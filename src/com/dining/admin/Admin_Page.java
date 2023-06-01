package com.dining.admin;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Component;
import javax.swing.SwingConstants;

public class Admin_Page {

	private JFrame frame;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Admin_Page window = new Admin_Page();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		
	}

	/**
	 * Create the application.
	 */
	public Admin_Page() {
		initialize();
		
	}
	
	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(255, 240, 245));
		frame.setBounds(100, 100, 450, 700);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 240, 245));
		panel.setBounds(0, 0, 434, 661);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		
		JLabel lblNewLabel = new JLabel("Admin");
		lblNewLabel.setFont(new Font("AmeriGarmnd BT", lblNewLabel.getFont().getStyle() | Font.BOLD, lblNewLabel.getFont().getSize() + 50));
		lblNewLabel.setForeground(new Color(65, 105, 225));
		lblNewLabel.setBounds(133, 65, 184, 64);
		panel.add(lblNewLabel);
		
		JButton btnNewButton = new JButton("음식점");
		btnNewButton.setFont(btnNewButton.getFont().deriveFont(btnNewButton.getFont().getStyle() | Font.BOLD, btnNewButton.getFont().getSize() + 18f));
		btnNewButton.setForeground(new Color(0, 0, 0));
		btnNewButton.setBorderPainted(false);
		btnNewButton.setBackground(new Color(255, 250, 205));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.setBounds(33, 234, 160, 160);
		panel.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("<html><body><center>리뷰및<br>평점</center></body></html>");
		btnNewButton_1.setFont(btnNewButton_1.getFont().deriveFont(btnNewButton_1.getFont().getStyle() | Font.BOLD, btnNewButton_1.getFont().getSize() + 15f));
		btnNewButton_1.setForeground(new Color(0, 0, 0));
		btnNewButton_1.setBackground(new Color(224, 255, 255));
		btnNewButton_1.setBorderPainted(false);
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_1.setBounds(237, 237, 160, 160);
		panel.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("회원정보");
		btnNewButton_2.setFont(btnNewButton_2.getFont().deriveFont(btnNewButton_2.getFont().getStyle() | Font.BOLD, btnNewButton_2.getFont().getSize() + 14f));
		btnNewButton_2.setForeground(new Color(0, 0, 0));
		btnNewButton_2.setBackground(new Color(255, 182, 193));
		btnNewButton_2.setBorderPainted(false);
		btnNewButton_2.setBounds(133, 420, 160, 160);
		panel.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("");
		btnNewButton_3.setEnabled(false);
		btnNewButton_3.setBackground(new Color(65, 105, 225));
		btnNewButton_3.setBorderPainted(false);
		btnNewButton_3.setBounds(33, 125, 364, 4);
		panel.add(btnNewButton_3);
	}
	
}
