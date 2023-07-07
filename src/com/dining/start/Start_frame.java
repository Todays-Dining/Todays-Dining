package com.dining.start;

import java.awt.CardLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.util.List;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.plaf.FontUIResource;

import com.dining.login.Login01_page;
import com.dining.login.Login02_member_join;
import com.dining.login.Login03_Find_id;
import com.dining.login.Login04_Find_pw;
import com.dining.main.Main00_Home;
import com.dining.main.Main00_Map;
import com.dining.main.Main00_store_search;
import com.dining.main.Main01_best1;
import com.dining.main.Main01_best2;
import com.dining.main.Main01_best3;
import com.dining.main.Main01_best4;
import com.dining.main.Main01_best5;
import com.dining.main.Main02_best1_korea;
import com.dining.main.Main02_best2_american;
import com.dining.main.Main02_best3_china;
import com.dining.main.Main02_best4_japan;
import com.dining.main.Main02_best5_cafe;
import com.dining.main.Main02_best6_etc;
import com.dining.main.Main02_category_select;
import com.dining.main.Main02_store1_korea;
import com.dining.main.Main02_store2_american;
import com.dining.main.Main02_store3_china;
import com.dining.main.Main02_store4_japan;
import com.dining.main.Main02_store5_cafe;
import com.dining.main.Main02_store6_etc;
import com.dining.main.Main03_random;
import com.dining.main.Main04_store1_main;
import com.dining.main.Main04_store2_map;
import com.dining.main.Main04_store3_review;
import com.dining.mypage.Mypage01_changePW;
import com.dining.mypage.Mypage01_main;
import com.dining.mypage.Mypage02_mypick;

public class Start_frame extends JFrame implements Runnable {
	JPanel main_pg ;
	CardLayout cardLayout;
	int member_num = 1 ;
	int break_num = 0;
	
	public String path = "";
	public db_VO vo;
	public Socket s;
	public ObjectOutputStream out;
	public ObjectInputStream in;
	Login02_member_join login02_member_join;
	Main00_Home main00_Home;
	Main00_Map main00_Map;
	Main00_store_search main00_store_search;
	Main04_store1_main main04_store1_main;
	Main04_store3_review main04_store3_review;
	Main02_category_select main02_category_select;
	Mypage01_changePW mypage01_changePW;
	Login01_page login01_page;
	
	int initialize_flag = 0;
	int imgIns_flag = 0;
	String id_for_pwchk;
	public Start_frame() {
		UIManager ui = new UIManager(); // 전체적인 UI시스템 이미지, 색상, 폰트 변경
	    ui.put("Button.font", new FontUIResource(new Font ("Sandoll 삼립호빵체 TTF Basic", Font.BOLD, 16))); // 버튼의 폰트 변경
	    ui.put("Button.background", new Color(65, 105, 225)); // 버튼의 색상변경
	    ui.put("Button.focus", new Color(65, 105, 225)); // 버튼의 글자 테두리의 색상 변경
	    ui.put("Label.font", new FontUIResource(new Font ("Sandoll 삼립호빵체 TTF Basic", Font.BOLD, 16))); // o
	    ui.put("OptionPane.background",new Color(255, 240, 245)); // 다이얼로그의 배경색 변경
	    ui.put("Panel.background",new Color(255, 240, 245)); // 다이얼로그의 패널부분 배경색 변경
	    
		// 연결하기
		connected();
		main_pg = new JPanel(); 
		cardLayout = new CardLayout();
		main_pg.setLayout(cardLayout);
		vo = new db_VO();
		// 각종패널들 가져오기 (★ 패널들은 지역변수로 딱 한번만 선언해야 함)
		// 마이페이지 
		Mypage01_main mypage01_main = new Mypage01_main(cardLayout,main_pg,this);
		mypage01_changePW = new Mypage01_changePW(cardLayout,main_pg,this);
		Mypage02_mypick mypage02_mypick = new Mypage02_mypick(cardLayout,main_pg);
		// 로그인 화면단
		login01_page = new Login01_page(cardLayout,main_pg ,this);	
		Login02_member_join login02_member_join = new Login02_member_join(cardLayout,main_pg,this);
		Login03_Find_id login03_Find_id = new Login03_Find_id(cardLayout,main_pg);
		Login04_Find_pw login04_Find_pw = new Login04_Find_pw(cardLayout,main_pg);
		// 메인 맵 화면
		main00_Map = new Main00_Map(cardLayout,main_pg, this);
		main00_Home = new Main00_Home(cardLayout,main_pg,this);
		// 검색시 이동할 화면
		main00_store_search = new Main00_store_search(cardLayout, main_pg, this);
		// 메인(주간best1등~5등)
		Main01_best1 main01_best1 = new Main01_best1(cardLayout,main_pg,this);
		Main01_best2 main01_best2 = new Main01_best2(cardLayout,main_pg);
		Main01_best3 main01_best3 = new Main01_best3(cardLayout,main_pg);
		Main01_best4 main01_best4 = new Main01_best4(cardLayout,main_pg);
		Main01_best5 main01_best5 = new Main01_best5(cardLayout,main_pg);
		// 음식 카테고리
		 main02_category_select = new Main02_category_select(cardLayout,main_pg);
		// 메인02_best(카테고리)
		Main02_best1_korea main02_best1_korea = new Main02_best1_korea(cardLayout,main_pg);
		Main02_best2_american main02_best2_american = new Main02_best2_american(cardLayout,main_pg);
		Main02_best3_china main02_best3_china = new Main02_best3_china(cardLayout,main_pg);
		Main02_best4_japan main02_best4_japan = new Main02_best4_japan(cardLayout,main_pg);
		Main02_best5_cafe main02_best5_cafe = new Main02_best5_cafe(cardLayout,main_pg);
		Main02_best6_etc main02_best6_etc = new Main02_best6_etc(cardLayout,main_pg);
		// 메인02_store(카테고리)
		Main02_store1_korea main02_store1_korea = new Main02_store1_korea(cardLayout,main_pg);
		Main02_store2_american main02_store2_american = new Main02_store2_american(cardLayout,main_pg);
		Main02_store3_china main02_store3_china = new Main02_store3_china(cardLayout,main_pg);
		Main02_store4_japan main02_store4_japan = new Main02_store4_japan(cardLayout,main_pg);
		Main02_store5_cafe main02_store5_cafe = new Main02_store5_cafe(cardLayout,main_pg);
		Main02_store6_etc main02_store6_etc = new Main02_store6_etc(cardLayout,main_pg);
		// 메인03_랜덤게임
		Main03_random main03_random = new Main03_random(cardLayout,main_pg);
		// 메인04_메인스토어화면
		main04_store1_main = new Main04_store1_main(cardLayout,main_pg,this);
		Main04_store2_map main04_store2_map = new Main04_store2_map(cardLayout,main_pg);
		main04_store3_review = new Main04_store3_review(cardLayout,main_pg,this);
		
		// 로그인
		main_pg.add("login01_page",login01_page);
		main_pg.add("login02_member_join",login02_member_join);
		main_pg.add("login03_Find_id",login03_Find_id);
		main_pg.add("login04_Find_pw",login04_Find_pw);
		// 마이페이지 
		main_pg.add("mypage01_main",mypage01_main);
		main_pg.add("mypage01_changePW",mypage01_changePW);
		main_pg.add("mypage02_mypick",mypage02_mypick);
		// 메인 맵
		main_pg.add("main00_map",main00_Map);
		// 홈화면 
		main_pg.add("main00_Home",main00_Home);
		// 검색시 이동할 화면
		main_pg.add("main00_store_search",main00_store_search);
		// 메인(주간best1등~5등)
		main_pg.add("main01_best1",main01_best1);
		main_pg.add("main01_best2",main01_best2);
		main_pg.add("main01_best3",main01_best3);
		main_pg.add("main01_best4",main01_best4);
		main_pg.add("main01_best5",main01_best5);
		// 카테고리 화면
		main_pg.add("main02_category_select",main02_category_select);
		// 메인02_best(카테고리)
		main_pg.add("main02_best1_korea",main02_best1_korea);
		main_pg.add("main02_best2_american",main02_best2_american);
		main_pg.add("main02_best3_china",main02_best3_china);
		main_pg.add("main02_best4_japan",main02_best4_japan);
		main_pg.add("main02_best5_cafe",main02_best5_cafe);
		main_pg.add("main02_best6_etc",main02_best6_etc);
		// 메인02_store(카테고리)
		main_pg.add("main02_store1_korea",main02_store1_korea);
		main_pg.add("main02_store2_american",main02_store2_american);
		main_pg.add("main02_store3_china",main02_store3_china);
		main_pg.add("main02_store4_japan",main02_store4_japan);
		main_pg.add("main02_store5_cafe",main02_store5_cafe);
		main_pg.add("main02_store6_etc",main02_store6_etc);
		// 메인03_랜덤게임
		main_pg.add("main03_random",main03_random);
		// 메인스토어 화면
		main_pg.add("main04_store1_main",main04_store1_main);
		main_pg.add("main04_store2_map",main04_store2_map);
		main_pg.add("main04_store3_review",main04_store3_review);
		
		
		add(main_pg);
	
		setSize(555, 1000);
			
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
			
		setVisible(true);

		
		
		// ★   로그인한 ID 정보를 mypage에 띄워주는 코드 (프로토콜 안에 넣는 것으로 수정해야 함!!)
		new Thread(new Runnable() {
			@Override
			public void run() {
				while (true) {
					// mypage의 모든 정보가 공란인 동안은 계속해서 getText로 값을 넣어준다. 
					while (mypage01_main.id_tf.getText().length() == 0 && mypage01_main.pw_tf.getText().length() == 0
							&& mypage01_main.name_tf.getText().length() == 0 && mypage01_main.birth_tf.getText().length() == 0
							&& mypage01_main.email_tf.getText().length() == 0 && mypage01_main.pwanser_tf.getText().length() == 0
							)
					try {
						String pw_show = vo.getPassword();
						String id_show = vo.getId();
						id_for_pwchk = vo.getId();
						String name_show = vo.getName();
						String birth_show = vo.getBirthday();
						birth_show = birth_show.substring(0, birth_show.length()-9);
						String email_show = vo.getEmail();
						String panswer_show = vo.getPassword_search_a();
						Thread.sleep(500);
						mypage01_changePW.id_forchk = vo.getId();
						mypage01_changePW.pw_forchk = vo.getPassword();						
						mypage01_main.id_tf.setText(id_show);
						mypage01_main.pw_tf.setText(pw_show);
						mypage01_main.name_tf.setText(name_show);
						mypage01_main.birth_tf.setText(birth_show);
						mypage01_main.email_tf.setText(email_show);
						mypage01_main.pwanser_tf.setText(panswer_show);
					} catch (Exception e3) {

					}
				}
			}
		}, "mypage").start();

	} // 생성자 끝

	// 접속
	public void connected() {
		try {
			s = new Socket("192.168.0.69", 7778);
			out = (new ObjectOutputStream(s.getOutputStream()));
			in = new ObjectInputStream(s.getInputStream());
			new Thread(this).start();
		} catch (Exception e) {
			System.out.println(e);
		}
	}
	
	public void run() {
		esc:while(true) {
			try {
				Object obj = in.readObject();
				if(obj != null) {
					Protocol p = (Protocol)obj;
					vo = p.getVo();
					switch(p.getCmd()) {
					case 0:	// 종료
						break esc;
						
					case 1: // 로그인
						if(p.getResult() == 1) {
							System.out.println("start_frame 로그인 성공!");
							cardLayout.show(main_pg,"main00_map");
							initialize_flag = 1;
							// ID, 비번 공란으로 변경
							login01_page.id_textField.setText("");
							login01_page.passwordField.setText("");
						}else {
//							System.out.println("로그인실패");
							JOptionPane.showMessageDialog(getParent(), "ID 및 패스워드를 확인해주세요.", null, JOptionPane.INFORMATION_MESSAGE,
							 new ImageIcon(Login01_page.class.getResource("/image/icon_mini.png")));
						}
						break;
						
					case 2: // ★ 회원가입 (김상우, 이상화, 윤성훈)
                        if(p.getResult()>0) {
//                            System.out.println("mainframe도착");
                            System.out.println(p.getResult());
                            // 메인으로 돌아오고 나서 성공이 뜸
                            JOptionPane.showMessageDialog(login02_member_join, "회원가입성공.", null, JOptionPane.INFORMATION_MESSAGE,
                                    new ImageIcon(Login02_member_join.class.getResource("/image/icon_mini.png")));
                            cardLayout.show(main_pg,"login01_page");
                        }else {
                            JOptionPane.showMessageDialog(login02_member_join, "회원가입실패", null, JOptionPane.INFORMATION_MESSAGE,
                                    new ImageIcon(Login02_member_join.class.getResource("/image/icon_mini.png")));
                        }
						break;
						// 재훈 검색기능 
					case 21:  // 홈화면에서 검색기능
						if(p.getResult() == 1) {
						int length_arr;
						length_arr = p.list.size();
						String diner_name[] = new String[length_arr];
						String menu[] = new String[length_arr];
						for (int i = 0; i < length_arr; i++) {
						    db_VO k = p.list.get(i);
						    diner_name[i] = k.getDiner_name();
						    menu[i] = k.getMenu();
						}
						for (int i = 0; i < length_arr; i++) {
							main00_store_search.table.setValueAt(diner_name[i],i,0) ;
							main00_store_search.table.setValueAt(menu[i],i,1) ;
						}	
						
						cardLayout.show(main_pg,"main00_store_search");
						}else {
							JOptionPane.showMessageDialog(getParent(), "검색결과가 존재하지 않습니다.", null, JOptionPane.INFORMATION_MESSAGE,
									 new ImageIcon(Main00_Home.class.getResource("/image/icon_mini.png")));
						}
						break;
						
					case 22: // 재훈 가게 이름 보내기
	                     main04_store1_main.store_name.setText( p.getStore_name());
	                     main04_store1_main.store_area_t.setText(p.getVo().getRegion());
	                     main04_store1_main.store_addr_t.setText(p.getVo().getAddress());
	                     main04_store1_main.store_bestfd_t.setText(p.getVo().getMenu());
	                     main04_store1_main.store_phone_t.setText(p.getVo().getPhone_number());
	                     main04_store1_main.store_open_t.setText(p.getVo().getOpening_hour());
//	                     main04_store1_main.avg_score_lb.setText(p.getVo().getStar());
	                  if(p.getVo().getParking_or_not().equals("1")) {
	                	  	// 주차가능
	                	  main04_store1_main.paking_t.setText("주차 가능");
	                  }else {
	                	  main04_store1_main.paking_t.setText("주차 불가능");
	                  }
	                     cardLayout.show(main_pg, "main04_store1_main");
                       break;
						
//					case 31: // ★ best식당 표시해주기 (김상우)
////						System.out.println("SF 31번 실행중");
////						System.out.println("설정된 cmd" + p.getCmd());
////						System.out.println("sf에서 31번 cmd 작동중!!");
//						if(p.getVo() != null) {
////						List<db_VO> vo_list = p.getList();
//						vo = p.getVo();
//						imgIns_flag = 1;
//						out.writeObject(p);
//						out.flush();	
//						} else {
////							System.out.println("31번 작동 안해 (빈값)");
//						}
//						break;
						
					case 36: // Id 받아오기
						mypage01_changePW.id_forchk = id_for_pwchk;
						break;
						
					case 37: // 해당 ID에 있는 pw와 비번변경 페이지에 입력된 pw가 일치하는지 확인
						String getpw = db_DAO.getPwforChk();
						mypage01_changePW.pw_forchk = getpw;
						System.out.println("sf 37번 실행");
						break;
						
					case 38: // 비밀번호 변경 (김상우)
						System.out.println("sf cmd 38 실행중");
						if(p.getResult() == 1) {
							JOptionPane.showMessageDialog(getParent(), "비밀번호 변경 성공!", null, JOptionPane.INFORMATION_MESSAGE,
									 new ImageIcon(Main00_Home.class.getResource("/image/icon_mini.png")));
							mypage01_changePW.old_pw_tf.setText("");
							mypage01_changePW.new_pw_tf.setText("");
							mypage01_changePW.new_pw_chk_tf.setText("");
						} else {
							JOptionPane.showMessageDialog(getParent(), "비밀번호 변경 실패!", null, JOptionPane.INFORMATION_MESSAGE,
									 new ImageIcon(Main00_Home.class.getResource("/image/icon_mini.png")));
						}
						break;
						
					case 39: // 39번 상우 리뷰 및 별점 작성
						// ID, 식당명 넘겨주기
						System.out.println("sf 39번 작동중");
						String diner_name2 = main04_store1_main.store_name.getText();
				    	String diner_no = db_DAO.findDiner(diner_name2);
						main04_store3_review.id_forchk = id_for_pwchk;
						System.out.println("sf의 아이디" + id_for_pwchk);
						main04_store3_review.tf_forid.setText(id_for_pwchk);
						main04_store3_review.tf_fordiner.setText(diner_name2);
//						main04_store3_review.tf_fordiner.setText(id_for_pwchk);
						String score = main04_store3_review.store_score_tf.getText();
						String content = main04_store3_review.now_review_ta.getText();
						db_VO vo = new db_VO();
						System.out.println(id_for_pwchk);
						vo.setId(id_for_pwchk);
						
						vo.setDiner_no(diner_no);
						vo.setReview_content2(content);
//						vo.setDiner_name(diner_name2);
						vo.setReview_score(score);
						
						p.setVo(vo);
						int result = db_DAO.insReview(vo);
//						out.writeObject(p);
//	                    out.flush();
	                    if (result == 1) {
	                    	JOptionPane.showMessageDialog(getParent(), "리뷰 작성 성공!", null, JOptionPane.INFORMATION_MESSAGE,
									 new ImageIcon(Main00_Home.class.getResource("/image/icon_mini.png")));
	                    }else if (result == 0) {
	                    	JOptionPane.showMessageDialog(getParent(), "리뷰 작성 실패!", null, JOptionPane.INFORMATION_MESSAGE,
									 new ImageIcon(Main00_Home.class.getResource("/image/icon_mini.png")));
	                    }
//						// 평점 텍스트필드
//						public JTextField store_score_tf;
//						// 리뷰 텍스트필드
//						public JTextField now_review_ta;
						break;
					case 40: // 상우 식당명에 해당하는 식당번호 받아오기
						
						break;
						
					case 51:
						System.out.println("sf 51번 가동");
						List<db_VO> list51 = p.getList();
						int length_arr = list51.size();
						String id[] = new String[length_arr];
						String review_content[] = new String[length_arr];
						for (int i = 0; i < length_arr; i++) {
							db_VO k = p.list.get(i);
							id[i] = k.getId();
							review_content[i] = k.getReview_content();
							System.out.println("id" + k.getId()+"나왔다");
							System.out.println("리뷰" +k.getReview_content()+"나왔다");
						}
						main04_store3_review.review1_id.setText(id[0]);
						main04_store3_review.review2_id.setText(id[1]);
						main04_store3_review.review3_id.setText(id[2]);
						main04_store3_review.review1_ta.setText(review_content[0]);
						main04_store3_review.review2_ta.setText(review_content[1]);
						main04_store3_review.review3_ta.setText(review_content[2]);
						cardLayout.show(main_pg, "main04_store3_review");
						break;
					}
				}
			} catch (Exception e) {
				System.out.println("sf case문 오류 실패");
				System.out.println(e);
			} 
		}// while문 끝
		closed();		
	}
	
	public int getMember_num() {
		return member_num;
	}
	public void setMember_num(int member_num) {
		this.member_num = member_num;
	}	
	
	// 끝내기 
		public void closed() {
			try {
				out.close();
				in.close();
				System.exit(0);
			} catch (Exception e) {
				System.out.println("Start frame closed 에러");
				System.out.println(e);
			}
		}
		
		public static void main(String[] args) {
			EventQueue.invokeLater(new Runnable() {
				public void run() {
					try {
						new Start_frame();
					} catch (Exception e) {
						System.out.println("시작페이지오류");
						System.out.println(e);
					}
				}
			});
		}
	}