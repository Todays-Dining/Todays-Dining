package com.dining.main;

import java.awt.CardLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Main02_best6_etc extends JPanel {
	 CardLayout cardLayout;
	 JPanel main_pg ;
	/**
	 * Create the application.
	 */
	public Main02_best6_etc(CardLayout cardLayout, JPanel main_pg) {
		this.cardLayout = cardLayout ;
		this.main_pg = main_pg ;

		setForeground(new Color(0, 0, 0));
		setBackground(new Color(255, 240, 245));
		setBounds(100, 100, 540, 960);
		setLayout(null);

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

		JLabel today = new JLabel("기타 BEST");
		today.setOpaque(true);
		today.setHorizontalAlignment(SwingConstants.CENTER);
		today.setForeground(new Color(65, 105, 225));
		today.setFont(new Font("Sandoll 삼립호빵체 TTF Basic", Font.PLAIN, 50));
		today.setBackground(new Color(255, 240, 245));
		today.setBounds(79, 224, 381, 81);
		add(today);

		JLabel store_food_img = new JLabel("가게이미지");
		store_food_img.setOpaque(true);
		store_food_img.setHorizontalAlignment(SwingConstants.CENTER);
		store_food_img.setForeground(new Color(255, 255, 255));
		store_food_img.setFont(new Font("Sandoll 삼립호빵체 TTF Basic", Font.PLAIN, 50));
		store_food_img.setBackground(new Color(65, 105, 225));
		store_food_img.setBounds(59, 309, 421, 289);
		add(store_food_img);

		JButton homeButton = new JButton("");
		homeButton.setBorderPainted(false);
		homeButton.setIcon(new ImageIcon(Main02_best6_etc.class.getResource("/image/homebutton_1.png")));
		homeButton.setBackground(new Color(255, 240, 245));
		homeButton.setBounds(327, 32, 77, 69);
		add(homeButton);

		JLabel lable_img = new JLabel("");
		lable_img.setIcon(new ImageIcon(Main02_best6_etc.class.getResource("/image/label.png")));
		lable_img.setBounds(0, 0, 540, 330);
		add(lable_img);

		RoundedButton_lsh_1 dif_etc_bt = new RoundedButton_lsh_1();
		dif_etc_bt.setText("다른 가게 보기(기타)");
		dif_etc_bt.setBorderPainted(false);
		dif_etc_bt.setOpaque(true);
		dif_etc_bt.setHorizontalAlignment(SwingConstants.CENTER);
		dif_etc_bt.setForeground(new Color(255, 255, 255));
		dif_etc_bt.setFont(new Font("Sandoll 삼립호빵체 TTF Outline", Font.BOLD, 20));
		dif_etc_bt.setBackground(new Color(65, 105, 225));
		dif_etc_bt.setBounds(157, 762, 223, 45);
		add(dif_etc_bt);

		JButton store_name_bt = new JButton("해당가게이름");
		store_name_bt.setForeground(new Color(255, 255, 255));
		store_name_bt.setBorderPainted(false);
		store_name_bt.setBackground(new Color(65, 105, 225));
		store_name_bt.setFont(new Font("Sandoll 삼립호빵체 TTF Basic", Font.PLAIN, 17));
		store_name_bt.setIcon(new ImageIcon("C:\\image\\qww.png"));
		store_name_bt.setBounds(157, 644, 223, 69);
		add(store_name_bt);
		
		// 해당 가게이름 페이지로 이동 main04_store1_main
		store_name_bt.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				cardLayout.show(main_pg, "main04_store1_main");
			}
		});
		
		// main02_store6_etc로 이동
		dif_etc_bt.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				cardLayout.show(main_pg, "main02_store6_etc");
			}
		});
	}
}
