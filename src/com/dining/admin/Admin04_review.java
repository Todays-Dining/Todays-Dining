package com.dining.admin;

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
import javax.swing.JComboBox;

public class Admin04_review extends JPanel {
	  JTextField textField_9;
	  
	
	 String header[]={"리뷰 번호", "가게 이름", "회원ID", "리뷰", "평점"};
     String contents[][]={
    		 {"리뷰 번호", "가게 이름", "회원ID", "리뷰", "평점"},
    		 {"리뷰 번호", "가게 이름", "회원ID", "리뷰", "평점"},
    		 {"리뷰 번호", "가게 이름", "회원ID", "리뷰", "평점"},
    		 {"리뷰 번호", "가게 이름", "회원ID", "리뷰", "평점"},
    		 {"리뷰 번호", "가게 이름", "회원ID", "리뷰", "평점"},
    		 {"리뷰 번호", "가게 이름", "회원ID", "리뷰", "평점"},
    		 {"리뷰 번호", "가게 이름", "회원ID", "리뷰", "평점"},
    		 {"리뷰 번호", "가게 이름", "회원ID", "리뷰", "평점"},
    		 {"리뷰 번호", "가게 이름", "회원ID", "리뷰", "평점"},
    		 {"리뷰 번호", "가게 이름", "회원ID", "리뷰", "평점"},
    		 {"리뷰 번호", "가게 이름", "회원ID", "리뷰", "평점"},
    		 {"리뷰 번호", "가게 이름", "회원ID", "리뷰", "평점"},
    		 {"리뷰 번호", "가게 이름", "회원ID", "리뷰", "평점"},
    		 {"리뷰 번호", "가게 이름", "회원ID", "리뷰", "평점"},
    		 {"리뷰 번호", "가게 이름", "회원ID", "리뷰", "평점"},
    		 {"리뷰 번호", "가게 이름", "회원ID", "리뷰", "평점"},
    		 {"리뷰 번호", "가게 이름", "회원ID", "리뷰", "평점"},
    		 {"리뷰 번호", "가게 이름", "회원ID", "리뷰", "평점"},
    		 {"리뷰 번호", "가게 이름", "회원ID", "리뷰", "평점"},
    		 {"리뷰 번호", "가게 이름", "회원ID", "리뷰", "평점"},
    		 {"리뷰 번호", "가게 이름", "회원ID", "리뷰", "평점"},
    		 {"리뷰 번호", "가게 이름", "회원ID", "리뷰", "평점"},
    		 {"리뷰 번호", "가게 이름", "회원ID", "리뷰", "평점"}
     };
     String selection[]= {"가게 이름", "회원아이디"}; 
     JTable table;
     JTable table_1;
     JTextField select_tf;
	/**
	 * Create the panel.
	 */
	public Admin04_review() {
		
		setBackground(new Color(255, 240, 245));
		setSize(1200, 800);
		setLayout(null);
		
		JLabel rest = new JLabel("리뷰 및 평점");
		rest.setForeground(new Color(65, 105, 225));
		rest.setFont(new Font("Sandoll 삼립호빵체 TTF Basic", Font.PLAIN, 50));
		rest.setBounds(36, 41, 251, 89);
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
		backbutton.setIcon(new ImageIcon(Admin04_review.class.getResource("/image/backbutton.png")));
		backbutton.setBounds(1064, 51, 101, 54);
		add(backbutton);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setToolTipText("음식점 신규등록");
		tabbedPane.setFont(new Font("Sandoll 삼립호빵체 TTF Basic", Font.BOLD, 25));
		tabbedPane.setBackground(new Color(170, 187, 255));
		tabbedPane.setBounds(36, 190, 1120, 580);
		add(tabbedPane);
		
		// ★★★ //
		JPanel panel = new JPanel();
		panel.setBackground(new Color(218, 226, 250));
		panel.setPreferredSize(new Dimension(500, 500));
		tabbedPane.addTab("", new ImageIcon(Admin04_review.class.getResource("/image/ReviewsandRating.png")), panel, "");
		tabbedPane.setBackgroundAt(5, Color.RED);
		
//		JPanel panel_1 = new JPanel();
//		panel_1.setBackground(new Color(218, 226, 250));
//		panel_1.setPreferredSize(new Dimension(500, 500));
//		tabbedPane.addTab("", new ImageIcon(ReviewandRating.class.getResource("/image/DinerRating.png")), panel_1, "");
//		tabbedPane.setBackgroundAt(3, Color.RED);
		
		JScrollPane scrollPane = new JScrollPane();
		JScrollPane scrollPane_1 = new JScrollPane();
		
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
		
//		table_1 = new JTable(contents, header);
//		table_1.setPreferredSize(new Dimension(750, 500));
//		table_1.setPreferredScrollableViewportSize(new Dimension(1030, 450));
//		table_1.setRowMargin(2);
//		table_1.setGridColor(SystemColor.scrollbar);
//		table_1.setRowHeight(25);
//		scrollPane_1.setViewportView(table_1);
//		table_1.getTableHeader();
		
		panel.add(scrollPane);
//		panel_1.add(scrollPane_1);
		
//		JLabel rest_1 = new JLabel("가게 이름");
//		rest_1.setForeground(new Color(65, 105, 225));
//		rest_1.setFont(new Font("Sandoll 삼립호빵체 TTF Basic", Font.PLAIN, 24));
//		rest_1.setBounds(510, 190, 91, 41);
//		add(rest_1);
		
		JComboBox comboBox = new JComboBox(selection);
		comboBox.setBounds(700, 195, 110, 30);
		comboBox.setBackground(new Color(255, 255, 255));
		add(comboBox);
		
		select_tf = new JTextField();
		select_tf.setBounds(830, 195, 150, 30);
		add(select_tf);
		select_tf.setColumns(10);
		
		RoundedButton_ksw_1 select_bt = new RoundedButton_ksw_1("New button");
		select_bt.setFont(new Font("Sandoll 삼립호빵체 TTF Basic", Font.PLAIN, 16));
		select_bt.setText("검색");
		select_bt.setBounds(999, 195, 50, 30);
		add(select_bt);
		
		RoundedButton_ksw_1 allselect_bt = new RoundedButton_ksw_1("New button");
		allselect_bt.setText("전체조회");
		allselect_bt.setFont(new Font("Sandoll 삼립호빵체 TTF Basic", Font.PLAIN, 16));
		allselect_bt.setBounds(1056, 195, 100, 30);
		add(allselect_bt);
		
//		btnNewButton_3.fillRoundRect(0, 0, 10, 10, 10, 10); 
	}
}
