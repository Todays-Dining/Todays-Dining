package com.dining.admin;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JTable;
import javax.swing.JTextField;

public class Admin03_rest2 extends JPanel {
	  JTextField store_tf;
	  JTextField storeArea_tf;
	  JTextField storeAddr_tf;
	  JTextField foodcate_tf;
	  JTextField bestfood_tf;
	  JTextField foodkey_tf;
	  JTextField storephone_tf;
	  JTextField opentime_tf;
	  JTextField parking_tf;
	  JTextField textField_9;
	  JTextField newstore_tf;
	  JTextField newstoreArea_tf;
	  JTextField newstoreAddr_tf;
	  JTextField newfoodcate_tf;
	  JTextField newbestfood_tf;
	  JTextField newfoodkey_tf;
	  JTextField newstorephone_tf;
	  JTextField newopentime_tf;
	  JTextField newparking_tf;
	
	  
	  
	 String header[]={"가게번호", "음식점 이름", "지역", "상세주소", "음식분류", "대표메뉴", "대표 전화번호", "영업시간", "주차 여부"};
     String contents[][]={
    		 {"0", "끼로끼로부엉이", "신촌", "신촌 어딘가", "한식", "삼겹살", "회식", "02-2212-2121", "영업시간", "주차 여부"},
    		 {"가게번호", "음식점 이름", "지역", "상세주소", "음식분류", "대표메뉴", "대표 전화번호", "영업시간", "주차 여부"},
    		 {"가게번호", "음식점 이름", "지역", "상세주소", "음식분류", "대표메뉴", "대표 전화번호", "영업시간", "주차 여부"},
    		 {"가게번호", "음식점 이름", "지역", "상세주소", "음식분류", "대표메뉴", "대표 전화번호", "영업시간", "주차 여부"},
    		 {"가게번호", "음식점 이름", "지역", "상세주소", "음식분류", "대표메뉴", "대표 전화번호", "영업시간", "주차 여부"},
    		 {"가게번호", "음식점 이름", "지역", "상세주소", "음식분류", "대표메뉴", "대표 전화번호", "영업시간", "주차 여부"},
    		 {"가게번호", "음식점 이름", "지역", "상세주소", "음식분류", "대표메뉴", "대표 전화번호", "영업시간", "주차 여부"},
    		 {"가게번호", "음식점 이름", "지역", "상세주소", "음식분류", "대표메뉴", "대표 전화번호", "영업시간", "주차 여부"},
    		 {"가게번호", "음식점 이름", "지역", "상세주소", "음식분류", "대표메뉴", "대표 전화번호", "영업시간", "주차 여부"},
    		 {"가게번호", "음식점 이름", "지역", "상세주소", "음식분류", "대표메뉴", "대표 전화번호", "영업시간", "주차 여부"},
    		 {"가게번호", "음식점 이름", "지역", "상세주소", "음식분류", "대표메뉴", "대표 전화번호", "영업시간", "주차 여부"},
    		 {"가게번호", "음식점 이름", "지역", "상세주소", "음식분류", "대표메뉴", "대표 전화번호", "영업시간", "주차 여부"},
    		 {"가게번호", "음식점 이름", "지역", "상세주소", "음식분류", "대표메뉴", "대표 전화번호", "영업시간", "주차 여부"},
    		 {"가게번호", "음식점 이름", "지역", "상세주소", "음식분류", "대표메뉴", "대표 전화번호", "영업시간", "주차 여부"},
    		 {"가게번호", "음식점 이름", "지역", "상세주소", "음식분류", "대표메뉴", "대표 전화번호", "영업시간", "주차 여부"},
    		 {"가게번호", "음식점 이름", "지역", "상세주소", "음식분류", "대표메뉴", "대표 전화번호", "영업시간", "주차 여부"},
    		 {"가게번호", "음식점 이름", "지역", "상세주소", "음식분류", "대표메뉴", "대표 전화번호", "영업시간", "주차 여부"},
    		 {"가게번호", "음식점 이름", "지역", "상세주소", "음식분류", "대표메뉴", "대표 전화번호", "영업시간", "주차 여부"},
    		 {"가게번호", "음식점 이름", "지역", "상세주소", "음식분류", "대표메뉴", "대표 전화번호", "영업시간", "주차 여부"},
    		 {"가게번호", "음식점 이름", "지역", "상세주소", "음식분류", "대표메뉴", "대표 전화번호", "영업시간", "주차 여부"},
    		 {"가게번호", "음식점 이름", "지역", "상세주소", "음식분류", "대표메뉴", "대표 전화번호", "영업시간", "주차 여부"},
    		 {"가게번호", "음식점 이름", "지역", "상세주소", "음식분류", "대표메뉴", "대표 전화번호", "영업시간", "주차 여부"},
    		 {"가게번호", "음식점 이름", "지역", "상세주소", "음식분류", "대표메뉴", "대표 전화번호", "영업시간", "주차 여부"},
    		 {"가게번호", "음식점 이름", "지역", "상세주소", "음식분류", "대표메뉴", "대표 전화번호", "영업시간", "주차 여부"}
     };
     String selection[]= {"회원번호", "회원아이디"}; 
     JTable table;
     JTable table_1;
     private JTextField newstroe_img_tf;
     private JTextField newbestfood_img_tf;
     private JTextField newstoreAddr_img_tf;
     private JTextField stroe_img_tf;
     private JTextField bestfood_img_tf;
     private JTextField storeAddr_img_tf;
     private JTextField select_tf;
	/**
	 * Create the panel.
	 */
	public Admin03_rest2() {
		
		
		JLabel rest = new JLabel("음식점");
		rest.setForeground(new Color(65, 105, 225));
		rest.setFont(new Font("Sandoll 삼립호빵체 TTF Basic", Font.PLAIN, 50));
		rest.setBounds(36, 41, 207, 89);
		add(rest);
		
		JLabel tool_lb = new JLabel("");
		tool_lb.setOpaque(true);
		tool_lb.setBackground(new Color(65, 105, 225));
		tool_lb.setBounds(36, 115, 1120, 8);
		add(tool_lb);
		
		JButton backbutton = new JButton("");
		backbutton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		backbutton.setBorderPainted(false);
		backbutton.setBackground(new Color(255, 240, 245));
		backbutton.setIcon(new ImageIcon(Admin03_rest2.class.getResource("/image/backbutton.png")));
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
		tabbedPane.addTab("", new ImageIcon(Admin03_rest2.class.getResource("/image/RegisteredDiner.png")), panel, "");
		tabbedPane.setBackgroundAt(29, Color.RED);
		
		setBackground(new Color(255, 240, 245));
		setSize(1200, 800);
		setLayout(null);

		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(213, 221, 255));
		tabbedPane.addTab("", new ImageIcon(Admin03_rest2.class.getResource("/image/DinerNew.png")), panel_1, null);
		
		panel_1.setLayout(null);
		
		newstore_tf = new JTextField();
		newstore_tf.setColumns(10);
		newstore_tf.setBounds(200, 75, 227, 21);
		panel_1.add(newstore_tf);
		
		JLabel newstore_lb = new JLabel("음식점 이름 : ");
		newstore_lb.setFont(new Font("Sandoll 삼립호빵체 TTF Basic", Font.BOLD, 20));
		newstore_lb.setBounds(40, 77, 176, 18);
		panel_1.add(newstore_lb);
		
		JLabel newstoreArea_lb = new JLabel("음식점 지역 : ");
		newstoreArea_lb.setFont(new Font("Sandoll 삼립호빵체 TTF Basic", Font.BOLD, 20));
		newstoreArea_lb.setBounds(40, 123, 176, 18);
		panel_1.add(newstoreArea_lb);
		
		newstoreArea_tf = new JTextField();
		newstoreArea_tf.setColumns(10);
		newstoreArea_tf.setBounds(200, 120, 227, 21);
		panel_1.add(newstoreArea_tf);
		
		JLabel newstoreAddr_lb = new JLabel("음식점 주소 : ");
		newstoreAddr_lb.setFont(new Font("Sandoll 삼립호빵체 TTF Basic", Font.BOLD, 20));
		newstoreAddr_lb.setBounds(40, 169, 176, 18);
		panel_1.add(newstoreAddr_lb);
		
		newstoreAddr_tf = new JTextField();
		newstoreAddr_tf.setColumns(10);
		newstoreAddr_tf.setBounds(200, 165, 228, 21);
		panel_1.add(newstoreAddr_tf);
		
		JLabel newfoodcate_lb = new JLabel("가게음식 분류 : ");
		newfoodcate_lb.setFont(new Font("Sandoll 삼립호빵체 TTF Basic", Font.BOLD, 20));
		newfoodcate_lb.setBounds(40, 215, 176, 18);
		panel_1.add(newfoodcate_lb);
		
		newfoodcate_tf = new JTextField();
		newfoodcate_tf.setColumns(10);
		newfoodcate_tf.setBounds(200, 210, 227, 21);
		panel_1.add(newfoodcate_tf);
		
		JLabel newbestfood_lb = new JLabel("가게음식 대표메뉴 : ");
		newbestfood_lb.setFont(new Font("Sandoll 삼립호빵체 TTF Basic", Font.BOLD, 20));
		newbestfood_lb.setBounds(40, 261, 176, 18);
		panel_1.add(newbestfood_lb);
		
		JLabel newfoodkey_lb = new JLabel("대표 키워드 : ");
		newfoodkey_lb.setFont(new Font("Sandoll 삼립호빵체 TTF Basic", Font.BOLD, 20));
		newfoodkey_lb.setBounds(40, 308, 176, 18);
		panel_1.add(newfoodkey_lb);
		
		JLabel newstorephone_lb = new JLabel("대표 전화번호 : ");
		newstorephone_lb.setFont(new Font("Sandoll 삼립호빵체 TTF Basic", Font.BOLD, 20));
		newstorephone_lb.setBounds(40, 352, 176, 18);
		panel_1.add(newstorephone_lb);
		
		JLabel newopentime_lb = new JLabel("영업 시간 : ");
		newopentime_lb.setFont(new Font("Sandoll 삼립호빵체 TTF Basic", Font.BOLD, 20));
		newopentime_lb.setBounds(40, 396, 176, 18);
		panel_1.add(newopentime_lb);
		
		JLabel newparking_lb = new JLabel("주차여부 : ");
		newparking_lb.setFont(new Font("Sandoll 삼립호빵체 TTF Basic", Font.BOLD, 20));
		newparking_lb.setBounds(40, 438, 176, 18);
		panel_1.add(newparking_lb);
		
		newbestfood_tf = new JTextField();
		newbestfood_tf.setColumns(10);
		newbestfood_tf.setBounds(200, 255, 227, 21);
		panel_1.add(newbestfood_tf);
		
		newfoodkey_tf = new JTextField();
		newfoodkey_tf.setColumns(10);
		newfoodkey_tf.setBounds(200, 300, 227, 21);
		panel_1.add(newfoodkey_tf);
		
		newstorephone_tf = new JTextField();
		newstorephone_tf.setColumns(10);
		newstorephone_tf.setBounds(200, 345, 227, 21);
		panel_1.add(newstorephone_tf);
		
		newopentime_tf = new JTextField();
		newopentime_tf.setColumns(10);
		newopentime_tf.setBounds(200, 390, 227, 21);
		panel_1.add(newopentime_tf);
		
		newparking_tf = new JTextField();
		newparking_tf.setColumns(10);
		newparking_tf.setBounds(200, 435, 227, 21);
		panel_1.add(newparking_tf);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(new Color(255, 247, 234));
		panel_3.setBounds(486, 75, 580, 381);
		panel_1.add(panel_3);
		panel_3.setLayout(null);
		
		JLabel new_lb = new JLabel("   이미지 등록");
		new_lb.setFont(new Font("Sandoll 삼립호빵체 TTF Basic", Font.PLAIN, 20));
		new_lb.setBounds(227, 10, 115, 32);
		panel_3.add(new_lb);
		
		JLabel newstroe_img_lb = new JLabel("가게 이미지 : ");
		newstroe_img_lb.setFont(new Font("Sandoll 삼립호빵체 TTF Basic", Font.PLAIN, 20));
		newstroe_img_lb.setBounds(12, 52, 115, 32);
		panel_3.add(newstroe_img_lb);
		
		JLabel newbestfood_img_lb = new JLabel("대표 메뉴 : ");
		newbestfood_img_lb.setFont(new Font("Sandoll 삼립호빵체 TTF Basic", Font.PLAIN, 20));
		newbestfood_img_lb.setBounds(12, 160, 115, 32);
		panel_3.add(newbestfood_img_lb);
		
		JLabel newstoreAddr_img_lb = new JLabel("가게 위치 : ");
		newstoreAddr_img_lb.setFont(new Font("Sandoll 삼립호빵체 TTF Basic", Font.PLAIN, 20));
		newstoreAddr_img_lb.setBounds(12, 275, 115, 32);
		panel_3.add(newstoreAddr_img_lb);
		
		newstroe_img_tf = new JTextField();
		newstroe_img_tf.setColumns(10);
		newstroe_img_tf.setBounds(115, 57, 453, 21);
		panel_3.add(newstroe_img_tf);
		
		newbestfood_img_tf = new JTextField();
		newbestfood_img_tf.setColumns(10);
		newbestfood_img_tf.setBounds(115, 165, 453, 21);
		panel_3.add(newbestfood_img_tf);
		
		newstoreAddr_img_tf = new JTextField();
		newstoreAddr_img_tf.setColumns(10);
		newstoreAddr_img_tf.setBounds(115, 280, 453, 21);
		panel_3.add(newstoreAddr_img_tf);
		
		JButton img1 = new JButton("이미지 불러오기");
		img1.setForeground(new Color(255, 240, 245));
		img1.setFont(new Font("Sandoll 삼립호빵체 TTF Basic", Font.PLAIN, 15));
		img1.setBorderPainted(false);
		img1.setBackground(new Color(65, 105, 255));
		img1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		img1.setBounds(182, 102, 127, 39);
		panel_3.add(img1);
		
		JButton look1 = new JButton("미리보기");
		look1.setForeground(new Color(255, 240, 245));
		look1.setFont(new Font("Sandoll 삼립호빵체 TTF Basic", Font.PLAIN, 15));
		look1.setBorderPainted(false);
		look1.setBackground(new Color(65, 105, 255));
		look1.setBounds(348, 102, 97, 39);
		panel_3.add(look1);
		
		JButton img2 = new JButton("이미지 불러오기");
		img2.setForeground(new Color(255, 240, 245));
		img2.setFont(new Font("Sandoll 삼립호빵체 TTF Basic", Font.PLAIN, 15));
		img2.setBorderPainted(false);
		img2.setBackground(new Color(65, 105, 255));
		img2.setBounds(182, 214, 127, 39);
		panel_3.add(img2);
		
		JButton look2 = new JButton("미리보기");
		look2.setForeground(new Color(255, 240, 245));
		look2.setFont(new Font("Sandoll 삼립호빵체 TTF Basic", Font.PLAIN, 15));
		look2.setBorderPainted(false);
		look2.setBackground(new Color(65, 105, 255));
		look2.setBounds(348, 214, 97, 39);
		panel_3.add(look2);
		
		JButton img3 = new JButton("이미지 불러오기");
		img3.setForeground(new Color(255, 240, 245));
		img3.setFont(new Font("Sandoll 삼립호빵체 TTF Basic", Font.PLAIN, 15));
		img3.setBorderPainted(false);
		img3.setBackground(new Color(65, 105, 255));
		img3.setBounds(182, 317, 127, 39);
		panel_3.add(img3);
		
		JButton look3 = new JButton("미리보기");
		look3.setForeground(new Color(255, 240, 245));
		look3.setFont(new Font("Sandoll 삼립호빵체 TTF Basic", Font.PLAIN, 15));
		look3.setBorderPainted(false);
		look3.setBackground(new Color(65, 105, 255));
		look3.setBounds(348, 317, 97, 39);
		panel_3.add(look3);
		
		JButton newadd_bt = new JButton("등  록");
		newadd_bt.setForeground(new Color(255, 240, 245));
		newadd_bt.setFont(new Font("Sandoll 삼립호빵체 TTF Basic", Font.PLAIN, 25));
		newadd_bt.setBorderPainted(false);
		newadd_bt.setBackground(new Color(65, 105, 255));
		newadd_bt.setBounds(171, 480, 125, 34);
		panel_1.add(newadd_bt);
		
		
		
		JPanel panel_2 = new JPanel();
		panel_2.setFont(new Font("Sandoll 삼립호빵체 TTF Basic", Font.BOLD, 15));
		panel_2.setBackground(new Color(213, 221, 255));
		tabbedPane.addTab("", new ImageIcon(Admin03_rest2.class.getResource("/image/DinerRevise.png")), panel_2, null);
		panel_2.setLayout(null);
		
		store_tf = new JTextField();
		store_tf.setBounds(200, 75, 227, 21);
		panel_2.add(store_tf);
		store_tf.setColumns(10);
		
		JLabel store_lb = new JLabel("음식점 이름 : ");
		store_lb.setFont(new Font("Sandoll 삼립호빵체 TTF Basic", Font.BOLD, 20));
		store_lb.setBounds(40, 77, 176, 18);
		panel_2.add(store_lb);
		
		JLabel storeArea_lb = new JLabel("음식점 지역 : ");
		storeArea_lb.setFont(new Font("Sandoll 삼립호빵체 TTF Basic", Font.BOLD, 20));
		storeArea_lb.setBounds(40, 123, 176, 18);
		panel_2.add(storeArea_lb);
		
		storeArea_tf = new JTextField();
		storeArea_tf.setColumns(10);
		storeArea_tf.setBounds(200, 120, 227, 21);
		panel_2.add(storeArea_tf);
		
		JLabel storeAddr_lb = new JLabel("음식점 주소 : ");
		storeAddr_lb.setFont(new Font("Sandoll 삼립호빵체 TTF Basic", Font.BOLD, 20));
		storeAddr_lb.setBounds(40, 169, 176, 18);
		panel_2.add(storeAddr_lb);
		
		storeAddr_tf = new JTextField();
		storeAddr_tf.setColumns(10);
		storeAddr_tf.setBounds(200, 165, 228, 21);
		panel_2.add(storeAddr_tf);
		
		JLabel foodcate_lb = new JLabel("가게음식 분류 : ");
		foodcate_lb.setFont(new Font("Sandoll 삼립호빵체 TTF Basic", Font.BOLD, 20));
		foodcate_lb.setBounds(40, 215, 176, 18);
		panel_2.add(foodcate_lb);
		
		foodcate_tf = new JTextField();
		foodcate_tf.setColumns(10);
		foodcate_tf.setBounds(200, 210, 227, 21);
		panel_2.add(foodcate_tf);
		
		JLabel bestfood_lb = new JLabel("가게음식 대표메뉴 : ");
		bestfood_lb.setFont(new Font("Sandoll 삼립호빵체 TTF Basic", Font.BOLD, 20));
		bestfood_lb.setBounds(40, 261, 176, 18);
		panel_2.add(bestfood_lb);
		
		JLabel foodkey_lb = new JLabel("대표 키워드 : ");
		foodkey_lb.setFont(new Font("Sandoll 삼립호빵체 TTF Basic", Font.BOLD, 20));
		foodkey_lb.setBounds(40, 308, 176, 18);
		panel_2.add(foodkey_lb);
		
		JLabel storephone_lb = new JLabel("대표 전화번호 : ");
		storephone_lb.setFont(new Font("Sandoll 삼립호빵체 TTF Basic", Font.BOLD, 20));
		storephone_lb.setBounds(40, 352, 176, 18);
		panel_2.add(storephone_lb);
		
		JLabel opentime_lb = new JLabel("영업 시간 : ");
		opentime_lb.setFont(new Font("Sandoll 삼립호빵체 TTF Basic", Font.BOLD, 20));
		opentime_lb.setBounds(40, 396, 176, 18);
		panel_2.add(opentime_lb);
		
		JLabel parking_lb = new JLabel("주차여부 : ");
		parking_lb.setFont(new Font("Sandoll 삼립호빵체 TTF Basic", Font.BOLD, 20));
		parking_lb.setBounds(40, 438, 135, 18);
		panel_2.add(parking_lb);
		
		bestfood_tf = new JTextField();
		bestfood_tf.setColumns(10);
		bestfood_tf.setBounds(200, 255, 227, 21);
		panel_2.add(bestfood_tf);
		
		foodkey_tf = new JTextField();
		foodkey_tf.setColumns(10);
		foodkey_tf.setBounds(200, 300, 227, 21);
		panel_2.add(foodkey_tf);
		
		storephone_tf = new JTextField();
		storephone_tf.setColumns(10);
		storephone_tf.setBounds(200, 345, 227, 21);
		panel_2.add(storephone_tf);
		
		opentime_tf = new JTextField();
		opentime_tf.setColumns(10);
		opentime_tf.setBounds(200, 390, 227, 21);
		panel_2.add(opentime_tf);
		
		parking_tf = new JTextField();
		parking_tf.setColumns(10);
		parking_tf.setBounds(200, 435, 227, 21);
		panel_2.add(parking_tf);
		
		JButton update_bt = new JButton("수  정");
		update_bt.setForeground(new Color(255, 240, 245));
		update_bt.setBackground(new Color(65, 105, 255));
		update_bt.setBorderPainted(false);
		update_bt.setFont(new Font("Sandoll 삼립호빵체 TTF Basic", Font.PLAIN, 25));
		update_bt.setBounds(50, 473, 125, 34);
		panel_2.add(update_bt);
		
		JButton alldel_1 = new JButton("전체삭제");
		alldel_1.setBackground(new Color(65, 105, 255));
		alldel_1.setBorderPainted(false);
		alldel_1.setForeground(new Color(255, 240, 245));
		alldel_1.setFont(new Font("Sandoll 삼립호빵체 TTF Basic", Font.PLAIN, 25));
		alldel_1.setBounds(246, 473, 125, 34);
		panel_2.add(alldel_1);
		
		JPanel panel_3_2 = new JPanel();
		panel_3_2.setLayout(null);
		panel_3_2.setBackground(new Color(255, 247, 234));
		panel_3_2.setBounds(486, 75, 580, 381);
		panel_2.add(panel_3_2);
		
		JLabel lb1 = new JLabel("   이미지 등록");
		lb1.setFont(new Font("Sandoll 삼립호빵체 TTF Basic", Font.PLAIN, 20));
		lb1.setBounds(227, 10, 115, 32);
		panel_3_2.add(lb1);
		
		JLabel lb2 = new JLabel("가게 이미지 : ");
		lb2.setFont(new Font("Sandoll 삼립호빵체 TTF Basic", Font.PLAIN, 20));
		lb2.setBounds(12, 52, 115, 32);
		panel_3_2.add(lb2);
		
		JLabel lb3 = new JLabel("대표 메뉴 : ");
		lb3.setFont(new Font("Sandoll 삼립호빵체 TTF Basic", Font.PLAIN, 20));
		lb3.setBounds(12, 160, 115, 32);
		panel_3_2.add(lb3);
		
		JLabel lb4 = new JLabel("가게 위치 : ");
		lb4.setFont(new Font("Sandoll 삼립호빵체 TTF Basic", Font.PLAIN, 20));
		lb4.setBounds(12, 275, 115, 32);
		panel_3_2.add(lb4);
		
		stroe_img_tf = new JTextField();
		stroe_img_tf.setColumns(10);
		stroe_img_tf.setBounds(115, 57, 453, 21);
		panel_3_2.add(stroe_img_tf);
		
		bestfood_img_tf = new JTextField();
		bestfood_img_tf.setColumns(10);
		bestfood_img_tf.setBounds(115, 165, 453, 21);
		panel_3_2.add(bestfood_img_tf);
		
		storeAddr_img_tf = new JTextField();
		storeAddr_img_tf.setColumns(10);
		storeAddr_img_tf.setBounds(115, 280, 453, 21);
		panel_3_2.add(storeAddr_img_tf);
		
		JButton up_img1 = new JButton("이미지 불러오기");
		up_img1.setForeground(new Color(255, 240, 245));
		up_img1.setFont(new Font("Sandoll 삼립호빵체 TTF Basic", Font.PLAIN, 15));
		up_img1.setBorderPainted(false);
		up_img1.setBackground(new Color(65, 105, 255));
		up_img1.setBounds(182, 102, 127, 39);
		panel_3_2.add(up_img1);
		
		JButton view_1 = new JButton("미리보기");
		view_1.setForeground(new Color(255, 240, 245));
		view_1.setFont(new Font("Sandoll 삼립호빵체 TTF Basic", Font.PLAIN, 15));
		view_1.setBorderPainted(false);
		view_1.setBackground(new Color(65, 105, 255));
		view_1.setBounds(348, 102, 97, 39);
		panel_3_2.add(view_1);
		
		JButton up_img2 = new JButton("이미지 불러오기");
		up_img2.setForeground(new Color(255, 240, 245));
		up_img2.setFont(new Font("Sandoll 삼립호빵체 TTF Basic", Font.PLAIN, 15));
		up_img2.setBorderPainted(false);
		up_img2.setBackground(new Color(65, 105, 255));
		up_img2.setBounds(182, 214, 127, 39);
		panel_3_2.add(up_img2);
		
		JButton view_2 = new JButton("미리보기");
		view_2.setForeground(new Color(255, 240, 245));
		view_2.setFont(new Font("Sandoll 삼립호빵체 TTF Basic", Font.PLAIN, 15));
		view_2.setBorderPainted(false);
		view_2.setBackground(new Color(65, 105, 255));
		view_2.setBounds(348, 214, 97, 39);
		panel_3_2.add(view_2);
		
		JButton up_img3 = new JButton("이미지 불러오기");
		up_img3.setForeground(new Color(255, 240, 245));
		up_img3.setFont(new Font("Sandoll 삼립호빵체 TTF Basic", Font.PLAIN, 15));
		up_img3.setBorderPainted(false);
		up_img3.setBackground(new Color(65, 105, 255));
		up_img3.setBounds(182, 317, 127, 39);
		panel_3_2.add(up_img3);
		
		JButton view_3 = new JButton("미리보기");
		view_3.setForeground(new Color(255, 240, 245));
		view_3.setFont(new Font("Sandoll 삼립호빵체 TTF Basic", Font.PLAIN, 15));
		view_3.setBorderPainted(false);
		view_3.setBackground(new Color(65, 105, 255));
		view_3.setBounds(348, 317, 97, 39);
		panel_3_2.add(view_3);
		
	
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(33, 53, 1049, 444);
		
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
		panel.setLayout(null);
		
		panel.add(scrollPane);
		
		JComboBox comboBox_1 = new JComboBox(new Object[]{});
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"음식점 이름", "지역", "음식분류", "대표메뉴"}));
		comboBox_1.setEditable(true);
		comboBox_1.setBackground(Color.WHITE);
		comboBox_1.setBounds(625, 13, 110, 30);
		panel.add(comboBox_1);
		
		select_tf = new JTextField();
		select_tf.setColumns(10);
		select_tf.setBounds(755, 13, 150, 30);
		panel.add(select_tf);
		
		RoundedButton_kjhw_2 select_bt = new RoundedButton_kjhw_2("New button");
		select_bt.setText("검색");
		select_bt.setFont(new Font("Sandoll 삼립호빵체 TTF Basic", Font.PLAIN, 16));
		select_bt.setBounds(924, 13, 50, 30);
		panel.add(select_bt);
		
		RoundedButton_kjhw_2 allselect_bt = new RoundedButton_kjhw_2("New button");
		allselect_bt.setText("전체조회");
		allselect_bt.setFont(new Font("Sandoll 삼립호빵체 TTF Basic", Font.PLAIN, 16));
		allselect_bt.setBounds(981, 13, 100, 30);
		panel.add(allselect_bt);
		
		//마우스 행관련 이벤트 코드.

		// 더블클릭 시 이벤트 코드
		table.addMouseListener(new MouseAdapter () { 
		@Override
			public void mouseClicked(MouseEvent e) {
			if (e.getClickCount() == 2) { 
				
			}
	
			}
		});
	}
}
