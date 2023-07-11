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

import com.dining.start.Protocol;
import com.dining.start.Start_frame;
import com.dining.start.db_DAO;
import com.dining.start.db_VO;

import java.awt.event.ActionListener;
import java.io.IOException;
import java.awt.event.ActionEvent;

public class Main01_best2 extends JPanel {
	CardLayout cardLayout;
	JPanel main_pg;
	Start_frame main;
	
	public String review_star;
	
	public JLabel store_food_image2;
	public String store_name2;
	public RoundedButton_kjh_5 store_bt ;

	public Main01_best2(CardLayout cardLayout, JPanel main_pg, Start_frame main) {
		this.cardLayout = cardLayout;
		this.main_pg = main_pg;
		this.main = main;
		setForeground(new Color(0, 0, 0));
		setBackground(new Color(255, 240, 245));
		setBounds(100, 100, 540, 960);
		setLayout(null);

		JButton befer_bt = new JButton("");
		befer_bt.setIcon(new ImageIcon(Main01_best2.class.getResource("/image/beferbutton.png")));
		befer_bt.setBounds(0, 415, 69, 69);
		add(befer_bt);

		JButton after_bt = new JButton("");
		after_bt.setIcon(new ImageIcon(Main01_best2.class.getResource("/image/afterbutton.png")));
		after_bt.setBounds(471, 415, 69, 69);
		add(after_bt);

		JLabel today = new JLabel("주간 BEST");
		today.setOpaque(true);
		today.setHorizontalAlignment(SwingConstants.CENTER);
		today.setForeground(new Color(65, 105, 225));
		today.setFont(new Font("Sandoll 삼립호빵체 TTF Basic", Font.PLAIN, 50));
		today.setBackground(new Color(255, 240, 245));
		today.setBounds(77, 236, 381, 69);
		add(today);

		store_food_image2 = new JLabel();
		store_food_image2.setOpaque(true);
		store_food_image2.setHorizontalAlignment(SwingConstants.CENTER);
		store_food_image2.setForeground(new Color(255, 255, 255));
		store_food_image2.setFont(new Font("Sandoll 삼립호빵체 TTF Basic", Font.PLAIN, 50));
		store_food_image2.setBounds(54, 315, 429, 292);
		add(store_food_image2);

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
		movemenu.setIcon(new ImageIcon(Main01_best2.class.getResource("/image/menubutton.png")));
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
		homeButton.setIcon(new ImageIcon(Main01_best2.class.getResource("/image/homebutton_1.png")));
		homeButton.setBorderPainted(false);
		homeButton.setBackground(new Color(255, 240, 245));
		homeButton.setBounds(329, 37, 77, 69);
		add(homeButton);

		JLabel label_image = new JLabel("");
		label_image.setIcon(new ImageIcon(Main01_best2.class.getResource("/image/label.png")));
		label_image.setBounds(0, 10, 540, 330);
		add(label_image);

		JLabel rank2_lb = new JLabel("평점 2위 ");
		rank2_lb.setHorizontalAlignment(SwingConstants.CENTER);
		rank2_lb.setFont(new Font("휴먼매직체", Font.BOLD, 30));
		rank2_lb.setBounds(127, 634, 297, 61);
		add(rank2_lb);

		store_bt = new RoundedButton_kjh_5();
		store_bt.setFont(new Font("Sandoll 삼립호빵체 TTF Basic", Font.PLAIN, 16));
		store_bt.setForeground(new Color(255, 240, 245));
		store_bt.setBackground(new Color(65, 105, 225));
		store_bt.setBorderPainted(false);
		store_bt.setBounds(157, 731, 227, 95);
		add(store_bt);

		// 이전 화면으로 이동 main01_best1
		befer_bt.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				cardLayout.show(main_pg, "main01_best1");
			}
		});

		// 다음 화면으로 이동 main01_best3
		after_bt.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				cardLayout.show(main_pg, "main01_best3");
			}
		});

		// 가게이름 버튼을 누르면 해당 가게로 이동하게된다. main04_store1_main
		store_bt.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// 별점 표시용 추가한 부분
				db_VO vo2 = new db_VO();
				vo2.setDiner_name(store_bt.getText());
//				review_star = db_DAO.getStoreStar(vo2);
				System.out.println("별점은" + review_star);
				
				Protocol p = new Protocol();
				db_VO vo = new db_VO();
				vo.setDiner_name(store_bt.getText()); 
				vo.setStar(review_star);
				System.out.println("vo에 들어간 스타" + vo.getStar());
				p.setStore_name(store_bt.getText()); 
				p.setVo(vo);
				 p.setCmd(22);
				 try {
					main.out.writeObject(p);
					main.out.flush();
				} catch (IOException e1) {
					System.out.println(e1);
				}
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