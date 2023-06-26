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
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Main04_store3_review extends JPanel {
	private JTextField store_score_tf;
	private JTextField now_review_ta;

	/**
	 * Create the panel.
	 */
	public Main04_store3_review() {
		
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

		JButton homeButton = new JButton("");
		homeButton.setBorderPainted(false);
		homeButton.setIcon(new ImageIcon(Main04_store3_review.class.getResource("/image/homebutton_1.png")));
		homeButton.setBackground(new Color(255, 240, 245));
		homeButton.setBounds(329, 37, 77, 69);
		add(homeButton);
		
		JLabel lb1 = new JLabel("리뷰");
		lb1.setFont(new Font("Sandoll 삼립호빵체 TTF Outline", Font.BOLD, 47));
		lb1.setHorizontalAlignment(SwingConstants.CENTER);
		lb1.setBounds(202, 260, 127, 54);
		add(lb1);
		
		JLabel img_lb = new JLabel("");
		img_lb.setIcon(new ImageIcon(Main04_store3_review.class.getResource("/image/label.png")));
		img_lb.setBounds(0, 10, 540, 330);
		add(img_lb);
		
		JLabel custname1_lb = new JLabel("작성자:");
		custname1_lb.setFont(new Font("Sandoll 삼립호빵체 TTF Basic", Font.PLAIN, 18));
		custname1_lb.setHorizontalAlignment(SwingConstants.CENTER);
		custname1_lb.setBounds(67, 350, 67, 29);
		add(custname1_lb);
		
		JTextArea review1_ta = new JTextArea();
		review1_ta.setBounds(169, 350, 317, 61);
		add(review1_ta);
		
		JLabel date_1 = new JLabel("최근날짜순");
		date_1.setHorizontalAlignment(SwingConstants.CENTER);
		date_1.setFont(new Font("Sandoll 삼립호빵체 TTF Basic", Font.PLAIN, 18));
		date_1.setBounds(48, 382, 96, 29);
		add(date_1);
		
		JTextArea review2_ta = new JTextArea();
		review2_ta.setBounds(169, 452, 317, 61);
		add(review2_ta);
		
		JLabel custname2_lb = new JLabel("작성자:");
		custname2_lb.setHorizontalAlignment(SwingConstants.CENTER);
		custname2_lb.setFont(new Font("Sandoll 삼립호빵체 TTF Basic", Font.PLAIN, 18));
		custname2_lb.setBounds(67, 457, 67, 29);
		add(custname2_lb);
		
		JLabel date_2 = new JLabel("2023/06/20");
		date_2.setHorizontalAlignment(SwingConstants.CENTER);
		date_2.setFont(new Font("Sandoll 삼립호빵체 TTF Basic", Font.PLAIN, 18));
		date_2.setBounds(48, 484, 96, 29);
		add(date_2);
		
		JTextArea review3_ta = new JTextArea();
		review3_ta.setBounds(169, 553, 317, 61);
		add(review3_ta);
		
		JLabel custname3_lb = new JLabel("작성자:");
		custname3_lb.setHorizontalAlignment(SwingConstants.CENTER);
		custname3_lb.setFont(new Font("Sandoll 삼립호빵체 TTF Basic", Font.PLAIN, 18));
		custname3_lb.setBounds(67, 553, 67, 29);
		add(custname3_lb);
		
		JLabel date_3 = new JLabel("2023/06/20");
		date_3.setHorizontalAlignment(SwingConstants.CENTER);
		date_3.setFont(new Font("Sandoll 삼립호빵체 TTF Basic", Font.PLAIN, 18));
		date_3.setBounds(48, 585, 96, 29);
		add(date_3);
		
		JLabel store_score_lb = new JLabel("별점 주기");
		store_score_lb.setHorizontalAlignment(SwingConstants.CENTER);
		store_score_lb.setFont(new Font("Sandoll 삼립호빵체 TTF Basic", Font.PLAIN, 18));
		store_score_lb.setBounds(61, 705, 67, 29);
		add(store_score_lb);
		
		store_score_tf = new JTextField();
		store_score_tf.setBounds(148, 707, 67, 29);
		add(store_score_tf);
		store_score_tf.setColumns(10);
		
		JLabel now_review_lb = new JLabel("리뷰 남기기:");
		now_review_lb.setFont(new Font("Sandoll 삼립호빵체 TTF Basic", Font.PLAIN, 20));
		now_review_lb.setBounds(32, 744, 96, 43);
		add(now_review_lb);
		
		now_review_ta = new JTextField();
		now_review_ta.setBounds(148, 755, 338, 148);
		add(now_review_ta);
		now_review_ta.setColumns(10);
		
		JButton back_bt = new JButton("");
		back_bt.setIcon(new ImageIcon(Main04_store2_map.class.getResource("/image/backbutton.png")));
		back_bt.setBorderPainted(false);
		back_bt.setBackground(new Color(255, 240, 245));
		back_bt.setBounds(242, 40, 77, 69);
		add(back_bt);
		
		
		RoundedButton_ysh_1 review_save_bt = new RoundedButton_ysh_1("저장하기");
		review_save_bt.setBorderPainted(false);
		review_save_bt.setForeground(new Color(255, 255, 255));
		review_save_bt.setFont(new Font("Sandoll 삼립호빵체 TTF Basic", Font.PLAIN, 20));
		review_save_bt.setBackground(new Color(65, 105, 225));
		review_save_bt.setBounds(366, 710, 109, 29);
		add(review_save_bt);
		
	}

}