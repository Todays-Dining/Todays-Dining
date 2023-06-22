package com.dining.main;



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


	/**
	 * Create the application.
	 */
	public  Main03_random() {
			
		setForeground(new Color(0, 0, 0));
		setBackground(new Color(255, 240, 245));
		setBounds(100, 100, 540, 960);
		setLayout(null);
			
		
		
		JLabel today = new JLabel("오늘의 추천Pick");
		today.setOpaque(true);
		today.setHorizontalAlignment(SwingConstants.CENTER);
		today.setForeground(new Color(65, 105, 225));
		today.setFont(new Font("Sandoll 삼립호빵체 TTF Basic", Font.PLAIN, 50));
		today.setBackground(new Color(255, 240, 245));
		today.setBounds(74, 239, 381, 89);
		add(today);
		
		JLabel image = new JLabel("가게이미지");
		image.setOpaque(true);
		image.setHorizontalAlignment(SwingConstants.CENTER);
		image.setForeground(new Color(255, 255, 255));
		image.setFont(new Font("Sandoll 삼립호빵체 TTF Basic", Font.PLAIN, 50));
		image.setBackground(new Color(65, 105, 225));
		image.setBounds(97, 326, 349, 194);
		add(image);
		
		
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
			
			
		
			

			
			JLabel lblNewLabel_1 = new JLabel("");
			lblNewLabel_1.setIcon(new ImageIcon("C:\\image\\label_1.png"));
			lblNewLabel_1.setBounds(0, 10, 540, 330);
			add(lblNewLabel_1);
			
			
	
			
			JButton btnNewButton_2 = new JButton("");
			btnNewButton_2.setBorderPainted(false);
			btnNewButton_2.setBackground(new Color(255, 240, 245));
			btnNewButton_2.setIcon(new ImageIcon(Main03_random.class.getResource("/image/111.png")));
			btnNewButton_2.setBounds(12, 546, 123, 138);
			add(btnNewButton_2);
			
		
		
		
			
			JButton btnNewButton_3 = new JButton("");
			btnNewButton_3.setBackground(new Color(255, 240, 245));
			btnNewButton_3.setIcon(new ImageIcon(Main03_random.class.getResource("/image/44.png")));
			btnNewButton_3.setBounds(309, 546, 86, 138);
			add(btnNewButton_3);
			
			JButton btnNewButton_4 = new JButton("New button");
			btnNewButton_4.setIcon(new ImageIcon(Main03_random.class.getResource("/image/33.png")));
			btnNewButton_4.setBounds(428, 546, 100, 138);
			add(btnNewButton_4);
			
			JButton btnNewButton_1 = new JButton("");
			btnNewButton_1.setIcon(new ImageIcon(Main03_random.class.getResource("/image/555.png")));
			btnNewButton_1.setBounds(169, 546, 113, 138);
			add(btnNewButton_1);
			
			JLabel lblNewLabel = new JLabel("");
			lblNewLabel.setIcon(new ImageIcon(Main03_random.class.getResource("/image/777777.png")));
			lblNewLabel.setBounds(97, 718, 375, 242);
			add(lblNewLabel);
			
		
			
		
			
			
		}
}