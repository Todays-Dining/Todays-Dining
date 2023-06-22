package com.dining.mypage;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.SystemColor;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.ImageIcon;
import javax.swing.JTextField;
import javax.swing.JButton;

public class Mypage02_mypick extends JPanel {
	JTextField textField_9;
	  
	
	 String header[]={"가게 이름"};
    String contents[][]={
   		 {"가게 이름"},
   		 {"가게 이름"},
   		 {"가게 이름"},
   		 {"가게 이름"},
   		 {"가게 이름"},
    };
    String selection[]= {"가게 이름"}; 
    JTable table;
    JTable table_1;
    JTextField textField;
	/**
	 * Create the panel.
	 */
	public Mypage02_mypick() {
		setForeground(new Color(0, 0, 0));
		setBackground(new Color(255, 240, 245));
		setBounds(100, 100, 540, 960);
		setLayout(null);
		
		JButton btnNewButton = new JButton("");
		btnNewButton.setIcon(new ImageIcon("C:\\TeamProject\\src\\image\\heart.png"));
		btnNewButton.setBounds(448, 329, 44, 54);
		add(btnNewButton);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setIcon(new ImageIcon("D:\\JHY\\javastudy\\javastudy\\src\\images\\icon_1.png"));
		lblNewLabel_3.setBounds(0, 590, 540, 360);
		add(lblNewLabel_3);
		
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setIcon(new ImageIcon("D:\\JHY\\javastudy\\javastudy\\src\\images\\homebutton_1.png"));
		lblNewLabel_1.setBounds(346, 41, 60, 60);
		add(lblNewLabel_1);
		
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
		table.setLocation(63, 256);
		table.setSize(343, 244);
		table.setPreferredSize(new Dimension(750, 500));
		table.setPreferredScrollableViewportSize(new Dimension(1030, 450));
		table.setRowMargin(2);
		table.setGridColor(new Color(255, 108, 108));
		table.setRowHeight(40);
		table.getTableHeader();
		add(table);
		
		
		JLabel lblNewLabel3 = new JLabel("");
		lblNewLabel3.setIcon(new ImageIcon("C:\\TeamProject\\src\\image\\label_1.png"));
		lblNewLabel3.setBounds(0, -2, 540, 330);
		add(lblNewLabel3);
		
		JScrollPane scrollPane_1 = new JScrollPane(table);
		scrollPane_1.setBounds(93, 314, 343, 244);
		add(scrollPane_1);
		
		
	}
}
