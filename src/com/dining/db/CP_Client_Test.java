package com.dining.db;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;

import network.com.ict.edu10.db.DAO_2;
import network.com.ict.edu10.db.VO_2;

public class CP_Client_Test extends Thread {
	Socket s;
	DB_Server_Test server;
	ObjectInputStream in;
	ObjectOutputStream out;
	List<VO> list = null;
	// 해당 부분 위로 올리면 DB 자체가 오류남
//	DB_Client dbc = new DB_Client();

	public CP_Client_Test(Socket s, DB_Server_Test server) {
		this.s = s;
		this.server = server;
		try {
			// 객체 직렬화, 역 직렬화.
			in = new ObjectInputStream(s.getInputStream());
			out = new ObjectOutputStream(s.getOutputStream());
		} catch (Exception e) {
		}
	}
	
	// run 안에 vo 인자로 보내는 것 => 안됨
	// VO를 전역변수로 빼는 것 => 안됨 (null이 넘어옴)
	// VO를 지역변수로 초기화하자 => 안됨 (생성하는 순간 앞에서 받은 값이 사라짐)
	// VO를 상속받자 => 이미 Thread 상속받고 있으므로 안됨
	public void run() {
		esc: while(true) {
			try {
				// 직렬화 또는 역직렬화 과정에서 별도의 처리가 필요할 때는 
				// writeObject와 readObject 메서드를 클래스 내부에 선언해주면 된다
				Object obj = in.readObject();
//				Object obj2 = in.readObject();
				if(obj != null) {
					// 프로토콜을 위에서 생성
					Protocol p = (Protocol)obj;
//					VO_2 vo = (VO_2)obj2;
					switch (p.getCmd()) {
						case 0:
							out.writeObject(p);
							out.flush();
							break esc;
						case 1:
							List<VO> list = DAO.getList();
							p.setList(list);
							out.writeObject(p);
							out.flush();
							break;
						case 2:
//							VO_2 vo = new VO_2();
//							DAO.getInsert(p.getVo());
////							System.out.println("카피클 텍스트 : " + dbc.custid_DB);
////							vo.setCustid(dbc.jtf1.getText());
////							vo.setName(dbc.jtf2.getText());
////							vo.setAddress(dbc.jtf3.getText());
////							vo.setPhone(dbc.jtf4.getText());
//////							List<VO_2> list3 = p.getList();
//////							DAO_2.getInsert((VO_2) list3);
////							DB_Client dbc = new DB_Client();
////							ArrayList<VO_2> list5 = dbc.list();
////							DAO_2.getInsert(list5);
//							
//							// 있어야 하나?
//							List<VO> list2 = DAO.getList();
//							p.setList(list2);
//							out.writeObject(p);
//							out.flush();
//							break;
						}
					}
				} catch (Exception e) {
					System.out.println(e);
				}
			} // while문의 끝
		try {
			out.close();
			in.close();
			s.close();
		} catch (Exception e) {
		}
	} // run 메서드의 끝
		
	public void prn(List<VO> list) {
		for (VO k : list) {
			System.out.println(k.getDiner_no()); 
			System.out.println(k.getDiner_name()); 
			System.out.println(k.getFavorited_number()); 
			System.out.println(k.getOpening_hours()); 
			System.out.println(k.getMenu()); 
			System.out.println(k.getPhone_number()); 
			System.out.println(k.getparking_or_not()); 
			System.out.println(k.getFood_category()); 
			System.out.println(k.getRegion()); 
			System.out.println(k.getAddress()); 
//			jta.append(k.getName()+"\t");
//			jta.append(k.getAddress()+"\t");
//			jta.append(k.getPhone()+"\n");
	
	}

	}
}
