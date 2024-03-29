package com.dining.admin;

import java.awt.AWTException;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Robot;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.InputEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.TableModel;
import javax.swing.JComboBox;

public class Admin04_review extends JPanel {
	JTextField textField_9;

	String header[] = { "리뷰 번호", "가게 이름", "회원ID", "리뷰", "평점" };
	String contents[][] = { { "리뷰 번호", "가게 이름", "회원ID", "리뷰", "평점" }, { "리뷰 번호", "가게 이름", "회원ID", "리뷰", "평점" },
			{ "리뷰 번호", "가게 이름", "회원ID", "리뷰", "평점" }, { "리뷰 번호", "가게 이름", "회원ID", "리뷰", "평점" },
			{ "리뷰 번호", "가게 이름", "회원ID", "리뷰", "평점" }, { "리뷰 번호", "가게 이름", "회원ID", "리뷰", "평점" },
			{ "리뷰 번호", "가게 이름", "회원ID", "리뷰", "평점" }, { "리뷰 번호", "가게 이름", "회원ID", "리뷰", "평점" },
			{ "리뷰 번호", "가게 이름", "회원ID", "리뷰", "평점" }, { "리뷰 번호", "가게 이름", "회원ID", "리뷰", "평점" },
			{ "리뷰 번호", "가게 이름", "회원ID", "리뷰", "평점" }, { "리뷰 번호", "가게 이름", "회원ID", "리뷰", "평점" },
			{ "리뷰 번호", "가게 이름", "회원ID", "리뷰", "평점" }, { "리뷰 번호", "가게 이름", "회원ID", "리뷰", "평점" },
			{ "리뷰 번호", "가게 이름", "회원ID", "리뷰", "평점" }, { "리뷰 번호", "가게 이름", "회원ID", "리뷰", "평점" },
			{ "리뷰 번호", "가게 이름", "회원ID", "리뷰", "평점" }, { "리뷰 번호", "가게 이름", "회원ID", "리뷰", "평점" },
			{ "리뷰 번호", "가게 이름", "회원ID", "리뷰", "평점" }, { "리뷰 번호", "가게 이름", "회원ID", "리뷰", "평점" },
			{ "리뷰 번호", "가게 이름", "회원ID", "리뷰", "평점" }, { "리뷰 번호", "가게 이름", "회원ID", "리뷰", "평점" },
			{ "리뷰 번호", "가게 이름", "회원ID", "리뷰", "평점" } };
	String selection[] = { "가게 이름", "회원아이디" };
	JTable table;
	JTable table_1;
	JTextField select_tf;
	JPanel admin_pg;
	CardLayout cardLayout;

	/**
	 * Create the panel.
	 */
	public Admin04_review(CardLayout cardLayout, JPanel admin_pg) {
		this.cardLayout = cardLayout;
		this.admin_pg = admin_pg;

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
		
		JComboBox comboBox = new JComboBox(selection);
		comboBox.setBackground(Color.WHITE);
		comboBox.setBounds(700, 195, 110, 30);
		add(comboBox);
		
		select_tf = new JTextField();
		select_tf.setBounds(830, 195, 150, 30);
		add(select_tf);
		select_tf.setColumns(10);
		
		RoundedButton_ksw_1 select_bt = new RoundedButton_ksw_1();
		select_bt.setFont(new Font("Sandoll 삼립호빵체 TTF Basic", Font.PLAIN, 16));
		select_bt.setText("검색");
		select_bt.setBounds(999, 195, 50, 30);
		add(select_bt);
		
		RoundedButton_ksw_1 allselect_bt = new RoundedButton_ksw_1();
		allselect_bt.setText("전체조회");
		allselect_bt.setFont(new Font("Sandoll 삼립호빵체 TTF Basic", Font.PLAIN, 16));
		allselect_bt.setBounds(1056, 195, 100, 30);
		add(allselect_bt);

		JButton backbutton = new JButton("");
		backbutton.setBorderPainted(false);
		backbutton.setBackground(new Color(255, 240, 245));
		backbutton.setIcon(new ImageIcon(Admin04_review.class.getResource("/image/backbutton.png")));
		backbutton.setBounds(1064, 51, 101, 54);
		add(backbutton);

		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setForeground(new Color(65, 105, 225));
		tabbedPane.setToolTipText("음식점 신규등록");
		tabbedPane.setFont(new Font("Sandoll 삼립호빵체 TTF Basic", Font.BOLD, 35));
		tabbedPane.setBackground(new Color(255, 240, 245));
		tabbedPane.setBounds(36, 190, 1120, 580);
		add(tabbedPane);

		JPanel panel = new JPanel();
		panel.setBackground(new Color(218, 226, 250));
		panel.setPreferredSize(new Dimension(500, 500));
		
		tabbedPane.addTab("리뷰 및 평점", null, panel, null);
		JScrollPane scrollPane = new JScrollPane();
		JScrollPane scrollPane_1 = new JScrollPane();

		// 테이블 있는곳 색은 65, 105, 225, 명도만 220 

		table = new JTable(contents, header) {
			public boolean isCellEditable(int i, int c){
				return false;
			}
		};		
		table.setPreferredSize(new Dimension(750, 500));
		table.setPreferredScrollableViewportSize(new Dimension(1030, 450));
		table.setRowMargin(2);
		table.setGridColor(SystemColor.scrollbar);
		table.setRowHeight(25);
		scrollPane.setViewportView(table);
		table.getTableHeader();
		table.getTableHeader().setReorderingAllowed(false);
		table.getTableHeader().setResizingAllowed(false);
		panel.add(scrollPane);
		
		// 전체조회 버튼
		allselect_bt.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// ★ REVIEW_TABLE에 있는 모든 자료 불러오는 쿼리
			}
		});
		
		// 검색 버튼
		select_bt.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// 콤보박스에서 선택한 항목
				String sel_option = "";
				sel_option = comboBox.getSelectedItem().toString();
				// tf에서 받아온 값 
				String input_text = "";
				input_text = select_tf.getText();
				if (sel_option == "가게 이름") {
					// ★ REVIEW_TABLE에서 변수 input_text 값과 일치하는 DINER_NAME 및 해당 row 불러오기.
				} else if (sel_option == "회원아이디") {
					// ★ REVIEW_TABLE에서 변수 input_text 값과 일치하는 ID 및 해당 row 불러오기.
				}
				
			}
		});

		// admin01_main로 이동
		backbutton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				cardLayout.show(admin_pg, "admin01_main");
			}
		});
	}
}
