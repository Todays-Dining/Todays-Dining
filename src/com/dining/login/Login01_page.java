package com.dining.login;

import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import com.dining.start.Admin_frame;
import com.dining.start.Start_frame;

public class Login01_page extends JPanel {
	JTextField id_textField;
	JTextField pw_textField;
	CardLayout cardLayout;
	JPanel main_pg ;
	int ad_num= 1 ;
	int a = 0;
	
	
	public int getA() {
		return a;
	}
	public void setA(int a) {
		this.a = a;
	}
	
	/**
	 * Create the panel.
	 */
	public Login01_page(CardLayout cardLayout, JPanel main_pg) {
		this.cardLayout = cardLayout ;
			this.main_pg = main_pg ;
		
		
		setForeground(new Color(0, 0, 0));
		setBackground(new Color(255, 240, 245));
		setBounds(100, 100, 540, 960);
		setLayout(null);
		
		JLabel main_label = new JLabel("");
		main_label.setIcon(new ImageIcon(Login01_page.class.getResource("/image/label.png")));
		main_label.setBounds(0, 0, 516, 210);
		add(main_label);
		
		JLabel main_icon = new JLabel("");
		main_icon.setIcon(new ImageIcon(Login01_page.class.getResource("/image/icon_small.png")));
		main_icon.setBounds(51, 654, 446, 306);
		add(main_icon);
		
		JLabel login_label = new JLabel("로 그 인");
		login_label.setForeground(new Color(65, 105, 225));
		login_label.setFont(new Font("Sandoll 삼립호빵체 TTF Basic", Font.PLAIN, 50));
		login_label.setBounds(196, 219, 162, 73);
		add(login_label);
		
		id_textField = new JTextField();
		id_textField.setBounds(144, 365, 224, 28);
		add(id_textField);
		id_textField.setColumns(10);
		
		pw_textField = new JTextField();
		pw_textField.setColumns(10);
		pw_textField.setBounds(144, 434, 224, 28);
		add(pw_textField);
		
		RoundedButton_kjh_1 login_Button = new RoundedButton_kjh_1("Login");
		login_Button.setForeground(new Color(255, 240, 245));
		login_Button.setFont(new Font("Sandoll 삼립호빵체 TTF Basic", Font.PLAIN, 23));
		login_Button.setBackground(new Color(65, 105, 225));
		login_Button.setBorderPainted(false);
		login_Button.setBounds(400, 367, 97, 95);
		add(login_Button);
		// 작업해야할 버튼(코딩하기전에 작업자 자기 이름 작성하기) 이 기능을 작업하는 내이름은:
		login_Button.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
			}
		});
		
		RoundedButton_kjh_1 find_id = new RoundedButton_kjh_1("아이디 찾기");
		find_id.setFont(new Font("Sandoll 삼립호빵체 TTF Basic", Font.BOLD, 17));
		find_id.setForeground(new Color(255, 240, 245));
		find_id.setBackground(new Color(65, 105, 225));
		find_id.setBorderPainted(false);
		find_id.setBounds(51, 539, 118, 32);
		add(find_id);
		
		RoundedButton_kjh_1 join_bt = new RoundedButton_kjh_1("회원가입");
		join_bt.setFont(new Font("Sandoll 삼립호빵체 TTF Basic", Font.BOLD, 17));
		join_bt.setForeground(new Color(255, 240, 245));
		join_bt.setBackground(new Color(65, 105, 225));
		join_bt.setBorderPainted(false);
		join_bt.setBounds(379, 539, 118, 32);
		add(join_bt);
		
		RoundedButton_kjh_1 find_pw = new RoundedButton_kjh_1("비밀번호 찾기");
		find_pw.setFont(new Font("Sandoll 삼립호빵체 TTF Basic", Font.BOLD, 17));
		find_pw.setForeground(new Color(255, 240, 245));
		find_pw.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		find_pw.setBackground(new Color(65, 105, 225));
		find_pw.setBorderPainted(false);
		find_pw.setBounds(216, 539, 118, 32);
		add(find_pw);
		
		RoundedButton_kjh_2 id_label = new RoundedButton_kjh_2(" I D");
		id_label.setEnabled(false);
		id_label.setBorderPainted(false);
		id_label.setBackground(new Color(65, 105, 225));
		id_label.setFont(new Font("Sandoll 삼립호빵체 TTF Basic", Font.BOLD, 20));
		id_label.setForeground(new Color(255, 240, 245));
		id_label.setBounds(59, 365, 63, 28);
		add(id_label);
		
		RoundedButton_kjh_2 pw_label = new RoundedButton_kjh_2(" I D");
		pw_label.setText(" P W");
		pw_label.setForeground(new Color(255, 240, 245));
		pw_label.setFont(new Font("Sandoll 삼립호빵체 TTF Basic", Font.BOLD, 20));
		pw_label.setEnabled(false);
		pw_label.setBorderPainted(false);
		pw_label.setBackground(new Color(65, 105, 225));
		pw_label.setBounds(59, 434, 63, 28);
		add(pw_label);
		
		
		// 로그인 화면에서 로그인 버튼클릭시 main00_Map 페이지로 넘어감
		login_Button.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if (ad_num == 1) {
//					Start_frame main = new Start_frame();
					cardLayout.show(main_pg,"main00_map");
				} else {
					main_pg.setVisible(false);
					setA(5) ;
					new Admin_frame();
					
				}
					
				
			}
		});
		
		// 회원가입 버튼 누를시 회원가입창인 login02_member_join 로 이동
		join_bt.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				cardLayout.show(main_pg,"login02_member_join");
			}
		});
		
		
		
		
			
		// 아이디 찾기 버튼 클릭시 아이디 찾는 페이지로 이동
		find_id.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				cardLayout.show(main_pg,"login03_Find_id");
			}
		});
		
		
		// 비밀번호 찾기 버튼 클릭시 비밀번호 찾는 페이지로 이동
		find_pw.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				cardLayout.show(main_pg,"login04_Find_pw");
			}
		});
		
		
		
	}
}
