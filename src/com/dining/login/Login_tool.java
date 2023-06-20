package com.dining.login;

import java.awt.Color;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Font;
import javax.swing.JTextField;

public class Login_tool extends JPanel {

	/**
	 * Create the panel.
	 */
	public Login_tool() {
		setForeground(new Color(0, 0, 0));
		setBackground(new Color(255, 240, 245));
		setBounds(100, 100, 540, 960);
		setLayout(null);
		
		JLabel main_label = new JLabel("");
		main_label.setIcon(new ImageIcon("D:\\KJH\\teamproject\\Todays-Dining\\src\\image\\label.png"));
		main_label.setBounds(0, 0, 516, 210);
		add(main_label);
		
		JLabel main_icon = new JLabel("");
		main_icon.setIcon(new ImageIcon("D:\\KJH\\teamproject\\Todays-Dining\\src\\image\\icon_small.png"));
		main_icon.setBounds(51, 654, 446, 306);
		add(main_icon);
	}
}
