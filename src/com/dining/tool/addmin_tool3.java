package com.dining.tool;

import java.awt.Color;
import java.awt.ComponentOrientation;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.ListSelectionModel;
import javax.swing.SwingConstants;

public class addmin_tool3 {

	JPanel jPanel_admin;
	JTextField textField;
	JTable table_2;
	JScrollPane jScrollPane;
	
	 String header[]={"회원번호", "회원아이디", "비밀번호", "생년월일", "이메일", "비밀번호 확인 질문", "비밀번호 확인 질문 답변", "고객분류", "신고 당한 횟수"};
     String contents[][]={
    		 {"0", "김재훈", "스윙마스터", "생년월일", "이메일", "비밀번호 확인 질문", "비밀번호 확인 질문 답변", "고객분류", "신고 당한 횟수"},
    		 {"1", "김좌현", "일어마스터", "생년월일", "이메일", "비밀번호 확인 질문", "비밀번호 확인 질문 답변", "고객분류", "신고 당한 횟수"},
     };
     String selection[]= {"회원번호", "회원아이디"}; 
     JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					addmin_tool3 window = new addmin_tool3();
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
	public addmin_tool3() {
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
		
		JButton backbutton = new JButton("");
		backbutton.setHorizontalTextPosition(SwingConstants.CENTER);
		backbutton.setBounds(1054, 10, 134, 136);
		backbutton.setIcon(new ImageIcon(addmin_tool3.class.getResource("/image/backbutton.png")));
		backbutton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		backbutton.setBorderPainted(false);
		backbutton.setBackground(new Color(255, 240, 245));
		jPanel_admin.add(backbutton);
		
		backbutton.setBorderPainted(false);
		backbutton.setFocusPainted(false);
		backbutton.setContentAreaFilled(false);
		
		JLabel lblNewLabel = new JLabel("회원정보");
		lblNewLabel.setBounds(36, 41, 207, 89);
		lblNewLabel.setForeground(new Color(65, 105, 225));
		lblNewLabel.setFont(new Font("Sandoll 삼립호빵체 TTF Basic", Font.PLAIN, 50));
		jPanel_admin.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setBounds(36, 115, 1120, 8);
		lblNewLabel_1.setOpaque(true);
		lblNewLabel_1.setBackground(new Color(65, 105, 225));
		jPanel_admin.add(lblNewLabel_1);
		
		JComboBox comboBox = new JComboBox(selection);
		comboBox.setEditable(true);
		comboBox.setBounds(218, 150, 161, 43);
		jPanel_admin.add(comboBox);
		
		textField = new JTextField();
		textField.setBounds(378, 150, 257, 43);
		jPanel_admin.add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton = new JButton("검색");
		btnNewButton.setBorderPainted(false);
		btnNewButton.setFont(new Font("Sandoll 삼립호빵체 TTF Basic", Font.PLAIN, 18));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.setBackground(Color.WHITE);
		btnNewButton.setBounds(636, 150, 102, 43);
		jPanel_admin.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("전체검색");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_1.setFont(new Font("Sandoll 삼립호빵체 TTF Basic", Font.PLAIN, 18));
		btnNewButton_1.setBorderPainted(false);
		btnNewButton_1.setBackground(Color.WHITE);
		btnNewButton_1.setBounds(739, 150, 102, 43);
		jPanel_admin.add(btnNewButton_1);
		
		JButton btnNewButton_1_1 = new JButton("삭제");
		btnNewButton_1_1.setFont(new Font("Sandoll 삼립호빵체 TTF Basic", Font.PLAIN, 18));
		btnNewButton_1_1.setBorderPainted(false);
		btnNewButton_1_1.setBackground(Color.WHITE);
		btnNewButton_1_1.setBounds(842, 150, 102, 43);
		jPanel_admin.add(btnNewButton_1_1);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setIgnoreRepaint(true);
		scrollPane.setPreferredSize(new Dimension(5, 5));
		scrollPane.setBounds(74, 219, 1048, 516);
		scrollPane.setBackground(Color.WHITE);
		jPanel_admin.add(scrollPane);
		
		table = new JTable(contents, header);
		table.setRowHeight(25);
		scrollPane.setViewportView(table);
		table.getTableHeader();
		
		 
	     }
	}
