package com.dining.main;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.JList;
import javax.swing.JTable;

public class Main02_store6_etc extends JPanel {
	
	String header[]= {"가게 이름","대표 메뉴","평점"};
	String contents[][]= {
			{"음식점1","햄버거","3.5"},
			{"음식점2","삼겹살","3.5"},
			{"음식점3","커피","3.5"},
			{"음식점4","치킨","3.5"},
			{"음식점5","김밥","3.5"},
			{"음식점6","떡볶이","3.5"},
			{"음식점7","피자","3.5"},
			{"음식점8","곱창","3.5"},
			{"음식점9","회","3.5"},
			{"음식점11","카레","3.5"},
			{"음식점12","초밥","3.5"},
			{"음식점13","덮밥","3.5"},
			{"음식점14","짜장면","3.5"},
			{"음식점15","마라탕","3.5"},
	};
	String selection[]= {"가게 이름"}; 
    JTable table;
    JTable table_1;
    JTextField textField;
	/**
	 * Create the panel.
	 */
	public Main02_store6_etc() {
		setForeground(new Color(0, 0, 0));
		setBackground(new Color(255, 240, 245));
		setBounds(100, 100, 540, 960);
		setLayout(null);
		
		
		
		JLabel lblNewLabel_2 = new JLabel("뭐먹지?");
		lblNewLabel_2.setOpaque(true);
		lblNewLabel_2.setForeground(new Color(255, 255, 255));
		lblNewLabel_2.setBackground(new Color(65, 105, 225));
		lblNewLabel_2.setFont(new Font("Sandoll 삼립호빵체 TTF Basic", Font.PLAIN, 30));
		lblNewLabel_2.setHorizontalAlignment(JLabel.CENTER);
		lblNewLabel_2.setBounds(163, 258, 200, 40);
		add(lblNewLabel_2);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\TeamProject\\src\\image\\label_1.png"));
		lblNewLabel.setBounds(0, 0, 540, 330);
		add(lblNewLabel);
		
		JButton homebutton = new JButton("");
		homebutton.setBorderPainted(false);
		homebutton.setIcon(new ImageIcon("D:\\JHY\\javastudy\\javastudy\\src\\images\\homebutton_1.png"));
		homebutton.setBackground(new Color(255, 240, 245));
		homebutton.setBounds(346, 40, 60, 60);
		add(homebutton);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBorderPainted(false);
		menuBar.setToolTipText("");
		menuBar.setBackground(new Color(255, 240, 245));
		menuBar.setBounds(418, 40, 62, 61);
		add(menuBar);
		
		JMenu movemenu = new JMenu("");
		movemenu.setOpaque(true);
		movemenu.setIconTextGap(0);
		movemenu.setIcon(new ImageIcon("C:\\TeamProject\\src\\image\\menubutton.png"));
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
		
	
		table = new JTable(contents, header);
		table.setBackground(new Color(255, 187, 187));
		table.setLocation(84, 380);
		table.setSize(350, 600);
		table.setPreferredSize(new Dimension(750, 500));
		table.setPreferredScrollableViewportSize(new Dimension(1030, 450));
		table.setRowMargin(2);
		table.setGridColor(new Color(255, 108, 108));
		table.setRowHeight(40);
		table.getTableHeader();
		add(table);
		
		JScrollPane scrollPane = new JScrollPane(table);
		scrollPane.setBounds(49, 350, 450, 450);
		add(scrollPane);
	}
}
