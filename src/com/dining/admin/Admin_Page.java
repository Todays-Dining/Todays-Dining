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
import javax.swing.UIManager;

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
		frame.setBounds(100, 100, 540, 960);
		// 화면사이즈고정
		frame.setResizable(false);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 240, 245));
		panel.setBounds(0, 0, 524, 932);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		
		JLabel lblNewLabel = new JLabel("Admin");
		lblNewLabel.setFont(new Font("Comic Sans Ms", lblNewLabel.getFont().getStyle() | Font.BOLD, lblNewLabel.getFont().getSize() + 50));
		lblNewLabel.setForeground(new Color(65, 105, 225));
		lblNewLabel.setBounds(171, 65, 244, 64);
		panel.add(lblNewLabel);
		
		RoundedButton btnNewButton = new RoundedButton("음식점");
		btnNewButton.setFont(new Font("HY엽서M", Font.BOLD, 55));
		btnNewButton.setBorderPainted(false);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.setBounds(28, 380, 470, 160);
		panel.add(btnNewButton);
		
		RoundedButton btnNewButton_1 = new RoundedButton("리뷰및평점");
		btnNewButton_1.setFont(new Font("HY엽서M", Font.BOLD, 55));
		btnNewButton_1.setBorderPainted(false);
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_1.setBounds(28, 568, 470, 160);
		panel.add(btnNewButton_1);
		
		RoundedButton btnNewButton_2 = new RoundedButton("회원정보");
		btnNewButton_2.setFont(new Font("HY엽서M", Font.BOLD, 55));
		btnNewButton_2.setBorderPainted(false);
		btnNewButton_2.setBounds(28, 192, 470, 160);
		panel.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("");
		btnNewButton_3.setEnabled(false);
		btnNewButton_3.setBackground(new Color(65, 105, 225));
		btnNewButton_3.setBorderPainted(false);
		btnNewButton_3.setBounds(28, 128, 470, 4);
		panel.add(btnNewButton_3);
		
		JButton btnNewButton_3_1 = new JButton("");
		btnNewButton_3_1.setEnabled(false);
		btnNewButton_3_1.setBorderPainted(false);
		btnNewButton_3_1.setBackground(new Color(65, 105, 225));
		btnNewButton_3_1.setBounds(28, 786, 470, 4);
		panel.add(btnNewButton_3_1);
	}
}
