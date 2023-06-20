package com.dining.main;

import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.ImageIcon;

public class test02 extends JPanel {

	/**
	 * Create the panel.
	 */
	public test02() {
		setBackground(new Color(255, 240, 245));
		setLayout(null);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon("D:\\KJH\\teamproject\\Todays-Dining\\src\\image\\icon.png"));
		lblNewLabel.setBounds(-12, 394, 504, 427);
		add(lblNewLabel);

	}
}
