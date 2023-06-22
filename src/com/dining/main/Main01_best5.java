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

public class Main01_best5 extends JPanel{


	/**
	 * Create the application.
	 */
	public Main01_best5() {
			
		setForeground(new Color(0, 0, 0));
		setBackground(new Color(255, 240, 245));
		setBounds(100, 100, 540, 960);
		setLayout(null);
			
		
		
		JLabel today = new JLabel("주간 BEST");
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
		image.setBounds(69, 365, 411, 231);
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
			
			JLabel lblNewLabel = new JLabel("평점 5위 ");
			lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
			lblNewLabel.setFont(new Font("휴먼매직체", Font.BOLD, 30));
			lblNewLabel.setBounds(127, 634, 297, 61);
			add(lblNewLabel);
			
			
			JButton btnNewButton_1 = new JButton("");
			btnNewButton_1.setIcon(new ImageIcon("C:\\image\\asd.png"));
			btnNewButton_1.setBounds(146, 729, 227, 95);
			add(btnNewButton_1);
			
			
		}
}

