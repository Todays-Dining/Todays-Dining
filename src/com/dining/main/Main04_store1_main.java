package com.dining.main;

import java.awt.Color;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

import java.awt.Button;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JCheckBox;
import javax.swing.JTextField;
import javax.swing.JRadioButton;

public class Main04_store1_main extends JPanel {
	 JTextField textField;
	 JTextField textField_1;
	 JTextField textField_2;
	 JTextField textField_3;
	 JTextField textField_4;
	 JTextField textField_5;

	/**
	 * Create the panel.
	 */
	public Main04_store1_main() {
		
		setForeground(new Color(0, 0, 0));
		setBackground(new Color(255, 240, 245));
		setBounds(100, 100, 540, 960);
		setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("4.5");
		lblNewLabel_1.setBounds(293, 160, 22, 22);
		add(lblNewLabel_1);
		
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
		
		JLabel lblNewLabel = new JLabel("가게 대표메뉴 이미지");
		lblNewLabel.setOpaque(true);
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setBackground(new Color(255, 0, 0));
		lblNewLabel.setFont(new Font("Sandoll 삼립호빵체 TTF Outline", Font.PLAIN, 50));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(53, 210, 414, 270);
		add(lblNewLabel);
		
		JMenu movemenu = new JMenu("");
		movemenu.setOpaque(true);
		movemenu.setIconTextGap(0);
		movemenu.setIcon(new ImageIcon("C:\\TeamProject\\src\\image\\menubutton.png"));
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
		homeButton.setBorderPainted(false);
		homeButton.setIcon(new ImageIcon("C:\\TeamProject\\\\src\\image\\homebutton_1.png"));
		homeButton.setBackground(new Color(255, 240, 245));
		homeButton.setBounds(329, 37, 77, 69);
		add(homeButton);
		
		RoundedButton_ysh_1 btnNewButton = new RoundedButton_ysh_1("끼로끼로하영이");
		btnNewButton.setForeground(new Color(255, 255, 255));
		btnNewButton.setBorderPainted(false);
		btnNewButton.setBackground(new Color(65, 105, 225));
		btnNewButton.setFont(new Font("Sandoll 삼립호빵체 TTF Basic", Font.PLAIN, 18));
		btnNewButton.setBounds(53, 139, 204, 61);
		add(btnNewButton);
		
		textField = new JTextField();
		textField.setBounds(228, 513, 218, 31);
		add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_1_5 = new JLabel("주차 여부 : ");
		lblNewLabel_1_5.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_5.setFont(new Font("Sandoll 삼립호빵체 TTF Basic", Font.PLAIN, 24));
		lblNewLabel_1_5.setBounds(86, 763, 132, 33);
		add(lblNewLabel_1_5);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(228, 568, 218, 31);
		add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(228, 621, 218, 31);
		add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(228, 671, 218, 31);
		add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(228, 719, 218, 31);
		add(textField_4);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(228, 765, 218, 31);
		add(textField_5);
		
		JLabel lblNewLabel_1_5_1 = new JLabel("가게 지역 : ");
		lblNewLabel_1_5_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_5_1.setFont(new Font("Sandoll 삼립호빵체 TTF Basic", Font.PLAIN, 24));
		lblNewLabel_1_5_1.setBounds(86, 511, 132, 33);
		add(lblNewLabel_1_5_1);
		
		JLabel lblNewLabel_1_5_2 = new JLabel("가게 주소 : ");
		lblNewLabel_1_5_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_5_2.setFont(new Font("Sandoll 삼립호빵체 TTF Basic", Font.PLAIN, 24));
		lblNewLabel_1_5_2.setBounds(86, 568, 132, 33);
		add(lblNewLabel_1_5_2);
		
		JLabel lblNewLabel_1_5_3 = new JLabel("가게대표메뉴 : ");
		lblNewLabel_1_5_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_5_3.setFont(new Font("Sandoll 삼립호빵체 TTF Basic", Font.PLAIN, 24));
		lblNewLabel_1_5_3.setBounds(63, 626, 151, 33);
		add(lblNewLabel_1_5_3);
		
		JLabel lblNewLabel_1_5_2_1 = new JLabel("전화 번호 : ");
		lblNewLabel_1_5_2_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_5_2_1.setFont(new Font("Sandoll 삼립호빵체 TTF Basic", Font.PLAIN, 24));
		lblNewLabel_1_5_2_1.setBounds(86, 676, 132, 33);
		add(lblNewLabel_1_5_2_1);
		
		JLabel lblNewLabel_1_5_2_1_1 = new JLabel("주차 여부 : ");
		lblNewLabel_1_5_2_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_5_2_1_1.setFont(new Font("Sandoll 삼립호빵체 TTF Basic", Font.PLAIN, 24));
		lblNewLabel_1_5_2_1_1.setBounds(86, 720, 132, 33);
		add(lblNewLabel_1_5_2_1_1);
		
		RoundedButton_ysh_1 btnNewButton_2 = new RoundedButton_ysh_1("상세위치 지도보기");
		btnNewButton_2.setBorderPainted(false);
		btnNewButton_2.setBackground(new Color(65, 105, 225));
		btnNewButton_2.setForeground(new Color(255, 255, 255));
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_2.setBounds(62, 839, 174, 61);
		add(btnNewButton_2);
		
		RoundedButton_ysh_1 btnNewButton_2_1 = new RoundedButton_ysh_1("리뷰 작성 및 보기");
		btnNewButton_2_1.setBackground(new Color(65, 105, 225));
		btnNewButton_2_1.setBorderPainted(false);
		btnNewButton_2_1.setForeground(new Color(255, 255, 255));
		btnNewButton_2_1.setBounds(293, 839, 174, 61);
		add(btnNewButton_2_1);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon("C:\\TeamProject\\src\\image\\star3.png"));
		lblNewLabel_2.setBounds(269, 139, 77, 61);
		add(lblNewLabel_2);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("");
		rdbtnNewRadioButton.setIconTextGap(0);
		rdbtnNewRadioButton.setIcon(new ImageIcon(Main04_store1_main.class.getResource("/image/whiteheart.png")));
		rdbtnNewRadioButton.setBounds(364, 139, 82, 65);
		add(rdbtnNewRadioButton);
	}
}