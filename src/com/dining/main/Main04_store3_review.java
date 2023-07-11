package com.dining.main;

import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.regex.Pattern;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

import com.dining.login.Login01_page;
import com.dining.start.Protocol;
import com.dining.start.Start_frame;
import com.dining.start.db_VO;

import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Main04_store3_review extends JPanel {
	// 평점 텍스트필드
	public JTextField store_score_tf;
	// 리뷰 텍스트필드
	public JTextField now_review_ta;
	CardLayout cardLayout;
	JPanel main_pg;
	Start_frame main;
	
	public JTextArea review1_ta;
	public JTextArea review2_ta;
	public JTextArea review3_ta;
	public JTextField review1_id;
	public JTextField review2_id;
	public JTextField review3_id;
	
	public JLabel date_1;
	public JLabel date_2;
	public JLabel date_3;
	
	public String id_forchk = "";
	public String store_name = "";
	public JTextField tf_forid;
	public JTextField tf_fordiner;

	public Main04_store3_review(CardLayout cardLayout, JPanel main_pg, Start_frame main) {
		this.cardLayout = cardLayout;
		this.main_pg = main_pg;
		this.main = main;

		setForeground(new Color(0, 0, 0));
		setBackground(new Color(255, 240, 245));
		setBounds(100, 100, 540, 960);
		setLayout(null);
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

		JButton homeButton = new JButton("");
		homeButton.setBorderPainted(false);
		homeButton.setIcon(new ImageIcon(Main04_store3_review.class.getResource("/image/homebutton_1.png")));
		homeButton.setBackground(new Color(255, 240, 245));
		homeButton.setBounds(329, 37, 77, 69);
		add(homeButton);

		JLabel lb1 = new JLabel("리뷰");
		lb1.setFont(new Font("Sandoll 삼립호빵체 TTF Outline", Font.BOLD, 47));
		lb1.setHorizontalAlignment(SwingConstants.CENTER);
		lb1.setBounds(202, 250, 127, 54);
		add(lb1);

		JLabel img_lb = new JLabel("");
		img_lb.setIcon(new ImageIcon(Main04_store3_review.class.getResource("/image/label.png")));
		img_lb.setBounds(0, 10, 540, 330);
		add(img_lb);

		JLabel custname1_lb = new JLabel("작성자:");
		custname1_lb.setFont(new Font("Sandoll 삼립호빵체 TTF Basic", Font.PLAIN, 18));
		custname1_lb.setHorizontalAlignment(SwingConstants.CENTER);
		custname1_lb.setBounds(130, 315, 67, 29);
		add(custname1_lb);

		String date_1_time = "";
		date_1 = new JLabel(date_1_time);
		date_1.setHorizontalAlignment(SwingConstants.CENTER);
		date_1.setFont(new Font("Sandoll 삼립호빵체 TTF Basic", Font.PLAIN, 18));
		date_1.setBounds(10, 345, 182, 30);
		add(date_1);
		review1_ta = new JTextArea();
		review1_ta.setEditable(false);
		review1_ta.setBounds(200, 350, 317, 61);
		add(review1_ta);

		String date_2_time = "";
		date_2 = new JLabel(date_2_time);
		date_2.setHorizontalAlignment(SwingConstants.CENTER);
		date_2.setFont(new Font("Sandoll 삼립호빵체 TTF Basic", Font.PLAIN, 18));
		date_2.setBounds(10, 447, 182, 30);
		add(date_2);
		review2_ta = new JTextArea();
		review2_ta.setEditable(false);
		review2_ta.setBounds(200, 452, 317, 61);
		add(review2_ta);

		JLabel custname2_lb = new JLabel("작성자:");
		custname2_lb.setHorizontalAlignment(SwingConstants.CENTER);
		custname2_lb.setFont(new Font("Sandoll 삼립호빵체 TTF Basic", Font.PLAIN, 18));
		custname2_lb.setBounds(130, 417, 67, 29);
		add(custname2_lb);

		
		String date_3_time = "";
		date_3 = new JLabel(date_3_time);
		date_3.setHorizontalAlignment(SwingConstants.CENTER);
		date_3.setFont(new Font("Sandoll 삼립호빵체 TTF Basic", Font.PLAIN, 18));
		date_3.setBounds(10, 548, 182, 30);
		add(date_3);
		review3_ta = new JTextArea();
		review3_ta.setEditable(false);
		review3_ta.setBounds(200, 553, 317, 61);
		add(review3_ta);

		JLabel custname3_lb = new JLabel("작성자:");
		custname3_lb.setHorizontalAlignment(SwingConstants.CENTER);
		custname3_lb.setFont(new Font("Sandoll 삼립호빵체 TTF Basic", Font.PLAIN, 18));
		custname3_lb.setBounds(130, 518, 67, 29);
		add(custname3_lb);

		JLabel store_score_lb = new JLabel("별점 주기");
		store_score_lb.setHorizontalAlignment(SwingConstants.CENTER);
		store_score_lb.setFont(new Font("Sandoll 삼립호빵체 TTF Basic", Font.PLAIN, 18));
		store_score_lb.setBounds(61, 705, 67, 29);
		add(store_score_lb);

		store_score_tf = new JTextField();
		store_score_tf.setBounds(148, 707, 67, 29);
		add(store_score_tf);
		store_score_tf.setColumns(10);
		// 입력 숫자 세자리 제한
		store_score_tf.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                JTextField src = (JTextField)e.getSource();
                if(src.getText().length() > 2)e.consume();
            }
        });

		JLabel now_review_lb = new JLabel("리뷰 남기기:");
		now_review_lb.setFont(new Font("Sandoll 삼립호빵체 TTF Basic", Font.PLAIN, 20));
		now_review_lb.setBounds(32, 744, 96, 43);
		add(now_review_lb);

		now_review_ta = new JTextField();
		now_review_ta.setBounds(148, 755, 338, 148);
		add(now_review_ta);
		now_review_ta.setColumns(10);
		
		// 작성자 ID 입력 받아오기(하영)
		review1_id = new JTextField();
		review1_id.setEditable(false);
		review1_id.setBounds(200, 319, 116, 21);
		add(review1_id);
		review1_id.setColumns(10);
				
		review2_id = new JTextField();
		review2_id.setEditable(false);
		review2_id.setBounds(200, 421, 116, 21);
		add(review2_id);
		review2_id.setColumns(10);
				
		review3_id = new JTextField();
		review3_id.setEditable(false);
		review3_id.setBounds(200, 522, 116, 21);
		add(review3_id);
		review3_id.setColumns(10);

		JButton back_bt = new JButton("");
		back_bt.setIcon(new ImageIcon(Main04_store2_map.class.getResource("/image/backbutton.png")));
		back_bt.setBorderPainted(false);
		back_bt.setBackground(new Color(255, 240, 245));
		back_bt.setBounds(242, 40, 77, 69);
		add(back_bt);

		RoundedButton_ysh_1 review_save_bt = new RoundedButton_ysh_1("저장하기");
		review_save_bt.setBorderPainted(false);
		review_save_bt.setForeground(new Color(255, 255, 255));
		review_save_bt.setFont(new Font("Sandoll 삼립호빵체 TTF Basic", Font.PLAIN, 20));
		review_save_bt.setBackground(new Color(65, 105, 225));
		review_save_bt.setBounds(366, 710, 109, 29);
		add(review_save_bt);
		
		tf_forid = new JTextField();
		tf_forid.setBounds(-1, -1, 0, 0);
		add(tf_forid);
		tf_forid.setColumns(10);
		
		tf_fordiner = new JTextField();
		tf_fordiner.setColumns(10);
		tf_fordiner.setBounds(1, 0, 0, 0);
		add(tf_fordiner);
		
	

		// 다시 가게보기 첫화면으로 돌아간다 main04_store1_main
		back_bt.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				cardLayout.show(main_pg, "main04_store1_main");
			}
		});

		// Main00_Home으로 돌아간다
		homeButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				cardLayout.show(main_pg, "main00_Home");
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
		
		// 리뷰 저장 버튼 (상우)
		review_save_bt.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// 기본값을 1로!!
				int blank_flag = 1;
				int input_flag = 1;
				// 별점주기 or 리뷰 남기기 중 하나라도 공백이면 메세지
				// 리뷰 작성
				if (now_review_ta.getText().length() == 0 && store_score_tf.getText().length() == 0) {
					JOptionPane.showMessageDialog(getParent(), "정보를 모두 입력해주세요!", null, JOptionPane.INFORMATION_MESSAGE,
	           				 new ImageIcon(Login01_page.class.getResource("/image/icon_mini.png")));
					blank_flag = 0;
				} else {
					blank_flag = 1;
				}
				Boolean id_test = Pattern.matches("^[0-9.]*$", store_score_tf.getText());
//				System.out.println(id_test);
				
				double res_score = 0.0;
				int trim_flag = 1;
				// 리뷰 부분은 숫자 0~5까지만 받기.
				try {
					res_score = Double.parseDouble(store_score_tf.getText().trim());
					trim_flag = 1;
				} catch (Exception e2) {
					JOptionPane.showMessageDialog(getParent(), "별점은 숫자 0~5 사이로 입력해 주세요!!", null, JOptionPane.INFORMATION_MESSAGE,
	           				 new ImageIcon(Login01_page.class.getResource("/image/icon_mini.png")));
					trim_flag = 0;
				}
				int less_five = 1;
				if (res_score > 5) {
					JOptionPane.showMessageDialog(getParent(), "별점은 숫자 0~5 사이로 입력해 주세요!!", null, JOptionPane.INFORMATION_MESSAGE,
	           				 new ImageIcon(Login01_page.class.getResource("/image/icon_mini.png")));
					less_five = 0;
				} else {
					less_five = 1;
				}
				
				System.out.println(blank_flag);
				System.out.println(input_flag);
				System.out.println(trim_flag);
				System.out.println(less_five);
				// 모든 조건을 통과했을 때 실행
				if (blank_flag == 1 && input_flag == 1 && trim_flag == 1 && less_five == 1) {
					System.out.println("조건 통과");
					// 내 ID 받아오기, 식당이름 받아오기
					Protocol p = new Protocol(); 
					p.setCmd(39);
					try {
						main.out.writeObject(p);
						main.out.flush();		
						System.out.println("flush 완료");
						System.out.println("p 넘버는" + p.getCmd());
					} catch (Exception e2) {
						System.out.println(e2);
					}
					
					// 바로 앞에서 식당 이름 받아오기
					// 식당이름 받아오기 전에 실행되기 때문에, while문 돌려줘서 식당이름 받아올 때까지 기다리기!
					while (tf_forid.getText().length() == 0 || tf_fordiner.getText().length() == 0) {
						
					} 
//					System.out.println("아이디 첵" + tf_forid.getText()); 
//					System.out.println("식당이름 첵" + tf_fordiner.getText());
					
					String id = tf_forid.getText();
					String diner_name = tf_fordiner.getText();
					
					now_review_ta.setText("");
					store_score_tf.setText("");
					
					// ★ 프로토콜 2번 쓸 수 있음!!
//					Protocol p2 = new Protocol();
//					db_VO vo = new db_VO();
//					vo.setDiner_name(diner_name);
//					p2.setVo(vo);
//					p2.setCmd(40);
//					try {
//						main.out.writeObject(p2);
//						main.out.flush();		
//						System.out.println("2번 flush 완료");
//						System.out.println("p2 넘버는" + p2.getCmd());
//					} catch (Exception e2) {
//						System.out.println(e2);
//					}
					
					// 
//					Protocol p2 = new Protocol(); 
//					p2.setCmd(39);
				}
//				

			}
		});

	}
}