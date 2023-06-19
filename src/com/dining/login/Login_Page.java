package com.dining.login;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Login_Page {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login_Page window = new Login_Page();
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
	public Login_Page() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	ImageIcon img = new ImageIcon("src/image/homebutton_1.png");
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 540, 960);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 240, 245));
		frame.getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		
		JLabel lblNewLabel = new JLabel("로 그 인");
		lblNewLabel.setForeground(new Color(65, 105, 225));
		lblNewLabel.setFont(new Font("Sandoll 삼립호빵체 TTF Basic", Font.BOLD, 54));
		lblNewLabel.setBounds(173, 275, 209, 55);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("I  D ");
		lblNewLabel_1.setFont(new Font("Sandoll 삼립호빵체 TTF Basic", Font.BOLD, 20));
		lblNewLabel_1.setForeground(new Color(65, 105, 225));
		lblNewLabel_1.setBounds(80, 357, 57, 34);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("P.W");
		lblNewLabel_2.setFont(new Font("Sandoll 삼립호빵체 TTF Basic", Font.BOLD, 20));
		lblNewLabel_2.setForeground(new Color(65, 105, 225));
		lblNewLabel_2.setBounds(80, 414, 57, 29);
		panel.add(lblNewLabel_2);
		
		textField = new JTextField();
		textField.setBounds(149, 365, 209, 23);
		panel.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(149, 419, 209, 23);
		panel.add(textField_1);
		textField_1.setColumns(10);
		
		JButton btnNewButton = new JButton("Logein\r\n");
		btnNewButton.setBorderPainted(false);
		btnNewButton.setBackground(new Color(65, 105, 225));
		btnNewButton.setForeground(new Color(255, 240, 245));
		btnNewButton.setFont(btnNewButton.getFont().deriveFont(btnNewButton.getFont().getStyle() | Font.BOLD | Font.ITALIC, btnNewButton.getFont().getSize() + 4f));
		btnNewButton.setBounds(396, 371, 87, 60);
		panel.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("아이디 찾기");
		btnNewButton_1.setFont(btnNewButton_1.getFont().deriveFont(btnNewButton_1.getFont().getStyle() | Font.BOLD | Font.ITALIC, btnNewButton_1.getFont().getSize() + 2f));
		btnNewButton_1.setBorderPainted(false);
		btnNewButton_1.setBackground(new Color(65, 105, 225));
		btnNewButton_1.setForeground(new Color(255, 240, 245));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_1.setBounds(61, 501, 113, 23);
		panel.add(btnNewButton_1);
		
		JButton btnNewButton_1_1 = new JButton("비밀번호 찾기");
		btnNewButton_1_1.setFont(btnNewButton_1_1.getFont().deriveFont(btnNewButton_1_1.getFont().getStyle() | Font.BOLD | Font.ITALIC, btnNewButton_1_1.getFont().getSize() + 2f));
		btnNewButton_1_1.setBorderPainted(false);
		btnNewButton_1_1.setBackground(new Color(65, 105, 225));
		btnNewButton_1_1.setForeground(new Color(255, 240, 245));
		btnNewButton_1_1.setBounds(197, 501, 140, 23);
		panel.add(btnNewButton_1_1);
		
		JButton btnNewButton_1_1_1 = new JButton("회원가입");
		btnNewButton_1_1_1.setFont(btnNewButton_1_1_1.getFont().deriveFont(btnNewButton_1_1_1.getFont().getStyle() | Font.BOLD | Font.ITALIC, btnNewButton_1_1_1.getFont().getSize() + 2f));
		btnNewButton_1_1_1.setBorderPainted(false);
		btnNewButton_1_1_1.setBackground(new Color(65, 105, 225));
		btnNewButton_1_1_1.setForeground(new Color(255, 240, 245));
		btnNewButton_1_1_1.setBounds(362, 501, 97, 23);
		panel.add(btnNewButton_1_1_1);
		
//		JButton homebutton = new JButton(img);
//		homebutton.setBorderPainted(false); // 버튼테두리 삭제
//		homebutton.setBackground(new Color(255, 240, 245)); // 버튼 배경색
//		homebutton.setBounds(394, 307, 60, 60);
//		homebutton.setPreferredSize(new Dimension(60,60));// 버튼 영역 선택
//		panel.add(homebutton);
		Dining_Canvas dc_1 = new Dining_Canvas();
		panel.add(dc_1);
		dc_1.setBounds(-12, 336, 520, 600);
		Dining_Canvas2 dc_2 = new Dining_Canvas2();
		panel.add(dc_2);
		dc_2.setBounds(-16, -268, 520, 660);
		
		
	}
}
