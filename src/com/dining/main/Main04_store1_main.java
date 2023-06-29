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
import javax.swing.SwingConstants;

import java.awt.Button;
import java.awt.CardLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JCheckBox;
import javax.swing.JTextField;
import javax.swing.JRadioButton;

public class Main04_store1_main extends JPanel {
	 JTextField store_area_tf;
	 JTextField store_addr_tf;
	 JTextField store_bestfd_tf;
	 JTextField store_phone_tf;
	 JTextField store_open_tf;
	 JTextField paking_tf;
	 CardLayout cardLayout;
	 JPanel main_pg ;


	/**
	 * Create the panel.
	 */
	public Main04_store1_main(CardLayout cardLayout, JPanel main_pg) {
		this.cardLayout = cardLayout ;
		this.main_pg = main_pg ;
		
		setForeground(new Color(0, 0, 0));
		setBackground(new Color(255, 240, 245));
		setBounds(100, 100, 540, 960);
		setLayout(null);
		
		JLabel avg_score_lb = new JLabel("4.5");
		avg_score_lb.setBounds(300, 160, 22, 22);
		add(avg_score_lb);
		
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


		
		JLabel store_bestfood_img = new JLabel("가게 대표메뉴 이미지");
		store_bestfood_img.setOpaque(true);
		store_bestfood_img.setForeground(new Color(255, 255, 255));
		store_bestfood_img.setBackground(new Color(255, 0, 0));
		store_bestfood_img.setFont(new Font("Sandoll 삼립호빵체 TTF Outline", Font.PLAIN, 50));
		store_bestfood_img.setHorizontalAlignment(SwingConstants.CENTER);
		store_bestfood_img.setBounds(53, 210, 414, 270);
		add(store_bestfood_img);
		
		
		
		JButton homeButton = new JButton("");
		homeButton.setBorderPainted(false);
		homeButton.setIcon(new ImageIcon(Main04_store1_main.class.getResource("/image/homebutton_1.png")));
		homeButton.setBackground(new Color(255, 240, 245));
		homeButton.setBounds(329, 37, 77, 69);
		add(homeButton);
		
		String storename = "끼로끼로하영이"; 
		RoundedButton_ysh_1 store_name = new RoundedButton_ysh_1(storename);
		store_name.setEnabled(false);
		store_name.setForeground(new Color(255, 255, 255));
		store_name.setBorderPainted(false);
		store_name.setBackground(new Color(65, 105, 225));
		store_name.setFont(new Font("Sandoll 삼립호빵체 TTF Basic", Font.PLAIN, 18));
		store_name.setBounds(53, 139, 204, 61);
		add(store_name);
		
		store_area_tf = new JTextField();
		store_area_tf.setBounds(228, 513, 218, 31);
		add(store_area_tf);
		store_area_tf.setColumns(10);
		
		JLabel packing_lb = new JLabel("주차 여부 : ");
		packing_lb.setHorizontalAlignment(SwingConstants.CENTER);
		packing_lb.setFont(new Font("Sandoll 삼립호빵체 TTF Basic", Font.PLAIN, 24));
		packing_lb.setBounds(86, 763, 132, 33);
		add(packing_lb);
		
		store_addr_tf = new JTextField();
		store_addr_tf.setColumns(10);
		store_addr_tf.setBounds(228, 568, 218, 31);
		add(store_addr_tf);
		
		store_bestfd_tf = new JTextField();
		store_bestfd_tf.setColumns(10);
		store_bestfd_tf.setBounds(228, 621, 218, 31);
		add(store_bestfd_tf);
		
		store_phone_tf = new JTextField();
		store_phone_tf.setColumns(10);
		store_phone_tf.setBounds(228, 671, 218, 31);
		add(store_phone_tf);
		
		store_open_tf = new JTextField();
		store_open_tf.setColumns(10);
		store_open_tf.setBounds(228, 719, 218, 31);
		add(store_open_tf);
		
		paking_tf = new JTextField();
		paking_tf.setColumns(10);
		paking_tf.setBounds(228, 765, 218, 31);
		add(paking_tf);
		
		JLabel lb1 = new JLabel("가게 지역 : ");
		lb1.setHorizontalAlignment(SwingConstants.CENTER);
		lb1.setFont(new Font("Sandoll 삼립호빵체 TTF Basic", Font.PLAIN, 24));
		lb1.setBounds(86, 511, 132, 33);
		add(lb1);
		
		JLabel lb2 = new JLabel("가게 주소 : ");
		lb2.setHorizontalAlignment(SwingConstants.CENTER);
		lb2.setFont(new Font("Sandoll 삼립호빵체 TTF Basic", Font.PLAIN, 24));
		lb2.setBounds(86, 568, 132, 33);
		add(lb2);
		
		JLabel lb3 = new JLabel("가게대표메뉴 : ");
		lb3.setHorizontalAlignment(SwingConstants.CENTER);
		lb3.setFont(new Font("Sandoll 삼립호빵체 TTF Basic", Font.PLAIN, 24));
		lb3.setBounds(63, 626, 151, 33);
		add(lb3);
		
		JLabel lb4 = new JLabel("전화 번호 : ");
		lb4.setHorizontalAlignment(SwingConstants.CENTER);
		lb4.setFont(new Font("Sandoll 삼립호빵체 TTF Basic", Font.PLAIN, 24));
		lb4.setBounds(86, 676, 132, 33);
		add(lb4);
		
		JLabel lb5 = new JLabel("영업 시간 : ");
		lb5.setHorizontalAlignment(SwingConstants.CENTER);
		lb5.setFont(new Font("Sandoll 삼립호빵체 TTF Basic", Font.PLAIN, 24));
		lb5.setBounds(86, 720, 132, 33);
		add(lb5);
		
		RoundedButton_ysh_1 open_map_bt = new RoundedButton_ysh_1("상세위치 지도보기");
		open_map_bt.setFont(new Font("Sandoll 삼립호빵체 TTF Basic", Font.PLAIN, 17));
		open_map_bt.setBorderPainted(false);
		open_map_bt.setBackground(new Color(65, 105, 225));
		open_map_bt.setForeground(new Color(255, 255, 255));
		open_map_bt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		open_map_bt.setBounds(62, 839, 174, 61);
		add(open_map_bt);
		
		RoundedButton_ysh_1 review_bt = new RoundedButton_ysh_1("리뷰 작성 및 보기");
		review_bt.setFont(new Font("Sandoll 삼립호빵체 TTF Basic", Font.PLAIN, 17));
		review_bt.setBackground(new Color(65, 105, 225));
		review_bt.setBorderPainted(false);
		review_bt.setForeground(new Color(255, 255, 255));
		review_bt.setBounds(293, 839, 174, 61);
		add(review_bt);
		
		JLabel star_lb = new JLabel("");
		star_lb.setIcon(new ImageIcon(Main04_store1_main.class.getResource("/image/star3.png")));
		star_lb.setBounds(274, 139, 77, 61);
		add(star_lb);
		
		JRadioButton love_jrbt = new JRadioButton("");
		love_jrbt.setBackground(new Color(255, 240, 245));
		love_jrbt.setIconTextGap(0);
		love_jrbt.setIcon(new ImageIcon(Main04_store1_main.class.getResource("/image/whiteheart.png")));
		love_jrbt.setBounds(359, 139, 70, 61);
		add(love_jrbt);
		
		// main04_store2_map 상세지도 보기 페이지로 이동
		open_map_bt.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				cardLayout.show(main_pg,"main04_store2_map");
			}
		});
		
		// main04_store3_review 리뷰페이지로 이동
		review_bt.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				cardLayout.show(main_pg,"main04_store3_review");
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