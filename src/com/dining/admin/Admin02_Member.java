package com.dining.admin;

import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.AbstractCellEditor;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.ListSelectionModel;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableCellEditor;
import javax.swing.table.TableCellRenderer;
import javax.swing.JRadioButton;

public class Admin02_Member extends JPanel {
	JTextField select_tf;
	DefaultTableModel model;
	JTable table;
	JScrollPane jScrollPane;
	JRadioButton rb;
	
	 String header[]={"회원번호", "회원아이디", "비밀번호", "생년월일", "이메일", "비밀번호 확인 질문", "비밀번호 확인 질문 답변", "고객분류", "신고 당한 횟수"};
     String contents[][]={
    		 {"0", "김재훈", "스윙마스터", "생년월일", "이메일", "비밀번호 확인 질문", "비밀번호 확인 질문 답변", "고객분류", "신고 당한 횟수"},
    		 {"1", "김좌현", "일어마스터", "생년월일", "이메일", "비밀번호 확인 질문", "비밀번호 확인 질문 답변", "고객분류", "신고 당한 횟수"},
    		 {"1", "김좌현", "일어마스터", "생년월일", "이메일", "비밀번호 확인 질문", "비밀번호 확인 질문 답변", "고객분류", "신고 당한 횟수"},
    		 {"1", "김좌현", "일어마스터", "생년월일", "이메일", "비밀번호 확인 질문", "비밀번호 확인 질문 답변", "고객분류", "신고 당한 횟수"},
    		 {"1", "김좌현", "일어마스터", "생년월일", "이메일", "비밀번호 확인 질문", "비밀번호 확인 질문 답변", "고객분류", "신고 당한 횟수"},
    		 {"1", "김좌현", "일어마스터", "생년월일", "이메일", "비밀번호 확인 질문", "비밀번호 확인 질문 답변", "고객분류", "신고 당한 횟수"},
    		 {"1", "김좌현", "일어마스터", "생년월일", "이메일", "비밀번호 확인 질문", "비밀번호 확인 질문 답변", "고객분류", "신고 당한 횟수"},
    		 {"1", "김좌현", "일어마스터", "생년월일", "이메일", "비밀번호 확인 질문", "비밀번호 확인 질문 답변", "고객분류", "신고 당한 횟수"},
    		 {"1", "김좌현", "일어마스터", "생년월일", "이메일", "비밀번호 확인 질문", "비밀번호 확인 질문 답변", "고객분류", "신고 당한 횟수"},
    		 {"1", "김좌현", "일어마스터", "생년월일", "이메일", "비밀번호 확인 질문", "비밀번호 확인 질문 답변", "고객분류", "신고 당한 횟수"},
    		 {"1", "김좌현", "일어마스터", "생년월일", "이메일", "비밀번호 확인 질문", "비밀번호 확인 질문 답변", "고객분류", "신고 당한 횟수"},
    		 {"1", "김좌현", "일어마스터", "생년월일", "이메일", "비밀번호 확인 질문", "비밀번호 확인 질문 답변", "고객분류", "신고 당한 횟수"},
    		 {"1", "김좌현", "일어마스터", "생년월일", "이메일", "비밀번호 확인 질문", "비밀번호 확인 질문 답변", "고객분류", "신고 당한 횟수"},
    		 {"1", "김좌현", "일어마스터", "생년월일", "이메일", "비밀번호 확인 질문", "비밀번호 확인 질문 답변", "고객분류", "신고 당한 횟수"},
    		 {"1", "김좌현", "일어마스터", "생년월일", "이메일", "비밀번호 확인 질문", "비밀번호 확인 질문 답변", "고객분류", "신고 당한 횟수"},
    		 {"1", "김좌현", "일어마스터", "생년월일", "이메일", "비밀번호 확인 질문", "비밀번호 확인 질문 답변", "고객분류", "신고 당한 횟수"},
    		 {"1", "김좌현", "일어마스터", "생년월일", "이메일", "비밀번호 확인 질문", "비밀번호 확인 질문 답변", "고객분류", "신고 당한 횟수"},
    		 {"1", "김좌현", "일어마스터", "생년월일", "이메일", "비밀번호 확인 질문", "비밀번호 확인 질문 답변", "고객분류", "신고 당한 횟수"},
    		 {"1", "김좌현", "일어마스터", "생년월일", "이메일", "비밀번호 확인 질문", "비밀번호 확인 질문 답변", "고객분류", "신고 당한 횟수"},
    		 {"1", "김좌현", "일어마스터", "생년월일", "이메일", "비밀번호 확인 질문", "비밀번호 확인 질문 답변", "고객분류", "신고 당한 횟수"},
    		 {"1", "김좌현", "일어마스터", "생년월일", "이메일", "비밀번호 확인 질문", "비밀번호 확인 질문 답변", "고객분류", "신고 당한 횟수"},
    		 {"1", "김좌현", "일어마스터", "생년월일", "이메일", "비밀번호 확인 질문", "비밀번호 확인 질문 답변", "고객분류", "신고 당한 횟수"},
    		 {"1", "김좌현", "일어마스터", "생년월일", "이메일", "비밀번호 확인 질문", "비밀번호 확인 질문 답변", "고객분류", "신고 당한 횟수"},
    		 {"1", "김좌현", "일어마스터", "생년월일", "이메일", "비밀번호 확인 질문", "비밀번호 확인 질문 답변", "고객분류", "신고 당한 횟수"},
    		 {"1", "김좌현", "일어마스터", "생년월일", "이메일", "비밀번호 확인 질문", "비밀번호 확인 질문 답변", "고객분류", "신고 당한 횟수"},
    		 {"1", "김좌현", "일어마스터", "생년월일", "이메일", "비밀번호 확인 질문", "비밀번호 확인 질문 답변", "고객분류", "신고 당한 횟수"},
    		 {"1", "김좌현", "일어마스터", "생년월일", "이메일", "비밀번호 확인 질문", "비밀번호 확인 질문 답변", "고객분류", "신고 당한 횟수"},
    		 {"1", "김좌현", "일어마스터", "생년월일", "이메일", "비밀번호 확인 질문", "비밀번호 확인 질문 답변", "고객분류", "신고 당한 횟수"}
    		 
     };
     String selection[]= {"회원번호", "회원아이디"}; 
     private JButton allselect_bt;
     
     JPanel admin_pg ;
 	CardLayout cardLayout;
    
	/**
	 * Create the panel.
	 */
	public Admin02_Member(CardLayout cardLayout,JPanel admin_pg) {
		this.cardLayout = cardLayout ;
		this.admin_pg = admin_pg ;
		
		
		setBackground(new Color(255, 240, 245));
		setBounds(100, 100, 1200, 800);
		setLayout(null);
		
		JButton backbutton = new JButton("");
		backbutton.setFocusPainted(false);
		backbutton.setBounds(1059, 41, 97, 56);
		backbutton.setBorderPainted(false);
		backbutton.setBackground(new Color(255, 240, 245));
		backbutton.setIcon(new ImageIcon(Admin02_Member.class.getResource("/image/backbutton.png")));
		add(backbutton);
		
		JLabel member_lb = new JLabel("회원정보");
		member_lb.setBounds(36, 41, 207, 89);
		member_lb.setForeground(new Color(65, 105, 225));
		member_lb.setFont(new Font("Sandoll 삼립호빵체 TTF Basic", Font.PLAIN, 50));
		add(member_lb);
		
		JLabel tool_lb = new JLabel("");
		tool_lb.setBounds(36, 115, 1120, 8);
		tool_lb.setOpaque(true);
		tool_lb.setBackground(new Color(65, 105, 225));
		add(tool_lb);
		
		JComboBox comboBox = new JComboBox(selection);
		comboBox.setBounds(218, 150, 161, 43);
		add(comboBox);
		
		select_tf = new JTextField();
		select_tf.setBounds(378, 150, 257, 43);
		add(select_tf);
		select_tf.setColumns(10);
		
		JButton select_bt = new JButton("검색");
		select_bt.setBorderPainted(false);
		select_bt.setFont(new Font("Sandoll 삼립호빵체 TTF Basic", Font.PLAIN, 18));
		select_bt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		select_bt.setBackground(Color.WHITE);
		select_bt.setBounds(636, 150, 102, 43);
		add(select_bt);
		
		allselect_bt = new JButton("전체검색");
		allselect_bt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		allselect_bt.setFont(new Font("Sandoll 삼립호빵체 TTF Basic", Font.PLAIN, 18));
		allselect_bt.setBorderPainted(false);
		allselect_bt.setBackground(Color.WHITE);
		allselect_bt.setBounds(739, 150, 102, 43);
		add(allselect_bt);
		
		JButton del_bt = new JButton("삭제");
		del_bt.setFont(new Font("Sandoll 삼립호빵체 TTF Basic", Font.PLAIN, 18));
		del_bt.setBorderPainted(false);
		del_bt.setBackground(Color.WHITE);
		del_bt.setBounds(842, 150, 102, 43);
		add(del_bt);
		
		
		table = new JTable(contents, header) {
			public boolean isCellEditable(int i, int c){
				return false;
			}
		};
		table.getTableHeader().setReorderingAllowed(false);
		table.getTableHeader().setResizingAllowed(false);
		table.isCellEditable(getX(), getY());
		table.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		table.setRowHeight(25);
		
		JScrollPane scrollPane = new JScrollPane(table);
		scrollPane.setIgnoreRepaint(true);
		scrollPane.setPreferredSize(new Dimension(5, 5));
		scrollPane.setBounds(74, 219, 1048, 516);
		add(scrollPane);
		
		JButton adminadd_bt = new JButton("관리자추가");
		adminadd_bt.setBackground(new Color(255, 0, 128));
		adminadd_bt.setBorderPainted(false);
		adminadd_bt.setFont(new Font("Sandoll 삼립호빵체 TTF Basic", Font.PLAIN, 20));
		adminadd_bt.setBounds(989, 150, 133, 43);
		add(adminadd_bt);
		
	
		
		// admin02_AdMember_add 관리자 추가페이지로 이동
		adminadd_bt.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				cardLayout.show(admin_pg, "admin02_AdMember_add");
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
