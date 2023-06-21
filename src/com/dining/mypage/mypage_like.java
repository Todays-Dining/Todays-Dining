package com.dining.mypage;

import java.awt.Color;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Font;
import javax.swing.JTextField;

public class mypage_like extends JPanel {

	/**
	 * Create the panel.
	 */
	public mypage_like() {
		setForeground(new Color(0, 0, 0));
		setBackground(new Color(255, 240, 245));
		setBounds(100, 100, 540, 960);
		setLayout(null);
		
		JLabel main_label = new JLabel("");
		main_label.setBounds(0, 0, 516, 210);
		main_label.setIcon(new ImageIcon("D:\\KJH\\teamproject\\Todays-Dining\\src\\image\\label.png"));
		add(main_label);
		
		JLabel main_icon = new JLabel("");
		main_icon.setBounds(51, 654, 446, 306);
		main_icon.setIcon(new ImageIcon("D:\\KJH\\teamproject\\Todays-Dining\\src\\image\\icon_small.png"));
		add(main_icon);
	}
}
