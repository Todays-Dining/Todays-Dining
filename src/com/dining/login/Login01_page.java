package com.dining.login;

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

import com.dining.start.Protocol;
import com.dining.start.Start_frame;
import com.dining.start.db_VO;


public class Login01_page extends JPanel {
	Socket s;
	ObjectOutputStream out;
	ObjectInputStream in;
	JPanel main_pg;
	Start_frame main;
	
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
	public Login01_page(CardLayout cardLayout, JPanel main_pg , Start_frame main) {
		this.cardLayout = cardLayout;
		this.main_pg = main_pg;
		this.main = main;
		this.s = main.s;
		this.out = main.out;
		this.in = main.in;

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
		passwordField.setBounds(144, 434, 224, 28);
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
		login_Button.setBounds(400, 367, 97, 95);
		add(login_Button);
		
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
				try {
					if (id_textField.getText().length() != 0 && passwordField.getText().length() != 0 ) {
						
					db_VO vo = new db_VO();
					Protocol p = new Protocol();
					vo.setId(id_textField.getText());
					vo.setPassword(passwordField.getText());
					p.setCmd(1);
					p.setVo(vo);
					main.out.writeObject(p);
//					System.out.println("작동");
					main.out.flush();
					}
				} catch (IOException e1) {
					e1.printStackTrace();
				}
			}
		});

		// 아이디 찾기 버튼 클릭시 아이디 찾는 페이지로 이동
		find_id.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				cardLayout.show(main_pg, "login03_Find_id");
				// 이동할 때 입력된 내용 초기화. ★ 아래 코드 중복 제거 가능한가??
				id_textField.setText("");
				passwordField.setText("");
			}
		});
		
		// 비밀번호 찾기 버튼 클릭시 비밀번호 찾는 페이지로 이동
		find_pw.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				cardLayout.show(main_pg, "login04_Find_pw");
				id_textField.setText("");
				passwordField.setText("");
			}
		});
		
		// 회원가입 버튼 누를시 회원가입창인 login02_member_join 로 이동
		join_bt.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				cardLayout.show(main_pg, "login02_member_join");
				id_textField.setText("");
				passwordField.setText("");
			}
		});
	}
}