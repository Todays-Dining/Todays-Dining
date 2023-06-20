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
import javax.swing.JComboBox;

public class Find_pw_page extends JPanel {
	JTextField id_textField;
	 JTextField email_textField;
	 
	/**
	 * Create the panel.
	 */
	public Find_pw_page() {
		setForeground(new Color(0, 0, 0));
		setBackground(new Color(255, 240, 245));
		setBounds(100, 100, 540, 960);
		setLayout(null);
		
		JLabel main_label = new JLabel("");
		main_label.setIcon(new ImageIcon(Find_pw_page.class.getResource("/image/label.png")));
		main_label.setBounds(0, 0, 516, 210);
		add(main_label);
		
		JLabel main_icon = new JLabel("");
		main_icon.setIcon(new ImageIcon(Find_pw_page.class.getResource("/image/icon_small.png")));
		main_icon.setBounds(51, 654, 446, 306);
		add(main_icon);
		
		JLabel findid_label = new JLabel("비밀번호 찾기");
		findid_label.setForeground(new Color(65, 105, 225));
		findid_label.setFont(new Font("Sandoll 삼립호빵체 TTF Basic", Font.PLAIN, 50));
		findid_label.setBounds(148, 220, 252, 73);
		add(findid_label);
		
		id_textField = new JTextField();
		id_textField.setBounds(217, 333, 224, 28);
		add(id_textField);
		id_textField.setColumns(10);
		
		RoundedButton find_id = new RoundedButton("아이디 찾기");
		find_id.setText("PW 찾기");
		find_id.setFont(new Font("Sandoll 삼립호빵체 TTF Basic", Font.BOLD, 17));
		find_id.setForeground(new Color(255, 240, 245));
		find_id.setBackground(new Color(255, 128, 128));
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
		id_label.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		id_label.setEnabled(false);
		id_label.setBorderPainted(false);
		id_label.setBackground(new Color(65, 105, 225));
		id_label.setFont(new Font("Sandoll 삼립호빵체 TTF Basic", Font.BOLD, 20));
		id_label.setForeground(new Color(255, 240, 245));
		id_label.setBounds(68, 333, 118, 28);
		add(id_label);
		
		RoundedButton2 birth_label = new RoundedButton2(" I D");
		birth_label.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		birth_label.setText("PW찾기질문");
		birth_label.setForeground(new Color(255, 240, 245));
		birth_label.setFont(new Font("Sandoll 삼립호빵체 TTF Basic", Font.BOLD, 20));
		birth_label.setEnabled(false);
		birth_label.setBorderPainted(false);
		birth_label.setBackground(new Color(65, 105, 225));
		birth_label.setBounds(68, 388, 118, 28);
		add(birth_label);
		
		RoundedButton2 email_label = new RoundedButton2(" I D");
		email_label.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		email_label.setText("질문 답변");
		email_label.setForeground(new Color(255, 240, 245));
		email_label.setFont(new Font("Sandoll 삼립호빵체 TTF Basic", Font.BOLD, 20));
		email_label.setEnabled(false);
		email_label.setBorderPainted(false);
		email_label.setBackground(new Color(65, 105, 225));
		email_label.setBounds(68, 441, 118, 28);
		add(email_label);
		
		email_textField = new JTextField();
		email_textField.setColumns(10);
		email_textField.setBounds(217, 440, 224, 28);
		add(email_textField);
		
		String[] items = {"질문1", "질문2", "질문3", "질문4","질문5"};
		JComboBox comboBox = new JComboBox(items);
		comboBox.setFont(new Font("Sandoll 삼립호빵체 TTF Basic", Font.PLAIN, 16));
		comboBox.setBounds(217, 388, 224, 28);
		add(comboBox);
	}
}
