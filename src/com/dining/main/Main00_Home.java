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
import javax.swing.JTextField;

import com.dining.mypage.RoundedButton_ha0_1;

public class Main00_Home extends JPanel {
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Create the panel.
	 */
	public Main00_Home() {
		setForeground(new Color(0, 0, 0));
		setBackground(new Color(255, 240, 245));
		setBounds(100, 100, 540, 960);
		setLayout(null);
		
		JButton homebutton = new JButton("");
		homebutton.setBorderPainted(false);
		homebutton.setIcon(new ImageIcon("D:\\JHY\\javastudy\\javastudy\\src\\images\\homebutton_1.png"));
		homebutton.setBackground(new Color(255, 240, 245));
		homebutton.setBounds(346, 40, 60, 60);
		add(homebutton);
		
		RoundedButton_ha0_1 btnNewButton= new RoundedButton_ha0_1("주간 Best");
		btnNewButton.setForeground(new Color(255, 255, 255));
		btnNewButton.setBorderPainted(false);
		btnNewButton.setBackground(new Color(65, 105, 225));
		btnNewButton.setFont(new Font("Sandoll 삼립호빵체 TTF Basic", Font.PLAIN, 24));
		btnNewButton.setBounds(162, 367, 204, 61);
		add(btnNewButton);
		
		RoundedButton_ha0_1 btnNewButton_1 = new RoundedButton_ha0_1("음식 카테고리");
		btnNewButton_1.setForeground(new Color(255, 255, 255));
		btnNewButton_1.setBorderPainted(false);
		btnNewButton_1.setBackground(new Color(65, 105, 225));
		btnNewButton_1.setFont(new Font("Sandoll 삼립호빵체 TTF Basic", Font.PLAIN, 24));
		btnNewButton_1.setBounds(162, 438, 204, 61);
		add(btnNewButton_1);
		
		RoundedButton_ha0_1 btnNewButton_2 = new RoundedButton_ha0_1("오늘 뭐먹죠?");
		btnNewButton_2.setForeground(new Color(255, 255, 255));
		btnNewButton_2.setBorderPainted(false);
		btnNewButton_2.setBackground(new Color(65, 105, 225));
		btnNewButton_2.setFont(new Font("Sandoll 삼립호빵체 TTF Basic", Font.PLAIN, 24));
		btnNewButton_2.setBounds(162, 509, 204, 61);
		add(btnNewButton_2);
		
		textField = new JTextField();
		textField.setBounds(118, 264, 280, 50);
		add(textField);
		textField.setColumns(10);
		
		RoundedButton_ha0_1 btnNewButton_3 = new RoundedButton_ha0_1("검색");
		btnNewButton_3.setForeground(new Color(255, 255, 255));
		btnNewButton_3.setBorderPainted(false);
		btnNewButton_3.setBackground(new Color(65, 105, 225));
		btnNewButton_3.setFont(new Font("Sandoll 삼립호빵체 TTF Basic", Font.PLAIN, 24));
		btnNewButton_3.setBounds(410, 264, 70, 50);
		add(btnNewButton_3);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\TeamProject\\src\\image\\icon_1.png"));
		lblNewLabel_1.setBounds(0, 590, 540, 360);
		add(lblNewLabel_1);
		
		textField_1 = new JTextField("인기많은 검색어 : 한식, 대학가, 커플, 디저트");
		textField_1.setBounds(118, 319, 280, 21);
		textField_1.setBackground(new Color(255, 240, 245));
		textField_1.setFont(new Font("Sandoll 삼립호빵체 TTF Basic", Font.PLAIN, 16));
		textField_1.setForeground(Color.GRAY);
		add(textField_1);
		textField_1.setColumns(50);
		
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
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\TeamProject\\src\\image\\label_1.png"));
		lblNewLabel.setBounds(0, -2, 540, 330);
		add(lblNewLabel);
		
	}

}
