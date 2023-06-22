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

public class Main02_category_select extends JPanel{
	
	
	
	/**
	 * Create the panel.
	 */
	public Main02_category_select() {
		
		
		 
		setForeground(new Color(0, 0, 0));
		setBackground(new Color(255, 240, 245));
		setBounds(100, 100, 540, 960);
		setLayout(null);
		
		
		JLabel today = new JLabel("음식 종류");
		today.setOpaque(true);
		today.setHorizontalAlignment(SwingConstants.CENTER);
		today.setForeground(new Color(255, 255, 255));
		today.setFont(new Font("Sandoll 삼립호빵체 TTF Basic", Font.PLAIN, 50));
		today.setBackground(new Color(65, 105, 225));
		today.setBounds(80, 261, 381, 89);
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
		movemenu.setIcon(new ImageIcon("C:\\image\\menubutton.png"));
		movemenu.setBorderPainted(true);
		movemenu.setBackground(new Color(255, 240, 245));
		menuBar.add(movemenu);
			
	
		
		JButton homeButton = new JButton("");
		homeButton.setBorderPainted(false);
		homeButton.setIcon(new ImageIcon("C:\\image\\homebutton_1.png"));
		homeButton.setBackground(new Color(255, 240, 245));
		homeButton.setBounds(327, 32, 77, 69);
		add(homeButton);
		
		RoundedButton_lsh_1 menu1 = new RoundedButton_lsh_1("한식");
		menu1.setSelected(true);
		menu1.setBorderPainted(false);
		menu1.setToolTipText("");
		menu1.setForeground(new Color(255, 255, 255));
		menu1.setFont(new Font("맑은 고딕", Font.BOLD , 20));
		menu1.setBackground(new Color(65, 105, 225));
		menu1.setBounds(52, 460, 101, 96);
		add(menu1);
		
		


		RoundedButton_lsh_1 menu2 = new RoundedButton_lsh_1("양식");
		menu2.setFont(new Font("맑은 고딕", Font.BOLD, 20));
		menu2.setBackground(new Color(65, 105, 225));
		menu2.setBorderPainted(false);
		menu2.setToolTipText("");
		menu2.setForeground(new Color(255, 255, 255));
		menu2.setFont(new Font("맑은 고딕", Font.BOLD, 20));
		menu2.setBackground(new Color(65, 105, 225));
		menu2.setBounds(220, 460, 101, 96);
		add(menu2);

		
		RoundedButton_lsh_1 menu3 = new RoundedButton_lsh_1("중식");
		menu3.setBorderPainted(false);
		menu3.setToolTipText("");
		menu3.setForeground(new Color(255, 255, 255));
		menu3.setFont(new Font("맑은 고딕", Font.BOLD , 20));
		menu3.setBackground(new Color(65, 105, 225));
		menu3.setBounds(384, 460, 101, 96);
		add(menu3);
		
		RoundedButton_lsh_1 menu4 = new RoundedButton_lsh_1("일식");
		menu4.setBorderPainted(false);
		menu4.setToolTipText("");
		menu4.setForeground(new Color(255, 255, 255));
		menu4.setFont(new Font("맑은 고딕", Font.BOLD, 20));
		menu4.setBackground(new Color(65, 105, 225));
		menu4.setBounds(52, 678, 101, 89);
		add(menu4);
		
		RoundedButton_lsh_1 menu5 = new RoundedButton_lsh_1("카페");
		menu5.setBorderPainted(false);
		menu5.setToolTipText("");
		menu5.setForeground(new Color(255, 255, 255));
		menu5.setFont(new Font("맑은 고딕", Font.BOLD, 20));
		menu5.setBackground(new Color(65, 105, 225));
		menu5.setBounds(220, 678, 101, 89);
		add(menu5);
		
		RoundedButton_lsh_1 menu6 = new RoundedButton_lsh_1("기타");
		menu6.setBorderPainted(false);
		menu6.setToolTipText("");
		menu6.setForeground(new Color(255, 255, 255));
		menu6.setFont(new Font("맑은 고딕", Font.BOLD, 20));
		menu6.setBackground(new Color(65, 105, 225));
		menu6.setBounds(384, 678, 101, 89);
		add(menu6);
		

		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\image\\icon_1.png"));
		lblNewLabel_1.setIcon(new ImageIcon("C:\\image\\label_1.png"));
		lblNewLabel_1.setBounds(0, 0, 540, 330);
		add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon("C:\\image\\icon_1.png"));
		lblNewLabel_2.setBounds(0, 512, 540, 330);
		add(lblNewLabel_2);
		
//		JLabel lblNewLabel_3 = new JLabel("");
//		lblNewLabel_3.setIcon(new ImageIcon("C:\\image\\roundbutton.png"));
//		lblNewLabel_3.setBounds(0, 512, 540, 330);
//		add(lblNewLabel_3);
	
		
	
	}
}
