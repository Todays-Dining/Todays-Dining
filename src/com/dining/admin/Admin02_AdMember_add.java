package com.dining.admin;

import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

import com.dining.start.Admin_frame;

public class Admin02_AdMember_add extends JPanel {
	JTextField id_textField;
	 JTextField email_textField;
	 private JTextField pw_textField;
	 private JTextField pwchek_textField;
	 private JTextField birth_textField;
	 private JTextField qa_textField;
	 private JTextField name_textField;
	 JPanel admin_pg ;
	 CardLayout cardLayout;
	 // ID 중복여부 체크하는 변수
	 int duplicate_or_not = 0;
	 // 비밀번호 질문 입력값 받아오기
	 String pass_ques = "";
	 
	/**
	 * Create the panel.
	 */
	public Admin02_AdMember_add(CardLayout cardLayout,JPanel admin_pg , Admin_frame admin) {
		this.cardLayout = cardLayout ;
		this.admin_pg = admin_pg ;
		
		setForeground(new Color(0, 0, 0));
		setBackground(new Color(255, 240, 245));
		setBounds(100, 100, 1200, 800);
		setLayout(null);
		
		
		JLabel join_label = new JLabel("관리자 추가");
		join_label.setForeground(new Color(65, 105, 225));
		join_label.setFont(new Font("Sandoll 삼립호빵체 TTF Basic", Font.PLAIN, 47));
		join_label.setBounds(665, 65, 330, 92);
		add(join_label);
		
		id_textField = new JTextField();
		id_textField.setBounds(747, 184, 250, 28);
		add(id_textField);
		id_textField.setColumns(10);
		
		RoundedButton_kjh_3 join_bt = new RoundedButton_kjh_3();
		join_bt.setText("회원가입");
		join_bt.setFont(new Font("Sandoll 삼립호빵체 TTF Basic", Font.BOLD, 17));
		join_bt.setForeground(new Color(255, 240, 245));
		join_bt.setBackground(new Color(65, 105, 225));
		join_bt.setBounds(639, 671, 118, 49);
		add(join_bt);
	
		
		RoundedButton_kjh_3 cancle_bt = new RoundedButton_kjh_3();
		cancle_bt.setText("취 소");
		cancle_bt.setFont(new Font("Sandoll 삼립호빵체 TTF Basic", Font.BOLD, 17));
		cancle_bt.setForeground(new Color(255, 240, 245));
		cancle_bt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		cancle_bt.setBackground(new Color(65, 105, 225));
		cancle_bt.setBorderPainted(false);
		cancle_bt.setBounds(827, 671, 118, 49);
		add(cancle_bt);
		
		RoundedButton_kjh_4 id_label = new RoundedButton_kjh_4();
		id_label.setText(" I D");
		id_label.setEnabled(false);
		id_label.setBorderPainted(false);
		id_label.setBackground(new Color(65, 105, 225));
		id_label.setFont(new Font("Sandoll 삼립호빵체 TTF Basic", Font.BOLD, 20));
		id_label.setForeground(new Color(255, 240, 245));
		id_label.setBounds(598, 184, 118, 28);
		add(id_label);
		
		RoundedButton_kjh_4 findpw_label = new RoundedButton_kjh_4();
		findpw_label.setText("PW찾기질문");
		findpw_label.setForeground(new Color(255, 240, 245));
		findpw_label.setFont(new Font("Sandoll 삼립호빵체 TTF Basic", Font.BOLD, 20));
		findpw_label.setEnabled(false);
		findpw_label.setBorderPainted(false);
		findpw_label.setBackground(new Color(65, 105, 225));
		findpw_label.setBounds(598, 544, 118, 28);
		add(findpw_label);
		
		RoundedButton_kjh_4 email_label = new RoundedButton_kjh_4();
		email_label.setText("이메일주소");
		email_label.setForeground(new Color(255, 240, 245));
		email_label.setFont(new Font("Sandoll 삼립호빵체 TTF Basic", Font.BOLD, 20));
		email_label.setEnabled(false);
		email_label.setBorderPainted(false);
		email_label.setBackground(new Color(65, 105, 225));
		email_label.setBounds(598, 484, 118, 28);
		add(email_label);
		
		email_textField = new JTextField();
		email_textField.setColumns(10);
		email_textField.setBounds(747, 484, 250, 28);
		add(email_textField);
		
		String[] items = {"1. 나의 최애 음식은?", "2. 꼭 가보고 싶은 여행 장소는?", "3. 가장 좋아하는 과일은?", "4. 내가 태어난 곳은?", "5. 부모님의 고향은?"};
		JComboBox comboBox = new JComboBox(items);
		comboBox.setFont(new Font("Sandoll 삼립호빵체 TTF Basic", Font.PLAIN, 16));
		comboBox.setBounds(747, 544, 250, 28);
		add(comboBox);
		
		
		RoundedButton_kjh_4 pw_label = new RoundedButton_kjh_4();
		pw_label.setText(" P W");
		pw_label.setForeground(new Color(255, 240, 245));
		pw_label.setFont(new Font("Sandoll 삼립호빵체 TTF Basic", Font.BOLD, 20));
		pw_label.setEnabled(false);
		pw_label.setBorderPainted(false);
		pw_label.setBackground(new Color(65, 105, 225));
		pw_label.setBounds(598, 244, 118, 28);
		add(pw_label);
		
		pw_textField = new JTextField();
		pw_textField.setColumns(10);
		pw_textField.setBounds(747, 244, 250, 28);
		add(pw_textField);
		
		RoundedButton_kjh_4 pwchek_label = new RoundedButton_kjh_4();
		pwchek_label.setText("P W 확인");
		pwchek_label.setForeground(new Color(255, 240, 245));
		pwchek_label.setFont(new Font("Sandoll 삼립호빵체 TTF Basic", Font.BOLD, 20));
		pwchek_label.setEnabled(false);
		pwchek_label.setBorderPainted(false);
		pwchek_label.setBackground(new Color(65, 105, 225));
		pwchek_label.setBounds(598, 304, 118, 28);
		add(pwchek_label);
		
		pwchek_textField = new JTextField();
		pwchek_textField.setColumns(10);
		pwchek_textField.setBounds(747, 304, 250, 28);
		add(pwchek_textField);
		
		RoundedButton_kjh_4 birth_label = new RoundedButton_kjh_4();
		birth_label.setText("생년월일");
		birth_label.setForeground(new Color(255, 240, 245));
		birth_label.setFont(new Font("Sandoll 삼립호빵체 TTF Basic", Font.BOLD, 20));
		birth_label.setEnabled(false);
		birth_label.setBorderPainted(false);
		birth_label.setBackground(new Color(65, 105, 225));
		birth_label.setBounds(598, 424, 118, 28);
		add(birth_label);
		
		birth_textField = new JTextField();
		birth_textField.setColumns(10);
		birth_textField.setBounds(747, 424, 250, 28);
		add(birth_textField);
		
		RoundedButton_kjh_4 qa_label = new RoundedButton_kjh_4();
		qa_label.setText("질문 답변");
		qa_label.setForeground(new Color(255, 240, 245));
		qa_label.setFont(new Font("Sandoll 삼립호빵체 TTF Basic", Font.BOLD, 20));
		qa_label.setEnabled(false);
		qa_label.setBorderPainted(false);
		qa_label.setBackground(new Color(65, 105, 225));
		qa_label.setBounds(598, 604, 118, 28);
		add(qa_label);
		
		qa_textField = new JTextField();
		qa_textField.setColumns(10);
		qa_textField.setBounds(747, 604, 250, 28);
		add(qa_textField);
		
		RoundedButton_kjh_4 name_label = new RoundedButton_kjh_4();
		name_label.setText("이 름");
		name_label.setForeground(new Color(255, 240, 245));
		name_label.setFont(new Font("Sandoll 삼립호빵체 TTF Basic", Font.BOLD, 20));
		name_label.setEnabled(false);
		name_label.setBorderPainted(false);
		name_label.setBackground(new Color(65, 105, 225));
		name_label.setBounds(598, 364, 118, 28);
		add(name_label);
		
		name_textField = new JTextField();
		name_textField.setColumns(10);
		name_textField.setBounds(747, 364, 250, 28);
		add(name_textField);
		
		RoundedButton_kjh_4 id_chek_bt = new RoundedButton_kjh_4();
		id_chek_bt.setText("ID중복확인");
		id_chek_bt.setFont(new Font("Sandoll 삼립호빵체 TTF Basic", Font.BOLD, 16));
		id_chek_bt.setBorderPainted(false);
		id_chek_bt.setBackground(new Color(65, 105, 225));
		id_chek_bt.setBounds(997, 184, 100, 28);
		add(id_chek_bt);
		id_chek_bt.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String duplicate_chk;
				duplicate_chk = id_textField.getText();
				if (duplicate_chk.length() > 0) {
					// ★ 중복여부 확인하는 쿼리(성훈) 
					// 중복일 경우
					// JOptionPane.showMessageDialog(null, "ID가 중복됩니다.", "Message", JOptionPane.ERROR_MESSAGE);
					// 중복이 아닐 경우
					JOptionPane.showMessageDialog(null, "사용 가능한 ID입니다.", "Message", JOptionPane.INFORMATION_MESSAGE);
					duplicate_or_not = 1;
				}else {
					JOptionPane.showMessageDialog(null, "ID를 제대로 입력하세요!", "Message", JOptionPane.ERROR_MESSAGE);
				}
			}
		});
		
		JLabel lb_1 = new JLabel("");
		lb_1.setIcon(new ImageIcon(Admin02_AdMember_add.class.getResource("/image/label.png")));
		lb_1.setBounds(29, 65, 528, 267);
		add(lb_1);
		
		JLabel lb_2 = new JLabel("");
		lb_2.setIcon(new ImageIcon(Admin02_AdMember_add.class.getResource("/image/icon.png")));
		lb_2.setBounds(33, 375, 540, 363);
		add(lb_2);
		
		join_bt.addActionListener(new ActionListener() {	
			@Override
			public void actionPerformed(ActionEvent e) {
				// ID 입력여부 및 글자수 제한 확인
				String id_length_chk;
				// 1이 되어야 통과
				int id_length_chk_no = 0;
				id_length_chk = id_textField.getText();
				if (id_length_chk.length() == 0) {
					JOptionPane.showMessageDialog(null, "ID를 입력하세요!", "Message", JOptionPane.ERROR_MESSAGE);
				}
				if (id_length_chk.length() > 16) {
					JOptionPane.showMessageDialog(null, "이름 최대 길이는 16자입니다!", "Message", JOptionPane.ERROR_MESSAGE);
					id_length_chk_no = 0;
				} else {
					id_length_chk_no = 1;
				}
				
				// 패스워드 일치 여부 + 글자수 제한 확인
				String pw_same_chk1;
				String pw_same_chk2;
				int pw_same_chk_no = 0;
				pw_same_chk1 = pw_textField.getText();
				pw_same_chk2 = pwchek_textField.getText();
				if (pw_same_chk1.length() == 0) {
					JOptionPane.showMessageDialog(null, "패스워드를 입력하세요!", "Message", JOptionPane.ERROR_MESSAGE);
					pw_same_chk_no = 0;
				}
				if (pw_same_chk1.length() > 32) {
					JOptionPane.showMessageDialog(null, "패스워드 최대 길이는 32자입니다!", "Message", JOptionPane.ERROR_MESSAGE);
					pw_same_chk_no = 0;
				}
				if (pw_same_chk1.equals(pw_same_chk2)) {
					pw_same_chk_no = 1;
				}else {
					JOptionPane.showMessageDialog(null, "비밀번호 일치 여부를 확인하세요!", "Message", JOptionPane.ERROR_MESSAGE);
					pw_same_chk_no = 0;
				}
				
				// 이름 글자수 제한 확인
				String name_length_chk;
				// 1이 되어야 통과
				int name_length_chk_no = 0;
				name_length_chk = name_textField.getText();
				if (name_length_chk.length() == 0) {
					JOptionPane.showMessageDialog(null, "이름을 입력하세요!", "Message", JOptionPane.ERROR_MESSAGE);
				}
				if (name_length_chk.length() > 16) {
					JOptionPane.showMessageDialog(null, "이름 최대 길이는 16자입니다!", "Message", JOptionPane.ERROR_MESSAGE);
					name_length_chk_no = 0;
				} else {
					name_length_chk_no = 1;
				}
				
				// 생년월일 길이 체크
				String birth_length_chk;
				int birth_length_chk_no = 0;
				// 생년월일 자료형 체크
				String birth_form_chk;
				int birth_no;
				int birth_form_chk_no = 0;
				birth_length_chk = birth_textField.getText();
				if (birth_length_chk.length() > 6) {
					JOptionPane.showMessageDialog(null, "생년월일 형식은 숫자 여섯자리(예시 : 950202)로 입력하세요!", "Message", JOptionPane.ERROR_MESSAGE);
					birth_length_chk_no = 0;
				} else {
					
					try {
						birth_no = Integer.parseInt(birth_length_chk);
					}catch (Exception e2) {
						JOptionPane.showMessageDialog(null, "생년월일 형식은 숫자 여섯자리(예시 : 950202)로 입력하세요!", "Message", JOptionPane.ERROR_MESSAGE);
						birth_length_chk_no = 0;
					}
					birth_length_chk_no = 1;
				}
				
				// 이메일 주소 형식 체크
				String email_form_chk;
				int email_form_chk_no = 0;
				email_form_chk = email_textField.getText();
				if (email_form_chk.length() == 0) {
					JOptionPane.showMessageDialog(null, "이메일 주소를 제대로 입력하세요!", "Message", JOptionPane.ERROR_MESSAGE);
					email_form_chk_no = 0;
				} else {
					if (email_form_chk.contains("@") == false) {
						JOptionPane.showMessageDialog(null, "이메일 주소를 제대로 입력하세요!", "Message", JOptionPane.ERROR_MESSAGE);
					}
					email_form_chk_no = 1;
				}

				// 질문 답변 길이 체크 (최대 16글자)
				String pass_answer_chk;
				int pass_answer_chk_no = 0;
				pass_answer_chk = qa_textField.getText();
				if (pass_answer_chk.length() == 0) {
					JOptionPane.showMessageDialog(null, "질문 답변을 입력하세요!", "Message", JOptionPane.ERROR_MESSAGE);
				}
				if (pass_answer_chk.length() > 16) {
					JOptionPane.showMessageDialog(null, "질문 답변을 제대로 입력하세요! (최대 16자)", "Message", JOptionPane.ERROR_MESSAGE);
					pass_answer_chk_no = 0;					
				}else {
					pass_answer_chk_no = 1;					
				}
				
				// 회원가입 버튼을 눌렀을 때, 
				// ID 중복이 안 되었다면 + PW가 일치한다면 + 이름 글자수 제한을 넘지 않는다면 + 생년월일 형태가 일치한다면 
				// + 이메일주소 형식에 맞다면 + 질문 답변 글자수 제한을 넘지 않는다면 => 회원 가입 성공!
				if (duplicate_or_not == 1 && id_length_chk_no == 1 && pw_same_chk_no == 1 && name_length_chk_no == 1 && birth_length_chk_no == 1
						&& email_form_chk_no == 1 && pass_answer_chk_no == 1) {
					// 아이디 id_length_chk;				
					// 패스워드 pw_same_chk1;
					// 이름 name_length_chk;
					// 생년월일 birth_length_chk;
					// 이메일 email_form_chk
					// (비번찾기 질문) 콤보박스 값 받아오기
//					pass_ques = comboBox.getSelectedItem().toString();
					// 비번찾기 정답 pass_answer_chk;

					JOptionPane.showMessageDialog(null, "회원 가입 성공!", "Message", JOptionPane.INFORMATION_MESSAGE);
					// ★ 해당 정보를 DB로 전송하는 쿼리문
				}
			}
		});
		
		// admin02_Member 페이지로 이동
		cancle_bt.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				cardLayout.show(admin_pg, "admin02_Member");
			}
		});
	}
}
