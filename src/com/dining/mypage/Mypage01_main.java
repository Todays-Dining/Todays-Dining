package com.dining.mypage;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Mypage01_main extends JPanel {
	private JTextField textField;

	/**
	 * Create the panel.
	 */
	public Mypage01_main() {
		setForeground(new Color(0, 0, 0));
		setBackground(new Color(255, 240, 245));
		setBounds(100, 100, 540, 960);
		setLayout(null);
		
		JLabel lblNewLabel = new JLabel("MY PAGE");
		lblNewLabel.setBounds(166, 89, 210, 50);
		lblNewLabel.setBackground(new Color(255, 240, 245));
		lblNewLabel.setFont(new Font("Sandoll 삼립호빵체 TTF Basic", Font.PLAIN, 50));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setForeground(Color.black);
		add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("ID");
		lblNewLabel_1.setOpaque(true);
		lblNewLabel_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1.setBackground(new Color(65, 105, 225));
		lblNewLabel_1.setFont(new Font("Sandoll 삼립호빵체 TTF Basic", Font.PLAIN, 24));
		lblNewLabel_1.setHorizontalAlignment(JLabel.CENTER);
		lblNewLabel_1.setBounds(79, 249, 90, 35);
		add(lblNewLabel_1);
		
		textField = new JTextField();
		textField.setBounds(183, 324, 250, 35);
		add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("PW");
		lblNewLabel_2.setOpaque(true);
		lblNewLabel_2.setForeground(new Color(255, 255, 255));
		lblNewLabel_2.setBackground(new Color(65, 105, 225));
		lblNewLabel_2.setFont(new Font("Sandoll 삼립호빵체 TTF Basic", Font.PLAIN, 24));
		lblNewLabel_2.setHorizontalAlignment(JLabel.CENTER);
		lblNewLabel_2.setBounds(79, 324, 90, 35);
		add(lblNewLabel_2);
		
		textField = new JTextField();
		textField.setBounds(183, 404, 250, 35);
		add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("이름");
		lblNewLabel_3.setOpaque(true);
		lblNewLabel_3.setForeground(new Color(255, 255, 255));
		lblNewLabel_3.setBackground(new Color(65, 105, 225));
		lblNewLabel_3.setFont(new Font("Sandoll 삼립호빵체 TTF Basic", Font.PLAIN, 24));
		lblNewLabel_3.setHorizontalAlignment(JLabel.CENTER);
		lblNewLabel_3.setBounds(79, 404, 90, 35);
		add(lblNewLabel_3);
		
		textField = new JTextField();
		textField.setBounds(183, 484, 250, 35);
		add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_4 = new JLabel("생년월일");
		lblNewLabel_4.setOpaque(true);
		lblNewLabel_4.setForeground(new Color(255, 255, 255));
		lblNewLabel_4.setBackground(new Color(65, 105, 225));
		lblNewLabel_4.setFont(new Font("Sandoll 삼립호빵체 TTF Basic", Font.PLAIN, 24));
		lblNewLabel_4.setHorizontalAlignment(JLabel.CENTER);
		lblNewLabel_4.setBounds(79, 484, 90, 35);
		add(lblNewLabel_4);
		
		textField = new JTextField();
		textField.setBounds(183, 562, 250, 35);
		add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_5 = new JLabel("이메일주소");
		lblNewLabel_5.setOpaque(true);
		lblNewLabel_5.setForeground(new Color(255, 255, 255));
		lblNewLabel_5.setBackground(new Color(65, 105, 225));
		lblNewLabel_5.setFont(new Font("Sandoll 삼립호빵체 TTF Basic", Font.PLAIN, 20));
		lblNewLabel_5.setHorizontalAlignment(JLabel.CENTER);
		lblNewLabel_5.setBounds(79, 562, 90, 35);
		add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("비번 찾기 질문");
		lblNewLabel_6.setOpaque(true);
		lblNewLabel_6.setForeground(new Color(255, 255, 255));
		lblNewLabel_6.setBackground(new Color(65, 105, 225));
		lblNewLabel_6.setFont(new Font("Sandoll 삼립호빵체 TTF Basic", Font.PLAIN, 16));
		lblNewLabel_6.setHorizontalAlignment(JLabel.CENTER);
		lblNewLabel_6.setBounds(79, 639, 90, 35);
		add(lblNewLabel_6);
		
		textField = new JTextField();
		textField.setBounds(183, 713, 250, 35);
		add(textField);
		textField.setColumns(10);
		
		JComboBox comboBox = new JComboBox();
		comboBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"비밀번호를 찾을 때 사용할 질문을 선택하세요.", "1번 질문", "2번 질문", "3번 질문", "4번 질문"}));
		comboBox.setBounds(183, 640, 250, 35);
		comboBox.setFont(new Font("Sandoll 삼립호빵체 TTF Basic", Font.PLAIN, 13));
		
		add(comboBox);
		
		
		JLabel lblNewLabel_7 = new JLabel("질문 답변");
		lblNewLabel_7.setOpaque(true);
		lblNewLabel_7.setForeground(new Color(255, 255, 255));
		lblNewLabel_7.setBackground(new Color(65, 105, 225));
		lblNewLabel_7.setFont(new Font("Sandoll 삼립호빵체 TTF Basic", Font.PLAIN, 24));
		lblNewLabel_7.setHorizontalAlignment(JLabel.CENTER);
		lblNewLabel_7.setBounds(79, 713, 90, 35);
		add(lblNewLabel_7);
		
		textField = new JTextField();
		textField.setBounds(183, 249, 250, 35);
		add(textField);
		textField.setColumns(10);
		
		RoundedButton_ha0_1 btnNewButton_1 = new RoundedButton_ha0_1("수정");
		btnNewButton_1.setForeground(new Color(255, 255, 255));
		btnNewButton_1.setBorderPainted(false);
		btnNewButton_1.setBackground(new Color(65, 105, 225));
		btnNewButton_1.setFont(new Font("Sandoll 삼립호빵체 TTF Basic", Font.PLAIN, 24));
		btnNewButton_1.setBounds(120, 808, 90, 50);
		add(btnNewButton_1);
		
		RoundedButton_ha0_2 btnNewButton_2 = new RoundedButton_ha0_2("회원탈퇴");
		btnNewButton_2.setBackground(new Color(255, 128, 128));
		btnNewButton_2.setForeground(new Color(255, 255, 255));
		
		btnNewButton_2.setFont(new Font("Sandoll 삼립호빵체 TTF Basic", Font.PLAIN, 24));
		btnNewButton_2.setBounds(305, 808, 90, 50);
		add(btnNewButton_2);
		
		
		
	}
}
