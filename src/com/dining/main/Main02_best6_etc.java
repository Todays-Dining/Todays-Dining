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

public class Main02_best6_etc extends JPanel{


	/**
	 * Create the application.
	 */
	public Main02_best6_etc() {
			
		setForeground(new Color(0, 0, 0));
		setBackground(new Color(255, 240, 245));
		setBounds(100, 100, 540, 960);
		setLayout(null);
			
		
		
		JLabel today = new JLabel("기타 BEST");
		today.setOpaque(true);
		today.setHorizontalAlignment(SwingConstants.CENTER);
		today.setForeground(new Color(65, 105, 225));
		today.setFont(new Font("Sandoll 삼립호빵체 TTF Basic", Font.PLAIN, 50));
		today.setBackground(new Color(255, 240, 245));
		today.setBounds(69, 266, 381, 89);
		add(today);
		
		JLabel image = new JLabel("가게이미지");
		image.setOpaque(true);
		image.setHorizontalAlignment(SwingConstants.CENTER);
		image.setForeground(new Color(255, 255, 255));
		image.setFont(new Font("Sandoll 삼립호빵체 TTF Basic", Font.PLAIN, 50));
		image.setBackground(new Color(65, 105, 225));
		image.setBounds(69, 379, 411, 209);
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
			
			
			JButton homeButton = new JButton("");
			homeButton.setBorderPainted(false);
			homeButton.setIcon(new ImageIcon("C:\\image\\homebutton_1.png"));
			homeButton.setBackground(new Color(255, 240, 245));
			homeButton.setBounds(327, 32, 77, 69);
			add(homeButton);
			
			
			JMenu movemenu = new JMenu("");
			movemenu.setOpaque(true);
			movemenu.setIconTextGap(0);
			movemenu.setIcon(new ImageIcon("C:\\image\\menubutton.png"));
			movemenu.setBorderPainted(true);
			movemenu.setBackground(new Color(255, 240, 245));
			menuBar.add(movemenu);
			

			
			JLabel lblNewLabel_1 = new JLabel("");
			lblNewLabel_1.setIcon(new ImageIcon("C:\\image\\label_1.png"));
			lblNewLabel_1.setBounds(0, 10, 540, 330);
			add(lblNewLabel_1);
			

			
			
			RoundedButton_lsh_1 btnNewButton_1 = new RoundedButton_lsh_1("다른 가게 보기");
			btnNewButton_1.setBorderPainted(false);
			btnNewButton_1.setOpaque(true);
			btnNewButton_1.setHorizontalAlignment(SwingConstants.CENTER);
			btnNewButton_1.setForeground(new Color(255, 255, 255));
			btnNewButton_1.setFont(new Font("Dialog", Font.BOLD, 20));
			btnNewButton_1.setBackground(new Color(65, 105, 225));
			btnNewButton_1.setBounds(185, 794, 175, 45);
			add(btnNewButton_1);
			
			JButton btnNewButton = new JButton("");
			btnNewButton.setIcon(new ImageIcon("C:\\image\\qww.png"));
			btnNewButton.setBounds(108, 621, 321, 128);
			add(btnNewButton);
			
			
		}
}
