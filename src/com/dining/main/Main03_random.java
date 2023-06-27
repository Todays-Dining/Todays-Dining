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

public class  Main03_random extends JPanel{

	CardLayout cardLayout;
	JPanel main_pg ;
	/**
	 * Create the application.
	 */
	public  Main03_random(CardLayout cardLayout, JPanel main_pg) {
		this.cardLayout = cardLayout ;
		this.main_pg = main_pg ;
		
		setForeground(new Color(0, 0, 0));
		setBackground(new Color(255, 240, 245));
		setBounds(100, 100, 540, 960);
		setLayout(null);
			
		
		
		JLabel today = new JLabel("오늘의 추천Pick!");
		today.setOpaque(true);
		today.setHorizontalAlignment(SwingConstants.CENTER);
		today.setForeground(new Color(65, 105, 225));
		today.setFont(new Font("Sandoll 삼립호빵체 TTF Basic", Font.PLAIN, 50));
		today.setBackground(new Color(255, 240, 245));
		today.setBounds(74, 227, 381, 89);
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
			homeButton.setIcon(new ImageIcon(Main03_random.class.getResource("/image/homebutton_1.png")));
			homeButton.setBackground(new Color(255, 240, 245));
			homeButton.setBounds(327, 32, 77, 69);
			add(homeButton);
			
			
		
			

			
			JLabel label_img = new JLabel("");
			label_img.setIcon(new ImageIcon(Main03_random.class.getResource("/image/label.png")));
			label_img.setBounds(0, 0, 540, 330);
			add(label_img);
			
			RoundedButton_kjh_5 start_bt = new RoundedButton_kjh_5("게임 시작!");
			start_bt.setText("Start!");
			start_bt.setFont(new Font("Sandoll 삼립호빵체 TTF Outline", Font.PLAIN, 25));
			start_bt.setBorderPainted(false);
			start_bt.setBackground(new Color(65, 105, 225));
			start_bt.setBounds(200, 317, 139, 40);
			add(start_bt);
			
			JButton korean_bt_img = new JButton("");
			korean_bt_img.setBorderPainted(false);
			korean_bt_img.setBackground(new Color(255, 240, 245));
			korean_bt_img.setIcon(new ImageIcon(Main03_random.class.getResource("/image/korea.png")));
			korean_bt_img.setBounds(33, 387, 80, 80);
			add(korean_bt_img);
			
			JButton japan_bt_img = new JButton("");
			japan_bt_img.setIcon(new ImageIcon(Main03_random.class.getResource("/image/japan.png")));
			japan_bt_img.setBorderPainted(false);
			japan_bt_img.setBackground(new Color(255, 240, 245));
			japan_bt_img.setBounds(142, 387, 80, 80);
			add(japan_bt_img);
			
			JButton china_bt_img = new JButton("");
			china_bt_img.setIcon(new ImageIcon(Main03_random.class.getResource("/image/china.png")));
			china_bt_img.setBorderPainted(false);
			china_bt_img.setBackground(new Color(255, 240, 245));
			china_bt_img.setBounds(251, 387, 80, 80);
			add(china_bt_img);
			
			JButton america_bt_img = new JButton("");
			america_bt_img.setIcon(new ImageIcon(Main03_random.class.getResource("/image/america.png")));
			america_bt_img.setBorderPainted(false);
			america_bt_img.setBackground(new Color(255, 240, 245));
			america_bt_img.setBounds(359, 387, 80, 80);
			add(america_bt_img);
			
			JLabel tool_lb1 = new JLabel("");
			tool_lb1.setOpaque(true);
			tool_lb1.setBackground(new Color(65, 105, 225));
			tool_lb1.setBounds(16, 387, 5, 500);
			add(tool_lb1);
			
			JLabel tool_lb2 = new JLabel("");
			tool_lb2.setOpaque(true);
			tool_lb2.setBackground(new Color(65, 105, 225));
			tool_lb2.setBounds(125, 387, 5, 500);
			add(tool_lb2);
			
			JLabel tool_lb3 = new JLabel("");
			tool_lb3.setOpaque(true);
			tool_lb3.setBackground(new Color(65, 105, 225));
			tool_lb3.setBounds(234, 387, 5, 500);
			add(tool_lb3);
			
			JLabel tool_lb4 = new JLabel("");
			tool_lb4.setOpaque(true);
			tool_lb4.setBackground(new Color(65, 105, 225));
			tool_lb4.setBounds(343, 387, 5, 500);
			add(tool_lb4);
			
			JLabel tool_lb5 = new JLabel("");
			tool_lb5.setOpaque(true);
			tool_lb5.setBackground(new Color(65, 105, 225));
			tool_lb5.setBounds(450, 387, 5, 500);
			add(tool_lb5);
			
			JLabel tool_lb6 = new JLabel("");
			tool_lb6.setOpaque(true);
			tool_lb6.setBackground(new Color(65, 105, 225));
			tool_lb6.setBounds(453, 460, 57, 5);
			add(tool_lb6);
			
			JLabel tool_lb7 = new JLabel("0M");
			tool_lb7.setForeground(new Color(65, 105, 225));
			tool_lb7.setFont(new Font("Sandoll 삼립호빵체 TTF Basic", Font.BOLD, 20));
			tool_lb7.setBounds(477, 440, 51, 20);
			add(tool_lb7);
			
			JLabel tool_lb8 = new JLabel("");
			tool_lb8.setOpaque(true);
			tool_lb8.setBackground(new Color(65, 105, 225));
			tool_lb8.setBounds(44, 655, 57, 5);
			add(tool_lb8);
			
			JLabel tool_lb9 = new JLabel("");
			tool_lb9.setOpaque(true);
			tool_lb9.setBackground(new Color(65, 105, 225));
			tool_lb9.setBounds(152, 655, 57, 5);
			add(tool_lb9);
			
			JLabel tool_lb10 = new JLabel("");
			tool_lb10.setOpaque(true);
			tool_lb10.setBackground(new Color(65, 105, 225));
			tool_lb10.setBounds(262, 655, 57, 5);
			add(tool_lb10);
			
			JLabel tool_lb11 = new JLabel("");
			tool_lb11.setOpaque(true);
			tool_lb11.setBackground(new Color(65, 105, 225));
			tool_lb11.setBounds(374, 655, 57, 5);
			add(tool_lb11);
			
			JLabel tool_lb12 = new JLabel("");
			tool_lb12.setOpaque(true);
			tool_lb12.setBackground(new Color(65, 105, 225));
			tool_lb12.setBounds(44, 882, 57, 5);
			add(tool_lb12);
			
			JLabel tool_lb13 = new JLabel("");
			tool_lb13.setOpaque(true);
			tool_lb13.setBackground(new Color(65, 105, 225));
			tool_lb13.setBounds(152, 882, 57, 5);
			add(tool_lb13);
			
			JLabel tool_lb14 = new JLabel("");
			tool_lb14.setOpaque(true);
			tool_lb14.setBackground(new Color(65, 105, 225));
			tool_lb14.setBounds(262, 882, 57, 5);
			add(tool_lb14);
			
			JLabel tool_lb15 = new JLabel("");
			tool_lb15.setOpaque(true);
			tool_lb15.setBackground(new Color(65, 105, 225));
			tool_lb15.setBounds(374, 882, 57, 5);
			add(tool_lb15);
			
			JLabel tool_lb16 = new JLabel("100M");
			tool_lb16.setForeground(new Color(65, 105, 225));
			tool_lb16.setFont(new Font("Sandoll 삼립호빵체 TTF Basic", Font.BOLD, 20));
			tool_lb16.setBounds(459, 635, 51, 20);
			add(tool_lb16);
			
			JLabel tool_lb17 = new JLabel("");
			tool_lb17.setOpaque(true);
			tool_lb17.setBackground(new Color(65, 105, 225));
			tool_lb17.setBounds(453, 655, 57, 5);
			add(tool_lb17);
			
			JLabel goal_lb = new JLabel("Goal!");
			goal_lb.setForeground(new Color(65, 105, 225));
			goal_lb.setFont(new Font("Sandoll 삼립호빵체 TTF Basic", Font.BOLD, 20));
			goal_lb.setBounds(459, 863, 51, 20);
			add(goal_lb);
			
			JLabel goal_line = new JLabel("");
			goal_line.setOpaque(true);
			goal_line.setBackground(new Color(65, 105, 225));
			goal_line.setBounds(453, 882, 57, 5);
			add(goal_line);
			
		
			
		
			
			
		}
}