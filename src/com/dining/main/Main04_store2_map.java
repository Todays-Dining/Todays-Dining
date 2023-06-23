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
import javax.swing.JSpinner;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JTextArea;

public class Main04_store2_map extends JPanel {
	private JTextField store_addr_tf;

	/**
	 * Create the panel.
	 */
	public Main04_store2_map() {
		
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
		homeButton.setIcon(new ImageIcon(Main04_store2_map.class.getResource("/image/homebutton_1.png")));
		homeButton.setBackground(new Color(255, 240, 245));
		homeButton.setBounds(329, 37, 77, 69);
		add(homeButton);
		
		JLabel store_img_lb = new JLabel("가게 이미지");
		store_img_lb.setOpaque(true);
		store_img_lb.setForeground(new Color(255, 255, 255));
		store_img_lb.setBackground(new Color(255, 128, 64));
		store_img_lb.setFont(new Font("Sandoll 삼립호빵체 TTF Outline", Font.PLAIN, 50));
		store_img_lb.setHorizontalAlignment(SwingConstants.CENTER);
		store_img_lb.setBounds(49, 122, 414, 350);
		add(store_img_lb);
		
		JLabel storeaddr_img_lb = new JLabel("가게 위치");
		storeaddr_img_lb.setOpaque(true);
		storeaddr_img_lb.setForeground(new Color(255, 255, 255));
		storeaddr_img_lb.setBackground(new Color(255, 128, 64));
		storeaddr_img_lb.setFont(new Font("Sandoll 삼립호빵체 TTF Outline", Font.PLAIN, 50));
		storeaddr_img_lb.setHorizontalAlignment(SwingConstants.CENTER);
		storeaddr_img_lb.setBounds(49, 548, 414, 350);
		add(storeaddr_img_lb);
		
		JLabel lb1 = new JLabel("<음식점 주소 >");
		lb1.setFont(new Font("Sandoll 삼립호빵체 TTF Basic", Font.PLAIN, 18));
		lb1.setBounds(49, 480, 108, 24);
		add(lb1);
		
		JButton back_bt = new JButton("");
		back_bt.setIcon(new ImageIcon(Main04_store2_map.class.getResource("/image/backbutton.png")));
		back_bt.setBorderPainted(false);
		back_bt.setBackground(new Color(255, 240, 245));
		back_bt.setBounds(242, 40, 77, 69);
		add(back_bt);
		
		store_addr_tf = new JTextField();
		store_addr_tf.setBounds(49, 514, 414, 24);
		add(store_addr_tf);
		store_addr_tf.setColumns(10);
	}
}