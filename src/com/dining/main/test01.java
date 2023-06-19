package com.dining.main;

import javax.swing.JFrame;

public class test01 extends JFrame{
	public test01() {
		
		main_tool_home jp1 = new main_tool_home();
		
		add(jp1.jPanel_main);
		
		setSize(540, 960);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}
	public static void main(String[] args) {
		new test01();
	}
}
