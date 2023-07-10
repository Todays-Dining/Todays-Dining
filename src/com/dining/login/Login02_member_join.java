package com.dining.login;

import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.util.regex.Pattern;

import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import com.dining.start.Protocol;
import com.dining.start.Start_frame;
import com.dining.start.db_DAO;
import com.dining.start.db_VO;

public class Login02_member_join extends JPanel {
//	Socket s;
//	ObjectOutputStream out;
//	ObjectInputStream in;
	JPanel main_pg;
	Start_frame main;
	
	CardLayout cardLayout;
	public JTextField id_textField;
	public JTextField email_textField;
	public JTextField birth_textField;
	public JTextField qa_textField;
	public JTextField name_textField;
	int duplicate_or_not = 0;
	int email_duplicate_or_not = 0;
	// private 하면 VO 로 안 담아짐!!
	public JPasswordField passwordField;
	public JPasswordField passwordField_1;
	
	public String status;
	public String id ;
	public String password;
	public String name;
	public String email; 
	public String birthday; 
	public String pw_search_q ;
	public String pw_search_a ;
	public String favorite_list ;
	public String reported_count ;
	JComboBox comboBox;

	public Login02_member_join(CardLayout cardLayout, JPanel main_pg, Start_frame main) {
		this.cardLayout = cardLayout;
		this.main_pg = main_pg;
		this.main = main;
//		this.s = main.s;
//		this.out = main.out;
//		this.in = main.in;
		
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

		RoundedButton_kjh_2 id_label = new RoundedButton_kjh_2(" I D");
		id_label.setEnabled(false);
		id_label.setBorderPainted(false);
		id_label.setBackground(new Color(65, 105, 225));
		id_label.setFont(new Font("Sandoll 삼립호빵체 TTF Basic", Font.BOLD, 20));
		id_label.setForeground(new Color(255, 240, 245));
		id_label.setBounds(68, 246, 118, 28);
		add(id_label);
		id_textField = new JTextField();
		id_textField.setBounds(217, 246, 250, 28);
		add(id_textField);
		id_textField.setColumns(10);
		id_textField.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                JTextField src = (JTextField)e.getSource();
                if(src.getText().length() > 15)e.consume();
            }
        });

		RoundedButton_kjh_2 pw_label = new RoundedButton_kjh_2();
		pw_label.setText(" P W");
		pw_label.setForeground(new Color(255, 240, 245));
		pw_label.setFont(new Font("Sandoll 삼립호빵체 TTF Basic", Font.BOLD, 20));
		pw_label.setEnabled(false);
		pw_label.setBorderPainted(false);
		pw_label.setBackground(new Color(65, 105, 225));
		pw_label.setBounds(68, 306, 118, 28);
		add(pw_label);
		passwordField = new JPasswordField();
		passwordField.setBounds(217, 306, 250, 28);
		add(passwordField);
		
		RoundedButton_kjh_2 pwchek_label = new RoundedButton_kjh_2();
		pwchek_label.setText("P W 확인");
		pwchek_label.setForeground(new Color(255, 240, 245));
		pwchek_label.setFont(new Font("Sandoll 삼립호빵체 TTF Basic", Font.BOLD, 20));
		pwchek_label.setEnabled(false);
		pwchek_label.setBorderPainted(false);
		pwchek_label.setBackground(new Color(65, 105, 225));
		pwchek_label.setBounds(68, 366, 118, 28);
		add(pwchek_label);
		passwordField_1 = new JPasswordField();
		passwordField_1.setBounds(217, 366, 250, 28);
		add(passwordField_1);
		
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
		name_textField.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                JTextField src = (JTextField)e.getSource();
                if(src.getText().length() > 15)e.consume();
            }
        });

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
		birth_textField.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
            	// 글자수 제한
                JTextField src = (JTextField)e.getSource();
                if(src.getText().length() > 7)e.consume();
            }
        });
		
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
		email_textField.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                JTextField src = (JTextField)e.getSource();
                if(src.getText().length() > 31)e.consume();
            }
        });

		RoundedButton_kjh_2 findpw_label = new RoundedButton_kjh_2();
		findpw_label.setText("PW찾기질문");
		findpw_label.setForeground(new Color(255, 240, 245));
		findpw_label.setFont(new Font("Sandoll 삼립호빵체 TTF Basic", Font.BOLD, 20));
		findpw_label.setEnabled(false);
		findpw_label.setBorderPainted(false);
		findpw_label.setBackground(new Color(65, 105, 225));
		findpw_label.setBounds(68, 606, 118, 28);
		add(findpw_label);
		String[] items = {"1. 나의 최애 음식은?", "2. 꼭 가보고 싶은 여행 장소는?", "3. 가장 좋아하는 과일은?", "4. 내가 태어난 곳은?", "5. 부모님의 고향은?"};
		comboBox = new JComboBox(items);
		comboBox.setFont(new Font("Sandoll 삼립호빵체 TTF Basic", Font.PLAIN, 16));
		comboBox.setBounds(217, 606, 250, 28);
		add(comboBox);

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
		qa_textField.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                JTextField src = (JTextField)e.getSource();
                if(src.getText().length() > 31)e.consume();
            }
        });
		
		RoundedButton_kjh_1 join_bt = new RoundedButton_kjh_1();
		join_bt.setText("회원가입");
		join_bt.setFont(new Font("Sandoll 삼립호빵체 TTF Basic", Font.BOLD, 17));
		join_bt.setForeground(new Color(255, 240, 245));
		join_bt.setBackground(new Color(65, 105, 225));
		join_bt.setBounds(109, 733, 118, 49);
		add(join_bt);
	
		RoundedButton_kjh_1 cancle_bt = new RoundedButton_kjh_1();
		cancle_bt.setText("취 소");
		cancle_bt.setFont(new Font("Sandoll 삼립호빵체 TTF Basic", Font.BOLD, 17));
		cancle_bt.setForeground(new Color(255, 240, 245));
		cancle_bt.setBackground(new Color(65, 105, 225));
		cancle_bt.setBorderPainted(false);
		cancle_bt.setBounds(297, 733, 118, 49);
		add(cancle_bt);

		RoundedButton_kjh_2 id_chek_bt = new RoundedButton_kjh_2();
		id_chek_bt.setText("ID중복확인");
		id_chek_bt.setFont(new Font("Sandoll 삼립호빵체 TTF Basic", Font.BOLD, 16));
		id_chek_bt.setBorderPainted(false);
		id_chek_bt.setBackground(new Color(65, 105, 225));
		id_chek_bt.setBounds(367, 216, 100, 29);
		add(id_chek_bt);
		
		// 작업해야할 버튼(코딩하기전에 작업자 자기 이름 작성하기) 이 기능을 작업하는 내이름은: 이상화, 김상우, 윤성훈
		id_chek_bt.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String duplicate_chk;
				duplicate_chk = id_textField.getText().trim();
				// ID에 영어나 숫자 아닌 다른 문자가 포함된 경우 다이얼로그
				 id = id_textField.getText();
				Boolean id_test = Pattern.matches("^[0-9a-zA-Z]*$", id);
				if (id_test == true) {
					if (duplicate_chk.length() > 0) {
						// ★ 중복여부 확인하는 쿼리(성훈) 
						// 중복일 경우
						if (db_DAO.getidChk(id_textField.getText()) == false) {
							JOptionPane.showMessageDialog(getParent(), "ID가 중복됩니다.", null, JOptionPane.INFORMATION_MESSAGE,
			           				 new ImageIcon(Login01_page.class.getResource("/image/icon_mini.png")));
							duplicate_or_not = 0;
						} else {
							// 중복이 아닐 경우
							JOptionPane.showMessageDialog(getParent(), "사용 가능한 ID입니다.", null, JOptionPane.INFORMATION_MESSAGE,
			           				 new ImageIcon(Login01_page.class.getResource("/image/icon_mini.png")));
							// ★ 회원가입 통과했을 때 수정 못하게 함!! (상화 헌정 코드)
							id_textField.setEditable(false);
							duplicate_or_not = 1;					
						}
					}else {
						JOptionPane.showMessageDialog(getParent(), "ID를 제대로 입력하세요!(특수문자, 한글 사용 불가)", null, JOptionPane.INFORMATION_MESSAGE,
		           				 new ImageIcon(Login01_page.class.getResource("/image/icon_mini.png")));
					}
				} else {
					JOptionPane.showMessageDialog(getParent(), "ID를 제대로 입력하세요!(특수문자, 한글 사용 불가)", null, JOptionPane.INFORMATION_MESSAGE,
	           				 new ImageIcon(Login01_page.class.getResource("/image/icon_mini.png")));
				}
			}
		});

		JLabel main_icon = new JLabel("");
		main_icon.setIcon(new ImageIcon(Login02_member_join.class.getResource("/image/icon_small.png")));
		main_icon.setBounds(51, 654, 446, 306);
		add(main_icon);
		
		JLabel lblNewLabel = new JLabel("예시)040827");
		lblNewLabel.setBorder(null);
		lblNewLabel.setFont(new Font("Sandoll 삼립호빵체 TTF Basic", Font.PLAIN, 13));
		lblNewLabel.setForeground(new Color(65, 105, 225));
		lblNewLabel.setBackground(new Color(255, 255, 255));
		lblNewLabel.setBounds(217, 464, 83, 19);
		add(lblNewLabel);
		
		// 작업해야할 버튼(코딩하기전에 작업자 자기 이름 작성하기) 이 기능을 작업하는 내이름은: 이상화 김상우 윤성훈
		join_bt.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// 하나라도 null값이 있을 경우 정보를 모두 입력해주세요 다이얼로그
				if (id_textField.getText().length() == 0 || passwordField.getText().length() == 0 || passwordField_1.getText().length() == 0 ||
				name_textField.getText().length() == 0 || birth_textField.getText().length() == 0 || email_textField.getText().length() == 0 ||
				qa_textField.getText().length() == 0) {
					JOptionPane.showMessageDialog(getParent(), "정보를 모두 입력하세요!", null, JOptionPane.INFORMATION_MESSAGE,
	           				 new ImageIcon(Login01_page.class.getResource("/image/icon_mini.png")));
				// 다 입력이 됐을 경우에
				} else {
					// ★ 찾는중
					// 패스워드 일치 여부 + 글자수 제한 확인
					String pw_same_chk1;
					String pw_same_chk2;
					int pw_same_chk_no = 0;
					pw_same_chk1 = passwordField.getText();
					pw_same_chk2 = passwordField_1.getText();
					if (pw_same_chk1.equals(pw_same_chk2)) {
						pw_same_chk_no = 1;
					}else {
						JOptionPane.showMessageDialog(null, "비밀번호 일치 여부를 확인하세요!", "Message", JOptionPane.ERROR_MESSAGE);
						pw_same_chk_no = 0;
					}
					// ID에 영어나 숫자 아닌 다른 문자가 포함된 경우 다이얼로그
					String id = id_textField.getText();
					Boolean id_test = Pattern.matches("^[0-9a-zA-Z]*$", id);
					// 패스워드에 영어나 숫자 아닌 다른 문자가 포함된 경우 다이얼로그
					String pass = passwordField.getText();
					Boolean pass_test = Pattern.matches("^[0-9a-zA-Z]*$", pass);
					// 이름에 한글이나 영어가 아닌 다른 문자가 포함된 경우 다이얼로그
					String name = name_textField.getText();
					Boolean name_test = Pattern.matches("^[a-zA-Zㄱ-ㅎ가-힣]*$", name);
					// 생년월에 숫자가 아닌 다른 문자가 포함된 경우 다이얼로그
					String birth = birth_textField.getText();
					Boolean birth_test = Pattern.matches("^[0-9]*$", birth);
					// 생년월일 길이 체크
					if (birth.length() != 6) {
						JOptionPane.showMessageDialog(getParent(), "생년월일은 숫자 6자리로 입력해 주세요!", null, JOptionPane.INFORMATION_MESSAGE,
		           				 new ImageIcon(Login01_page.class.getResource("/image/icon_mini.png")));
					}
					// 이메일에 특수문자, @이 들어가고, 영문, 숫자로만 이루어져있는지 확인
					String email;
					Boolean email_test = false;
					int email_test1 = 0;
					int email_test2 = 0;
					email = email_textField.getText();
					if (email.contains("@") == false) {
						// 제대로 입력해라 두번 뜬다!!
						JOptionPane.showMessageDialog(getParent(), "이메일 주소를 제대로 입력하세요!", null, JOptionPane.INFORMATION_MESSAGE,
		           				 new ImageIcon(Login01_page.class.getResource("/image/icon_mini.png")));
					} else{
						email_test1 = 1;
					}
					if(email.matches(".*[ㄱ-ㅎㅏ-ㅣ가-힣]+.*")) {
						//한글이 포함된 문자열
						JOptionPane.showMessageDialog(getParent(), "이메일 주소를 제대로 입력하세요!", null, JOptionPane.INFORMATION_MESSAGE,
		           				 new ImageIcon(Login01_page.class.getResource("/image/icon_mini.png")));
					} else {
						email_test2 = 1;
					}
					if (email_test1 == 1 && email_test2 == 1) {
						email_textField.setEditable(false);
						email_duplicate_or_not = 1;
					}
					// 비밀번호 찾기 질문어 한글, 영어나 숫자 아닌 다른 문자가 포함된 경우 에러메시지
					String pass_answer = qa_textField.getText();
					Boolean pass_answer_test = Pattern.matches("^[0-9a-zA-Zㄱ-ㅎ가-힣]*$", pass_answer);
					
					if (id_test == true && pass_test == true && name_test == true && birth_test == true
							&& email_duplicate_or_not == 1 && pass_answer_test == true && duplicate_or_not == 1) {
//						JOptionPane.showMessageDialog(getParent(), "회원 가입 진행중... ", null, JOptionPane.INFORMATION_MESSAGE,
//		           				 new ImageIcon(Login01_page.class.getResource("/image/icon_mini.png")));
						status = "1";
						id = id_textField.getText().trim();
						password = passwordField.getText().trim();
						name = name_textField.getText().trim();
						email = email_textField.getText().trim();
						birthday = birth_textField.getText().trim();
						pw_search_q = (String) comboBox.getSelectedItem();
						pw_search_a = qa_textField.getText().trim();
						favorite_list = "0";
						reported_count = "0";
						
						Protocol p = new Protocol(); 
						db_VO vo = new db_VO();
						vo.setStatus(status);
						vo.setId(id);
						vo.setPassword(password);
						vo.setName(name);
						vo.setEmail(email);
						vo.setBirthday(birthday);
						vo.setPassword_search_q(pw_search_q);
						vo.setPassword_search_a(pw_search_a);
						vo.setFavorite_list(favorite_list);
						vo.setReported_count(reported_count);
//			            int res = db_DAO.insInfoMember(vo);
						p.setCmd(2);
						p.setVo(vo);
						System.out.println(p.getVo().getId()); 
						System.out.println(p.getVo().getPassword()); 
						try {
							main.out.writeObject(p);
							main.out.flush();						
							
						} catch (Exception e2) {
							System.out.println(e2);
						}
						// 내용 전체를 빈값으로 세팅해버림
						setTextBlank();
//						cardLayout.show(main_pg, "login01_page");
						// ★ INSERT 쿼리
//							} catch (Exception e2) {
//								System.out.println(e2);
//								System.out.println("회원가입 오류");
//							}
						/*
						 * if(res>0) { // System.out.println("회원가입 성공!"); }
						 */
					} else if (duplicate_or_not == 0) {
						JOptionPane.showMessageDialog(getParent(), "ID 중복확인을 해주세요!", null, JOptionPane.INFORMATION_MESSAGE,
		           				 new ImageIcon(Login01_page.class.getResource("/image/icon_mini.png")));
					}else {
						JOptionPane.showMessageDialog(getParent(), "정보를 제대로 입력하세요!", null, JOptionPane.INFORMATION_MESSAGE,
		           				 new ImageIcon(Login01_page.class.getResource("/image/icon_mini.png")));
					}
				}	
			}
		});

		// 취소 버튼
		cancle_bt.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				setTextBlank();
				comboBox.setSelectedIndex(0);
				cardLayout.show(main_pg, "login01_page");
			}
		});
	}
	
	public void setTextBlank() {
		id_textField.setText("");
		passwordField.setText("");
		passwordField_1.setText("");
		name_textField.setText("");
		birth_textField.setText("");
		email_textField.setText("");
		qa_textField.setText("");
		id_textField.setEditable(true);
		email_textField.setEditable(true);
	}
}
