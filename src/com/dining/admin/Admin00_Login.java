package com.dining.admin;

import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.UIManager;

import com.dining.start.Admin_frame;
import com.dining.start.Protocol;
import com.dining.start.Start_frame;
import com.dining.start.db_VO;


public class Admin00_Login extends JPanel {
	Socket s;
	ObjectOutputStream out;
	ObjectInputStream in;
	Admin_frame admin;
	JPanel admin_pg;
	
	CardLayout cardLayout;
	public JTextField id_textField;
	public JTextField pw_textField;
	public JPasswordField passwordField;
	int ad_num = 1;
	int a = 0;
	public boolean idChk = true;
	String msg ;
	public int setcmd = 0;
	
	public int getA() {
		return a;
	}
	public void setA(int a) {
		this.a = a;
	}

	// 생성자에 클라이언트위치인 Start_frame 객체를 집어넣어서 전역변수로 만들고  socket , 아웃스트림 , 인풋스트림
		// 만들어서 요청을 보낼때 사용? 확인해봐야할거같음
	public Admin00_Login(CardLayout cardLayout, JPanel admin_pg , Admin_frame admin ) {
		this.cardLayout = cardLayout;
		this.admin_pg = admin_pg;

		setForeground(new Color(0, 0, 0));
		setBackground(new Color(255, 240, 245));
		setBounds(100, 100, 1200, 800);
		setLayout(null);

		JLabel main_label = new JLabel("");
		main_label.setIcon(new ImageIcon(Admin00_Login.class.getResource("/image/label.png")));
		main_label.setBounds(585, 60, 516, 210);
		add(main_label);

		JLabel main_icon = new JLabel("");
		main_icon.setIcon(new ImageIcon(Admin00_Login.class.getResource("/image/icon_small.png")));
		main_icon.setBounds(641, 390, 446, 306);
		add(main_icon);

		JLabel login_label = new JLabel("로 그 인");
		login_label.setForeground(new Color(65, 105, 225));
		login_label.setFont(new Font("Sandoll 삼립호빵체 TTF Basic", Font.PLAIN, 50));
		login_label.setBounds(204, 291, 162, 73);
		add(login_label);

		id_textField = new JTextField();
		id_textField.setBounds(171, 454, 224, 28);
		add(id_textField);
		id_textField.setColumns(10);

		id_textField.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				JTextField src = (JTextField) e.getSource();
				if (src.getText().length() > 16)
					e.consume();
			}
		});

		passwordField = new JPasswordField();
		passwordField.setColumns(10);
		passwordField.setBounds(171, 523, 224, 28);
		add(passwordField);

		passwordField.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				JTextField src = (JTextField) e.getSource();
				if (src.getText().length() > 16)
					e.consume();
			}
		});

		RoundedButton_kjh_1 login_Button = new RoundedButton_kjh_1("Login");
		login_Button.setForeground(new Color(255, 240, 245));
		login_Button.setFont(new Font("Sandoll 삼립호빵체 TTF Basic", Font.PLAIN, 23));
		login_Button.setBackground(new Color(65, 105, 225));
		login_Button.setBorderPainted(false);
		login_Button.setBounds(427, 456, 97, 95);
		add(login_Button);
		
		RoundedButton_kjh_1 find_id = new RoundedButton_kjh_1("아이디 찾기");
		find_id.setFont(new Font("Sandoll 삼립호빵체 TTF Basic", Font.BOLD, 17));
		find_id.setForeground(new Color(255, 240, 245));
		find_id.setBackground(new Color(65, 105, 225));
		find_id.setBorderPainted(false);
		find_id.setBounds(131, 629, 118, 32);
		add(find_id);

		RoundedButton_kjh_1 find_pw = new RoundedButton_kjh_1("비밀번호 찾기");
		find_pw.setFont(new Font("Sandoll 삼립호빵체 TTF Basic", Font.BOLD, 17));
		find_pw.setForeground(new Color(255, 240, 245));
		find_pw.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		find_pw.setBackground(new Color(65, 105, 225));
		find_pw.setBorderPainted(false);
		find_pw.setBounds(296, 629, 118, 32);
		add(find_pw);

		RoundedButton_kjh_2 id_label = new RoundedButton_kjh_2(" I D");
		id_label.setEnabled(false);
		id_label.setBorderPainted(false);
		id_label.setBackground(new Color(65, 105, 225));
		id_label.setFont(new Font("Sandoll 삼립호빵체 TTF Basic", Font.BOLD, 20));
		id_label.setForeground(new Color(255, 240, 245));
		id_label.setBounds(86, 454, 63, 28);
		add(id_label);

		RoundedButton_kjh_2 pw_label = new RoundedButton_kjh_2(" I D");
		pw_label.setText(" P W");
		pw_label.setForeground(new Color(255, 240, 245));
		pw_label.setFont(new Font("Sandoll 삼립호빵체 TTF Basic", Font.BOLD, 20));
		pw_label.setEnabled(false);
		pw_label.setBorderPainted(false);
		pw_label.setBackground(new Color(65, 105, 225));
		pw_label.setBounds(86, 523, 63, 28);
		add(pw_label);
		
		JLabel lblNewLabel = new JLabel("관리자 페이지");
		lblNewLabel.setForeground(new Color(65, 105, 225));
		lblNewLabel.setFont(new Font("Sandoll 삼립호빵체 TTF Outline", Font.PLAIN, 75));
		lblNewLabel.setBounds(86, 123, 456, 95);
		add(lblNewLabel);
		
		// 로그인 화면에서 로그인 버튼클릭시 Admin01_main 페이지로 넘어감
		login_Button.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				
				cardLayout.show(admin_pg, "admin01_main");
				   
			}
		});

		// 아이디 찾기 버튼 클릭시 아이디 찾는 페이지로 이동
		find_id.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		
		// 비밀번호 찾기 버튼 클릭시 비밀번호 찾는 페이지로 이동
		find_pw.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				
			}
		});
	}
}