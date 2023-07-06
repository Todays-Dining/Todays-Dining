package com.dining.main;

import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

import com.dining.mypage.RoundedButton_ha0_1;
import com.dining.start.Protocol;
import com.dining.start.Start_frame;
import com.dining.start.db_VO;

public class Main00_Home extends JPanel {
	JTextField search_tf;
	JTextField keyword_tf;
	CardLayout cardLayout;
	JPanel main_pg;

	public Main00_Home(CardLayout cardLayout, JPanel main_pg, Start_frame main) {
		this.cardLayout = cardLayout;
		this.main_pg = main_pg;
		setForeground(new Color(0, 0, 0));
		setBackground(new Color(255, 240, 245));
		setBounds(100, 100, 540, 960);
		setLayout(null);

		// 주간 Best 버튼 삭제 (김상우)
		RoundedButton_ha0_1 best_bt = new RoundedButton_ha0_1("주간 Best");
		best_bt.setForeground(new Color(255, 255, 255));
		best_bt.setBorderPainted(false);
		best_bt.setBackground(new Color(65, 105, 225));
		best_bt.setFont(new Font("Sandoll 삼립호빵체 TTF Basic", Font.PLAIN, 24));
		best_bt.setBounds(169, 370, 204, 61);
		add(best_bt);

		RoundedButton_ha0_1 foodcategory_bt = new RoundedButton_ha0_1("음식 카테고리");
		foodcategory_bt.setForeground(new Color(255, 255, 255));
		foodcategory_bt.setBorderPainted(false);
		foodcategory_bt.setBackground(new Color(65, 105, 225));
		foodcategory_bt.setFont(new Font("Sandoll 삼립호빵체 TTF Basic", Font.PLAIN, 24));
		foodcategory_bt.setBounds(169, 465, 204, 61);
		add(foodcategory_bt);

		RoundedButton_ha0_1 random_bt = new RoundedButton_ha0_1("오늘 뭐먹죠?");
		random_bt.setForeground(new Color(255, 255, 255));
		random_bt.setBorderPainted(false);
		random_bt.setBackground(new Color(65, 105, 225));
		random_bt.setFont(new Font("Sandoll 삼립호빵체 TTF Basic", Font.PLAIN, 24));
		random_bt.setBounds(169, 560, 204, 61);
		add(random_bt);

		search_tf = new JTextField();
		search_tf.setBounds(118, 264, 280, 50);
		add(search_tf);
		search_tf.setColumns(10);

		RoundedButton_ha0_1 search_bt = new RoundedButton_ha0_1("검색");
		search_bt.setForeground(new Color(255, 255, 255));
		search_bt.setBorderPainted(false);
		search_bt.setBackground(new Color(65, 105, 225));
		search_bt.setFont(new Font("Sandoll 삼립호빵체 TTF Basic", Font.PLAIN, 24));
		search_bt.setBounds(399, 264, 70, 50);
		add(search_bt);

		JLabel icon_lb = new JLabel("");
		icon_lb.setIcon(new ImageIcon(Main00_Home.class.getResource("/image/icon_small.png")));
		icon_lb.setBounds(54, 643, 430, 307);
		add(icon_lb);

		keyword_tf = new JTextField("인기많은 검색어 : 한식, 카페, 카레, 일식");
		keyword_tf.setBorder(null);
		keyword_tf.setBounds(118, 319, 280, 21);
		keyword_tf.setBackground(new Color(255, 240, 245));
		keyword_tf.setFont(new Font("Sandoll 삼립호빵체 TTF Basic", Font.PLAIN, 16));
		keyword_tf.setForeground(Color.GRAY);
		add(keyword_tf);
		keyword_tf.setColumns(50);

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

		JButton map_bt = new JButton("");
		map_bt.setIcon(new ImageIcon(Main00_Home.class.getResource("/image/map_icon.png")));
		map_bt.setBorderPainted(false);
		map_bt.setBackground(new Color(255, 240, 245));
		map_bt.setBounds(329, 37, 77, 69);
		add(map_bt);

		JLabel image_lb = new JLabel("");
		image_lb.setIcon(new ImageIcon(Main00_Home.class.getResource("/image/label.png")));
		image_lb.setBounds(0, -2, 540, 330);
		add(image_lb);

		// 맵 main00_map 화면으로 돌아감
		map_bt.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				cardLayout.show(main_pg, "main00_map");
			}
		});

		// best1화면으로 이동함 main01_best1
		best_bt.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				cardLayout.show(main_pg, "main01_best1");
			}
		});

		// 음식카테고리 화면으로 이동한다.
		foodcategory_bt.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				cardLayout.show(main_pg, "main02_category_select");
			}
		});

		// 랜덤게임창으로 이동 main03_random
		random_bt.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				cardLayout.show(main_pg, "main03_random");
			}
		});

		// 검색시
		search_bt.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				String search = search_tf.getText().trim();
				// 값이 있는지 확인
				if (search.length() > 0) {
					Protocol p = new Protocol();
					db_VO vo = new db_VO();
					// 검색가능한지 테스트(null값 확인)
					vo.setSearch(search);
					// 검색 가능했을때 검색어 저장해두기
					p.setSearch(search);
					p.setCmd(21);
					p.setVo(vo);
					search_tf.setText("");
					try {
						main.out.writeObject(p);
						main.out.flush();
					} catch (IOException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				} else {
					JOptionPane.showMessageDialog(getParent(), "검색어를 입력해주세요.", null, JOptionPane.INFORMATION_MESSAGE,
							new ImageIcon(Main00_Home.class.getResource("/image/icon_mini.png")));
				}		
			}
		});

		// main01_best1 로 이동
		movemenu_1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				cardLayout.show(main_pg, "main01_best1");
			}
		});

		// main02_category_select 로 이동
		movemenu_2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				cardLayout.show(main_pg, "main02_category_select");
			}
		});

		// main03_random 로 이동
		movemenu_3.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				cardLayout.show(main_pg, "main03_random");
			}
		});

		// mypage01_main 로 이동
		mypage.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				cardLayout.show(main_pg, "mypage01_main");
			}
		});
	}

}
