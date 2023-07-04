package com.dining.start;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class DB_Server implements Runnable{
	public ServerSocket ss = null;
	public Socket s = null;
	
	public DB_Server() {
		try {
			ss = new ServerSocket(7778);
			System.out.println("서버 대기중..");
			new Thread(this).start();
		} catch (Exception e) {
			System.out.println("서버연결실패");
			e.printStackTrace();
		}
	}
	@Override
	public void run() {
		while(true) {
			try {
				s = ss.accept();
				CP_Client cc = new CP_Client(s , this);
				cc.start();
			} catch (IOException e) {
				e.printStackTrace();
				System.out.println("net_server");
			}
		}
	}
				
	public static void main(String[] args) {
		new DB_Server();
	}
}