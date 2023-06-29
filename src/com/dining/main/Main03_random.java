package com.dining.main;

import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class Main03_random extends JPanel {

	CardLayout cardLayout;
	JPanel main_pg;
	int y1 = 387, y2 = 387, y3 = 387, y4 = 387;
	private JTextField score_1;
	String korean,japan,china,america;

	/**
	 * Create the application.
	 */
	public Main03_random(CardLayout cardLayout, JPanel main_pg) {
		this.cardLayout = cardLayout;
		this.main_pg = main_pg;

		setForeground(new Color(0, 0, 0));
		setBackground(new Color(255, 240, 245));
		setBounds(100, 100, 540, 960);
		setLayout(null);

		JLabel today = new JLabel("오늘의 추천Pick!");
		today.setOpaque(true);
		today.setHorizontalAlignment(SwingConstants.CENTER);
		today.setForeground(new Color(65, 105, 225));
		today.setFont(new Font("Sandoll 삼립호빵체 TTF Basic", Font.PLAIN, 50));
		today.setBackground(new Color(255, 240, 245));
		today.setBounds(74, 227, 381, 89);
		add(today);

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
		homeButton.setIcon(new ImageIcon(Main03_random.class.getResource("/image/homebutton_1.png")));
		homeButton.setBackground(new Color(255, 240, 245));
		homeButton.setBounds(327, 32, 77, 69);
		add(homeButton);

		JLabel label_img = new JLabel("");
		label_img.setIcon(new ImageIcon(Main03_random.class.getResource("/image/label.png")));
		label_img.setBounds(0, 0, 540, 330);
		add(label_img);

		RoundedButton_kjh_5 start_bt = new RoundedButton_kjh_5("게임 시작!");
		start_bt.setText("Start!");
		start_bt.setFont(new Font("Sandoll 삼립호빵체 TTF Outline", Font.PLAIN, 25));
		start_bt.setBorderPainted(false);
		start_bt.setBackground(new Color(65, 105, 225));
		start_bt.setBounds(200, 317, 139, 40);
		add(start_bt);

		JButton korean_bt_img = new JButton("");
		korean_bt_img.setBorderPainted(false);
		korean_bt_img.setBackground(new Color(255, 240, 245));
		korean_bt_img.setIcon(new ImageIcon(Main03_random.class.getResource("/image/korea.png")));
		korean_bt_img.setBounds(33, 387, 80, 80);
		add(korean_bt_img);

		JButton japan_bt_img = new JButton("");
		japan_bt_img.setIcon(new ImageIcon(Main03_random.class.getResource("/image/japan.png")));
		japan_bt_img.setBorderPainted(false);
		japan_bt_img.setBackground(new Color(255, 240, 245));
		japan_bt_img.setBounds(142, 387, 80, 80);
		add(japan_bt_img);

		JButton china_bt_img = new JButton("");
		china_bt_img.setIcon(new ImageIcon(Main03_random.class.getResource("/image/china.png")));
		china_bt_img.setBorderPainted(false);
		china_bt_img.setBackground(new Color(255, 240, 245));
		china_bt_img.setBounds(251, 387, 80, 80);
		add(china_bt_img);

		JButton america_bt_img = new JButton("");
		america_bt_img.setIcon(new ImageIcon(Main03_random.class.getResource("/image/america.png")));
		america_bt_img.setBorderPainted(false);
		america_bt_img.setBackground(new Color(255, 240, 245));
		america_bt_img.setBounds(359, 387, 80, 80);
		add(america_bt_img);

		JLabel tool_lb1 = new JLabel("");
		tool_lb1.setOpaque(true);
		tool_lb1.setBackground(new Color(65, 105, 225));
		tool_lb1.setBounds(16, 387, 5, 500);
		add(tool_lb1);

		JLabel tool_lb2 = new JLabel("");
		tool_lb2.setOpaque(true);
		tool_lb2.setBackground(new Color(65, 105, 225));
		tool_lb2.setBounds(125, 387, 5, 500);
		add(tool_lb2);

		JLabel tool_lb3 = new JLabel("");
		tool_lb3.setOpaque(true);
		tool_lb3.setBackground(new Color(65, 105, 225));
		tool_lb3.setBounds(234, 387, 5, 500);
		add(tool_lb3);

		JLabel tool_lb4 = new JLabel("");
		tool_lb4.setOpaque(true);
		tool_lb4.setBackground(new Color(65, 105, 225));
		tool_lb4.setBounds(343, 387, 5, 500);
		add(tool_lb4);

		JLabel tool_lb5 = new JLabel("");
		tool_lb5.setOpaque(true);
		tool_lb5.setBackground(new Color(65, 105, 225));
		tool_lb5.setBounds(450, 387, 5, 500);
		add(tool_lb5);

		JLabel tool_lb6 = new JLabel("");
		tool_lb6.setOpaque(true);
		tool_lb6.setBackground(new Color(65, 105, 225));
		tool_lb6.setBounds(453, 460, 57, 5);
		add(tool_lb6);

		JLabel tool_lb7 = new JLabel("0M");
		tool_lb7.setForeground(new Color(65, 105, 225));
		tool_lb7.setFont(new Font("Sandoll 삼립호빵체 TTF Basic", Font.BOLD, 20));
		tool_lb7.setBounds(477, 440, 51, 20);
		add(tool_lb7);

		JLabel tool_lb8 = new JLabel("");
		tool_lb8.setOpaque(true);
		tool_lb8.setBackground(new Color(65, 105, 225));
		tool_lb8.setBounds(44, 655, 57, 5);
		add(tool_lb8);

		JLabel tool_lb9 = new JLabel("");
		tool_lb9.setOpaque(true);
		tool_lb9.setBackground(new Color(65, 105, 225));
		tool_lb9.setBounds(152, 655, 57, 5);
		add(tool_lb9);

		JLabel tool_lb10 = new JLabel("");
		tool_lb10.setOpaque(true);
		tool_lb10.setBackground(new Color(65, 105, 225));
		tool_lb10.setBounds(262, 655, 57, 5);
		add(tool_lb10);

		JLabel tool_lb11 = new JLabel("");
		tool_lb11.setOpaque(true);
		tool_lb11.setBackground(new Color(65, 105, 225));
		tool_lb11.setBounds(374, 655, 57, 5);
		add(tool_lb11);

		JLabel tool_lb12 = new JLabel("");
		tool_lb12.setOpaque(true);
		tool_lb12.setBackground(new Color(65, 105, 225));
		tool_lb12.setBounds(44, 882, 57, 5);
		add(tool_lb12);

		JLabel tool_lb13 = new JLabel("");
		tool_lb13.setOpaque(true);
		tool_lb13.setBackground(new Color(65, 105, 225));
		tool_lb13.setBounds(152, 882, 57, 5);
		add(tool_lb13);

		JLabel tool_lb14 = new JLabel("");
		tool_lb14.setOpaque(true);
		tool_lb14.setBackground(new Color(65, 105, 225));
		tool_lb14.setBounds(262, 882, 57, 5);
		add(tool_lb14);

		JLabel tool_lb15 = new JLabel("");
		tool_lb15.setOpaque(true);
		tool_lb15.setBackground(new Color(65, 105, 225));
		tool_lb15.setBounds(374, 882, 57, 5);
		add(tool_lb15);

		JLabel tool_lb16 = new JLabel("100M");
		tool_lb16.setForeground(new Color(65, 105, 225));
		tool_lb16.setFont(new Font("Sandoll 삼립호빵체 TTF Basic", Font.BOLD, 20));
		tool_lb16.setBounds(459, 635, 51, 20);
		add(tool_lb16);

		JLabel tool_lb17 = new JLabel("");
		tool_lb17.setOpaque(true);
		tool_lb17.setBackground(new Color(65, 105, 225));
		tool_lb17.setBounds(453, 655, 57, 5);
		add(tool_lb17);

		JLabel goal_lb = new JLabel("Goal!");
		goal_lb.setForeground(new Color(65, 105, 225));
		goal_lb.setFont(new Font("Sandoll 삼립호빵체 TTF Basic", Font.BOLD, 20));
		goal_lb.setBounds(459, 863, 51, 20);
		add(goal_lb);

		JLabel goal_line = new JLabel("");
		goal_line.setOpaque(true);
		goal_line.setBackground(new Color(65, 105, 225));
		goal_line.setBounds(453, 882, 57, 5);
		add(goal_line);
		
		JLabel lb_1 = new JLabel("위 아이콘을 눌러 식당으로 이동해주세요");
		lb_1.setForeground(new Color(65, 105, 225));
		lb_1.setFont(new Font("Sandoll 삼립호빵체 TTF Basic", Font.BOLD, 17));
		lb_1.setBounds(174, 897, 294, 31);
		add(lb_1);
		
		JLabel lblNewLabel = new JLabel("↑↑↑↑↑");
		lblNewLabel.setFont(new Font("굴림", Font.BOLD, 17));
		lblNewLabel.setForeground(new Color(65, 105, 225));
		lblNewLabel.setBounds(99, 900, 77, 24);
		add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("1등 : ");
		lblNewLabel_1.setBounds(33, 935, 38, 15);
		add(lblNewLabel_1);
		
		score_1 = new JTextField();
		score_1.setBackground(new Color(255, 240, 245));
		score_1.setBounds(74, 932, 116, 21);
		add(score_1);
		score_1.setColumns(10);

		// 이미지를 누르면 main02_best1_korea 로 이동
		korean_bt_img.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				cardLayout.show(main_pg, "main02_best1_korea");
			}
		});
		// 이미지를 누르면 main02_best4_japan 로 이동
		japan_bt_img.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				cardLayout.show(main_pg, "main02_best4_japan");
			}
		});
		// 이미지를 누르면 main02_best3_china 로 이동
		china_bt_img.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				cardLayout.show(main_pg, "main02_best3_china");
			}
		});
		// 이미지를 누르면 main02_best2_american 로 이동
		america_bt_img.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				cardLayout.show(main_pg, "main02_best2_american");
			}
		});

		// Main00_Home으로 돌아간다
		homeButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
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
		// start 버튼을 누르면 일제히 음식들이 떨어진다.
		start_bt.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				score_1.setText(null);
				ArrayList<String> rank_list = new ArrayList<String>();
				 y1 = 387; y2 = 387; y3 = 387; y4 = 387;
				 
				new Thread(new Runnable() {
					@Override
					public void run() {
						while (y1 < 802) {
							korean_bt_img.setLocation(korean_bt_img.getX(), y1);
							y1 += (int) (Math.random() * 10);

							try {
								Thread.sleep(60);
							} catch (InterruptedException e2) {
								e2.printStackTrace();
							}
						}
						korean =Thread.currentThread().getName();
						rank_list.add("korean");
					}
				}, "korean").start();

				new Thread(new Runnable() {
					@Override
					public void run() {
						while (y2 < 802) {
							japan_bt_img.setLocation(japan_bt_img.getX(), y2);
							y2 += (int) (Math.random() * 10);
							try {
								Thread.sleep(60);
							} catch (InterruptedException e2) {
								e2.printStackTrace();
							}
						}
						japan =Thread.currentThread().getName();
						rank_list.add("japan");
					}
				}, "japan").start();

				new Thread(new Runnable() {
					@Override
					public void run() {
						while (y3 < 802) {
							china_bt_img.setLocation(china_bt_img.getX(), y3);
							y3 += (int) (Math.random() * 10);
							try {
								Thread.sleep(60);
							} catch (InterruptedException e2) {
								e2.printStackTrace();
							}
						}
						china =Thread.currentThread().getName();
						 rank_list.add("china");

						//System.out.println(Thread.currentThread());
					}
				}, "china").start();

				new Thread(new Runnable() {
					@Override
					public void run() {
						while (y4 < 802) {
							y4 += (int) (Math.random() * 10);
							america_bt_img.setLocation(america_bt_img.getX(), y4);
							try {
								Thread.sleep(60);
							} catch (InterruptedException e2) {
								e2.printStackTrace();
							}
						}
						 america =Thread.currentThread().getName();
						 rank_list.add("america");

						// score_1.setText(Thread.currentThread().getName());
//						 String[] arr = 
//						 for (int i = 0; i < arr.length; i++) {
//							 
//							 System.out.println(arr[i]);
//							 
//							 score_1.setText(arr[0]);
//						 }
					}
				}, "america").start();
				
				
				new Thread(new Runnable() {
					@Override
					public void run() {
						int success = 0;
						while (true) {
							try {
								Thread.sleep(1000);
								score_1.setText(rank_list.get(0));
								
//								// score_2 => 2등 음식 표시할 textfield
//								score_2.setText(rank_list.get(1));
//								// score_3 => 3등 음식 표시할 textfield
//								score_3.setText(rank_list.get(2));
//								// score_2 => 4등 음식 표시할 textfield
//								score_4.setText(rank_list.get(3));
								success = 1;
								if (success == 1 ) { 
									break;
								}
							} catch (Exception e3) {

							}
						}
					}
				}, "rank").start();
				
				
//				new Thread(new Runnable() {
//					int success = 0;
//					public void run() {
//						while (true) {
//							try {
//								Thread.sleep(3000);
//								score_1.setText(rank_list.get(0));
//								success = 1;
//								if (success == 1 ) { 
//									break;
//								}
//							} catch (Exception e3) {
//
//							}
//						}
//					};
//				});
				
			
			
//				for (String k : rank_list) {
//					System.out.println("하나씩 출력 " + k);
//				}
			}
		});
		
		
	}
}