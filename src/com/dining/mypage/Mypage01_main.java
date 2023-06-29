package com.dining.mypage;

import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Font;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.SwingConstants;

import com.dining.main.Main00_Home;
import com.dining.main.Main01_best1;
import com.dining.start.db_DAO;
import com.dining.start.db_Service;
import com.dining.start.db_VO;

import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import java.awt.event.ActionEvent;

public class Mypage01_main extends JPanel {
	JTextField textField;
	 JTextField id_tf;
	 JTextField pwanser_tf;
	 JTextField email_tf;
	 JTextField birth_tf;
	 JTextField name_tf;
	 JTextField pw_tf;
	CardLayout cardLayout;
	JPanel main_pg;

	/**
	 * Create the panel.
	 */
	public Mypage01_main(CardLayout cardLayout, JPanel main_pg) {
		this.cardLayout = cardLayout ;
		this.main_pg = main_pg ;
		setForeground(new Color(0, 0, 0));
		setBackground(new Color(255, 240, 245));
		setBounds(100, 100, 540, 960);
		setLayout(null);

		JLabel sidetool = new JLabel("");
		sidetool.setOpaque(true);
		sidetool.setBackground(new Color(255, 240, 245));
		sidetool.setBounds(405, 97, 91, 15);
		add(sidetool);
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBorderPainted(false);
		menuBar.setToolTipText("");
		menuBar.setBackground(new Color(255, 240, 245));
		menuBar.setBounds(418, 40, 62, 61);
		add(menuBar);

		JMenu movemenu = new JMenu("");
		movemenu.setOpaque(true);
		movemenu.setIconTextGap(0);
		movemenu.setIcon(new ImageIcon(Main00_Home.class.getResource("/image/menubutton.png")));
		movemenu.setBorderPainted(true);
		movemenu.setBackground(new Color(255, 240, 245));
		menuBar.add(movemenu);

		JMenuItem movemenu_1 = new JMenuItem("주간Best");
		movemenu_1.setFont(new Font("Sandoll 삼립호빵체 TTF Basic", Font.PLAIN, 14));
		movemenu_1.setOpaque(true);
		movemenu_1.setBorderPainted(true);
		movemenu_1.setBackground(new Color(65, 105, 225));
		movemenu.add(movemenu_1);

		JMenuItem movemenu_2 = new JMenuItem("음식카테고리");
		movemenu_2.setFont(new Font("Sandoll 삼립호빵체 TTF Basic", Font.PLAIN, 14));
		movemenu_2.setOpaque(true);
		movemenu_2.setBorderPainted(true);
		movemenu_2.setBackground(new Color(65, 105, 225));
		movemenu.add(movemenu_2);

		JMenuItem movemenu_3 = new JMenuItem("오늘 뭐먹죠?");
		movemenu_3.setFont(new Font("Sandoll 삼립호빵체 TTF Basic", Font.PLAIN, 14));
		movemenu_3.setOpaque(true);
		movemenu_3.setBorderPainted(true);
		movemenu_3.setBackground(new Color(65, 105, 225));
		movemenu.add(movemenu_3);

		JMenuItem mypage = new JMenuItem("MY Page");
		mypage.setFont(new Font("Sandoll 삼립호빵체 TTF Basic", Font.PLAIN, 14));
		mypage.setOpaque(true);
		mypage.setBorderPainted(true);
		mypage.setBackground(new Color(65, 105, 225));
		movemenu.add(mypage);

		JButton homeButton = new JButton("");
		homeButton.setIcon(new ImageIcon(Main01_best1.class.getResource("/image/homebutton_1.png")));
		homeButton.setBorderPainted(false);
		homeButton.setBackground(new Color(255, 240, 245));
		homeButton.setBounds(329, 37, 77, 69);
		add(homeButton);

		JLabel mypage_lb = new JLabel("MY PAGE");
		mypage_lb.setBounds(145, 112, 250, 72);
		mypage_lb.setBackground(new Color(255, 240, 245));
		mypage_lb.setFont(new Font("Sandoll 삼립호빵체 TTF Outline", Font.PLAIN, 60));
		mypage_lb.setHorizontalAlignment(SwingConstants.CENTER);
		mypage_lb.setForeground(Color.black);
		add(mypage_lb);

		JLabel id_lb = new JLabel("ID");
		id_lb.setOpaque(true);
		id_lb.setForeground(new Color(255, 255, 255));
		id_lb.setBackground(new Color(65, 105, 225));
		id_lb.setFont(new Font("Sandoll 삼립호빵체 TTF Basic", Font.PLAIN, 24));
		id_lb.setHorizontalAlignment(JLabel.CENTER);
		id_lb.setBounds(92, 229, 90, 35);
		add(id_lb);

		pw_tf = new JTextField();
		pw_tf.setEditable(false);
		pw_tf.setBounds(196, 304, 250, 35);
		add(pw_tf);
		pw_tf.setColumns(10);

		JLabel pw_lb = new JLabel("PW");
		pw_lb.setOpaque(true);
		pw_lb.setForeground(new Color(255, 255, 255));
		pw_lb.setBackground(new Color(65, 105, 225));
		pw_lb.setFont(new Font("Sandoll 삼립호빵체 TTF Basic", Font.PLAIN, 24));
		pw_lb.setHorizontalAlignment(JLabel.CENTER);
		pw_lb.setBounds(92, 304, 90, 35);
		add(pw_lb);

		name_tf = new JTextField();
		name_tf.setBounds(196, 384, 250, 35);
		add(name_tf);
		name_tf.setColumns(10);

		JLabel name_lb = new JLabel("이름");
		name_lb.setOpaque(true);
		name_lb.setForeground(new Color(255, 255, 255));
		name_lb.setBackground(new Color(65, 105, 225));
		name_lb.setFont(new Font("Sandoll 삼립호빵체 TTF Basic", Font.PLAIN, 24));
		name_lb.setHorizontalAlignment(JLabel.CENTER);
		name_lb.setBounds(92, 384, 90, 35);
		add(name_lb);

		birth_tf = new JTextField();
		birth_tf.setBounds(196, 464, 250, 35);
		add(birth_tf);
		birth_tf.setColumns(10);

		JLabel birth_lb = new JLabel("생년월일");
		birth_lb.setOpaque(true);
		birth_lb.setForeground(new Color(255, 255, 255));
		birth_lb.setBackground(new Color(65, 105, 225));
		birth_lb.setFont(new Font("Sandoll 삼립호빵체 TTF Basic", Font.PLAIN, 24));
		birth_lb.setHorizontalAlignment(JLabel.CENTER);
		birth_lb.setBounds(92, 464, 90, 35);
		add(birth_lb);

		email_tf = new JTextField();
		email_tf.setBounds(196, 542, 250, 35);
		add(email_tf);
		email_tf.setColumns(10);

		JLabel email_lb = new JLabel("이메일주소");
		email_lb.setOpaque(true);
		email_lb.setForeground(new Color(255, 255, 255));
		email_lb.setBackground(new Color(65, 105, 225));
		email_lb.setFont(new Font("Sandoll 삼립호빵체 TTF Basic", Font.PLAIN, 20));
		email_lb.setHorizontalAlignment(JLabel.CENTER);
		email_lb.setBounds(92, 542, 90, 35);
		add(email_lb);

		JLabel pwqa_lb = new JLabel("비번 찾기 질문");
		pwqa_lb.setOpaque(true);
		pwqa_lb.setForeground(new Color(255, 255, 255));
		pwqa_lb.setBackground(new Color(65, 105, 225));
		pwqa_lb.setFont(new Font("Sandoll 삼립호빵체 TTF Basic", Font.PLAIN, 16));
		pwqa_lb.setHorizontalAlignment(JLabel.CENTER);
		pwqa_lb.setBounds(92, 620, 90, 35);
		add(pwqa_lb);

		pwanser_tf = new JTextField();
		pwanser_tf.setBounds(196, 693, 250, 35);
		add(pwanser_tf);
		pwanser_tf.setColumns(10);

		JComboBox pw_comboBox = new JComboBox();
		pw_comboBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		pw_comboBox.setModel(new DefaultComboBoxModel(new String[] { "비밀번호를 찾을 때 사용할 질문을 선택하세요.", "1번 질문", "2번 질문", "3번 질문", "4번 질문" }));
		pw_comboBox.setBounds(196, 620, 250, 35);
		pw_comboBox.setFont(new Font("Sandoll 삼립호빵체 TTF Basic", Font.PLAIN, 13));

		add(pw_comboBox);

		JLabel pwanser_lb = new JLabel("질문 답변");
		pwanser_lb.setOpaque(true);
		pwanser_lb.setForeground(new Color(255, 255, 255));
		pwanser_lb.setBackground(new Color(65, 105, 225));
		pwanser_lb.setFont(new Font("Sandoll 삼립호빵체 TTF Basic", Font.PLAIN, 24));
		pwanser_lb.setHorizontalAlignment(JLabel.CENTER);
		pwanser_lb.setBounds(92, 693, 90, 35);
		add(pwanser_lb);

		id_tf = new JTextField();
		id_tf.setBounds(196, 229, 250, 35);
		add(id_tf);
		id_tf.setColumns(10);

		RoundedButton_ha0_1 fix_bt = new RoundedButton_ha0_1("수정");
		fix_bt.setForeground(new Color(255, 255, 255));
		fix_bt.setBorderPainted(false);
		fix_bt.setBackground(new Color(65, 105, 225));
		fix_bt.setFont(new Font("Sandoll 삼립호빵체 TTF Basic", Font.PLAIN, 24));
		fix_bt.setBounds(225, 776, 90, 50);
		add(fix_bt);

		RoundedButton_ha0_2 mem_del_bt = new RoundedButton_ha0_2("회원탈퇴");
		mem_del_bt.setBackground(new Color(255, 128, 128));
		mem_del_bt.setForeground(new Color(255, 255, 255));

		mem_del_bt.setFont(new Font("Sandoll 삼립호빵체 TTF Basic", Font.PLAIN, 24));
		mem_del_bt.setBounds(225, 859, 90, 50);
		add(mem_del_bt);

		RoundedButton_ha0_1 pw_change_bt = new RoundedButton_ha0_1();
		pw_change_bt.setText("pw변경");
		pw_change_bt.setForeground(Color.WHITE);
		pw_change_bt.setFont(new Font("Sandoll 삼립호빵체 TTF Basic", Font.PLAIN, 24));
		pw_change_bt.setBorderPainted(false);
		pw_change_bt.setBackground(new Color(65, 105, 225));
		pw_change_bt.setBounds(356, 776, 90, 50);
		add(pw_change_bt);
		
		RoundedButton_ha0_1 like_bt = new RoundedButton_ha0_1();
		like_bt.setText("즐겨찾기");
		like_bt.setForeground(Color.WHITE);
		like_bt.setFont(new Font("Sandoll 삼립호빵체 TTF Basic", Font.PLAIN, 24));
		like_bt.setBorderPainted(false);
		like_bt.setBackground(new Color(65, 105, 225));
		like_bt.setBounds(92, 776, 90, 50);
		add(like_bt);
		
		JButton logout_bt = new JButton("");
		logout_bt.setBackground(new Color(255, 240, 245));
		logout_bt.setBorderPainted(false);
		logout_bt.setIcon(new ImageIcon(Mypage01_main.class.getResource("/image/logout_bt.png")));
		logout_bt.setBounds(240, 21, 80, 80);
		add(logout_bt);

		// Main00_Home으로 돌아간다
		homeButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				cardLayout.show(main_pg, "main00_Home");
			}
		});
		
		// mypage01_changePW로 이동 비번변경
		pw_change_bt.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				cardLayout.show(main_pg, "mypage01_changePW");
			}
		});
		
		// main01_best1 로 이동
		movemenu_1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				cardLayout.show(main_pg, "main01_best1");
			}
		});

		// main02_category_select 로 이동
		movemenu_2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				cardLayout.show(main_pg, "main02_category_select");
			}
		});

		// main03_random 로 이동
		movemenu_3.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				cardLayout.show(main_pg, "main03_random");
			}
		});

		// mypage01_main 로 이동
		mypage.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				cardLayout.show(main_pg, "mypage01_main");
			}
		});
		// 나만의 즐겨찾기로 이동
		like_bt.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				cardLayout.show(main_pg, "mypage02_mypick");
			}
		});
		
		// 로그아웃해서 로그인 화면으로 돌아가기 login01_page
		logout_bt.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				cardLayout.show(main_pg, "login01_page");
			}
		});
		
		fix_bt.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				db_VO vo = new db_VO();
				vo = db_DAO.getid();
				id_tf.setText(vo.getId());
//				List<db_VO> list = db_DAO.getidAll();
				
//				for (db_VO k : list) {
//					System.out.print(k.getId()+"\t");
//					System.out.print(k.getPassword()+"\t");
//					System.out.println(k.getName());
//				}
			}
		});
	}
}
