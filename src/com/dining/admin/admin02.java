package com.dining.;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JTable;
import javax.swing.JTextField;

public class admin02 extends JPanel {
	  JTextField textField;
	  JTextField textField_1;
	  JTextField textField_2;
	  JTextField textField_3;
	  JTextField textField_4;
	  JTextField textField_5;
	  JTextField textField_6;
	  JTextField textField_7;
	  JTextField textField_8;
	  JTextField textField_9;
	  JTextField textField_10;
	  JTextField textField_11;
	  JTextField textField_12;
	  JTextField textField_13;
	  JTextField textField_14;
	  JTextField textField_15;
	  JTextField textField_16;
	  JTextField textField_17;
	  JTextField textField_18;
	
	 String header[]={"가게번호", "음식점 이름", "지역", "상세주소", "음식분류", "대표메뉴", "대표 키워드", "대표 전화번호", "영업시간", "주차 여부"};
     String contents[][]={
    		 {"0", "끼로끼로부엉이", "신촌", "신촌 어딘가", "한식", "삼겹살", "회식", "02-2212-2121", "영업시간", "주차 여부"},
    		 {"가게번호", "음식점 이름", "지역", "상세주소", "음식분류", "대표메뉴", "대표 키워드", "대표 전화번호", "영업시간", "주차 여부"},
    		 {"가게번호", "음식점 이름", "지역", "상세주소", "음식분류", "대표메뉴", "대표 키워드", "대표 전화번호", "영업시간", "주차 여부"},
    		 {"가게번호", "음식점 이름", "지역", "상세주소", "음식분류", "대표메뉴", "대표 키워드", "대표 전화번호", "영업시간", "주차 여부"},
    		 {"가게번호", "음식점 이름", "지역", "상세주소", "음식분류", "대표메뉴", "대표 키워드", "대표 전화번호", "영업시간", "주차 여부"},
    		 {"가게번호", "음식점 이름", "지역", "상세주소", "음식분류", "대표메뉴", "대표 키워드", "대표 전화번호", "영업시간", "주차 여부"},
    		 {"가게번호", "음식점 이름", "지역", "상세주소", "음식분류", "대표메뉴", "대표 키워드", "대표 전화번호", "영업시간", "주차 여부"},
    		 {"가게번호", "음식점 이름", "지역", "상세주소", "음식분류", "대표메뉴", "대표 키워드", "대표 전화번호", "영업시간", "주차 여부"},
    		 {"가게번호", "음식점 이름", "지역", "상세주소", "음식분류", "대표메뉴", "대표 키워드", "대표 전화번호", "영업시간", "주차 여부"},
    		 {"가게번호", "음식점 이름", "지역", "상세주소", "음식분류", "대표메뉴", "대표 키워드", "대표 전화번호", "영업시간", "주차 여부"},
    		 {"가게번호", "음식점 이름", "지역", "상세주소", "음식분류", "대표메뉴", "대표 키워드", "대표 전화번호", "영업시간", "주차 여부"},
    		 {"가게번호", "음식점 이름", "지역", "상세주소", "음식분류", "대표메뉴", "대표 키워드", "대표 전화번호", "영업시간", "주차 여부"},
    		 {"가게번호", "음식점 이름", "지역", "상세주소", "음식분류", "대표메뉴", "대표 키워드", "대표 전화번호", "영업시간", "주차 여부"},
    		 {"가게번호", "음식점 이름", "지역", "상세주소", "음식분류", "대표메뉴", "대표 키워드", "대표 전화번호", "영업시간", "주차 여부"},
    		 {"가게번호", "음식점 이름", "지역", "상세주소", "음식분류", "대표메뉴", "대표 키워드", "대표 전화번호", "영업시간", "주차 여부"},
    		 {"가게번호", "음식점 이름", "지역", "상세주소", "음식분류", "대표메뉴", "대표 키워드", "대표 전화번호", "영업시간", "주차 여부"},
    		 {"가게번호", "음식점 이름", "지역", "상세주소", "음식분류", "대표메뉴", "대표 키워드", "대표 전화번호", "영업시간", "주차 여부"},
    		 {"가게번호", "음식점 이름", "지역", "상세주소", "음식분류", "대표메뉴", "대표 키워드", "대표 전화번호", "영업시간", "주차 여부"},
    		 {"가게번호", "음식점 이름", "지역", "상세주소", "음식분류", "대표메뉴", "대표 키워드", "대표 전화번호", "영업시간", "주차 여부"},
    		 {"가게번호", "음식점 이름", "지역", "상세주소", "음식분류", "대표메뉴", "대표 키워드", "대표 전화번호", "영업시간", "주차 여부"},
    		 {"가게번호", "음식점 이름", "지역", "상세주소", "음식분류", "대표메뉴", "대표 키워드", "대표 전화번호", "영업시간", "주차 여부"},
    		 {"가게번호", "음식점 이름", "지역", "상세주소", "음식분류", "대표메뉴", "대표 키워드", "대표 전화번호", "영업시간", "주차 여부"},
    		 {"가게번호", "음식점 이름", "지역", "상세주소", "음식분류", "대표메뉴", "대표 키워드", "대표 전화번호", "영업시간", "주차 여부"},
    		 {"가게번호", "음식점 이름", "지역", "상세주소", "음식분류", "대표메뉴", "대표 키워드", "대표 전화번호", "영업시간", "주차 여부"}
     };
     String selection[]= {"회원번호", "회원아이디"}; 
     JTable table;
     JTable table_1;
     private JTextField textField_19;
     private JTextField textField_20;
     private JTextField textField_21;
     private JTextField textField_22;
     private JTextField textField_23;
     private JTextField textField_24;
	/**
	 * Create the panel.
	 */
	public admin02() {
		
		setBackground(new Color(255, 240, 245));
		setSize(1200, 800);
		setLayout(null);
		
		JLabel rest = new JLabel("음식점");
		rest.setForeground(new Color(65, 105, 225));
		rest.setFont(new Font("Sandoll 삼립호빵체 TTF Basic", Font.PLAIN, 50));
		rest.setBounds(36, 41, 207, 89);
		add(rest);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setOpaque(true);
		lblNewLabel_1.setBackground(new Color(65, 105, 225));
		lblNewLabel_1.setBounds(36, 115, 1120, 8);
		add(lblNewLabel_1);
		
		JButton backbutton = new JButton("");
		backbutton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		backbutton.setBorderPainted(false);
		backbutton.setBackground(new Color(255, 240, 245));
		backbutton.setIcon(new ImageIcon(admin02.class.getResource("/image/backbutton.png")));
		backbutton.setBounds(1055, 51, 101, 54);
		add(backbutton);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setToolTipText("음식점 신규등록");
		tabbedPane.setFont(new Font("Sandoll 삼립호빵체 TTF Basic", Font.BOLD, 25));
		tabbedPane.setBackground(new Color(170, 187, 255));
		tabbedPane.setBounds(36, 194, 1120, 580);
		add(tabbedPane);
		
		// ★★★ //
		JPanel panel = new JPanel();
		panel.setBackground(new Color(218, 226, 250));
		panel.setPreferredSize(new Dimension(500, 500));
		tabbedPane.addTab("", new ImageIcon(admin02.class.getResource("/image/RegisteredDiner.png")), panel, "");
		tabbedPane.setBackgroundAt(17, Color.RED);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(213, 221, 255));
		tabbedPane.addTab("", new ImageIcon(admin02.class.getResource("/image/DinerNew.png")), panel_1, null);
		
		panel_1.setLayout(null);
		
		textField_10 = new JTextField();
		textField_10.setColumns(10);
		textField_10.setBounds(200, 75, 227, 21);
		panel_1.add(textField_10);
		
		JLabel foodname01 = new JLabel("음식점 이름 : ");
		foodname01.setFont(new Font("Sandoll 삼립호빵체 TTF Basic", Font.BOLD, 20));
		foodname01.setBounds(40, 77, 176, 18);
		panel_1.add(foodname01);
		
		JLabel foodcity01 = new JLabel("음식점 지역 : ");
		foodcity01.setFont(new Font("Sandoll 삼립호빵체 TTF Basic", Font.BOLD, 20));
		foodcity01.setBounds(40, 123, 176, 18);
		panel_1.add(foodcity01);
		
		textField_11 = new JTextField();
		textField_11.setColumns(10);
		textField_11.setBounds(200, 120, 227, 21);
		panel_1.add(textField_11);
		
		JLabel foodadd01 = new JLabel("음식점 주소 : ");
		foodadd01.setFont(new Font("Sandoll 삼립호빵체 TTF Basic", Font.BOLD, 20));
		foodadd01.setBounds(40, 169, 176, 18);
		panel_1.add(foodadd01);
		
		textField_12 = new JTextField();
		textField_12.setColumns(10);
		textField_12.setBounds(200, 165, 228, 21);
		panel_1.add(textField_12);
		
		JLabel foodcate01 = new JLabel("가게음식 분류 : ");
		foodcate01.setFont(new Font("Sandoll 삼립호빵체 TTF Basic", Font.BOLD, 20));
		foodcate01.setBounds(40, 215, 176, 18);
		panel_1.add(foodcate01);
		
		textField_13 = new JTextField();
		textField_13.setColumns(10);
		textField_13.setBounds(200, 210, 227, 21);
		panel_1.add(textField_13);
		
		JLabel bestfood01 = new JLabel("가게음식 대표메뉴 : ");
		bestfood01.setFont(new Font("Sandoll 삼립호빵체 TTF Basic", Font.BOLD, 20));
		bestfood01.setBounds(40, 261, 176, 18);
		panel_1.add(bestfood01);
		
		JLabel foodkey01 = new JLabel("대표 키워드 : ");
		foodkey01.setFont(new Font("Sandoll 삼립호빵체 TTF Basic", Font.BOLD, 20));
		foodkey01.setBounds(40, 308, 176, 18);
		panel_1.add(foodkey01);
		
		JLabel foodphone01 = new JLabel("대표 전화번호 : ");
		foodphone01.setFont(new Font("Sandoll 삼립호빵체 TTF Basic", Font.BOLD, 20));
		foodphone01.setBounds(40, 352, 176, 18);
		panel_1.add(foodphone01);
		
		JLabel onpentime01 = new JLabel("영업 시간 : ");
		onpentime01.setFont(new Font("Sandoll 삼립호빵체 TTF Basic", Font.BOLD, 20));
		onpentime01.setBounds(40, 396, 176, 18);
		panel_1.add(onpentime01);
		
		JLabel car01 = new JLabel("주차여부 : ");
		car01.setFont(new Font("Sandoll 삼립호빵체 TTF Basic", Font.BOLD, 20));
		car01.setBounds(40, 438, 176, 18);
		panel_1.add(car01);
		
		textField_14 = new JTextField();
		textField_14.setColumns(10);
		textField_14.setBounds(200, 255, 227, 21);
		panel_1.add(textField_14);
		
		textField_15 = new JTextField();
		textField_15.setColumns(10);
		textField_15.setBounds(200, 300, 227, 21);
		panel_1.add(textField_15);
		
		textField_16 = new JTextField();
		textField_16.setColumns(10);
		textField_16.setBounds(200, 345, 227, 21);
		panel_1.add(textField_16);
		
		textField_17 = new JTextField();
		textField_17.setColumns(10);
		textField_17.setBounds(200, 390, 227, 21);
		panel_1.add(textField_17);
		
		textField_18 = new JTextField();
		textField_18.setColumns(10);
		textField_18.setBounds(200, 435, 227, 21);
		panel_1.add(textField_18);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(new Color(255, 247, 234));
		panel_3.setBounds(486, 75, 580, 381);
		panel_1.add(panel_3);
		panel_3.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("   이미지 등록");
		lblNewLabel.setFont(new Font("Sandoll 삼립호빵체 TTF Basic", Font.PLAIN, 20));
		lblNewLabel.setBounds(227, 10, 115, 32);
		panel_3.add(lblNewLabel);
		
		JLabel lblNewLabel_2 = new JLabel("가게 이미지 : ");
		lblNewLabel_2.setFont(new Font("Sandoll 삼립호빵체 TTF Basic", Font.PLAIN, 20));
		lblNewLabel_2.setBounds(12, 52, 115, 32);
		panel_3.add(lblNewLabel_2);
		
		JLabel lblNewLabel_2_1 = new JLabel("대표 메뉴 : ");
		lblNewLabel_2_1.setFont(new Font("Sandoll 삼립호빵체 TTF Basic", Font.PLAIN, 20));
		lblNewLabel_2_1.setBounds(12, 160, 115, 32);
		panel_3.add(lblNewLabel_2_1);
		
		JLabel lblNewLabel_2_2 = new JLabel("가게 위치 : ");
		lblNewLabel_2_2.setFont(new Font("Sandoll 삼립호빵체 TTF Basic", Font.PLAIN, 20));
		lblNewLabel_2_2.setBounds(12, 275, 115, 32);
		panel_3.add(lblNewLabel_2_2);
		
		textField_19 = new JTextField();
		textField_19.setColumns(10);
		textField_19.setBounds(115, 57, 453, 21);
		panel_3.add(textField_19);
		
		textField_20 = new JTextField();
		textField_20.setColumns(10);
		textField_20.setBounds(115, 165, 453, 21);
		panel_3.add(textField_20);
		
		textField_21 = new JTextField();
		textField_21.setColumns(10);
		textField_21.setBounds(115, 280, 453, 21);
		panel_3.add(textField_21);
		
		JButton btnNewButton_3 = new JButton("이미지 불러오기");
		btnNewButton_3.setForeground(new Color(255, 240, 245));
		btnNewButton_3.setFont(new Font("Sandoll 삼립호빵체 TTF Basic", Font.PLAIN, 15));
		btnNewButton_3.setBorderPainted(false);
		btnNewButton_3.setBackground(new Color(65, 105, 255));
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_3.setBounds(182, 102, 127, 39);
		panel_3.add(btnNewButton_3);
		
		JButton btnNewButton_3_1 = new JButton("미리보기");
		btnNewButton_3_1.setForeground(new Color(255, 240, 245));
		btnNewButton_3_1.setFont(new Font("Sandoll 삼립호빵체 TTF Basic", Font.PLAIN, 15));
		btnNewButton_3_1.setBorderPainted(false);
		btnNewButton_3_1.setBackground(new Color(65, 105, 255));
		btnNewButton_3_1.setBounds(348, 102, 97, 39);
		panel_3.add(btnNewButton_3_1);
		
		JButton btnNewButton_3_2 = new JButton("이미지 불러오기");
		btnNewButton_3_2.setForeground(new Color(255, 240, 245));
		btnNewButton_3_2.setFont(new Font("Sandoll 삼립호빵체 TTF Basic", Font.PLAIN, 15));
		btnNewButton_3_2.setBorderPainted(false);
		btnNewButton_3_2.setBackground(new Color(65, 105, 255));
		btnNewButton_3_2.setBounds(182, 214, 127, 39);
		panel_3.add(btnNewButton_3_2);
		
		JButton btnNewButton_3_1_1 = new JButton("미리보기");
		btnNewButton_3_1_1.setForeground(new Color(255, 240, 245));
		btnNewButton_3_1_1.setFont(new Font("Sandoll 삼립호빵체 TTF Basic", Font.PLAIN, 15));
		btnNewButton_3_1_1.setBorderPainted(false);
		btnNewButton_3_1_1.setBackground(new Color(65, 105, 255));
		btnNewButton_3_1_1.setBounds(348, 214, 97, 39);
		panel_3.add(btnNewButton_3_1_1);
		
		JButton btnNewButton_3_2_1 = new JButton("이미지 불러오기");
		btnNewButton_3_2_1.setForeground(new Color(255, 240, 245));
		btnNewButton_3_2_1.setFont(new Font("Sandoll 삼립호빵체 TTF Basic", Font.PLAIN, 15));
		btnNewButton_3_2_1.setBorderPainted(false);
		btnNewButton_3_2_1.setBackground(new Color(65, 105, 255));
		btnNewButton_3_2_1.setBounds(182, 317, 127, 39);
		panel_3.add(btnNewButton_3_2_1);
		
		JButton btnNewButton_3_1_1_1 = new JButton("미리보기");
		btnNewButton_3_1_1_1.setForeground(new Color(255, 240, 245));
		btnNewButton_3_1_1_1.setFont(new Font("Sandoll 삼립호빵체 TTF Basic", Font.PLAIN, 15));
		btnNewButton_3_1_1_1.setBorderPainted(false);
		btnNewButton_3_1_1_1.setBackground(new Color(65, 105, 255));
		btnNewButton_3_1_1_1.setBounds(348, 317, 97, 39);
		panel_3.add(btnNewButton_3_1_1_1);
		
		JButton btnNewButton_2 = new JButton("등  록");
		btnNewButton_2.setForeground(new Color(255, 240, 245));
		btnNewButton_2.setFont(new Font("Sandoll 삼립호빵체 TTF Basic", Font.PLAIN, 25));
		btnNewButton_2.setBorderPainted(false);
		btnNewButton_2.setBackground(new Color(65, 105, 255));
		btnNewButton_2.setBounds(171, 480, 125, 34);
		panel_1.add(btnNewButton_2);
		
		
		
		JPanel panel_2 = new JPanel();
		panel_2.setFont(new Font("Sandoll 삼립호빵체 TTF Basic", Font.BOLD, 15));
		panel_2.setBackground(new Color(213, 221, 255));
		tabbedPane.addTab("", new ImageIcon(admin02.class.getResource("/image/DinerRevise.png")), panel_2, null);
		panel_2.setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(200, 75, 227, 21);
		panel_2.add(textField);
		textField.setColumns(10);
		
		JLabel foodname02 = new JLabel("음식점 이름 : ");
		foodname02.setFont(new Font("Sandoll 삼립호빵체 TTF Basic", Font.BOLD, 20));
		foodname02.setBounds(40, 77, 176, 18);
		panel_2.add(foodname02);
		
		JLabel foodcity02 = new JLabel("음식점 지역 : ");
		foodcity02.setFont(new Font("Sandoll 삼립호빵체 TTF Basic", Font.BOLD, 20));
		foodcity02.setBounds(40, 123, 176, 18);
		panel_2.add(foodcity02);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(200, 120, 227, 21);
		panel_2.add(textField_1);
		
		JLabel foodadd02 = new JLabel("음식점 주소 : ");
		foodadd02.setFont(new Font("Sandoll 삼립호빵체 TTF Basic", Font.BOLD, 20));
		foodadd02.setBounds(40, 169, 176, 18);
		panel_2.add(foodadd02);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(200, 165, 228, 21);
		panel_2.add(textField_2);
		
		JLabel foodcate02 = new JLabel("가게음식 분류 : ");
		foodcate02.setFont(new Font("Sandoll 삼립호빵체 TTF Basic", Font.BOLD, 20));
		foodcate02.setBounds(40, 215, 176, 18);
		panel_2.add(foodcate02);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(200, 210, 227, 21);
		panel_2.add(textField_3);
		
		JLabel bestfood02 = new JLabel("가게음식 대표메뉴 : ");
		bestfood02.setFont(new Font("Sandoll 삼립호빵체 TTF Basic", Font.BOLD, 20));
		bestfood02.setBounds(40, 261, 176, 18);
		panel_2.add(bestfood02);
		
		JLabel foodkey02 = new JLabel("대표 키워드 : ");
		foodkey02.setFont(new Font("Sandoll 삼립호빵체 TTF Basic", Font.BOLD, 20));
		foodkey02.setBounds(40, 308, 176, 18);
		panel_2.add(foodkey02);
		
		JLabel foodphone02 = new JLabel("대표 전화번호 : ");
		foodphone02.setFont(new Font("Sandoll 삼립호빵체 TTF Basic", Font.BOLD, 20));
		foodphone02.setBounds(40, 352, 176, 18);
		panel_2.add(foodphone02);
		
		JLabel car02 = new JLabel("영업 시간 : ");
		car02.setFont(new Font("Sandoll 삼립호빵체 TTF Basic", Font.BOLD, 20));
		car02.setBounds(40, 396, 176, 18);
		panel_2.add(car02);
		
		JLabel lblNewLabel_2_7_1 = new JLabel("주차여부 : ");
		lblNewLabel_2_7_1.setFont(new Font("Sandoll 삼립호빵체 TTF Basic", Font.BOLD, 20));
		lblNewLabel_2_7_1.setBounds(40, 438, 135, 18);
		panel_2.add(lblNewLabel_2_7_1);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(200, 255, 227, 21);
		panel_2.add(textField_4);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(200, 300, 227, 21);
		panel_2.add(textField_5);
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(200, 345, 227, 21);
		panel_2.add(textField_6);
		
		textField_7 = new JTextField();
		textField_7.setColumns(10);
		textField_7.setBounds(200, 390, 227, 21);
		panel_2.add(textField_7);
		
		textField_8 = new JTextField();
		textField_8.setColumns(10);
		textField_8.setBounds(200, 435, 227, 21);
		panel_2.add(textField_8);
		
		JButton btnNewButton = new JButton("수  정");
		btnNewButton.setForeground(new Color(255, 240, 245));
		btnNewButton.setBackground(new Color(65, 105, 255));
		btnNewButton.setBorderPainted(false);
		btnNewButton.setFont(new Font("Sandoll 삼립호빵체 TTF Basic", Font.PLAIN, 25));
		btnNewButton.setBounds(50, 473, 125, 34);
		panel_2.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("전체삭제");
		btnNewButton_1.setBackground(new Color(65, 105, 255));
		btnNewButton_1.setBorderPainted(false);
		btnNewButton_1.setForeground(new Color(255, 240, 245));
		btnNewButton_1.setFont(new Font("Sandoll 삼립호빵체 TTF Basic", Font.PLAIN, 25));
		btnNewButton_1.setBounds(246, 473, 125, 34);
		panel_2.add(btnNewButton_1);
		
		JPanel panel_3_2 = new JPanel();
		panel_3_2.setLayout(null);
		panel_3_2.setBackground(new Color(255, 247, 234));
		panel_3_2.setBounds(486, 75, 580, 381);
		panel_2.add(panel_3_2);
		
		JLabel lblNewLabel_3 = new JLabel("   이미지 등록");
		lblNewLabel_3.setFont(new Font("Sandoll 삼립호빵체 TTF Basic", Font.PLAIN, 20));
		lblNewLabel_3.setBounds(227, 10, 115, 32);
		panel_3_2.add(lblNewLabel_3);
		
		JLabel lblNewLabel_2_3 = new JLabel("가게 이미지 : ");
		lblNewLabel_2_3.setFont(new Font("Sandoll 삼립호빵체 TTF Basic", Font.PLAIN, 20));
		lblNewLabel_2_3.setBounds(12, 52, 115, 32);
		panel_3_2.add(lblNewLabel_2_3);
		
		JLabel lblNewLabel_2_1_1 = new JLabel("대표 메뉴 : ");
		lblNewLabel_2_1_1.setFont(new Font("Sandoll 삼립호빵체 TTF Basic", Font.PLAIN, 20));
		lblNewLabel_2_1_1.setBounds(12, 160, 115, 32);
		panel_3_2.add(lblNewLabel_2_1_1);
		
		JLabel lblNewLabel_2_2_1 = new JLabel("가게 위치 : ");
		lblNewLabel_2_2_1.setFont(new Font("Sandoll 삼립호빵체 TTF Basic", Font.PLAIN, 20));
		lblNewLabel_2_2_1.setBounds(12, 275, 115, 32);
		panel_3_2.add(lblNewLabel_2_2_1);
		
		textField_22 = new JTextField();
		textField_22.setColumns(10);
		textField_22.setBounds(115, 57, 453, 21);
		panel_3_2.add(textField_22);
		
		textField_23 = new JTextField();
		textField_23.setColumns(10);
		textField_23.setBounds(115, 165, 453, 21);
		panel_3_2.add(textField_23);
		
		textField_24 = new JTextField();
		textField_24.setColumns(10);
		textField_24.setBounds(115, 280, 453, 21);
		panel_3_2.add(textField_24);
		
		JButton btnNewButton_3_3 = new JButton("이미지 불러오기");
		btnNewButton_3_3.setForeground(new Color(255, 240, 245));
		btnNewButton_3_3.setFont(new Font("Sandoll 삼립호빵체 TTF Basic", Font.PLAIN, 15));
		btnNewButton_3_3.setBorderPainted(false);
		btnNewButton_3_3.setBackground(new Color(65, 105, 255));
		btnNewButton_3_3.setBounds(182, 102, 127, 39);
		panel_3_2.add(btnNewButton_3_3);
		
		JButton btnNewButton_3_1_2 = new JButton("미리보기");
		btnNewButton_3_1_2.setForeground(new Color(255, 240, 245));
		btnNewButton_3_1_2.setFont(new Font("Sandoll 삼립호빵체 TTF Basic", Font.PLAIN, 15));
		btnNewButton_3_1_2.setBorderPainted(false);
		btnNewButton_3_1_2.setBackground(new Color(65, 105, 255));
		btnNewButton_3_1_2.setBounds(348, 102, 97, 39);
		panel_3_2.add(btnNewButton_3_1_2);
		
		JButton btnNewButton_3_2_2 = new JButton("이미지 불러오기");
		btnNewButton_3_2_2.setForeground(new Color(255, 240, 245));
		btnNewButton_3_2_2.setFont(new Font("Sandoll 삼립호빵체 TTF Basic", Font.PLAIN, 15));
		btnNewButton_3_2_2.setBorderPainted(false);
		btnNewButton_3_2_2.setBackground(new Color(65, 105, 255));
		btnNewButton_3_2_2.setBounds(182, 214, 127, 39);
		panel_3_2.add(btnNewButton_3_2_2);
		
		JButton btnNewButton_3_1_1_2 = new JButton("미리보기");
		btnNewButton_3_1_1_2.setForeground(new Color(255, 240, 245));
		btnNewButton_3_1_1_2.setFont(new Font("Sandoll 삼립호빵체 TTF Basic", Font.PLAIN, 15));
		btnNewButton_3_1_1_2.setBorderPainted(false);
		btnNewButton_3_1_1_2.setBackground(new Color(65, 105, 255));
		btnNewButton_3_1_1_2.setBounds(348, 214, 97, 39);
		panel_3_2.add(btnNewButton_3_1_1_2);
		
		JButton btnNewButton_3_2_1_1 = new JButton("이미지 불러오기");
		btnNewButton_3_2_1_1.setForeground(new Color(255, 240, 245));
		btnNewButton_3_2_1_1.setFont(new Font("Sandoll 삼립호빵체 TTF Basic", Font.PLAIN, 15));
		btnNewButton_3_2_1_1.setBorderPainted(false);
		btnNewButton_3_2_1_1.setBackground(new Color(65, 105, 255));
		btnNewButton_3_2_1_1.setBounds(182, 317, 127, 39);
		panel_3_2.add(btnNewButton_3_2_1_1);
		
		JButton btnNewButton_3_1_1_1_1 = new JButton("미리보기");
		btnNewButton_3_1_1_1_1.setForeground(new Color(255, 240, 245));
		btnNewButton_3_1_1_1_1.setFont(new Font("Sandoll 삼립호빵체 TTF Basic", Font.PLAIN, 15));
		btnNewButton_3_1_1_1_1.setBorderPainted(false);
		btnNewButton_3_1_1_1_1.setBackground(new Color(65, 105, 255));
		btnNewButton_3_1_1_1_1.setBounds(348, 317, 97, 39);
		panel_3_2.add(btnNewButton_3_1_1_1_1);
		
	
		
		JScrollPane scrollPane = new JScrollPane();
		
		// 테이블 있는곳 색은 
//		65, 105, 225
//		명도만 220 

		table = new JTable(contents, header);
		table.setPreferredSize(new Dimension(750, 500));
		table.setPreferredScrollableViewportSize(new Dimension(1030, 450));
		table.setRowMargin(2);
		table.setGridColor(SystemColor.scrollbar);
		table.setRowHeight(25);
		scrollPane.setViewportView(table);
		table.getTableHeader();
		
		panel.add(scrollPane);
	}
}
