package com.dining.tool;

import javax.swing.JFrame;

import com.dining.login.Find_id_page;

public class test01 extends JFrame{
	public test01() {
		
		Find_id_page jp1 = new Find_id_page();
		
		add(jp1);
		
		setSize(540, 1000);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}
	public static void main(String[] args) {
		new test01();
	}
}
