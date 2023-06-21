package com.dining.tool;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class admin_tool_panel extends JPanel {

	/**
	 * Create the panel.
	 */
	public admin_tool_panel() {
		setBackground(new Color(255, 240, 245));
		setBounds(100, 100, 1200, 800);
		setLayout(null);
		
		JLabel lblNewLabel = new JLabel("회원정보");
		lblNewLabel.setForeground(new Color(65, 105, 225));
		lblNewLabel.setFont(new Font("Sandoll 삼립호빵체 TTF Basic", Font.PLAIN, 50));
		lblNewLabel.setBounds(36, 41, 207, 89);
		add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setOpaque(true);
		lblNewLabel_1.setBackground(new Color(65, 105, 225));
		lblNewLabel_1.setBounds(36, 115, 1120, 8);
		add(lblNewLabel_1);
		
		JButton backbutton = new JButton("");
		backbutton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		backbutton.setBorderPainted(false);
		backbutton.setBackground(new Color(255, 240, 245));
		backbutton.setIcon(new ImageIcon(admin_tool_panel.class.getResource("/image/backbutton.png")));
		backbutton.setBounds(1068, 54, 97, 58);
		add(backbutton);
	}

}
