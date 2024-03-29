package com.dining.login;

import java.awt.CardLayout;
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

public class Login02_member_join extends JPanel {
	JTextField id_textField;
	JTextField email_textField;
	JTextField pw_textField;
	JTextField pwchek_textField;
	JTextField birth_textField;
	JTextField qa_textField;
	JTextField name_textField;
	CardLayout cardLayout;
	JPanel main_pg;

	/**
	 * Create the panel.
	 */
	public Login02_member_join(CardLayout cardLayout, JPanel main_pg) {
		this.cardLayout = cardLayout;
		this.main_pg = main_pg;
		setForeground(new Color(0, 0, 0));
		setBackground(new Color(255, 240, 245));
		setBounds(100, 100, 540, 960);
		setLayout(null);

		JLabel main_label = new JLabel("");
		main_label.setIcon(new ImageIcon(Login02_member_join.class.getResource("/image/label.png")));
		main_label.setBounds(0, 0, 516, 210);
		add(main_label);

		JLabel join_label = new JLabel("회원가입");
		join_label.setForeground(new Color(65, 105, 225));
		join_label.setFont(new Font("Sandoll 삼립호빵체 TTF Basic", Font.PLAIN, 32));
		join_label.setBounds(215, 159, 145, 73);
		add(join_label);

		id_textField = new JTextField();
		id_textField.setBounds(217, 246, 250, 28);
		add(id_textField);
		id_textField.setColumns(10);

		RoundedButton_kjh_1 join_bt = new RoundedButton_kjh_1();
		join_bt.setText("회원가입");
		join_bt.setFont(new Font("Sandoll 삼립호빵체 TTF Basic", Font.BOLD, 17));
		join_bt.setForeground(new Color(255, 240, 245));
		join_bt.setBackground(new Color(65, 105, 225));
		join_bt.setBounds(109, 733, 118, 49);
		add(join_bt);
		// 작업해야할 버튼(코딩하기전에 작업자 자기 이름 작성하기) 이 기능을 작업하는 내이름은:
		join_bt.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub

			}
		});

		RoundedButton_kjh_1 cancle_bt = new RoundedButton_kjh_1();
		cancle_bt.setText("취 소");
		cancle_bt.setFont(new Font("Sandoll 삼립호빵체 TTF Basic", Font.BOLD, 17));
		cancle_bt.setForeground(new Color(255, 240, 245));
		cancle_bt.setBackground(new Color(65, 105, 225));
		cancle_bt.setBorderPainted(false);
		cancle_bt.setBounds(297, 733, 118, 49);
		add(cancle_bt);

		RoundedButton_kjh_2 id_label = new RoundedButton_kjh_2(" I D");
		id_label.setEnabled(false);
		id_label.setBorderPainted(false);
		id_label.setBackground(new Color(65, 105, 225));
		id_label.setFont(new Font("Sandoll 삼립호빵체 TTF Basic", Font.BOLD, 20));
		id_label.setForeground(new Color(255, 240, 245));
		id_label.setBounds(68, 246, 118, 28);
		add(id_label);

		RoundedButton_kjh_2 findpw_label = new RoundedButton_kjh_2();
		findpw_label.setText("PW찾기질문");
		findpw_label.setForeground(new Color(255, 240, 245));
		findpw_label.setFont(new Font("Sandoll 삼립호빵체 TTF Basic", Font.BOLD, 20));
		findpw_label.setEnabled(false);
		findpw_label.setBorderPainted(false);
		findpw_label.setBackground(new Color(65, 105, 225));
		findpw_label.setBounds(68, 606, 118, 28);
		add(findpw_label);

		RoundedButton_kjh_2 email_label = new RoundedButton_kjh_2();
		email_label.setText("이메일주소");
		email_label.setForeground(new Color(255, 240, 245));
		email_label.setFont(new Font("Sandoll 삼립호빵체 TTF Basic", Font.BOLD, 20));
		email_label.setEnabled(false);
		email_label.setBorderPainted(false);
		email_label.setBackground(new Color(65, 105, 225));
		email_label.setBounds(68, 546, 118, 28);
		add(email_label);

		email_textField = new JTextField();
		email_textField.setColumns(10);
		email_textField.setBounds(217, 546, 250, 28);
		add(email_textField);

		String[] items = { "질문1", "질문2", "질문3", "질문4", "질문5" };
		JComboBox comboBox = new JComboBox(items);
		comboBox.setFont(new Font("Sandoll 삼립호빵체 TTF Basic", Font.PLAIN, 16));
		comboBox.setBounds(217, 606, 250, 28);
		add(comboBox);

		RoundedButton_kjh_2 pw_label = new RoundedButton_kjh_2();
		pw_label.setText(" P W");
		pw_label.setForeground(new Color(255, 240, 245));
		pw_label.setFont(new Font("Sandoll 삼립호빵체 TTF Basic", Font.BOLD, 20));
		pw_label.setEnabled(false);
		pw_label.setBorderPainted(false);
		pw_label.setBackground(new Color(65, 105, 225));
		pw_label.setBounds(68, 306, 118, 28);
		add(pw_label);

		pw_textField = new JTextField();
		pw_textField.setColumns(10);
		pw_textField.setBounds(217, 306, 250, 28);
		add(pw_textField);

		RoundedButton_kjh_2 pwchek_label = new RoundedButton_kjh_2();
		pwchek_label.setText("P W 확인");
		pwchek_label.setForeground(new Color(255, 240, 245));
		pwchek_label.setFont(new Font("Sandoll 삼립호빵체 TTF Basic", Font.BOLD, 20));
		pwchek_label.setEnabled(false);
		pwchek_label.setBorderPainted(false);
		pwchek_label.setBackground(new Color(65, 105, 225));
		pwchek_label.setBounds(68, 366, 118, 28);
		add(pwchek_label);

		pwchek_textField = new JTextField();
		pwchek_textField.setColumns(10);
		pwchek_textField.setBounds(217, 366, 250, 28);
		add(pwchek_textField);

		RoundedButton_kjh_2 birth_label = new RoundedButton_kjh_2();
		birth_label.setText("생년월일");
		birth_label.setForeground(new Color(255, 240, 245));
		birth_label.setFont(new Font("Sandoll 삼립호빵체 TTF Basic", Font.BOLD, 20));
		birth_label.setEnabled(false);
		birth_label.setBorderPainted(false);
		birth_label.setBackground(new Color(65, 105, 225));
		birth_label.setBounds(68, 486, 118, 28);
		add(birth_label);

		birth_textField = new JTextField();
		birth_textField.setColumns(10);
		birth_textField.setBounds(217, 486, 250, 28);
		add(birth_textField);

		RoundedButton_kjh_2 qa_label = new RoundedButton_kjh_2();
		qa_label.setText("질문 답변");
		qa_label.setForeground(new Color(255, 240, 245));
		qa_label.setFont(new Font("Sandoll 삼립호빵체 TTF Basic", Font.BOLD, 20));
		qa_label.setEnabled(false);
		qa_label.setBorderPainted(false);
		qa_label.setBackground(new Color(65, 105, 225));
		qa_label.setBounds(68, 666, 118, 28);
		add(qa_label);

		qa_textField = new JTextField();
		qa_textField.setColumns(10);
		qa_textField.setBounds(217, 666, 250, 28);
		add(qa_textField);

		RoundedButton_kjh_2 name_label = new RoundedButton_kjh_2();
		name_label.setText("이 름");
		name_label.setForeground(new Color(255, 240, 245));
		name_label.setFont(new Font("Sandoll 삼립호빵체 TTF Basic", Font.BOLD, 20));
		name_label.setEnabled(false);
		name_label.setBorderPainted(false);
		name_label.setBackground(new Color(65, 105, 225));
		name_label.setBounds(68, 426, 118, 28);
		add(name_label);

		name_textField = new JTextField();
		name_textField.setColumns(10);
		name_textField.setBounds(217, 426, 250, 28);
		add(name_textField);

		RoundedButton_kjh_2 id_chek_bt = new RoundedButton_kjh_2();
		id_chek_bt.setText("ID중복확인");
		id_chek_bt.setFont(new Font("Sandoll 삼립호빵체 TTF Basic", Font.BOLD, 16));
		id_chek_bt.setBorderPainted(false);
		id_chek_bt.setBackground(new Color(65, 105, 225));
		id_chek_bt.setBounds(367, 216, 100, 29);
		add(id_chek_bt);
		// 작업해야할 버튼(코딩하기전에 작업자 자기 이름 작성하기) 이 기능을 작업하는 내이름은:
		id_chek_bt.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub

			}
		});

		JLabel main_icon = new JLabel("");
		main_icon.setIcon(new ImageIcon(Login02_member_join.class.getResource("/image/icon_small.png")));
		main_icon.setBounds(51, 654, 446, 306);
		add(main_icon);

		cancle_bt.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				cardLayout.show(main_pg, "login01_page");
			}
		});

	}
}
