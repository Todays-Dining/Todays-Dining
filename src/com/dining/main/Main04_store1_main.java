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

import com.dining.start.Protocol;
import com.dining.start.Start_frame;
import com.dining.start.db_VO;

import java.awt.Button;
import java.awt.CardLayout;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.awt.event.ActionEvent;
import javax.swing.JCheckBox;
import javax.swing.JTextField;
import javax.swing.JRadioButton;

public class Main04_store1_main extends JPanel {
	 public JLabel store_area_t;
	 public	JLabel store_addr_t;
	 public JLabel store_bestfd_t;
	 public JLabel store_phone_t;
	 public JLabel store_open_t;
	 public JLabel paking_t;
	 public JLabel store_bestfood_img ;
	 
	 
	 public JLabel avg_score_lb ;
	 CardLayout cardLayout;
	 JPanel main_pg ;
	 public RoundedButton_ysh_1 store_name ;
	 
	/**
	 * Create the panel.
	 */
	public Main04_store1_main(CardLayout cardLayout, JPanel main_pg, Start_frame main) {
		this.cardLayout = cardLayout ;
		this.main_pg = main_pg ;
		
		setForeground(new Color(0, 0, 0));
		setBackground(new Color(255, 240, 245));
		setBounds(100, 100, 540, 960);
		setLayout(null);
		
		JLabel avg_score_lb = new JLabel();
		avg_score_lb.setFont(new Font("Sandoll 삼립호빵체 TTF Outline", Font.BOLD, 14));
		avg_score_lb.setBounds(296, 158, 29, 22);
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


		
		store_bestfood_img = new JLabel();
		store_bestfood_img.setOpaque(true);
		store_bestfood_img.setForeground(new Color(255, 255, 255));
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
		
		
		store_name = new RoundedButton_ysh_1();
		store_name.setEnabled(false);
		store_name.setForeground(new Color(255, 255, 255));
		store_name.setBorderPainted(false);
		store_name.setBackground(new Color(65, 105, 225));
		store_name.setFont(new Font("Sandoll 삼립호빵체 TTF Basic", Font.PLAIN, 18));
		store_name.setBounds(53, 139, 204, 61);
		add(store_name);
		
		JLabel packing_lb = new JLabel("주차 여부 : ");
		packing_lb.setHorizontalAlignment(SwingConstants.CENTER);
		packing_lb.setFont(new Font("Sandoll 삼립호빵체 TTF Basic", Font.PLAIN, 24));
		packing_lb.setBounds(86, 768, 132, 33);
		add(packing_lb);
		
		 store_area_t = new JLabel();
		 store_area_t.setBorder(null);
		 store_area_t.setFont(new Font("Sandoll 삼립호빵체 TTF Basic", Font.PLAIN, 24));
		 store_area_t.setBounds(228, 513, 218, 33);
		add(store_area_t);
		
		
		store_addr_t = new JLabel();
		store_addr_t.setBorder(null);
		store_addr_t.setFont(new Font("Sandoll 삼립호빵체 TTF Basic", Font.PLAIN, 24));
		store_addr_t.setBounds(228, 568, 218, 33);
		add(store_addr_t);
		
		 store_bestfd_t = new JLabel();
		 store_bestfd_t.setBorder(null);
		 store_bestfd_t.setFont(new Font("Sandoll 삼립호빵체 TTF Basic", Font.PLAIN, 24));
		store_bestfd_t.setBounds(228, 620, 218, 33);
		add(store_bestfd_t);
		
		store_phone_t = new JLabel();
		store_phone_t.setBorder(null);
		store_phone_t.setFont(new Font("Sandoll 삼립호빵체 TTF Basic", Font.PLAIN, 24));
		store_phone_t.setBounds(228, 671, 218, 33);
		add(store_phone_t);
		
		store_open_t = new JLabel();
		store_open_t.setBorder(null);
		store_open_t.setFont(new Font("Sandoll 삼립호빵체 TTF Basic", Font.PLAIN, 24));
		store_open_t.setBounds(228, 720, 218, 33);
		add(store_open_t);
		
		paking_t = new JLabel();
		paking_t.setBorder(null);
		paking_t.setFont(new Font("Sandoll 삼립호빵체 TTF Basic", Font.PLAIN, 24));
		paking_t.setBounds(228, 768, 218, 33);
		add(paking_t);
		
		JLabel lb1 = new JLabel("가게 지역 : ");
		lb1.setHorizontalAlignment(SwingConstants.CENTER);
		lb1.setFont(new Font("Sandoll 삼립호빵체 TTF Basic", Font.PLAIN, 24));
		lb1.setBounds(86, 513, 132, 33);
		add(lb1);
		
		JLabel lb2 = new JLabel("가게 주소 : ");
		lb2.setHorizontalAlignment(SwingConstants.CENTER);
		lb2.setFont(new Font("Sandoll 삼립호빵체 TTF Basic", Font.PLAIN, 24));
		lb2.setBounds(86, 568, 132, 33);
		add(lb2);
		
		JLabel lb3 = new JLabel("가게 메뉴 : ");
		lb3.setHorizontalAlignment(SwingConstants.CENTER);
		lb3.setFont(new Font("Sandoll 삼립호빵체 TTF Basic", Font.PLAIN, 24));
		lb3.setBounds(77, 620, 151, 33);
		add(lb3);
		
		JLabel lb4 = new JLabel("전화 번호 : ");
		lb4.setHorizontalAlignment(SwingConstants.CENTER);
		lb4.setFont(new Font("Sandoll 삼립호빵체 TTF Basic", Font.PLAIN, 24));
		lb4.setBounds(86, 671, 132, 33);
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
		
		love_jrbt.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if (love_jrbt.isSelected()) {
					
					love_jrbt.setIcon(new ImageIcon(Main04_store1_main.class.getResource("/image/heart.png")));	
				}else {
					love_jrbt.setIcon(new ImageIcon(Main04_store1_main.class.getResource("/image/whiteheart.png")));
				}
			}
		});
		
		// main04_store2_map 상세지도 보기 페이지로 이동
		open_map_bt.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				try {
					//  가게이름 보내기
					Protocol p = new Protocol();
					db_VO vo = new db_VO();
					vo.setDiner_name(store_name.getText());
					vo.setAddress(store_addr_t.getText());
					System.out.println("가게 이름은" + store_name.getText());
					p.setCmd(28);
					p.setVo(vo);
					try {
						main.out.writeObject(p);
						main.out.flush();							
					} catch (Exception e2) {
						System.out.println("리뷰로 넘어가는 버튼 오류");
						System.out.println(e2);
					}					
				} catch (Exception e3) {

				}
			}
		});
		
		// main04_store3_review 리뷰페이지로 이동
		review_bt.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				try {
					//  가게이름 보내기
					Protocol p = new Protocol();
					db_VO vo = new db_VO();
					vo.setDiner_name(store_name.getText());
					p.setSearch(store_name.getText());
					p.setCmd(51);
					p.setVo(vo);
					main.out.writeObject(p);
					main.out.flush();	
				} catch (IOException e1) {
					e1.printStackTrace();
				}

//				cardLayout.show(main_pg,"main04_store3_review");
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