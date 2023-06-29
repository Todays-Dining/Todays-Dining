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

public class Login03_Find_id extends JPanel {
	JTextField id_textField;
	JTextField birth_textField;
	JTextField email_textField;
	CardLayout cardLayout;
	JPanel main_pg;

	/**
	 * Create the panel.
	 */
	public Login03_Find_id(CardLayout cardLayout, JPanel main_pg) {
		this.cardLayout = cardLayout;
		this.main_pg = main_pg;
		setForeground(new Color(0, 0, 0));
		setBackground(new Color(255, 240, 245));
		setBounds(100, 100, 540, 960);
		setLayout(null);

		JLabel main_label = new JLabel("");
		main_label.setIcon(new ImageIcon(Login03_Find_id.class.getResource("/image/label.png")));
		main_label.setBounds(0, 0, 516, 210);
		add(main_label);

		JLabel main_icon = new JLabel("");
		main_icon.setIcon(new ImageIcon(Login03_Find_id.class.getResource("/image/icon_small.png")));
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

		RoundedButton_kjh_1 find_id = new RoundedButton_kjh_1("아이디 찾기");
		find_id.setFont(new Font("Sandoll 삼립호빵체 TTF Basic", Font.BOLD, 17));
		find_id.setForeground(new Color(255, 240, 245));
		find_id.setBackground(new Color(65, 105, 225));
		find_id.setBorderPainted(false);
		find_id.setBounds(51, 518, 118, 49);
		add(find_id);
		// 작업해야할 버튼(코딩하기전에 작업자 자기 이름 작성하기) 이 기능을 작업하는 내이름은:
		find_id.addActionListener(new ActionListener() {

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
		cancle_bt.setBounds(368, 518, 118, 49);
		add(cancle_bt);

		RoundedButton_kjh_2 id_label = new RoundedButton_kjh_2(" I D");
		id_label.setText("이 름");
		id_label.setEnabled(false);
		id_label.setBorderPainted(false);
		id_label.setBackground(new Color(65, 105, 225));
		id_label.setFont(new Font("Sandoll 삼립호빵체 TTF Basic", Font.BOLD, 20));
		id_label.setForeground(new Color(255, 240, 245));
		id_label.setBounds(94, 333, 92, 28);
		add(id_label);

		RoundedButton_kjh_2 birth_label = new RoundedButton_kjh_2();
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

		RoundedButton_kjh_2 email_label = new RoundedButton_kjh_2();
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

		RoundedButton_kjh_1 find_pw = new RoundedButton_kjh_1();
		find_pw.setText("pw 찾기");
		find_pw.setForeground(new Color(255, 240, 245));
		find_pw.setFont(new Font("Sandoll 삼립호빵체 TTF Basic", Font.BOLD, 17));
		find_pw.setBorderPainted(false);
		find_pw.setBackground(new Color(65, 105, 225));
		find_pw.setBounds(209, 518, 118, 49);
		add(find_pw);

		// 취소 버튼을 누르면 login01_page 로 돌아감
		cancle_bt.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				cardLayout.show(main_pg, "login01_page");
			}
		});

		// 비밀번호 찾기 버튼을 누르면 login04_Find_pw 페이지로 이동한다
		find_pw.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				cardLayout.show(main_pg, "login04_Find_pw");
			}
		});
	}
}
