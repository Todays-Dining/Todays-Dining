package com.dining.tool;

import javax.swing.JFrame;

import com.dining.admin.Admin01_main;

public class test01 {
	
	JFrame jframe1 ;
	JFrame jframe2 ;
	public test01() {
		
		jframe1 = new JFrame();
		jframe2 = new JFrame();
		Admin01_main jp1 = new Admin01_main();
		
		jframe2.add(jp1);
		
//		jframe1.setSize(540, 1000);
		jframe2.setSize(1200,840);
		jframe2.setLocationRelativeTo(null);
//		jframe2.setDefaultCloseOperation(EXIT_ON_CLOSE);
		jframe2.setVisible(true);
	}
	public static void main(String[] args) {
		new test01();
	}
}
