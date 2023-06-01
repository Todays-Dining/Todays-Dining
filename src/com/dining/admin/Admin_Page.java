package com.dining.admin;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Admin_Page extends JFrame{
	private JPanel Admin_Page_jp1 ,Admin_Page_jp2 ;
	private JLabel Admin_Page_jlb ;
	private JButton Admin_Page_jb1, Admin_Page_jb2, Admin_Page_jb3 ;
	public Admin_Page() {
		super("Admin");
		Admin_Page_jp1 = new JPanel();
		Admin_Page_jp2 = new JPanel(new GridLayout(3,1));
		Admin_Page_jlb = new JLabel("Admin");
		Admin_Page_jlb.setFont(new Font("Serif", Font.ITALIC, 80));
		Admin_Page_jlb.setForeground(Color.RED);
		// 버튼
		Admin_Page_jb1 = new JButton("회원정보 관리");
		Admin_Page_jb1.setFont(new Font("Monospaced", Font.BOLD, 40));
		Admin_Page_jb2 = new JButton("음식점 관리");
		Admin_Page_jb2.setFont(new Font("Monospaced", Font.BOLD, 40));
		Admin_Page_jb3 = new JButton("리뷰및평점 관리");
		Admin_Page_jb3.setFont(new Font("Monospaced", Font.BOLD, 40));
		
		
		// 배경색
		Admin_Page_jp1.setBackground(Color.BLACK);
		Admin_Page_jb1.setBackground(Color.WHITE);
		Admin_Page_jb2.setBackground(Color.WHITE);
		Admin_Page_jb3.setBackground(Color.WHITE);
		
		Admin_Page_jp1.add(Admin_Page_jlb);
		
		Admin_Page_jp2.add(Admin_Page_jb1);
		Admin_Page_jp2.add(Admin_Page_jb2);
		Admin_Page_jp2.add(Admin_Page_jb3);
		
		// 패널 위치 분배
		add(Admin_Page_jp1, BorderLayout.NORTH);
		add(Admin_Page_jp2, BorderLayout.CENTER);
		
		setSize(500,600);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}
	public static void main(String[] args) {
		new Admin_Page();
	}
}