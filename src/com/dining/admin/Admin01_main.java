package com.dining.admin;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class Admin01_main extends JPanel {

	/**
	 * Create the panel.
	 */
	public Admin01_main() {
		
		setBackground(new Color(255, 240, 245));
		setBounds(100, 100, 1200, 800);
		setLayout(null);

		JLabel lblNewLabel = new JLabel("Admin");
		lblNewLabel.setForeground(new Color(65, 105, 225));
		lblNewLabel.setFont(new Font("Sandoll 삼립호빵체 TTF Basic", Font.PLAIN, 60));
		lblNewLabel.setBounds(498, 50, 207, 89);
		add(lblNewLabel);

		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setOpaque(true);
		lblNewLabel_1.setBackground(new Color(65, 105, 225));
		lblNewLabel_1.setBounds(33, 136, 1120, 8);
		add(lblNewLabel_1);

		JLabel lblNewLabel_1_1 = new JLabel("");
		lblNewLabel_1_1.setOpaque(true);
		lblNewLabel_1_1.setBackground(new Color(65, 105, 225));
		lblNewLabel_1_1.setBounds(33, 699, 1120, 8);
		add(lblNewLabel_1_1);

		RoundedButton_kjhw_1 btnNewButton = new RoundedButton_kjhw_1("회원정보");
		btnNewButton.setForeground(new Color(255, 240, 245));
		btnNewButton.setBackground(new Color(65, 105, 255));
		btnNewButton.setBorderPainted(false);
		btnNewButton.setFont(new Font("Sandoll 삼립호빵체 TTF Basic", Font.PLAIN, 40));
		btnNewButton.setBounds(131, 285, 230, 255);
		add(btnNewButton);

		RoundedButton_kjhw_1 btnNewButton_1 = new RoundedButton_kjhw_1("음식점");
		btnNewButton_1.setBackground(new Color(65, 105, 255));
		btnNewButton_1.setBorderPainted(false);
		btnNewButton_1.setForeground(new Color(255, 240, 245));
		btnNewButton_1.setFont(new Font("Sandoll 삼립호빵체 TTF Basic", Font.PLAIN, 40));
		btnNewButton_1.setBounds(475, 285, 230, 255);
		add(btnNewButton_1);

		RoundedButton_kjhw_1 btnNewButton_2 = new RoundedButton_kjhw_1("리뷰 및 평점");
		btnNewButton_2.setBackground(new Color(65, 105, 255));
		btnNewButton_2.setBorderPainted(false);
		btnNewButton_2.setForeground(new Color(255, 240, 245));
		btnNewButton_2.setFont(new Font("Sandoll 삼립호빵체 TTF Basic", Font.PLAIN, 40));
		btnNewButton_2.setBounds(849, 285, 230, 255);
		add(btnNewButton_2);
	}

}
