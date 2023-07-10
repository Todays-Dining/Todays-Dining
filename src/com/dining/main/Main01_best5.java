package com.dining.main;

import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

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

public class Main01_best5 extends JPanel {
	CardLayout cardLayout;
	JPanel main_pg;
	Start_frame main;
	
	public String store_name5;
	
	public RoundedButton_kjh_5 store_bt ;
	public JLabel store_food_image5;
	/**
	 * Create the application.
	 */
	public Main01_best5(CardLayout cardLayout, JPanel main_pg,Start_frame main) {
		this.cardLayout = cardLayout;
		this.main_pg = main_pg;
		this.main = main;
		setForeground(new Color(0, 0, 0));
		setBackground(new Color(255, 240, 245));
		setBounds(100, 100, 540, 960);
		setLayout(null);

		JButton befer_bt = new JButton("");
		befer_bt.setIcon(new ImageIcon(Main01_best4.class.getResource("/image/beferbutton.png")));
		befer_bt.setBounds(0, 415, 69, 69);
		add(befer_bt);

		JLabel today = new JLabel("주간 BEST");
		today.setOpaque(true);
		today.setHorizontalAlignment(SwingConstants.CENTER);
		today.setForeground(new Color(65, 105, 225));
		today.setFont(new Font("Sandoll 삼립호빵체 TTF Basic", Font.PLAIN, 50));
		today.setBackground(new Color(255, 240, 245));
		today.setBounds(77, 236, 381, 69);
		add(today);

		store_food_image5 = new JLabel();
		store_food_image5.setOpaque(true);
		store_food_image5.setHorizontalAlignment(SwingConstants.CENTER);
		store_food_image5.setForeground(new Color(255, 255, 255));
		store_food_image5.setFont(new Font("Sandoll 삼립호빵체 TTF Basic", Font.PLAIN, 50));
		store_food_image5.setBounds(54, 315, 429, 292);
		add(store_food_image5);

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
		movemenu.setIcon(new ImageIcon(Main01_best5.class.getResource("/image/menubutton.png")));
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
		homeButton.setIcon(new ImageIcon(Main01_best5.class.getResource("/image/homebutton_1.png")));
		homeButton.setBorderPainted(false);
		homeButton.setBackground(new Color(255, 240, 245));
		homeButton.setBounds(329, 37, 77, 69);
		add(homeButton);

		JLabel label_image = new JLabel("");
		label_image.setIcon(new ImageIcon(Main01_best5.class.getResource("/image/label.png")));
		label_image.setBounds(0, 10, 540, 330);
		add(label_image);

		JLabel rank5_lb = new JLabel("평점 5위 ");
		rank5_lb.setHorizontalAlignment(SwingConstants.CENTER);
		rank5_lb.setFont(new Font("휴먼매직체", Font.BOLD, 30));
		rank5_lb.setBounds(127, 634, 297, 61);
		add(rank5_lb);

		store_bt = new RoundedButton_kjh_5();
		store_bt.setFont(new Font("Sandoll 삼립호빵체 TTF Basic", Font.PLAIN, 16));
		store_bt.setForeground(new Color(255, 240, 245));
		store_bt.setBackground(new Color(65, 105, 225));
		store_bt.setBorderPainted(false);
		store_bt.setBounds(157, 731, 227, 95);
		add(store_bt);

		// 이전 화면으로 이동 main01_best4
		befer_bt.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				cardLayout.show(main_pg, "main01_best4");
			}
		});

		// 가게이름 버튼을 누르면 해당 가게로 이동하게된다. main04_store1_main
		store_bt.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				Protocol p = new Protocol();
				db_VO vo = new db_VO();
				vo.setDiner_name(store_bt.getText()); 
				p.setStore_name(store_bt.getText()); 
				p.setVo(vo);
				 p.setCmd(22);
				 try {
					main.out.writeObject(p);
					main.out.flush();
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
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