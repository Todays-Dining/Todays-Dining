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
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

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
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

import com.dining.start.Admin_frame;
import com.dining.start.Protocol;
import com.dining.start.db_VO;

public class Admin03_rest extends JPanel {
	public JTextField store_tf;
	public JTextField storeArea_tf;
	public JTextField storeAddr_tf;
	
	public JTextField bestfood_tf;
	public JTextField storephone_tf;
	public JTextField opentime_tf;
	public JTextField parking_tf;
	public JTextField newstore_tf;
	public JTextField newstoreAddr_tf;
	
	public JTextField newbestfood_tf;
	public JTextField newstorephone_tf;
	public JTextField newopentime_tf;
	
	public JComboBox comboBox_foodcate;
	public JComboBox comboBox_parking;
	
	String header[] = { "가게번호", "음식점 이름", "지역", "상세주소", "음식분류", "대표메뉴", "대표 전화번호", "영업시간", "주차 여부" };
	String contents[][] = new String[0][0];
	String selection[] = { "회원번호", "회원아이디" };
	public JTable table;
    public DefaultTableModel dtm;
    
	public JTextField newstore_img_tf;
	public JTextField newbestfood_img_tf;
	public JTextField newstoreAddr_img_tf;
	private JTextField stroe_img_tf;
	private JTextField bestfood_img_tf;
	private JTextField storeAddr_img_tf;
	public JTextField select_tf;
	public JComboBox comboBox_newfoodcate;
	public JComboBox comboBox_newparking;
	
	Admin_frame admin;
	JPanel admin_pg;
	CardLayout cardLayout;
	String store;
	public JButton alldel_1;
	public JButton update_bt;
	public JTextField search_tf;

	// 하영 추가
	private JTextField copy_1;		
	private JTextField copy_2;
	private JTextField copy_3;
	private JTextField copy_4, copy_5, copy_6;
	
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
		
		// ☆ 여기 확인 (위에랑)
		JPanel admin_store_tab = new JPanel();
		admin_store_tab.setBackground(new Color(213, 221, 255));
		admin_store_tab.setPreferredSize(new Dimension(500, 500));
		tabbedPane.addTab("등록된 음식점", null, admin_store_tab, "");
		


		setBackground(new Color(255, 240, 245));
		setSize(1200, 800);
		setLayout(null);

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
		newstoreAddr_tf.setColumns(20);
		newstoreAddr_tf.setBounds(200, 165, 228, 21);
		admin_new_tab.add(newstoreAddr_tf);

		JLabel newfoodcate_lb = new JLabel("가게음식 분류 : ");
		newfoodcate_lb.setFont(new Font("Sandoll 삼립호빵체 TTF Basic", Font.BOLD, 20));
		newfoodcate_lb.setBounds(40, 215, 176, 18);
		admin_new_tab.add(newfoodcate_lb);
		comboBox_newfoodcate = new JComboBox();
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
		comboBox_newparking = new JComboBox();
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

		JButton img1 = new JButton("이미지 등록하기");
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

		JButton img2 = new JButton("이미지 등록하기");
		img2.setForeground(new Color(255, 240, 245));
		img2.setFont(new Font("Sandoll 삼립호빵체 TTF Basic", Font.PLAIN, 15));
		img2.setBorderPainted(false);
		img2.setBackground(new Color(65, 105, 255));
		img2.setBounds(227, 205, 127, 39);
		panel_3.add(img2);

		JButton img3 = new JButton("이미지 등록하기");
		img3.setForeground(new Color(255, 240, 245));
		img3.setFont(new Font("Sandoll 삼립호빵체 TTF Basic", Font.PLAIN, 15));
		img3.setBorderPainted(false);
		img3.setBackground(new Color(65, 105, 255));
		img3.setBounds(227, 320, 127, 39);
		panel_3.add(img3);

		// 하영 추가
				copy_1 = new JTextField(20);
				copy_1.setBounds(115, 85, 330, 21);
				panel_3.add(copy_1);
				copy_1.setColumns(10);
				
				copy_2 = new JTextField(20);
				copy_2.setColumns(10);
				copy_2.setBounds(115, 190, 330, 21);
				panel_3.add(copy_2);
				
				copy_3 = new JTextField(20);
				copy_3.setColumns(10);
				copy_3.setBounds(115, 304, 330, 21);
				panel_3.add(copy_3);
				
				// 하영 추가
				JLabel lblNewLabel_1 = new JLabel("불러올 사진");
				lblNewLabel_1.setFont(new Font("Sandoll 삼립호빵체 TTF Basic", Font.PLAIN, 13));
				lblNewLabel_1.setBounds(452, 63, 74, 15);
				panel_3.add(lblNewLabel_1);
				
				JLabel lblDinerimg_1 = new JLabel("저장 경로(diner_img)");
				lblDinerimg_1.setFont(new Font("Sandoll 삼립호빵체 TTF Basic", Font.PLAIN, 13));
				lblDinerimg_1.setBounds(452, 88, 128, 15);
				panel_3.add(lblDinerimg_1);
				
				JLabel lblNewLabel_2 = new JLabel("불러올 사진");
				lblNewLabel_2.setFont(new Font("Sandoll 삼립호빵체 TTF Basic", Font.PLAIN, 13));
				lblNewLabel_2.setBounds(452, 165, 74, 15);
				panel_3.add(lblNewLabel_2);
				
				JLabel lblDinerimg_2 = new JLabel("저장 경로(diner_img)");
				lblDinerimg_2.setFont(new Font("Sandoll 삼립호빵체 TTF Basic", Font.PLAIN, 13));
				lblDinerimg_2.setBounds(452, 190, 128, 15);
				panel_3.add(lblDinerimg_2);
				
				JLabel lblNewLabel_3 = new JLabel("불러올 사진");
				lblNewLabel_3.setFont(new Font("Sandoll 삼립호빵체 TTF Basic", Font.PLAIN, 13));
				lblNewLabel_3.setBounds(452, 280, 74, 15);
				panel_3.add(lblNewLabel_3);
				
				JLabel lblDinerimg_3 = new JLabel("저장 경로(diner_img)");
				lblDinerimg_3.setFont(new Font("Sandoll 삼립호빵체 TTF Basic", Font.PLAIN, 13));
				lblDinerimg_3.setBounds(452, 305, 128, 15);
				panel_3.add(lblDinerimg_3);

		
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
		bestfood_tf.setColumns(20);
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

		update_bt = new JButton("수  정");
		update_bt.setForeground(new Color(255, 240, 245));
		update_bt.setBackground(new Color(65, 105, 255));
		update_bt.setBorderPainted(false);
		update_bt.setFont(new Font("Sandoll 삼립호빵체 TTF Basic", Font.PLAIN, 25));
		update_bt.setBounds(60, 445, 125, 34);
		admin_del_up_tab.add(update_bt);

		alldel_1 = new JButton("삭제");
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

		JButton up_img2 = new JButton("이미지 불러오기");
		up_img2.setForeground(new Color(255, 240, 245));
		up_img2.setFont(new Font("Sandoll 삼립호빵체 TTF Basic", Font.PLAIN, 15));
		up_img2.setBorderPainted(false);
		up_img2.setBackground(new Color(65, 105, 255));
		up_img2.setBounds(227, 205, 127, 39);
		panel_3_2.add(up_img2);

		JButton up_img3 = new JButton("이미지 불러오기");
		up_img3.setForeground(new Color(255, 240, 245));
		up_img3.setFont(new Font("Sandoll 삼립호빵체 TTF Basic", Font.PLAIN, 15));
		up_img3.setBorderPainted(false);
		up_img3.setBackground(new Color(65, 105, 255));
		up_img3.setBounds(227, 320, 127, 39);
		panel_3_2.add(up_img3);
		//하영
		copy_4 = new JTextField(10);
		copy_4.setBounds(115, 85, 330, 21);
		panel_3_2.add(copy_4);
		
		copy_5 = new JTextField(10);
		copy_5.setBounds(115, 190, 330, 21);
		panel_3_2.add(copy_5);
		
		copy_6 = new JTextField(10);
		copy_6.setBounds(115, 304, 330, 21);
		panel_3_2.add(copy_6);
		
		JLabel lblNewLabel_4 = new JLabel("불러올 사진");
		lblNewLabel_4.setFont(new Font("Sandoll 삼립호빵체 TTF Basic", Font.PLAIN, 13));
		lblNewLabel_4.setBounds(452, 60, 74, 15);
		panel_3_2.add(lblNewLabel_4);
		
		JLabel lblDinerimg_4 = new JLabel("저장 경로(diner_img)");
		lblDinerimg_4.setFont(new Font("Sandoll 삼립호빵체 TTF Basic", Font.PLAIN, 13));
		lblDinerimg_4.setBounds(452, 85, 128, 15);
		panel_3_2.add(lblDinerimg_4);
		
		JLabel lblNewLabel_5 = new JLabel("불러올 사진");
		lblNewLabel_5.setFont(new Font("Sandoll 삼립호빵체 TTF Basic", Font.PLAIN, 13));
		lblNewLabel_5.setBounds(452, 171, 74, 15);
		panel_3_2.add(lblNewLabel_5);
		
		JLabel lblDinerimg_5 = new JLabel("저장 경로(diner_img)");
		lblDinerimg_5.setFont(new Font("Sandoll 삼립호빵체 TTF Basic", Font.PLAIN, 13));
		lblDinerimg_5.setBounds(452, 196, 128, 15);
		panel_3_2.add(lblDinerimg_5);
		
		JLabel lblNewLabel_6 = new JLabel("불러올 사진");
		lblNewLabel_6.setFont(new Font("Sandoll 삼립호빵체 TTF Basic", Font.PLAIN, 13));
		lblNewLabel_6.setBounds(457, 285, 74, 15);
		panel_3_2.add(lblNewLabel_6);
		
		JLabel lblDinerimg_6 = new JLabel("저장 경로(diner_img)");
		lblDinerimg_6.setFont(new Font("Sandoll 삼립호빵체 TTF Basic", Font.PLAIN, 13));
		lblDinerimg_6.setBounds(457, 310, 128, 15);
		panel_3_2.add(lblDinerimg_6);
		
		JComboBox comboBox_storeAddr = new JComboBox();
		comboBox_storeAddr.setModel(new DefaultComboBoxModel(new String[] {"마포구", "신촌", "홍대", "을지로", "연남", "강남"}));
		comboBox_storeAddr.setBounds(200, 120, 227, 21);
		admin_del_up_tab.add(comboBox_storeAddr);
		
		comboBox_foodcate = new JComboBox();
		comboBox_foodcate.setModel(new DefaultComboBoxModel(new String[] {"한식", "양식", "중식", "일식", "카페", "기타"}));
		comboBox_foodcate.setBounds(200, 210, 227, 21);
		admin_del_up_tab.add(comboBox_foodcate);
		
		comboBox_parking = new JComboBox();
		comboBox_parking.setModel(new DefaultComboBoxModel(new String[] {"가능", "불가능"}));
		comboBox_parking.setBounds(200, 390, 227, 21);
		admin_del_up_tab.add(comboBox_parking);
		
		JButton search_bt = new JButton("불러오기");
		search_bt.setForeground(new Color(255, 240, 245));
		search_bt.setFont(new Font("Sandoll 삼립호빵체 TTF Basic", Font.PLAIN, 25));
		search_bt.setBorderPainted(false);
		search_bt.setBackground(new Color(65, 105, 255));
		search_bt.setBounds(30, 20, 125, 34);
		admin_del_up_tab.add(search_bt);
		
		search_tf = new JTextField();
		search_tf.setColumns(10);
		search_tf.setBounds(200, 20, 227, 34);
		admin_del_up_tab.add(search_tf);

		alldel_1.setEnabled(false);
		update_bt.setEnabled(false);
		
		// 테이블 있는곳 색은 65, 105, 225, 명도만 220 
		// ▼▼▼ 추가된 table ▼▼▼
		dtm = new DefaultTableModel(contents, header);
        table = new JTable(dtm) {
            public boolean isCellEditable(int i, int c){
                return false;
            }
        };
        JScrollPane scrollPane = new JScrollPane();
        scrollPane.setBounds(33, 53, 1049, 444);
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
//		table.setPreferredSize(new Dimension(750, 500));
		table.setPreferredScrollableViewportSize(new Dimension(1030, 450));
		table.setRowMargin(2);
		table.setGridColor(SystemColor.scrollbar);
		table.setRowHeight(25);
		scrollPane.setViewportView(table);
		table.getTableHeader();
		admin_store_tab.setLayout(null);
		admin_store_tab.add(scrollPane);

		JComboBox comboBox_1 = new JComboBox(new Object[] {});
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"음식점 이름", "음식분류"}));
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
				dtm.setNumRows(0);
				String combo_sel = "";
				combo_sel = comboBox_1.getSelectedItem().toString();
				String input_text = "";
				input_text = select_tf.getText();
				Protocol p = new Protocol();
				db_VO vo = new db_VO(); 
				if(input_text != null) {
				if (combo_sel == "음식점 이름") {
					// ★ DINER_TABLE의 DINER_NAME열에서 변수 input_text에 입력된 값과 일치하는 row들을 찾아서 반환.
					try {
						p.setCmd(49);
						vo.setDiner_name(input_text);
						p.setVo(vo);
						admin.out.writeObject(p);
						admin.out.flush();
					} catch (Exception e2) {
					}
					
				}else if (combo_sel == "음식분류") {
					// ★ DINER_TABLE의 FOOD_CATEGORY열에서 변수 input_text에 입력된 값과 일치하는 row들을 찾아서 반환.
					try {					
						p.setCmd(50);
						vo.setFood_category(input_text);
						p.setVo(vo);
						admin.out.writeObject(p);
						admin.out.flush();
					} catch (Exception e2) {
					}
				}
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
			try {
				select_tf.setText("");
				Protocol p = new Protocol();
				dtm.setNumRows(0);
				p.setCmd(48);
				admin.out.writeObject(p);
				admin.out.flush();
			} catch (Exception e2) {
			}
			}
		});
		
		// 식당 신규등록
		newadd_bt.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// 이름 32자, 즐겨찾기 숫자 0, 오픈시간 숫자 32개, 메뉴 128자, 전번 숫자 32개, 주소 128자 제한
				Protocol p = new Protocol();
				db_VO vo = new db_VO();
				String input_address = "";
				String store_name = "";
				String input_region = "";
				String food_caterogy = "";
				String parking_chk = "";
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
					input_region = comboBox_newstoreArea.getSelectedItem().toString();
					food_caterogy = comboBox_newfoodcate.getSelectedItem().toString();
					parking_chk = comboBox_newparking.getSelectedItem().toString();

					}
				
				try {
					vo.setDiner_name(store_name);
					vo.setRegion(input_region);
					vo.setAddress(input_address);
					vo.setFood_category(food_caterogy);
					vo.setMenu(menu_text);
					vo.setPhone_number(phone_number);
					vo.setOpening_hours(open_hours);
					if(parking_chk.equals("가능")) {
						vo.setParking_or_not("1");
					}else {
						vo.setParking_or_not("0");
					}
					vo.setFavorited_number("0");
					p.setCmd(51);
					p.setVo(vo);
					
				admin.out.writeObject(p);
				admin.out.flush();
				} catch (IOException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
				}	
			}
		});
		
		alldel_1.addActionListener(new ActionListener() { // 삭제 버튼
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				
				Protocol p = new Protocol();
				p.setCmd(53);
				db_VO vo = new db_VO();
				vo.setDiner_name(store_tf.getText().trim());
				p.setVo(vo);
				try {
					admin.out.writeObject(p);
					admin.out.flush();
				} catch (Exception e2) {
				}				
			}
		});
		
		update_bt.addActionListener(new ActionListener() { // 수정 버튼
			
			@Override
			public void actionPerformed(ActionEvent e) {
				store_tf.setEditable(false);
				try {
					Protocol p = new Protocol();
					db_VO vo = new db_VO();
					vo.setDiner_name(store_tf.getText());
					vo.setAddress(storeAddr_tf.getText());
					vo.setMenu(bestfood_tf.getText());
					vo.setPhone_number(storephone_tf.getText());
					vo.setOpening_hours(opentime_tf.getText());
					vo.setFavorited_number("0");
					vo.getDiner_no();
					String combo_sel = comboBox_foodcate.getSelectedItem().toString();
					if(combo_sel.equals("한식")) {						
						vo.setFood_category("한식");	
					}else if(combo_sel.equals("양식")) {
						vo.setFood_category("양식");
					}else if(combo_sel.equals("중식")) {
						vo.setFood_category("중식");
					}else if(combo_sel.equals("일식")) {
						vo.setFood_category("일식");
					}else if(combo_sel.equals("카페")) {
						vo.setFood_category("카페");
					}else if(combo_sel.equals("기타")) {
						vo.setFood_category("기타");
					}
					
					String yes_or_not = comboBox_parking.getSelectedItem().toString();
					if(yes_or_not.equals("가능")) {
						vo.setParking_or_not("1");
					}else if(yes_or_not.equals("불가능")) {
						vo.setParking_or_not("0");
					}
					
					p.setVo(vo);;
					p.setCmd(56);
					admin.out.writeObject(p);
					admin.out.flush();
				} catch (Exception e2) {
				}
				
			}
		});
		// 식당 불러오기 버튼
		search_bt.addActionListener(new ActionListener() { 
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				db_VO vo = new db_VO();
				Protocol p = new Protocol();
				alldel_1.setEnabled(true);
				update_bt.setEnabled(true);
				try {
					vo.setDiner_name(search_tf.getText().trim());
					p.setCmd(55);
					p.setVo(vo);
					admin.out.writeObject(p);
					admin.out.flush();
				} catch (Exception e2) {
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

		// 하영 추가!!!!!!!!!!!!!!!!!!! 아래까지 쭉
		
				// ** 신규 등록 탭 ** 
				// ! 가게 이미지 !
				// 파일 불러오기 (원본 파일)
				newstore_img_tf.addMouseListener(new MouseAdapter() {
					@Override
					public void mouseClicked(MouseEvent e) {
						FileDialog fd = new FileDialog(new Frame(), "열기", FileDialog.LOAD);
						fd.setVisible(true);
						String msg = fd.getDirectory() + fd.getFile();
						if (!msg.equals("nullnull")) {
							newstore_img_tf.setText(msg);
						}
					}
				});
				
				
				// 복사해서 저장하기
				// 자동으로 _1.png 삽입되게 해서 파일명 입력 시 가게 이름만 써주면 됨!
				copy_1.addMouseListener(new MouseAdapter() {
					@Override
					public void mouseClicked(MouseEvent e) {
						FileDialog fd = new FileDialog(new Frame(), "저장하기", FileDialog.SAVE);
						fd.setVisible(true);
						// File file = new File("D:\\Test");
						//String msg = fd.getDirectory() + fd.getFile() + "_1.png";
						String msg = fd.getDirectory() +fd.getFile()+ "_1.png";
						
						if (!msg.equals("nullnull")) {
							copy_1.setText(msg);
						}
					}
				});
				
				// 이미지 불러오기 버튼을 누르면 지정한 경로로 이미지 저장(복사)
				img1.addActionListener(new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent e) {
						String openPathName = newstore_img_tf.getText().trim();
						String savePathName = copy_1.getText().trim();
						
						// 파일은 무조건 바이트 스트림 처리 하자.
						FileInputStream fis = null;
						BufferedInputStream bis = null;
						FileOutputStream fos = null;
						BufferedOutputStream bos = null;
						
						try {
							fis = new FileInputStream(openPathName);
							bis = new BufferedInputStream(fis);
							fos = new FileOutputStream(savePathName);
							bos = new BufferedOutputStream(fos);
							
							int b = 0 ;
							while ((b=bis.read()) != -1) {
								bos.write(b);
							}
							bos.flush();
							newstore_img_tf.setText("");
							copy_1.setText("");
						} catch (Exception e2) {
						}finally {
							try {
								bos.close();
								fos.close();
								bis.close();
								fis.close();
							} catch (Exception e3) {
								// TODO: handle exception
							}
						}
					}
				});
				
				// ! 대표 메뉴 !
				// 파일 불러오기 (원본 파일)
				newbestfood_img_tf.addMouseListener(new MouseAdapter() {
					@Override
					public void mouseClicked(MouseEvent e) {
						FileDialog fd = new FileDialog(new Frame(), "열기", FileDialog.LOAD);
						fd.setVisible(true);
						String msg = fd.getDirectory() + fd.getFile();
						if (!msg.equals("nullnull")) {
							newbestfood_img_tf.setText(msg);
						}
					}
				});
				
				
				// 복사해서 저장하기
				// 자동으로 _2.png 삽입되게 해서 파일명 입력 시 가게 이름만 써주면 됨!
				copy_2.addMouseListener(new MouseAdapter() {
					@Override
					public void mouseClicked(MouseEvent e) {
						FileDialog fd = new FileDialog(new Frame(), "저장하기", FileDialog.SAVE);
						fd.setVisible(true);
						String msg = fd.getDirectory() + fd.getFile() + "_2.png";
						if (!msg.equals("nullnull")) {
							copy_2.setText(msg);
						}
					}
				});
				
				// 이미지 불러오기 버튼을 누르면 지정한 경로로 이미지 저장(복사)
				img2.addActionListener(new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent e) {
						String openPathName = newbestfood_img_tf.getText().trim();
						String savePathName = copy_2.getText().trim();
						
						// 파일은 무조건 바이트 스트림 처리 하자.
						FileInputStream fis = null;
						BufferedInputStream bis = null;
						FileOutputStream fos = null;
						BufferedOutputStream bos = null;
						
						try {
							fis = new FileInputStream(openPathName);
							bis = new BufferedInputStream(fis);
							fos = new FileOutputStream(savePathName);
							bos = new BufferedOutputStream(fos);
							
							int b = 0 ;
							while ((b=bis.read()) != -1) {
								bos.write(b);
							}
							bos.flush();
							newbestfood_img_tf.setText("");
							copy_2.setText("");
						} catch (Exception e2) {
						}finally {
							try {
								bos.close();
								fos.close();
								bis.close();
								fis.close();
							} catch (Exception e3) {
								// TODO: handle exception
							}
						}
					}
				});
				
				// ! 가게 위치 !
				// 파일 불러오기 (원본 파일)
				newstoreAddr_img_tf.addMouseListener(new MouseAdapter() {
					@Override
					public void mouseClicked(MouseEvent e) {
						FileDialog fd = new FileDialog(new Frame(), "열기", FileDialog.LOAD);
						fd.setVisible(true);
						String msg = fd.getDirectory() + fd.getFile();
						if (!msg.equals("nullnull")) {
							newstoreAddr_img_tf.setText(msg);
						}
					}
				});
				
				
				// 복사해서 저장하기
				copy_3.addMouseListener(new MouseAdapter() {
					@Override
					public void mouseClicked(MouseEvent e) {
						FileDialog fd = new FileDialog(new Frame(), "저장하기", FileDialog.SAVE);
						fd.setVisible(true);
						String msg = fd.getDirectory() + fd.getFile() + "_3.png";
						if (!msg.equals("nullnull")) {
							copy_3.setText(msg);
						}
					}
				});
				
				// 이미지 불러오기 버튼을 누르면 지정한 경로로 이미지 저장(복사)
				// 자동으로 _3.png 삽입되게 해서 파일명 입력 시 가게 이름만 써주면 됨!
				img3.addActionListener(new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent e) {
						String openPathName = newstoreAddr_img_tf.getText().trim();
						String savePathName = copy_3.getText().trim();
						
						// 파일은 무조건 바이트 스트림 처리 하자.
						FileInputStream fis = null;
						BufferedInputStream bis = null;
						FileOutputStream fos = null;
						BufferedOutputStream bos = null;
						
						try {
							fis = new FileInputStream(openPathName);
							bis = new BufferedInputStream(fis);
							fos = new FileOutputStream(savePathName);
							bos = new BufferedOutputStream(fos);
							
							int b = 0 ;
							while ((b=bis.read()) != -1) {
								bos.write(b);
							}
							bos.flush();
							newstoreAddr_img_tf.setText("");
							copy_3.setText("");
						} catch (Exception e2) {
						}finally {
							try {
								bos.close();
								fos.close();
								bis.close();
								fis.close();
							} catch (Exception e3) {
								// TODO: handle exception
							}
						}
					}
				});
				
				// =======================================================================
				// ** 수정 및 삭제 탭 **
				// ! 가게 이미지 !
						// 파일 불러오기 (원본 파일)
						stroe_img_tf.addMouseListener(new MouseAdapter() {
							@Override
							public void mouseClicked(MouseEvent e) {
								FileDialog fd = new FileDialog(new Frame(), "열기", FileDialog.LOAD);
								fd.setVisible(true);
								String msg = fd.getDirectory() + fd.getFile();
								if (!msg.equals("nullnull")) {
									stroe_img_tf.setText(msg);
								}
							}
						});
						
						
						// 복사해서 저장하기
						// 자동으로 _1.png 삽입되게 해서 파일명 입력 시 가게 이름만 써주면 됨!
						copy_4.addMouseListener(new MouseAdapter() {
							@Override
							public void mouseClicked(MouseEvent e) {
								FileDialog fd = new FileDialog(new Frame(), "저장하기", FileDialog.SAVE);
								fd.setVisible(true);
								// File file = new File("D:\\Test");
								//String msg = fd.getDirectory() + fd.getFile() + "_1.png";
								String msg = fd.getDirectory() +fd.getFile()+ "_1.png";
								
								if (!msg.equals("nullnull")) {
									copy_4.setText(msg);
								}
							}
						});
						
						// 이미지 불러오기 버튼을 누르면 지정한 경로로 이미지 저장(복사)
						up_img1.addActionListener(new ActionListener() {
							
							@Override
							public void actionPerformed(ActionEvent e) {
								String openPathName = stroe_img_tf.getText().trim();
								String savePathName = copy_4.getText().trim();
								
								// 파일은 무조건 바이트 스트림 처리 하자.
								FileInputStream fis = null;
								BufferedInputStream bis = null;
								FileOutputStream fos = null;
								BufferedOutputStream bos = null;
								
								try {
									fis = new FileInputStream(openPathName);
									bis = new BufferedInputStream(fis);
									fos = new FileOutputStream(savePathName);
									bos = new BufferedOutputStream(fos);
									
									int b = 0 ;
									while ((b=bis.read()) != -1) {
										bos.write(b);
									}
									bos.flush();
									stroe_img_tf.setText("");
									copy_4.setText("");
								} catch (Exception e2) {
								}finally {
									try {
										bos.close();
										fos.close();
										bis.close();
										fis.close();
									} catch (Exception e3) {
										// TODO: handle exception
									}
								}
							}
						});
						
						// ! 대표 메뉴 !
						// 파일 불러오기 (원본 파일)
						bestfood_img_tf.addMouseListener(new MouseAdapter() {
							@Override
							public void mouseClicked(MouseEvent e) {
								FileDialog fd = new FileDialog(new Frame(), "열기", FileDialog.LOAD);
								fd.setVisible(true);
								String msg = fd.getDirectory() + fd.getFile();
								if (!msg.equals("nullnull")) {
									bestfood_img_tf.setText(msg);
								}
							}
						});
						
						
						// 복사해서 저장하기
						// 자동으로 _2.png 삽입되게 해서 파일명 입력 시 가게 이름만 써주면 됨!
						copy_5.addMouseListener(new MouseAdapter() {
							@Override
							public void mouseClicked(MouseEvent e) {
								FileDialog fd = new FileDialog(new Frame(), "저장하기", FileDialog.SAVE);
								fd.setVisible(true);
								String msg = fd.getDirectory() + fd.getFile() + "_2.png";
								if (!msg.equals("nullnull")) {
									copy_5.setText(msg);
								}
							}
						});
						
						// 이미지 불러오기 버튼을 누르면 지정한 경로로 이미지 저장(복사)
						up_img2.addActionListener(new ActionListener() {
							
							@Override
							public void actionPerformed(ActionEvent e) {
								String openPathName = bestfood_img_tf.getText().trim();
								String savePathName = copy_5.getText().trim();
								
								// 파일은 무조건 바이트 스트림 처리 하자.
								FileInputStream fis = null;
								BufferedInputStream bis = null;
								FileOutputStream fos = null;
								BufferedOutputStream bos = null;
								
								try {
									fis = new FileInputStream(openPathName);
									bis = new BufferedInputStream(fis);
									fos = new FileOutputStream(savePathName);
									bos = new BufferedOutputStream(fos);
									
									int b = 0 ;
									while ((b=bis.read()) != -1) {
										bos.write(b);
									}
									bos.flush();
									bestfood_img_tf.setText("");
									copy_5.setText("");
								} catch (Exception e2) {
								}finally {
									try {
										bos.close();
										fos.close();
										bis.close();
										fis.close();
									} catch (Exception e3) {
										// TODO: handle exception
									}
								}
							}
						});
						
						// ! 가게 위치 !
						// 파일 불러오기 (원본 파일)
						storeAddr_img_tf.addMouseListener(new MouseAdapter() {
							@Override
							public void mouseClicked(MouseEvent e) {
								FileDialog fd = new FileDialog(new Frame(), "열기", FileDialog.LOAD);
								fd.setVisible(true);
								String msg = fd.getDirectory() + fd.getFile();
								if (!msg.equals("nullnull")) {
									storeAddr_img_tf.setText(msg);
								}
							}
						});
						
						
						// 복사해서 저장하기
						copy_6.addMouseListener(new MouseAdapter() {
							@Override
							public void mouseClicked(MouseEvent e) {
								FileDialog fd = new FileDialog(new Frame(), "저장하기", FileDialog.SAVE);
								fd.setVisible(true);
								String msg = fd.getDirectory() + fd.getFile() + "_3.png";
								if (!msg.equals("nullnull")) {
									copy_6.setText(msg);
								}
							}
						});
						
						// 이미지 불러오기 버튼을 누르면 지정한 경로로 이미지 저장(복사)
						// 자동으로 _3.png 삽입되게 해서 파일명 입력 시 가게 이름만 써주면 됨!
						up_img3.addActionListener(new ActionListener() {
							
							@Override
							public void actionPerformed(ActionEvent e) {
								String openPathName = storeAddr_img_tf.getText().trim();
								String savePathName = copy_6.getText().trim();
								
								// 파일은 무조건 바이트 스트림 처리 하자.
								FileInputStream fis = null;
								BufferedInputStream bis = null;
								FileOutputStream fos = null;
								BufferedOutputStream bos = null;
								
								try {
									fis = new FileInputStream(openPathName);
									bis = new BufferedInputStream(fis);
									fos = new FileOutputStream(savePathName);
									bos = new BufferedOutputStream(fos);
									
									int b = 0 ;
									while ((b=bis.read()) != -1) {
										bos.write(b);
									}
									bos.flush();
									storeAddr_img_tf.setText("");
									copy_6.setText("");
								} catch (Exception e2) {
								}finally {
									try {
										bos.close();
										fos.close();
										bis.close();
										fis.close();
									} catch (Exception e3) {
										// TODO: handle exception
									}
								}
							}
						});
				
		
		// admin01_main로 이동
		backbutton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				dtm.setNumRows(0);
				store_tf.setText("");
				storeAddr_tf.setText("");
				bestfood_tf.setText("");
				storephone_tf.setText("");
				opentime_tf.setText("");
				search_tf.setText("");
				newstoreAddr_img_tf.setText("");
				newbestfood_img_tf.setText("");
				newstore_img_tf.setText("");
				storephone_tf.setText("");				
				newstore_tf.setText("");				
				newbestfood_tf.setText("");
				newstorephone_tf.setText("");
				newopentime_tf.setText("");
				stroe_img_tf.setText("");
				bestfood_img_tf.setText("");
				storeAddr_img_tf.setText("");
				select_tf.setText("");
				comboBox_foodcate.setSelectedIndex(0);
				comboBox_parking.setSelectedIndex(0);
				comboBox_newfoodcate.setSelectedIndex(0);
				comboBox_newparking.setSelectedIndex(0);
				cardLayout.show(admin_pg, "admin01_main");				
			}
		});
	}
}
