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
import javax.swing.JPasswordField;

public class Mypage01_changePW extends JPanel {
	CardLayout cardLayout;
	JPanel main_pg;
	public String id_forchk;
	public String pw_forchk;
	public String old_pw = "";
	public String new_pw = "";
	public String new_pw_chk = "";
	public JPasswordField old_pw_tf;
	public JPasswordField new_pw_tf;
	public JPasswordField new_pw_chk_tf;
	public int getres = 0;
	
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
		old_pw_lb.setBounds(84, 330, 103, 35);
		add(old_pw_lb);
		
		JLabel new_pw_lb = new JLabel("새로운pw");
		new_pw_lb.setOpaque(true);
		new_pw_lb.setForeground(new Color(255, 255, 255));
		new_pw_lb.setBackground(new Color(65, 105, 225));
		new_pw_lb.setFont(new Font("Sandoll 삼립호빵체 TTF Basic", Font.PLAIN, 24));
		new_pw_lb.setHorizontalAlignment(JLabel.CENTER);
		new_pw_lb.setBounds(84, 400, 103, 35);
		add(new_pw_lb);
		
		
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
		
		JLabel new_pw_lb_1 = new JLabel("pw확인");
		new_pw_lb_1.setOpaque(true);
		new_pw_lb_1.setHorizontalAlignment(SwingConstants.CENTER);
		new_pw_lb_1.setForeground(Color.WHITE);
		new_pw_lb_1.setFont(new Font("Sandoll 삼립호빵체 TTF Basic", Font.PLAIN, 24));
		new_pw_lb_1.setBackground(new Color(65, 105, 225));
		new_pw_lb_1.setBounds(84, 471, 103, 35);
		add(new_pw_lb_1);
		
		old_pw_tf = new JPasswordField();
		old_pw_tf.setBounds(200, 330, 250, 35);
		add(old_pw_tf);
		
		new_pw_tf = new JPasswordField();
		new_pw_tf.setBounds(201, 400, 250, 35);
		add(new_pw_tf);
		
		new_pw_chk_tf = new JPasswordField();
		new_pw_chk_tf.setBounds(201, 471, 250, 35);
		add(new_pw_chk_tf);
		
		// mypage01_main 로 이동 (김상우)
		cancle_bt.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				old_pw_tf.setText("");
				new_pw_tf.setText("");
				new_pw_chk_tf.setText("");
				cardLayout.show(main_pg,"mypage01_main");
			}
		});
		
		// 비밀번호 변경 버튼 (김상우)
		pw_change_bt.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				old_pw = old_pw_tf.getText().trim();
//				System.out.println(old_pw);
				new_pw = new_pw_tf.getText().trim();
//				System.out.println(new_pw);
				new_pw_chk = new_pw_chk_tf.getText().trim();
				System.out.println(new_pw_chk);
				int blank_flag = 0;
				int same_flag = 0;
				int old_chk_flag = 0;
				int id_chk_flag = 0;
				int old_now_flag = 0;
				// 빈칸이 없는지 확인
				if (old_pw.length() == 0 || new_pw.length() == 0 || new_pw_chk.length() == 0) {
					JOptionPane.showMessageDialog(getParent(), "내용을 모두 입력해주세요!", null, JOptionPane.INFORMATION_MESSAGE,
      				 new ImageIcon(Login01_page.class.getResource("/image/icon_mini.png")));
					 blank_flag = 0;
				} else {
					blank_flag = 1;
				}
				// ID 확인
				try {
					Protocol p = new Protocol();
//					db_VO vo = new db_VO();
//					vo.setOld_pw(old_pw);
					p.setCmd(36);
//					p.setVo(vo);
					main.out.writeObject(p);
					main.out.flush();
					id_chk_flag = 1;
				} catch (IOException e1) {
					System.out.println("아이디 확인에서 오류");
					System.out.println(e1);
					id_chk_flag = 0;
				}
//				System.out.println("아이디는" + id_forchk);
				
				// 해당 ID의 실제 pw 받아오기
				try {
					Protocol p = new Protocol();
					db_VO vo = new db_VO();
					vo.setOld_pw(old_pw);
					vo.setId_for_pwchk(id_forchk);
					p.setCmd(37);
					p.setVo(vo);
					main.out.writeObject(p);
					main.out.flush();
					old_now_flag = 1;
				} catch (Exception e2) {
					System.out.println("아이디 확인에서 오류");
					System.out.println(e2);
					old_now_flag = 0;
				}
//				System.out.println("pw_forchk는" + pw_forchk);
				
				// 받아온 pw와 비번변경 페이지에 입력된 old pw가 일치하는지 확인
				if (old_pw.equals(pw_forchk) == false) {
					JOptionPane.showMessageDialog(getParent(), "현재 비밀번호를 확인하세요!", null, JOptionPane.INFORMATION_MESSAGE,
		      				 new ImageIcon(Login01_page.class.getResource("/image/icon_mini.png")));
					old_chk_flag = 0;
				} else if (old_pw.equals(pw_forchk)) {
					old_chk_flag = 1;
				}
				
				// 비밀번호 칸과 확인 칸이 서로 일치하는지 확인
				if (new_pw.equals(new_pw_chk) == false) {
					JOptionPane.showMessageDialog(getParent(), "비밀번호 확인란을 제대로 입력하세요!", null, JOptionPane.INFORMATION_MESSAGE,
		      				 new ImageIcon(Login01_page.class.getResource("/image/icon_mini.png")));
					same_flag = 0;
				} else if (new_pw.equals(new_pw_chk)) {
					same_flag = 1;
				}
				// 모든 조건 만족 시 통과하여 update 하자
				if (blank_flag == 1 && same_flag == 1 && old_chk_flag == 1 && old_now_flag == 1) {
		
						Protocol p = new Protocol();
						db_VO vo = new db_VO();
//					System.out.println("아이디는" + id_forchk);
//					System.out.println("예전 비번은" + old_pw);
//					System.out.println("새 비번은" + new_pw);
						// id_forchk가 널값이었음.
//						vo.setUpdate_id(id_forchk);
						vo.setId(id_forchk);
						vo.setNew_pw(new_pw);
						p.setCmd(38);
						p.setVo(vo);
						try {
							main.out.writeObject(p);
							main.out.flush();
						} catch (Exception e2) {
							System.out.println("비번 변경 버튼에서 오류");
							System.out.println(e2);
						}
//						System.out.println("pw변경 cmd 값 " + p.getCmd());
						System.out.println("p입력값 id " + p.getVo().getId());
						System.out.println("p입력값 pw " + p.getVo().getNew_pw());
						System.out.println("비번 값 보내기 성공!");
				}
			}		
		});
	}
}
