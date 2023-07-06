package com.dining.admin;

import java.awt.AWTException;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FileDialog;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Robot;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.InputEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.TableModel;

import com.dining.start.Admin_frame;

public class Admin03_rest extends JPanel {
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

	String header[] = { "가게번호", "음식점 이름", "지역", "상세주소", "음식분류", "대표메뉴", "대표 전화번호", "영업시간", "주차 여부" };
	String contents[][] = { { "0", "끼로끼로부엉이", "신촌", "신촌 어딘가", "한식", "삼겹살", "회식", "02-2212-2121", "영업시간", "주차 여부" },
			{ "가게번호", "음식점 이름", "지역", "상세주소", "음식분류", "대표메뉴", "대표 전화번호", "영업시간", "주차 여부" },
			{ "가게번호", "음식점 이름", "지역", "상세주소", "음식분류", "대표메뉴", "대표 전화번호", "영업시간", "주차 여부" },
			{ "가게번호", "음식점 이름", "지역", "상세주소", "음식분류", "대표메뉴", "대표 전화번호", "영업시간", "주차 여부" },
			{ "가게번호", "음식점 이름", "지역", "상세주소", "음식분류", "대표메뉴", "대표 전화번호", "영업시간", "주차 여부" },
			{ "가게번호", "음식점 이름", "지역", "상세주소", "음식분류", "대표메뉴", "대표 전화번호", "영업시간", "주차 여부" },
			{ "가게번호", "음식점 이름", "지역", "상세주소", "음식분류", "대표메뉴", "대표 전화번호", "영업시간", "주차 여부" },
			{ "가게번호", "음식점 이름", "지역", "상세주소", "음식분류", "대표메뉴", "대표 전화번호", "영업시간", "주차 여부" },
			{ "가게번호", "음식점 이름", "지역", "상세주소", "음식분류", "대표메뉴", "대표 전화번호", "영업시간", "주차 여부" },
			{ "가게번호", "음식점 이름", "지역", "상세주소", "음식분류", "대표메뉴", "대표 전화번호", "영업시간", "주차 여부" },
			{ "가게번호", "음식점 이름", "지역", "상세주소", "음식분류", "대표메뉴", "대표 전화번호", "영업시간", "주차 여부" },
			{ "가게번호", "음식점 이름", "지역", "상세주소", "음식분류", "대표메뉴", "대표 전화번호", "영업시간", "주차 여부" },
			{ "가게번호", "음식점 이름", "지역", "상세주소", "음식분류", "대표메뉴", "대표 전화번호", "영업시간", "주차 여부" },
			{ "가게번호", "음식점 이름", "지역", "상세주소", "음식분류", "대표메뉴", "대표 전화번호", "영업시간", "주차 여부" },
			{ "가게번호", "음식점 이름", "지역", "상세주소", "음식분류", "대표메뉴", "대표 전화번호", "영업시간", "주차 여부" },
			{ "가게번호", "음식점 이름", "지역", "상세주소", "음식분류", "대표메뉴", "대표 전화번호", "영업시간", "주차 여부" },
			{ "가게번호", "음식점 이름", "지역", "상세주소", "음식분류", "대표메뉴", "대표 전화번호", "영업시간", "주차 여부" },
			{ "가게번호", "음식점 이름", "지역", "상세주소", "음식분류", "대표메뉴", "대표 전화번호", "영업시간", "주차 여부" },
			{ "가게번호", "음식점 이름", "지역", "상세주소", "음식분류", "대표메뉴", "대표 전화번호", "영업시간", "주차 여부" },
			{ "가게번호", "음식점 이름", "지역", "상세주소", "음식분류", "대표메뉴", "대표 전화번호", "영업시간", "주차 여부" },
			{ "가게번호", "음식점 이름", "지역", "상세주소", "음식분류", "대표메뉴", "대표 전화번호", "영업시간", "주차 여부" },
			{ "가게번호", "음식점 이름", "지역", "상세주소", "음식분류", "대표메뉴", "대표 전화번호", "영업시간", "주차 여부" },
			{ "가게번호", "음식점 이름", "지역", "상세주소", "음식분류", "대표메뉴", "대표 전화번호", "영업시간", "주차 여부" },
			{ "가게번호", "음식점 이름", "지역", "상세주소", "음식분류", "대표메뉴", "대표 전화번호", "영업시간", "주차 여부" } };
	String selection[] = { "회원번호", "회원아이디" };
	JTable table;
	JTable table_1;
	private JTextField newstore_img_tf;
	private JTextField newbestfood_img_tf;
	private JTextField newstoreAddr_img_tf;
	private JTextField stroe_img_tf;
	private JTextField bestfood_img_tf;
	private JTextField storeAddr_img_tf;
	private JTextField select_tf;
	JPanel admin_pg;
	CardLayout cardLayout;
	String store;

	public Admin03_rest(CardLayout cardLayout, JPanel admin_pg , Admin_frame admin) {
		this.cardLayout = cardLayout;
		this.admin_pg = admin_pg;

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
		
		// 뒤로가기 버튼
		JButton backbutton = new JButton("");
		backbutton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		backbutton.setBorderPainted(false);
		backbutton.setBackground(new Color(255, 240, 245));
		backbutton.setIcon(new ImageIcon(Admin03_rest.class.getResource("/image/backbutton.png")));
		backbutton.setBounds(1055, 51, 101, 54);
		add(backbutton);
		

		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setForeground(new Color(65, 105, 225));
		tabbedPane.setToolTipText("음식점 신규등록");
		// ☆ 아래 2줄 첵
		tabbedPane.setFont(new Font("Sandoll 삼립호빵체 TTF Basic", Font.BOLD, 35));
		tabbedPane.setBackground(new Color(255, 240, 245));
		tabbedPane.setBounds(36, 194, 1120, 580);
		add(tabbedPane);

//		JPanel panel = new JPanel();
//		panel.setBackground(new Color(218, 226, 250));
//		panel.setPreferredSize(new Dimension(500, 500));
//		tabbedPane.addTab("", new ImageIcon(Admin03_rest.class.getResource("/image/RegisteredDiner.png")), panel, "");
////		tabbedPane.setBackgroundAt(27, Color.RED);
		
		// ☆ 여기 확인 (위에랑)
		JPanel admin_store_tab = new JPanel();
		admin_store_tab.setBackground(new Color(213, 221, 255));
		admin_store_tab.setPreferredSize(new Dimension(500, 500));
		tabbedPane.addTab("등록된 음식점", null, admin_store_tab, "");
		


		setBackground(new Color(255, 240, 245));
		setSize(1200, 800);
		setLayout(null);

		// ☆ 확인
//		JPanel panel_1 = new JPanel();
//		panel_1.setBackground(new Color(213, 221, 255));
//		tabbedPane.addTab("", new ImageIcon(Admin03_rest.class.getResource("/image/DinerNew.png")), panel_1, null);
//		panel_1.setLayout(null);
		
		JPanel admin_new_tab = new JPanel();
		admin_new_tab.setBackground(new Color(213, 221, 255));
		tabbedPane.addTab("음식점 신규등록", null , admin_new_tab, null);
		admin_new_tab.setLayout(null);
		
		JLabel newstore_lb = new JLabel("음식점 이름 : ");
		newstore_lb.setFont(new Font("Sandoll 삼립호빵체 TTF Basic", Font.BOLD, 20));
		newstore_lb.setBounds(40, 77, 176, 18);
		admin_new_tab.add(newstore_lb);
		newstore_tf = new JTextField();
		newstore_tf.setColumns(10);
		newstore_tf.setBounds(200, 75, 227, 21);
		admin_new_tab.add(newstore_tf);
		
		JLabel newstoreArea_lb = new JLabel("음식점 지역 : ");
		newstoreArea_lb.setFont(new Font("Sandoll 삼립호빵체 TTF Basic", Font.BOLD, 20));
		newstoreArea_lb.setBounds(40, 123, 176, 18);
		admin_new_tab.add(newstoreArea_lb);
		JComboBox comboBox_newstoreArea = new JComboBox();
		comboBox_newstoreArea.setModel(new DefaultComboBoxModel(new String[] {"마포구", "신촌", "홍대", "을지로", "연남", "강남"}));
		comboBox_newstoreArea.setBounds(200, 120, 227, 21);
		admin_new_tab.add(comboBox_newstoreArea);

		JLabel newstoreAddr_lb = new JLabel("음식점 주소 : ");
		newstoreAddr_lb.setFont(new Font("Sandoll 삼립호빵체 TTF Basic", Font.BOLD, 20));
		newstoreAddr_lb.setBounds(40, 169, 176, 18);
		admin_new_tab.add(newstoreAddr_lb);
		newstoreAddr_tf = new JTextField();
		newstoreAddr_tf.setColumns(10);
		newstoreAddr_tf.setBounds(200, 165, 228, 21);
		admin_new_tab.add(newstoreAddr_tf);

		JLabel newfoodcate_lb = new JLabel("가게음식 분류 : ");
		newfoodcate_lb.setFont(new Font("Sandoll 삼립호빵체 TTF Basic", Font.BOLD, 20));
		newfoodcate_lb.setBounds(40, 215, 176, 18);
		admin_new_tab.add(newfoodcate_lb);
		JComboBox comboBox_newfoodcate = new JComboBox();
		comboBox_newfoodcate.setModel(new DefaultComboBoxModel(new String[] {"한식", "양식", "중식", "일식", "카페", "기타"}));
		comboBox_newfoodcate.setBounds(200, 210, 227, 21);
		admin_new_tab.add(comboBox_newfoodcate);
		
		JLabel newbestfood_lb = new JLabel("가게음식 대표메뉴 : ");
		newbestfood_lb.setFont(new Font("Sandoll 삼립호빵체 TTF Basic", Font.BOLD, 20));
		newbestfood_lb.setBounds(40, 257, 176, 18);
		admin_new_tab.add(newbestfood_lb);
		newbestfood_tf = new JTextField();
		newbestfood_tf.setColumns(10);
		newbestfood_tf.setBounds(200, 255, 227, 21);
		admin_new_tab.add(newbestfood_tf);
	
		JLabel newstorephone_lb = new JLabel("대표 전화번호 : ");
		newstorephone_lb.setFont(new Font("Sandoll 삼립호빵체 TTF Basic", Font.BOLD, 20));
		newstorephone_lb.setBounds(40, 303, 176, 18);
		admin_new_tab.add(newstorephone_lb);
		newstorephone_tf = new JTextField();
		newstorephone_tf.setColumns(10);
		newstorephone_tf.setBounds(200, 300, 227, 21);
		admin_new_tab.add(newstorephone_tf);

		JLabel newopentime_lb = new JLabel("영업 시간 : ");
		newopentime_lb.setFont(new Font("Sandoll 삼립호빵체 TTF Basic", Font.BOLD, 20));
		newopentime_lb.setBounds(40, 347, 176, 18);
		admin_new_tab.add(newopentime_lb);
		newopentime_tf = new JTextField();
		newopentime_tf.setColumns(10);
		newopentime_tf.setBounds(200, 345, 227, 21);
		admin_new_tab.add(newopentime_tf);
		
		JLabel newparking_lb = new JLabel("주차여부 : ");
		newparking_lb.setFont(new Font("Sandoll 삼립호빵체 TTF Basic", Font.BOLD, 20));
		newparking_lb.setBounds(40, 392, 176, 18);
		admin_new_tab.add(newparking_lb);
		JComboBox comboBox_newparking = new JComboBox();
		comboBox_newparking.setModel(new DefaultComboBoxModel(new String[] {"가능", "불가능"}));
		comboBox_newparking.setBounds(200, 390, 227, 21);
		admin_new_tab.add(comboBox_newparking);
		
	
	
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(new Color(255, 247, 234));
		panel_3.setBounds(486, 75, 580, 381);
		admin_new_tab.add(panel_3);
		panel_3.setLayout(null);

		JLabel new_lb = new JLabel("   이미지 등록");
		new_lb.setFont(new Font("Sandoll 삼립호빵체 TTF Basic", Font.PLAIN, 20));
		new_lb.setBounds(227, 10, 115, 32);
		panel_3.add(new_lb);

		JLabel newstore_img_lb = new JLabel("가게 이미지 : ");
		newstore_img_lb.setFont(new Font("Sandoll 삼립호빵체 TTF Basic", Font.PLAIN, 20));
		newstore_img_lb.setBounds(12, 52, 115, 32);
		panel_3.add(newstore_img_lb);
		newstore_img_tf = new JTextField();
		newstore_img_tf.setColumns(10);
		newstore_img_tf.setBounds(115, 57, 453, 21);
		panel_3.add(newstore_img_tf);
		
		JLabel newbestfood_img_lb = new JLabel("대표 메뉴 : ");
		newbestfood_img_lb.setFont(new Font("Sandoll 삼립호빵체 TTF Basic", Font.PLAIN, 20));
		newbestfood_img_lb.setBounds(12, 160, 115, 32);
		panel_3.add(newbestfood_img_lb);
		newbestfood_img_tf = new JTextField();
		newbestfood_img_tf.setColumns(10);
		newbestfood_img_tf.setBounds(115, 165, 453, 21);
		panel_3.add(newbestfood_img_tf);

		JLabel newstoreAddr_img_lb = new JLabel("가게 위치 : ");
		newstoreAddr_img_lb.setFont(new Font("Sandoll 삼립호빵체 TTF Basic", Font.PLAIN, 20));
		newstoreAddr_img_lb.setBounds(12, 275, 115, 32);
		panel_3.add(newstoreAddr_img_lb);
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
		img1.setBounds(227, 97, 127, 39);
		panel_3.add(img1);

//		JButton look1 = new JButton("미리보기");
//		look1.setForeground(new Color(255, 240, 245));
//		look1.setFont(new Font("Sandoll 삼립호빵체 TTF Basic", Font.PLAIN, 15));
//		look1.setBorderPainted(false);
//		look1.setBackground(new Color(65, 105, 255));
//		look1.setBounds(348, 102, 97, 39);
//		panel_3.add(look1);

		JButton img2 = new JButton("이미지 불러오기");
		img2.setForeground(new Color(255, 240, 245));
		img2.setFont(new Font("Sandoll 삼립호빵체 TTF Basic", Font.PLAIN, 15));
		img2.setBorderPainted(false);
		img2.setBackground(new Color(65, 105, 255));
		img2.setBounds(227, 205, 127, 39);
		panel_3.add(img2);

//		JButton look2 = new JButton("미리보기");
//		look2.setForeground(new Color(255, 240, 245));
//		look2.setFont(new Font("Sandoll 삼립호빵체 TTF Basic", Font.PLAIN, 15));
//		look2.setBorderPainted(false);
//		look2.setBackground(new Color(65, 105, 255));
//		look2.setBounds(348, 214, 97, 39);
//		panel_3.add(look2);

		JButton img3 = new JButton("이미지 불러오기");
		img3.setForeground(new Color(255, 240, 245));
		img3.setFont(new Font("Sandoll 삼립호빵체 TTF Basic", Font.PLAIN, 15));
		img3.setBorderPainted(false);
		img3.setBackground(new Color(65, 105, 255));
		img3.setBounds(227, 320, 127, 39);
		panel_3.add(img3);

//		JButton look3 = new JButton("미리보기");
//		look3.setForeground(new Color(255, 240, 245));
//		look3.setFont(new Font("Sandoll 삼립호빵체 TTF Basic", Font.PLAIN, 15));
//		look3.setBorderPainted(false);
//		look3.setBackground(new Color(65, 105, 255));
//		look3.setBounds(348, 317, 97, 39);
//		panel_3.add(look3);

		JButton newadd_bt = new JButton("등  록");
		newadd_bt.setForeground(new Color(255, 240, 245));
		newadd_bt.setFont(new Font("Sandoll 삼립호빵체 TTF Basic", Font.PLAIN, 25));
		newadd_bt.setBorderPainted(false);
		newadd_bt.setBackground(new Color(65, 105, 255));
		newadd_bt.setBounds(175, 445, 125, 34);
		admin_new_tab.add(newadd_bt);
		
	
		// ▼▼▼ 음식점 수정 및 삭제 탭 ▼▼▼
		JPanel admin_del_up_tab = new JPanel();
		admin_del_up_tab.setFont(new Font("Sandoll 삼립호빵체 TTF Basic", Font.BOLD, 15));
		admin_del_up_tab.setBackground(new Color(213, 221, 255));
		tabbedPane.addTab("음식점 수정및 삭제", null, admin_del_up_tab, null);
		admin_del_up_tab.setLayout(null);

		JLabel store_lb = new JLabel("음식점 이름 : ");
		store_lb.setFont(new Font("Sandoll 삼립호빵체 TTF Basic", Font.BOLD, 20));
		store_lb.setBounds(40, 77, 176, 18);
		admin_del_up_tab.add(store_lb);
		store_tf = new JTextField();
		store_tf.setBounds(200, 75, 227, 21);
		admin_del_up_tab.add(store_tf);
		store_tf.setColumns(10);

		JLabel storeArea_lb = new JLabel("음식점 지역 : ");
		storeArea_lb.setFont(new Font("Sandoll 삼립호빵체 TTF Basic", Font.BOLD, 20));
		storeArea_lb.setBounds(40, 123, 176, 18);
		admin_del_up_tab.add(storeArea_lb);

		JLabel storeAddr_lb = new JLabel("음식점 주소 : ");
		storeAddr_lb.setFont(new Font("Sandoll 삼립호빵체 TTF Basic", Font.BOLD, 20));
		storeAddr_lb.setBounds(40, 169, 176, 18);
		admin_del_up_tab.add(storeAddr_lb);

		storeAddr_tf = new JTextField();
		storeAddr_tf.setColumns(10);
		storeAddr_tf.setBounds(200, 165, 228, 21);
		admin_del_up_tab.add(storeAddr_tf);

		JLabel foodcate_lb = new JLabel("가게음식 분류 : ");
		foodcate_lb.setFont(new Font("Sandoll 삼립호빵체 TTF Basic", Font.BOLD, 20));
		foodcate_lb.setBounds(40, 215, 176, 18);
		admin_del_up_tab.add(foodcate_lb);

		JLabel bestfood_lb = new JLabel("가게음식 대표메뉴 : ");
		bestfood_lb.setFont(new Font("Sandoll 삼립호빵체 TTF Basic", Font.BOLD, 20));
		bestfood_lb.setBounds(40, 257, 176, 18);
		admin_del_up_tab.add(bestfood_lb);
		bestfood_tf = new JTextField();
		bestfood_tf.setColumns(10);
		bestfood_tf.setBounds(200, 255, 227, 21);
		admin_del_up_tab.add(bestfood_tf);

		JLabel storephone_lb = new JLabel("대표 전화번호 : ");
		storephone_lb.setFont(new Font("Sandoll 삼립호빵체 TTF Basic", Font.BOLD, 20));
		storephone_lb.setBounds(40, 303, 176, 18);
		admin_del_up_tab.add(storephone_lb);
		storephone_tf = new JTextField();
		storephone_tf.setColumns(10);
		storephone_tf.setBounds(200, 300, 227, 21);
		admin_del_up_tab.add(storephone_tf);

		JLabel opentime_lb = new JLabel("영업 시간 : ");
		opentime_lb.setFont(new Font("Sandoll 삼립호빵체 TTF Basic", Font.BOLD, 20));
		opentime_lb.setBounds(40, 347, 176, 18);
		admin_del_up_tab.add(opentime_lb);
		opentime_tf = new JTextField();
		opentime_tf.setColumns(10);
		opentime_tf.setBounds(200, 345, 227, 21);
		admin_del_up_tab.add(opentime_tf);

		JLabel parking_lb = new JLabel("주차여부 : ");
		parking_lb.setFont(new Font("Sandoll 삼립호빵체 TTF Basic", Font.BOLD, 20));
		parking_lb.setBounds(40, 392, 160, 18);
		admin_del_up_tab.add(parking_lb);

		JButton update_bt = new JButton("수  정");
		update_bt.setForeground(new Color(255, 240, 245));
		update_bt.setBackground(new Color(65, 105, 255));
		update_bt.setBorderPainted(false);
		update_bt.setFont(new Font("Sandoll 삼립호빵체 TTF Basic", Font.PLAIN, 25));
		update_bt.setBounds(60, 445, 125, 34);
		admin_del_up_tab.add(update_bt);

		JButton alldel_1 = new JButton("전체삭제");
		alldel_1.setBackground(new Color(65, 105, 255));
		alldel_1.setBorderPainted(false);
		alldel_1.setForeground(new Color(255, 240, 245));
		alldel_1.setFont(new Font("Sandoll 삼립호빵체 TTF Basic", Font.PLAIN, 25));
		alldel_1.setBounds(260, 445, 125, 34);
		admin_del_up_tab.add(alldel_1);

		JPanel panel_3_2 = new JPanel();
		panel_3_2.setLayout(null);
		panel_3_2.setBackground(new Color(255, 247, 234));
		panel_3_2.setBounds(486, 75, 580, 381);
		admin_del_up_tab.add(panel_3_2);

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
		up_img1.setBounds(227, 97, 127, 39);
		panel_3_2.add(up_img1);

//		JButton view_1 = new JButton("미리보기");
//		view_1.setForeground(new Color(255, 240, 245));
//		view_1.setFont(new Font("Sandoll 삼립호빵체 TTF Basic", Font.PLAIN, 15));
//		view_1.setBorderPainted(false);
//		view_1.setBackground(new Color(65, 105, 255));
//		view_1.setBounds(348, 102, 97, 39);
//		panel_3_2.add(view_1);

		JButton up_img2 = new JButton("이미지 불러오기");
		up_img2.setForeground(new Color(255, 240, 245));
		up_img2.setFont(new Font("Sandoll 삼립호빵체 TTF Basic", Font.PLAIN, 15));
		up_img2.setBorderPainted(false);
		up_img2.setBackground(new Color(65, 105, 255));
		up_img2.setBounds(227, 205, 127, 39);
		panel_3_2.add(up_img2);

//		JButton view_2 = new JButton("미리보기");
//		view_2.setForeground(new Color(255, 240, 245));
//		view_2.setFont(new Font("Sandoll 삼립호빵체 TTF Basic", Font.PLAIN, 15));
//		view_2.setBorderPainted(false);
//		view_2.setBackground(new Color(65, 105, 255));
//		view_2.setBounds(348, 214, 97, 39);
//		panel_3_2.add(view_2);

		JButton up_img3 = new JButton("이미지 불러오기");
		up_img3.setForeground(new Color(255, 240, 245));
		up_img3.setFont(new Font("Sandoll 삼립호빵체 TTF Basic", Font.PLAIN, 15));
		up_img3.setBorderPainted(false);
		up_img3.setBackground(new Color(65, 105, 255));
		up_img3.setBounds(227, 320, 127, 39);
		panel_3_2.add(up_img3);

//		JButton view_3 = new JButton("미리보기");
//		view_3.setForeground(new Color(255, 240, 245));
//		view_3.setFont(new Font("Sandoll 삼립호빵체 TTF Basic", Font.PLAIN, 15));
//		view_3.setBorderPainted(false);
//		view_3.setBackground(new Color(65, 105, 255));
//		view_3.setBounds(348, 317, 97, 39);
//		panel_3_2.add(view_3);
		
		JComboBox comboBox_storeAddr = new JComboBox();
		comboBox_storeAddr.setModel(new DefaultComboBoxModel(new String[] {"마포구", "신촌", "홍대", "을지로", "연남", "강남"}));
		comboBox_storeAddr.setBounds(200, 120, 227, 21);
		admin_del_up_tab.add(comboBox_storeAddr);
		
		JComboBox comboBox_foodcate = new JComboBox();
		comboBox_foodcate.setModel(new DefaultComboBoxModel(new String[] {"한식", "양식", "중식", "일식", "카페", "기타"}));
		comboBox_foodcate.setBounds(200, 210, 227, 21);
		admin_del_up_tab.add(comboBox_foodcate);
		
		JComboBox comboBox_parking = new JComboBox();
		comboBox_parking.setModel(new DefaultComboBoxModel(new String[] {"가능", "불가능"}));
		comboBox_parking.setBounds(200, 390, 227, 21);
		admin_del_up_tab.add(comboBox_parking);

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(33, 53, 1049, 444);

		// 테이블 있는곳 색은 65, 105, 225, 명도만 220 
		// ▼▼▼ 추가된 table ▼▼▼
		table = new JTable(contents, header) {
			public boolean isCellEditable(int i, int c){
				return false;
			}
		};
		table.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (e.getClickCount() == 2) { 
					int row = table.getSelectedRow();
					TableModel data = table.getModel();
					 store = (String)data.getValueAt(row,0);
					 // System.out.println(store);
					 // cardLayout.show(main_pg, "main04_store1_main");
					 Robot robot;
					try {
						robot = new Robot();
						robot.mouseMove(1300,350); // 오토 마우스 위치값 설정
						robot.mousePress(InputEvent.BUTTON1_DOWN_MASK); // 좌클릭 한번눌렀다가
						robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK); // 때는역할
					} catch (AWTException e1) {
						e1.printStackTrace();
					}
				}
			}
		});
		table.getTableHeader().setReorderingAllowed(false);
		table.getTableHeader().setResizingAllowed(false);
		table.isCellEditable(getX(), getY());
		table.setPreferredSize(new Dimension(750, 500));
		table.setPreferredScrollableViewportSize(new Dimension(1030, 450));
		table.setRowMargin(2);
		table.setGridColor(SystemColor.scrollbar);
		table.setRowHeight(25);
		scrollPane.setViewportView(table);
		table.getTableHeader();
		admin_store_tab.setLayout(null);
		admin_store_tab.add(scrollPane);

		JComboBox comboBox_1 = new JComboBox(new Object[] {});
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"음식점 이름", "지역", "음식분류", "대표메뉴"}));
		comboBox_1.setBackground(Color.WHITE);
		comboBox_1.setBounds(625, 13, 110, 30);
		admin_store_tab.add(comboBox_1);		

		select_tf = new JTextField();
		select_tf.setColumns(10);
		select_tf.setBounds(755, 13, 150, 30);
		admin_store_tab.add(select_tf);

		RoundedButton_kjhw_2 select_bt = new RoundedButton_kjhw_2();
		select_bt.setText("검색");
		select_bt.setFont(new Font("Sandoll 삼립호빵체 TTF Basic", Font.PLAIN, 16));
		select_bt.setBounds(924, 13, 50, 30);
		admin_store_tab.add(select_bt);
		select_bt.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// comboBox_1 에서 선택된 값을 받아서 해당 값을 select_bt 에 넘겨주자!
				String combo_sel = "";
				combo_sel = comboBox_1.getSelectedItem().toString();
				String input_text = "";
				input_text = select_tf.getText();
				if (combo_sel == "음식점 이름") {
					// ★ DINER_TABLE의 DINER_NAME열에서 변수 input_text에 입력된 값과 일치하는 row들을 찾아서 반환.
				}else if (combo_sel == "지역") {
					// ★ DINER_TABLE의 REGION열에서 변수 input_text에 입력된 값과 일치하는 row들을 찾아서 반환.
				}else if (combo_sel == "음식분류") {
					// ★ DINER_TABLE의 FOOD_CATEGORY열에서 변수 input_text에 입력된 값과 일치하는 row들을 찾아서 반환.
				}else if (combo_sel == "대표메뉴") {
					// ★ DINER_TABLE의 MENU열에서 변수 input_text에 입력된 값과 일치하는 row들을 찾아서 반환.
				}
			}
		});

		RoundedButton_kjhw_2 allselect_bt = new RoundedButton_kjhw_2();
		allselect_bt.setText("전체조회");
		allselect_bt.setFont(new Font("Sandoll 삼립호빵체 TTF Basic", Font.PLAIN, 16));
		allselect_bt.setBounds(981, 13, 100, 30);
		admin_store_tab.add(allselect_bt);
		allselect_bt.addActionListener(new ActionListener() {			
			@Override
			public void actionPerformed(ActionEvent e) {
				// ★ DINER_TABLE에 있는 모든 정보를 보여주는 쿼리
			}
		});
		
		// 식당 신규등록
		newadd_bt.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// 이름 32자, 즐겨찾기 숫자 0, 오픈시간 숫자 32개, 메뉴 128자, 전번 숫자 32개, 주소 128자 제한
				String store_name = "";
				store_name = newstore_tf.getText();	
				int store_name_no = 0; 
				if (store_name.length() == 0) {
					JOptionPane.showMessageDialog(null, "식당 이름을 입력하세요!", "Message", JOptionPane.ERROR_MESSAGE);
					store_name_no = 0;
				} else {
					store_name_no = 1;
				}
				if (store_name.length() > 32) {
					JOptionPane.showMessageDialog(null, "식당 이름은 최대 32자 입니다!", "Message", JOptionPane.ERROR_MESSAGE);
					store_name_no = 0;
				} else {
					store_name_no = 1;
				}
				String open_hours = "";
				open_hours = newopentime_tf.getText();
				int open_hours_no = 0;
				if (open_hours.length() > 32) {
					JOptionPane.showMessageDialog(null, "영업 시간을 제대로 입력하세요!", "Message", JOptionPane.ERROR_MESSAGE);
					open_hours_no = 0;
				} else {
					open_hours_no = 1;
				}
				String menu_text = "";
				menu_text = newbestfood_tf.getText();
				int menu_text_no = 0;
				if (open_hours.length() > 128) {
					JOptionPane.showMessageDialog(null, "메뉴명은 최대 128자입니다!", "Message", JOptionPane.ERROR_MESSAGE);
					menu_text_no = 0;
				} else {
					menu_text_no = 1;
				}
				String phone_number = "";
				phone_number = newstorephone_tf.getText();
				int phone_number_no = 0;
				if (phone_number.length() > 32) {
					JOptionPane.showMessageDialog(null, "전화번호는 최대 32자입니다!", "Message", JOptionPane.ERROR_MESSAGE);
					phone_number_no = 0;
				} else {
					phone_number_no = 1;
				}
				String input_address = "";
				input_address = newstoreAddr_tf.getText();
				int input_address_no = 0;
				if (input_address.length() > 128) {
					JOptionPane.showMessageDialog(null, "주소는 최대 128자입니다!", "Message", JOptionPane.ERROR_MESSAGE);
					input_address_no = 0;
				} else {
					input_address_no = 1;
				}
				

				
				// 모든 조건 만족 시, DB에 자료 신규 등록
				if (store_name_no == 1 && open_hours_no == 1 && menu_text_no == 1 && phone_number_no == 1 && input_address_no == 1) {
					// ★ 음식점 이름, 지역, 주소, 분류, 메뉴, 전화번호, 영업시간, 주차여부 받아서 DB에 INSERT 하는 쿼리문
					// 음식점 이름 
					System.out.println(store_name);
					// 지역 값 받아오기 (콤보박스)
					String input_region = "";
					input_region = comboBox_newstoreArea.getSelectedItem().toString();
					System.out.println(input_region);
//					주소 : input_address
					System.out.println(input_address);
//					분류 값 받아오기 (콤보박스)
					String food_caterogy = "";
					food_caterogy = comboBox_newfoodcate.getSelectedItem().toString();
					System.out.println(food_caterogy); 
//					메뉴 받아오기 
					System.out.println(menu_text);
//					전화번호 
					System.out.println(phone_number);				
//					영업 시간 
					System.out.println(open_hours);
//					주차여부 값 받아오기 (콤보박스)
					String parking_chk = "";
					parking_chk = comboBox_newparking.getSelectedItem().toString();
					System.out.println(parking_chk);
				}
			}
		});
		
		// 이미지 불러오기 (가게 이미지)
		img1.addActionListener(new ActionListener() {
			@Override
		public void actionPerformed(ActionEvent e) {
				FileDialog fd = new FileDialog(new Frame(),"My Settings",FileDialog.LOAD);
				fd.setVisible(true);
				String msg = fd.getDirectory()+fd.getFile();
				String path = fd.getDirectory(); // 파일경로 
				String name = fd.getFile(); // 파일이름
				// 취소 눌렀을 때 nullnull 표시하는 대신 아무반응 안 하게!!
			if (! msg.equals("nullnull")){
				newstore_img_tf.setText(path+name);
				}
			}
		});
		
		// 이미지 불러오기 (가게 이미지)
		img2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				FileDialog fd = new FileDialog(new Frame(),"My Settings",FileDialog.LOAD);
				fd.setVisible(true);
				String msg = fd.getDirectory()+fd.getFile();
				String path = fd.getDirectory(); // 파일경로 
				String name = fd.getFile(); // 파일이름
				// 취소 눌렀을 때 nullnull 표시하는 대신 아무반응 안 하게!!
				if (! msg.equals("nullnull")){
					newbestfood_img_tf.setText(path+name);
				}
			}
		});
		
		// 이미지 불러오기 (가게 이미지)
		img3.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				FileDialog fd = new FileDialog(new Frame(),"My Settings",FileDialog.LOAD);
				fd.setVisible(true);
				String msg = fd.getDirectory()+fd.getFile();
				String path = fd.getDirectory(); // 파일경로 
				String name = fd.getFile(); // 파일이름
				// 취소 눌렀을 때 nullnull 표시하는 대신 아무반응 안 하게!!
				if (! msg.equals("nullnull")){
					newstoreAddr_img_tf.setText(path+name);
				}
			}
		});
		
//		// 미리보기 버튼 (가게 이미지)
//		look1.addActionListener(new ActionListener() {
//			@Override
//			public void actionPerformed(ActionEvent e) {
//				if (newstore_img_tf.getText().length() == 0) {
//					JOptionPane.showMessageDialog(null, "이미지 경로를 입력하거나, 이미지 불러오기를 클릭하세요!", "Message", JOptionPane.ERROR_MESSAGE);
//				}
//				ImageIcon img_peek =  new ImageIcon(newstore_img_tf.getText());
//				JLabel img_label = new JLabel();
//				admin_pg.add(img_label);
//				admin_pg.setLocation(300, 200);
//				admin_pg.setVisible(true);
//			}
//		});
		
		// admin01_main로 이동
		backbutton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				cardLayout.show(admin_pg, "admin01_main");
			}
		});

	}
}
