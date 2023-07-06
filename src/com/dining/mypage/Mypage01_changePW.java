package com.dining.mypage;

import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Font;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;

import com.dining.login.Login01_page;
import com.dining.start.Protocol;
import com.dining.start.Start_frame;
import com.dining.start.db_VO;

import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;

public class Mypage01_changePW extends JPanel {
	public JTextField textField;
	public JTextField new_pw_tf;
	public JTextField old_pw_tf;
	CardLayout cardLayout;
	JPanel main_pg;
	public String old_pw;
	public String new_pw;
	public String id_forchk;
	public String pw_forchk;
	
	public Mypage01_changePW(CardLayout cardLayout, JPanel main_pg, Start_frame main) {
		this.cardLayout = cardLayout ;
		this.main_pg = main_pg ;
		
		setForeground(new Color(0, 0, 0));
		setBackground(new Color(255, 240, 245));
		setBounds(100, 100, 540, 960);
		setLayout(null);
		
		JLabel mypage_lb = new JLabel("MY PAGE");
		mypage_lb.setBounds(145, 76, 250, 72);
		mypage_lb.setBackground(new Color(255, 240, 245));
		mypage_lb.setFont(new Font("Sandoll 삼립호빵체 TTF Outline", Font.PLAIN, 60));
		mypage_lb.setHorizontalAlignment(SwingConstants.CENTER);
		mypage_lb.setForeground(Color.black);
		add(mypage_lb);
		
		JLabel old_pw_lb = new JLabel("현재PW");
		old_pw_lb.setOpaque(true);
		old_pw_lb.setForeground(new Color(255, 255, 255));
		old_pw_lb.setBackground(new Color(65, 105, 225));
		old_pw_lb.setFont(new Font("Sandoll 삼립호빵체 TTF Basic", Font.PLAIN, 24));
		old_pw_lb.setHorizontalAlignment(JLabel.CENTER);
		old_pw_lb.setBounds(84, 380, 103, 35);
		add(old_pw_lb);
		old_pw_tf = new JTextField();
		old_pw_tf.setBounds(201, 380, 250, 35);
		add(old_pw_tf);
		old_pw_tf.setColumns(10);
		
		JLabel new_pw_lb = new JLabel("새로운pw");
		new_pw_lb.setOpaque(true);
		new_pw_lb.setForeground(new Color(255, 255, 255));
		new_pw_lb.setBackground(new Color(65, 105, 225));
		new_pw_lb.setFont(new Font("Sandoll 삼립호빵체 TTF Basic", Font.PLAIN, 24));
		new_pw_lb.setHorizontalAlignment(JLabel.CENTER);
		new_pw_lb.setBounds(84, 475, 103, 35);
		add(new_pw_lb);
		new_pw_tf = new JTextField();
		new_pw_tf.setBounds(201, 475, 250, 35);
		add(new_pw_tf);
		new_pw_tf.setColumns(10);
		
		
		RoundedButton_ha0_1 pw_change_bt = new RoundedButton_ha0_1("수정");
		pw_change_bt.setText("pw변경");
		pw_change_bt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		pw_change_bt.setForeground(Color.WHITE);
		pw_change_bt.setFont(new Font("Sandoll 삼립호빵체 TTF Basic", Font.PLAIN, 24));
		pw_change_bt.setBorderPainted(false);
		pw_change_bt.setBackground(new Color(65, 105, 225));
		pw_change_bt.setBounds(84, 629, 148, 50);
		add(pw_change_bt);
		
		RoundedButton_ha0_1 cancle_bt = new RoundedButton_ha0_1();
		cancle_bt.setText("취 소");
		cancle_bt.setForeground(Color.WHITE);
		cancle_bt.setFont(new Font("Sandoll 삼립호빵체 TTF Basic", Font.PLAIN, 24));
		cancle_bt.setBorderPainted(false);
		cancle_bt.setBackground(new Color(65, 105, 225));
		cancle_bt.setBounds(303, 629, 148, 50);
		add(cancle_bt);
		
		JLabel icon_lb = new JLabel("New label");
		icon_lb.setIcon(new ImageIcon(Mypage01_changePW.class.getResource("/image/icon_small.png")));
		icon_lb.setBounds(48, 678, 415, 282);
		add(icon_lb);
		
		// mypage01_main 로 이동 (김상우)
		cancle_bt.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				old_pw_tf.setText("");
				new_pw_tf.setText("");
				cardLayout.show(main_pg,"mypage01_main");
			}
		});
		
		// 비밀번호 변경 버튼 (김상우)
		pw_change_bt.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				old_pw = old_pw_tf.getText().trim();
				new_pw = new_pw_tf.getText().trim();
				if (pw_forchk.equals(old_pw)) {
					try {
						Protocol p = new Protocol();
						db_VO vo = new db_VO();
//					System.out.println("아이디는" + id_forchk);
//					System.out.println("예전 비번은" + old_pw);
//					System.out.println("새 비번은" + new_pw);
						vo.setUpdate_id(id_forchk);
						vo.setOld_pw(old_pw);
						vo.setNew_pw(new_pw);
						p.setCmd(36);
						p.setVo(vo);
						main.out.writeObject(p);
						main.out.flush();
//					System.out.println("pw변경 cmd 값 " + p.getCmd());
//					System.out.println("비번 값 보내기 성공!");
					} catch (IOException e1) {
						System.out.println("비번 변경 버튼에서 오류");
						System.out.println(e1);
					}			
				} else {
					JOptionPane.showMessageDialog(getParent(), "현재 비밀번호를 확인해주세요!", null, JOptionPane.INFORMATION_MESSAGE,
	           				 new ImageIcon(Login01_page.class.getResource("/image/icon_mini.png")));
				}
					
//				
//				else {
//					System.out.println("비밀번호 변경 실행");
//				}
			}
		});
	}
}
