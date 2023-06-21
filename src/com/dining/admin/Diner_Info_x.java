package com.dining;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.JTextField;
import java.awt.Dimension;
import java.awt.ComponentOrientation;
import java.awt.Cursor;
import javax.swing.DropMode;
import javax.swing.ListSelectionModel;
import javax.swing.SwingConstants;
import javax.swing.JTabbedPane;
import java.awt.Rectangle;
import javax.swing.JScrollPane;
import java.awt.SystemColor;

public class Diner_Info_x {

//	private JFrame frame;
	public JPanel jPanel_admin ;
	private JTable table_2;
	
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
    		 {"가게번호", "음식점 이름", "지역", "상세주소", "음식분류", "대표메뉴", "대표 키워드", "대표 전화번호", "영업시간", "주차 여부"}
    	
     };
     String selection[]= {"회원번호", "회원아이디"}; 
     private JTable table;
     private JTable table_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Diner_Info_x window = new Diner_Info_x();
					window.jPanel_admin.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Diner_Info_x() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		jPanel_admin = new JPanel();
		jPanel_admin.setBackground(new Color(255, 240, 245));
		jPanel_admin.setBounds(100, 100, 1200, 800);
		jPanel_admin.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("음식점");
		lblNewLabel.setBounds(36, 41, 207, 89);
		lblNewLabel.setForeground(new Color(65, 105, 225));
		lblNewLabel.setFont(new Font("Sandoll 삼립호빵체 TTF Basic", Font.PLAIN, 50));
		jPanel_admin.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setBounds(36, 115, 1120, 8);
		lblNewLabel_1.setOpaque(true);
		lblNewLabel_1.setBackground(new Color(65, 105, 225));
		jPanel_admin.add(lblNewLabel_1);
		
		JButton backbutton = new JButton("");
		backbutton.setBounds(1076, 49, 97, 56);
		backbutton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		backbutton.setBorderPainted(false);
		backbutton.setBackground(new Color(255, 240, 245));
		backbutton.setIcon(new ImageIcon(Diner_Info_x.class.getResource("/image/backbutton.png")));
		jPanel_admin.add(backbutton);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(63, 192, 1074, 560);
		tabbedPane.setPreferredSize(new Dimension(500, 500));
		

		jPanel_admin.add(tabbedPane);
		
		JPanel panel_2 = new JPanel();
//		panel_2.setBackground(SystemColor.window);
		panel_2.setBackground(new Color(218, 226, 250));
		tabbedPane.addTab("", new ImageIcon(Diner_Info_x.class.getResource("/image/DinerRevise.png")), panel_2, null);
		tabbedPane.setBackgroundAt(0, SystemColor.textHighlight);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(new Rectangle(300, 300, 2500, 500));
		panel_2.add(scrollPane_1);
		
//		table_1 = new JTable();
//		panel_2.add(table_1);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(218, 226, 250));
		panel_1.setPreferredSize(new Dimension(500, 500));
		tabbedPane.addTab("", new ImageIcon(Diner_Info_x.class.getResource("/image/DinerNew.png")), panel_1, "");
		tabbedPane.setBackgroundAt(1, Color.RED);
		
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
		
		panel_1.add(scrollPane);
//		
//		table = new JTable();
//		panel_2.add(table);
		
//		JLabel lblNewLabel_2 = new JLabel("음식점 수정 및 삭제");
//		lblNewLabel_2.setForeground(new Color(65, 105, 225));
//		lblNewLabel_2.setFont(new Font("Sandoll 삼립호빵체 TTF Basic", Font.PLAIN, 30));
//		lblNewLabel_2.setBounds(488, 31, 220, 51);
//		jPanel_admin.add(lblNewLabel_2);
//		
		JLabel lblNewLabel_2_1 = new JLabel("가게별 평점");
		lblNewLabel_2_1.setBounds(736, 41, 175, 30);
		jPanel_admin.add(lblNewLabel_2_1);
		lblNewLabel_2_1.setForeground(new Color(65, 105, 225));
		lblNewLabel_2_1.setFont(new Font("Sandoll 삼립호빵체 TTF Basic", Font.PLAIN, 30));
		
		JLabel lblNewLabel_2_1_1 = new JLabel("리뷰 및 평점");
		lblNewLabel_2_1_1.setForeground(new Color(65, 105, 225));
		lblNewLabel_2_1_1.setFont(new Font("Sandoll 삼립호빵체 TTF Basic", Font.PLAIN, 30));
		lblNewLabel_2_1_1.setBounds(520, 41, 175, 30);
		jPanel_admin.add(lblNewLabel_2_1_1);
	}
}
