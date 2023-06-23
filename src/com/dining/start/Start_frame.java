package com.dining.start;

import javax.swing.JFrame;

import com.dining.login.Login01_page;

public class Start_frame {
	JFrame frame_main;
	JFrame frame_admin;
	
	public Start_frame() {
		// 상속받아서 하는게 아니라서 새로 생성을 해줘야한다
		frame_main = new JFrame();
		frame_admin= new JFrame();
		Login01_page login01_page = new Login01_page();
		
		frame_main.add(login01_page);
		
		frame_main.setSize(540, 1000);
//		frame_admin.setSize(1200, 840); 어떻게 두 프레임을 할지 생각
		frame_main.setVisible(true);
		frame_main.setLocationRelativeTo(null);
		
	}
	public static void main(String[] args) {
		new Start_frame();
	}
}
