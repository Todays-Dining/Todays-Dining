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
import javax.swing.SwingConstants;
import java.awt.Label;

public class Main00_Map extends JPanel{
	
	
	
	/**
	 * Create the panel.
	 */
	public Main00_Map() {
		
		
		 
		setForeground(new Color(0, 0, 0));
		setBackground(new Color(255, 240, 245));
		setBounds(100, 100, 540, 960);
		setLayout(null);
		
		
		JLabel today = new JLabel("지역 선택");
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
		homeButton.setIcon(new ImageIcon(Main00_Map.class.getResource("/image/homebutton_1.png")));
		homeButton.setBackground(new Color(255, 240, 245));
		homeButton.setBounds(327, 32, 77, 69);
		add(homeButton);
		
		RoundedButton_lsh_1 place1_bt = new RoundedButton_lsh_1("한식");
		place1_bt.setText("마포구");
		place1_bt.setBorderPainted(false);
		place1_bt.setToolTipText("");
		place1_bt.setForeground(new Color(255, 255, 255));
		place1_bt.setFont(new Font("Sandoll 삼립호빵체 TTF Outline", Font.BOLD, 30));
		place1_bt.setBackground(new Color(65, 105, 225));
		place1_bt.setBounds(57, 389, 101, 96);
		add(place1_bt);
		

		JLabel label_lb = new JLabel("");
		label_lb.setIcon(new ImageIcon(Main00_Map.class.getResource("/image/label.png")));
		label_lb.setBounds(0, 0, 540, 330);
		add(label_lb);
		
		JLabel icon_lb = new JLabel("");
		icon_lb.setIcon(new ImageIcon(Main00_Map.class.getResource("/image/icon_small.png")));
		icon_lb.setBounds(50, 645, 540, 330);
		add(icon_lb);
		
		RoundedButton_lsh_1 place2_bt = new RoundedButton_lsh_1("한식");
		place2_bt.setText("신촌");
		place2_bt.setToolTipText("");
		place2_bt.setForeground(Color.WHITE);
		place2_bt.setFont(new Font("Sandoll 삼립호빵체 TTF Outline", Font.BOLD, 30));
		place2_bt.setBorderPainted(false);
		place2_bt.setBackground(new Color(65, 105, 225));
		place2_bt.setBounds(225, 389, 101, 96);
		add(place2_bt);
		
		RoundedButton_lsh_1 place3_bt = new RoundedButton_lsh_1("한식");
		place3_bt.setToolTipText("");
		place3_bt.setText("홍대");
		place3_bt.setForeground(Color.WHITE);
		place3_bt.setFont(new Font("Sandoll 삼립호빵체 TTF Outline", Font.BOLD, 30));
		place3_bt.setBorderPainted(false);
		place3_bt.setBackground(new Color(65, 105, 225));
		place3_bt.setBounds(389, 389, 101, 96);
		add(place3_bt);
		
		RoundedButton_lsh_1 place4_bt = new RoundedButton_lsh_1("한식");
		place4_bt.setText("을지로");
		place4_bt.setToolTipText("");
		place4_bt.setForeground(Color.WHITE);
		place4_bt.setFont(new Font("Sandoll 삼립호빵체 TTF Outline", Font.BOLD, 30));
		place4_bt.setBorderPainted(false);
		place4_bt.setBackground(new Color(65, 105, 225));
		place4_bt.setBounds(57, 520, 101, 96);
		add(place4_bt);
		
		RoundedButton_lsh_1 place5_bt = new RoundedButton_lsh_1("한식");
		place5_bt.setToolTipText("");
		place5_bt.setText("연남");
		place5_bt.setForeground(Color.WHITE);
		place5_bt.setFont(new Font("Sandoll 삼립호빵체 TTF Outline", Font.BOLD, 30));
		place5_bt.setBorderPainted(false);
		place5_bt.setBackground(new Color(65, 105, 225));
		place5_bt.setBounds(225, 520, 101, 96);
		add(place5_bt);
		
		RoundedButton_lsh_1 place6_bt = new RoundedButton_lsh_1("한식");
		place6_bt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		place6_bt.setToolTipText("");
		place6_bt.setText("강남");
		place6_bt.setForeground(Color.WHITE);
		place6_bt.setFont(new Font("Sandoll 삼립호빵체 TTF Outline", Font.BOLD, 30));
		place6_bt.setBorderPainted(false);
		place6_bt.setBackground(new Color(65, 105, 225));
		place6_bt.setBounds(389, 520, 101, 96);
		add(place6_bt);
		
//		JLabel lblNewLabel_3 = new JLabel("");
//		lblNewLabel_3.setIcon(new ImageIcon("C:\\image\\roundbutton.png"));
//		lblNewLabel_3.setBounds(0, 512, 540, 330);
//		add(lblNewLabel_3);
	
		
	
	}
}
