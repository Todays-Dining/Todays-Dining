package com.dining.main;

import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

import com.dining.start.Start_frame;

public class Main00_store_search extends JPanel {
	
	public DefaultTableModel dtm;
	String header[]= {"가게 이름","대표 메뉴"};
	String contents[][] = new String[40][];
	String selection[]= {"가게 이름"}; 
    public JTable table;
    JTable table_1;
    JTextField textField;
    CardLayout cardLayout;
	JPanel main_pg;
	String store;
	Start_frame main;
	/**
	 * Create the panel.
	 */
	public Main00_store_search(CardLayout cardLayout, JPanel main_pg,Start_frame main) {
		this.cardLayout = cardLayout ;
		this.main_pg = main_pg ;
		this.main = main;
		
		setForeground(new Color(0, 0, 0));
		setBackground(new Color(255, 240, 245));
		setBounds(100, 100, 540, 960);
		setLayout(null);
		
		
		
		JLabel search_lb = new JLabel("뭐먹지?");
		search_lb.setOpaque(true);
		search_lb.setForeground(new Color(255, 255, 255));
		search_lb.setBackground(new Color(65, 105, 225));
		search_lb.setFont(new Font("Sandoll 삼립호빵체 TTF Basic", Font.PLAIN, 30));
		search_lb.setHorizontalAlignment(JLabel.CENTER);
		search_lb.setBounds(163, 258, 200, 40);
		add(search_lb);
		
		JLabel ib_img = new JLabel("");
		ib_img.setIcon(new ImageIcon(Main00_store_search.class.getResource("/image/label.png")));
		ib_img.setBounds(0, 0, 540, 330);
		add(ib_img);
		
		JButton homebutton = new JButton("");
		homebutton.setBorderPainted(false);
		homebutton.setIcon(new ImageIcon(Main00_store_search.class.getResource("/image/homebutton_1.png")));
		homebutton.setBackground(new Color(255, 240, 245));
		homebutton.setBounds(346, 40, 60, 60);
		add(homebutton);
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
		
		JMenu movemenu = new JMenu("");
		movemenu.setOpaque(true);
		movemenu.setIconTextGap(0);
		movemenu.setIcon(new ImageIcon(Main00_Home.class.getResource("/image/menubutton.png")));
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
		

		// 재훈 테이블 클릭시 이벤트및 초기화
		dtm = new DefaultTableModel(contents, header);
		table = new JTable(dtm) {
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
				 cardLayout.show(main_pg, "main04_store1_main");
				 clear();
			 } 
			}
		});
		table.getTableHeader().setReorderingAllowed(false);
		table.getTableHeader().setResizingAllowed(false);
		table.isCellEditable(getX(), getY());
		table.setBackground(new Color(255, 187, 187));
		table.setLocation(84, 380);
		table.setSize(350, 600);
		table.setPreferredSize(new Dimension(750, 500));
		table.setPreferredScrollableViewportSize(new Dimension(1030, 450));
		table.setRowMargin(2);
		table.setGridColor(new Color(255, 108, 108));
		table.setRowHeight(40);
		table.getTableHeader();
		add(table);
		
		JScrollPane scrollPane = new JScrollPane(table);
		scrollPane.setBounds(49, 350, 450, 450);
		add(scrollPane);
		
		// Main00_Home으로 돌아간다
		homebutton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				cardLayout.show(main_pg,"main00_Home");
				clear();
			}
		});
		
		// main01_best1 로 이동
		movemenu_1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				cardLayout.show(main_pg, "main01_best1");
				clear();
			}
		});

		// main02_category_select 로 이동
		movemenu_2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				cardLayout.show(main_pg, "main02_category_select");
				clear();
			}
		});

		// main03_random 로 이동
		movemenu_3.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				cardLayout.show(main_pg, "main03_random");
				clear();
			}
		});

		// mypage01_main 로 이동
		mypage.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				cardLayout.show(main_pg, "mypage01_main");
				clear();
			}
		});
	}
	
	// 테이블 클리어
			public void clear() {
				for (int i = 0; i < 40; i++) {
					table.setValueAt("", i, 0);
					table.setValueAt("", i, 1);
					
				}
			}
}
