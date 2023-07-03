package com.dining.start;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.util.List;

import javax.swing.JOptionPane;

import com.dining.mypage.Mypage01_main;

// implements Runnble 하면, DB_Server에서 .start()가 작동 안됨!
public class CP_Client extends Thread {
	Socket s;
	DB_Server server;
	ObjectInputStream in;
	ObjectOutputStream out;
	List<db_VO> list = null;

	public CP_Client(Socket s, DB_Server server) {
		this.s = s;
		this.server = server;
		try {
			// 객체 직렬화, 역 직렬화.
			in = new ObjectInputStream(s.getInputStream());
			out = new ObjectOutputStream(s.getOutputStream());
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	public void run() {
		esc: while (true) {
			try {
				Object obj = in.readObject();
				if (obj != null) {
					Protocol p = (Protocol) obj;
					switch (p.getCmd()) {
					case 0: // 종료
						break esc;
					case 1: // 로그인
						db_VO vo = new db_VO();
						vo = p.getVo();
						vo = db_DAO.login(vo);
						p.setVo(vo);
						if(vo != null) {
							System.out.println("로그인 성공");
							p.setResult(1);
						}else {
							System.out.println("로그인 실패");
							p.setResult(0);
						}
						out.writeObject(p);
						out.flush();
						break;
					}
				}
			} catch (Exception e) {
				System.out.println(e);
				System.out.println("cp_client");
			}
		}// while문 끝
//	try {
//		out.close();
//		in.close();
//		s.close();
//	} catch (Exception e) {
//	}
	}
}
