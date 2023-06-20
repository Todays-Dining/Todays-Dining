package com.dining.login;

import java.awt.Color;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Find_id_page extends JPanel {
	JTextField id_textField;
	 JTextField birth_textField;
	 JTextField email_textField;

	/**
	 * Create the panel.
	 */
	public Find_id_page() {
		setForeground(new Color(0, 0, 0));
		setBackground(new Color(255, 240, 245));
		setBounds(100, 100, 540, 960);
		setLayout(null);
		
		JLabel main_label = new JLabel("");
		main_label.setIcon(new ImageIcon(Find_id_page.class.getResource("/image/label.png")));
		main_label.setBounds(0, 0, 516, 210);
		add(main_label);
		
		JLabel main_icon = new JLabel("");
		main_icon.setIcon(new ImageIcon(Find_id_page.class.getResource("/image/icon_small.png")));
		main_icon.setBounds(51, 654, 446, 306);
		add(main_icon);
		
		JLabel findid_label = new JLabel("아이디 찾기");
		findid_label.setForeground(new Color(65, 105, 225));
		findid_label.setFont(new Font("Sandoll 삼립호빵체 TTF Basic", Font.PLAIN, 50));
		findid_label.setBounds(166, 220, 224, 73);
		add(findid_label);
		
		id_textField = new JTextField();
		id_textField.setBounds(217, 333, 224, 28);
		add(id_textField);
		id_textField.setColumns(10);
		
		RoundedButton find_id = new RoundedButton("아이디 찾기");
		find_id.setFont(new Font("Sandoll 삼립호빵체 TTF Basic", Font.BOLD, 17));
		find_id.setForeground(new Color(255, 240, 245));
		find_id.setBackground(new Color(65, 105, 225));
		find_id.setBorderPainted(false);
		find_id.setBounds(112, 518, 118, 49);
		add(find_id);
		
		RoundedButton find_pw = new RoundedButton("비밀번호 찾기");
		find_pw.setText("취 소");
		find_pw.setFont(new Font("Sandoll 삼립호빵체 TTF Basic", Font.BOLD, 17));
		find_pw.setForeground(new Color(255, 240, 245));
		find_pw.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		find_pw.setBackground(new Color(65, 105, 225));
		find_pw.setBorderPainted(false);
		find_pw.setBounds(300, 518, 118, 49);
		add(find_pw);
		
		RoundedButton2 id_label = new RoundedButton2(" I D");
		id_label.setText("이 름");
		id_label.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		id_label.setEnabled(false);
		id_label.setBorderPainted(false);
		id_label.setBackground(new Color(65, 105, 225));
		id_label.setFont(new Font("Sandoll 삼립호빵체 TTF Basic", Font.BOLD, 20));
		id_label.setForeground(new Color(255, 240, 245));
		id_label.setBounds(94, 333, 92, 28);
		add(id_label);
		
		RoundedButton2 birth_label = new RoundedButton2(" I D");
		birth_label.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		birth_label.setText("생년월일");
		birth_label.setForeground(new Color(255, 240, 245));
		birth_label.setFont(new Font("Sandoll 삼립호빵체 TTF Basic", Font.BOLD, 20));
		birth_label.setEnabled(false);
		birth_label.setBorderPainted(false);
		birth_label.setBackground(new Color(65, 105, 225));
		birth_label.setBounds(94, 388, 92, 28);
		add(birth_label);
		
		birth_textField = new JTextField();
		birth_textField.setColumns(10);
		birth_textField.setBounds(217, 388, 224, 28);
		add(birth_textField);
		
		RoundedButton2 email_label = new RoundedButton2(" I D");
		email_label.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		email_label.setText("이메일");
		email_label.setForeground(new Color(255, 240, 245));
		email_label.setFont(new Font("Sandoll 삼립호빵체 TTF Basic", Font.BOLD, 20));
		email_label.setEnabled(false);
		email_label.setBorderPainted(false);
		email_label.setBackground(new Color(65, 105, 225));
		email_label.setBounds(94, 441, 92, 28);
		add(email_label);
		
		email_textField = new JTextField();
		email_textField.setColumns(10);
		email_textField.setBounds(217, 440, 224, 28);
		add(email_textField);
	}
}
