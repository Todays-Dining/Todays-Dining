package com.dining.main;

import java.awt.Color;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JTextPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.TextField;
import java.awt.Button;
import java.awt.CardLayout;

import javax.swing.SwingConstants;
import java.awt.Label;

public class Main02_category_select extends JPanel {
	CardLayout cardLayout;
	JPanel main_pg;

	/**
	 * Create the panel.
	 */
	public Main02_category_select(CardLayout cardLayout, JPanel main_pg) {
		this.cardLayout = cardLayout;
		this.main_pg = main_pg;

		setForeground(new Color(0, 0, 0));
		setBackground(new Color(255, 240, 245));
		setBounds(100, 100, 540, 960);
		setLayout(null);

		JLabel today = new JLabel("음식 종류");
		today.setOpaque(true);
		today.setHorizontalAlignment(SwingConstants.CENTER);
		today.setForeground(new Color(255, 255, 255));
		today.setFont(new Font("Sandoll 삼립호빵체 TTF Basic", Font.PLAIN, 50));
		today.setBackground(new Color(65, 105, 225));
		today.setBounds(78, 244, 381, 89);
		add(today);

		JLabel sidetool = new JLabel("");
		sidetool.setOpaque(true);
		sidetool.setBackground(new Color(255, 240, 245));
		sidetool.setBounds(405, 97, 91, 15);
		add(sidetool);
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBorderPainted(false);
		menuBar.setToolTipText("");
		menuBar.setBackground(new Color(255, 240, 245));
		menuBar.setBounds(418, 40, 62, 61);
		add(menuBar);

		JMenu movemenu = new JMenu("");
		movemenu.setOpaque(true);
		movemenu.setIconTextGap(0);
		movemenu.setIcon(new ImageIcon(Main00_Home.class.getResource("/image/menubutton.png")));
		movemenu.setBorderPainted(true);
		movemenu.setBackground(new Color(255, 240, 245));
		menuBar.add(movemenu);

		JMenuItem movemenu_1 = new JMenuItem("주간Best");
		movemenu_1.setFont(new Font("Sandoll 삼립호빵체 TTF Basic", Font.PLAIN, 14));
		movemenu_1.setOpaque(true);
		movemenu_1.setBorderPainted(true);
		movemenu_1.setBackground(new Color(65, 105, 225));
		movemenu.add(movemenu_1);

		JMenuItem movemenu_2 = new JMenuItem("음식카테고리");
		movemenu_2.setFont(new Font("Sandoll 삼립호빵체 TTF Basic", Font.PLAIN, 14));
		movemenu_2.setOpaque(true);
		movemenu_2.setBorderPainted(true);
		movemenu_2.setBackground(new Color(65, 105, 225));
		movemenu.add(movemenu_2);

		JMenuItem movemenu_3 = new JMenuItem("오늘 뭐먹죠?");
		movemenu_3.setFont(new Font("Sandoll 삼립호빵체 TTF Basic", Font.PLAIN, 14));
		movemenu_3.setOpaque(true);
		movemenu_3.setBorderPainted(true);
		movemenu_3.setBackground(new Color(65, 105, 225));
		movemenu.add(movemenu_3);

		JMenuItem mypage = new JMenuItem("MY Page");
		mypage.setFont(new Font("Sandoll 삼립호빵체 TTF Basic", Font.PLAIN, 14));
		mypage.setOpaque(true);
		mypage.setBorderPainted(true);
		mypage.setBackground(new Color(65, 105, 225));
		movemenu.add(mypage);

		JButton homeButton = new JButton("");
		homeButton.setBorderPainted(false);
		homeButton.setIcon(new ImageIcon(Main02_category_select.class.getResource("/image/homebutton_1.png")));
		homeButton.setBackground(new Color(255, 240, 245));
		homeButton.setBounds(327, 32, 77, 69);
		add(homeButton);

		RoundedButton_lsh_1 menu1_kr = new RoundedButton_lsh_1("한식");
		menu1_kr.setBorderPainted(false);
		menu1_kr.setToolTipText("");
		menu1_kr.setForeground(new Color(255, 255, 255));
		menu1_kr.setFont(new Font("Sandoll 삼립호빵체 TTF Outline", Font.BOLD, 30));
		menu1_kr.setBackground(new Color(65, 105, 225));
		menu1_kr.setBounds(57, 389, 101, 96);
		add(menu1_kr);

		JLabel label_lb = new JLabel("");
		label_lb.setIcon(new ImageIcon(Main02_category_select.class.getResource("/image/label.png")));
		label_lb.setBounds(0, 0, 540, 330);
		add(label_lb);

		JLabel icon_lb = new JLabel("");
		icon_lb.setIcon(new ImageIcon(Main02_category_select.class.getResource("/image/icon_small.png")));
		icon_lb.setBounds(50, 645, 540, 330);
		add(icon_lb);

		RoundedButton_lsh_1 menu1_am = new RoundedButton_lsh_1();
		menu1_am.setText("양식");
		menu1_am.setForeground(Color.WHITE);
		menu1_am.setFont(new Font("Sandoll 삼립호빵체 TTF Outline", Font.BOLD, 30));
		menu1_am.setBorderPainted(false);
		menu1_am.setBackground(new Color(65, 105, 225));
		menu1_am.setBounds(225, 389, 101, 96);
		add(menu1_am);

		RoundedButton_lsh_1 menu1_ch = new RoundedButton_lsh_1();
		menu1_ch.setText("중식");
		menu1_ch.setForeground(Color.WHITE);
		menu1_ch.setFont(new Font("Sandoll 삼립호빵체 TTF Outline", Font.BOLD, 30));
		menu1_ch.setBorderPainted(false);
		menu1_ch.setBackground(new Color(65, 105, 225));
		menu1_ch.setBounds(389, 389, 101, 96);
		add(menu1_ch);

		RoundedButton_lsh_1 menu1_ja = new RoundedButton_lsh_1();
		menu1_ja.setText("일식");
		menu1_ja.setToolTipText("");
		menu1_ja.setForeground(Color.WHITE);
		menu1_ja.setFont(new Font("Sandoll 삼립호빵체 TTF Outline", Font.BOLD, 30));
		menu1_ja.setBorderPainted(false);
		menu1_ja.setBackground(new Color(65, 105, 225));
		menu1_ja.setBounds(57, 520, 101, 96);
		add(menu1_ja);

		RoundedButton_lsh_1 menu1_ca = new RoundedButton_lsh_1();
		menu1_ca.setText("카페");
		menu1_ca.setForeground(Color.WHITE);
		menu1_ca.setFont(new Font("Sandoll 삼립호빵체 TTF Outline", Font.BOLD, 30));
		menu1_ca.setBorderPainted(false);
		menu1_ca.setBackground(new Color(65, 105, 225));
		menu1_ca.setBounds(225, 520, 101, 96);
		add(menu1_ca);

		RoundedButton_lsh_1 menu1_etc = new RoundedButton_lsh_1();
		menu1_etc.setText("기타");
		menu1_etc.setForeground(Color.WHITE);
		menu1_etc.setFont(new Font("Sandoll 삼립호빵체 TTF Outline", Font.BOLD, 30));
		menu1_etc.setBorderPainted(false);
		menu1_etc.setBackground(new Color(65, 105, 225));
		menu1_etc.setBounds(389, 520, 101, 96);
		add(menu1_etc);

		menu1_kr.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				cardLayout.show(main_pg, "main02_best1_korea");
			}
		});
		menu1_am.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				cardLayout.show(main_pg, "main02_best2_american");
			}
		});
		menu1_ch.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				cardLayout.show(main_pg, "main02_best3_china");
			}
		});
		menu1_ja.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				cardLayout.show(main_pg, "main02_best4_japan");
			}
		});
		menu1_ca.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				cardLayout.show(main_pg, "main02_best5_cafe");
			}
		});
		menu1_etc.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				cardLayout.show(main_pg, "main02_best6_etc");
			}
		});

		// Main00_Home으로 돌아간다
		homeButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				cardLayout.show(main_pg, "main00_Home");
			}
		});
		
		// main01_best1 로 이동
		movemenu_1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				cardLayout.show(main_pg, "main01_best1");
			}
		});

		// main02_category_select 로 이동
		movemenu_2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				cardLayout.show(main_pg, "main02_category_select");
			}
		});

		// main03_random 로 이동
		movemenu_3.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				cardLayout.show(main_pg, "main03_random");
			}
		});

		// mypage01_main 로 이동
		mypage.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				cardLayout.show(main_pg, "mypage01_main");
			}
		});

	}
}
