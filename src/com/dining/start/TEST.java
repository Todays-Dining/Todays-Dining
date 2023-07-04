//package com.dining.login;
//
//import java.awt.CardLayout;
//import java.awt.Color;
//
//import javax.swing.JPanel;
//import javax.swing.JLabel;
//import javax.swing.JOptionPane;
//import javax.swing.ImageIcon;
//import java.awt.Font;
//import javax.swing.JTextField;
//
//import com.dining.start.db_DAO;
//import com.dining.start.db_VO;
//
//import javax.swing.JButton;
//import java.awt.event.ActionListener;
//import java.util.HashMap;
//import java.util.Map;
//import java.awt.event.ActionEvent;
//import javax.swing.JComboBox;
//
//public class Login04_Find_pw extends JPanel {
//	JTextField id_textField;
//	JTextField add_textField;
//	JComboBox comboBox;
//	CardLayout cardLayout;
//	JPanel main_pg;
//	
//
//	/**
//	 * Create the panel.
//	 */
//	public Login04_Find_pw(CardLayout cardLayout, JPanel main_pg) {
//		this.cardLayout = cardLayout;
//		this.main_pg = main_pg;
//
//		setForeground(new Color(0, 0, 0));
//		setBackground(new Color(255, 240, 245));
//		setBounds(100, 100, 540, 960);
//		setLayout(null);
//
//		JLabel main_label = new JLabel("");
//		main_label.setIcon(new ImageIcon(Login04_Find_pw.class.getResource("/image/label.png")));
//		main_label.setBounds(0, 0, 516, 210);
//		add(main_label);
//
//		JLabel main_icon = new JLabel("");
//		main_icon.setIcon(new ImageIcon(Login04_Find_pw.class.getResource("/image/icon_small.png")));
//		main_icon.setBounds(51, 654, 446, 306);
//		add(main_icon);
//
//		JLabel findid_label = new JLabel("비밀번호 찾기");
//		findid_label.setForeground(new Color(65, 105, 225));
//		findid_label.setFont(new Font("Sandoll 삼립호빵체 TTF Basic", Font.PLAIN, 50));
//		findid_label.setBounds(148, 220, 252, 73);
//		add(findid_label);
//
//		id_textField = new JTextField();
//		id_textField.setBounds(217, 333, 224, 28);
//		add(id_textField);
//		id_textField.setColumns(10);
//
//		RoundedButton_kjh_1 find_pw = new RoundedButton_kjh_1();
//		find_pw.setText("PW 찾기");
//		find_pw.setFont(new Font("Sandoll 삼립호빵체 TTF Basic", Font.BOLD, 17));
//		find_pw.setForeground(new Color(65, 105, 225));
//		find_pw.setBackground(new Color(255, 255, 255));
//		find_pw.setBounds(112, 518, 118, 49);
//		add(find_pw);
//		// 작업해야할 버튼(코딩하기전에 작업자 자기 이름 작성하기) 이 기능을 작업하는 내이름은:
//		find_pw.addActionListener(new ActionListener() {
//
//			@Override
//			public void actionPerformed(ActionEvent e) {
//				//if(!id_textField.getText().isBlank() && !email_textField.getText().isBlank()) {
//					//Map<String,String> param = new HashMap<>();
//					//param.put("name",id_textField.getText());
//					//param.put("email",email_textField.getText());
//					String id = id_textField.getText().trim();
//					String cb = comboBox.getSelectedItem().toString().trim();
//					String res = add_textField.getText().trim();
//					
//					db_VO vo = new db_VO();
//					vo.setId(id);
//					vo.setPassword_search_q(cb);
//					vo.setPassword_search_a(res);
//					//vo.setBirthday(birthday);
//					System.out.println(cb);
//					System.out.println(res);
//	                vo = db_DAO.findpw(vo);
//	                try {
//	                	JOptionPane.showMessageDialog(null, "당신의 PASSWORD는 " +  vo.getPassword() + "입니다.", "Message", JOptionPane.ERROR_MESSAGE);
//					} catch (Exception e2) {
//						JOptionPane.showMessageDialog(null, "입력된 정보가 일치하지 않습니다.", "Message", JOptionPane.ERROR_MESSAGE);
//					}
//					
//			}
//		});
//
//		RoundedButton_kjh_1 cancle_bt = new RoundedButton_kjh_1();
//		cancle_bt.setText("취 소");
//		cancle_bt.setFont(new Font("Sandoll 삼립호빵체 TTF Basic", Font.BOLD, 17));
//		cancle_bt.setForeground(new Color(255, 240, 245));
//		cancle_bt.setBackground(new Color(65, 105, 225));
//		cancle_bt.setBorderPainted(false);
//		cancle_bt.setBounds(300, 518, 118, 49);
//		add(cancle_bt);
//
//		RoundedButton_kjh_2 id_label = new RoundedButton_kjh_2(" I D");
//		id_label.setEnabled(false);
//		id_label.setBorderPainted(false);
//		id_label.setBackground(new Color(65, 105, 225));
//		id_label.setFont(new Font("Sandoll 삼립호빵체 TTF Basic", Font.BOLD, 20));
//		id_label.setForeground(new Color(255, 240, 245));
//		id_label.setBounds(68, 333, 118, 28);
//		add(id_label);
//
//		RoundedButton_kjh_2 birth_label = new RoundedButton_kjh_2(" I D");
//		birth_label.setText("PW찾기질문");
//		birth_label.setForeground(new Color(255, 240, 245));
//		birth_label.setFont(new Font("Sandoll 삼립호빵체 TTF Basic", Font.BOLD, 20));
//		birth_label.setEnabled(false);
//		birth_label.setBorderPainted(false);
//		birth_label.setBackground(new Color(65, 105, 225));
//		birth_label.setBounds(68, 388, 118, 28);
//		add(birth_label);
//
//		RoundedButton_kjh_2 email_label = new RoundedButton_kjh_2();
//		email_label.setText("질문 답변");
//		email_label.setForeground(new Color(255, 240, 245));
//		email_label.setFont(new Font("Sandoll 삼립호빵체 TTF Basic", Font.BOLD, 20));
//		email_label.setEnabled(false);
//		email_label.setBorderPainted(false);
//		email_label.setBackground(new Color(65, 105, 225));
//		email_label.setBounds(68, 441, 118, 28);
//		add(email_label);
//
//		add_textField = new JTextField();
//		add_textField.setColumns(10);
//		add_textField.setBounds(217, 440, 224, 28);
//		add(add_textField);
//
//		String[] items = { "질문 선택해주세요.", "1. 나의 최애 음식은?", "2. 꼭 가보고 싶은 여행 장소는?", "3. 가장 좋아하는 과일은?", "4. 내가 태어난 곳은?", "5. 부모님의 고향은?" };
//		comboBox = new JComboBox(items);
//		comboBox.setFont(new Font("Sandoll 삼립호빵체 TTF Basic", Font.PLAIN, 16));
//		comboBox.setBounds(217, 388, 224, 28);
//		add(comboBox);
//
//		cancle_bt.addActionListener(new ActionListener() {
//
//			@Override
//			public void actionPerformed(ActionEvent e) {
//				// TODO Auto-generated method stub
//				cardLayout.show(main_pg, "login01_page");
//			}
//		});
//
//	}
//}
