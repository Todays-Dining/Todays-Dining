package com.dining.start;

import java.awt.CardLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.io.File;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.net.URL;
import java.util.List;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
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
import javax.swing.JTextField;	

public class Start_frame extends JFrame implements Runnable {
	JPanel main_pg ;
	CardLayout cardLayout;
	int member_num = 1 ;
	int break_num = 0;
	
	public URL path ;
	public URL path1 ;
	public URL path2 ;
	public URL path3;
	public URL path4 ;
	public URL path5 ;
	public URL path40 ;
	public db_VO vo;
	public Socket s;
	public ObjectOutputStream out;
	public ObjectInputStream in;
	
	Login01_page login01_page;
	Login03_Find_id login03_Find_id;
	Login04_Find_pw login04_Find_pw;
	Mypage01_main mypage01_main ;
	Login02_member_join login02_member_join;
	Main00_Home main00_Home;
	Main00_Map main00_Map;
	Main00_store_search main00_store_search;
	Main04_store3_review main04_store3_review;
	Mypage01_changePW mypage01_changePW;
	Main02_category_select main02_category_select;
	
	Main01_best1 main01_best1 ;
	Main01_best2 main01_best2 ;
	Main01_best3 main01_best3 ;
	Main01_best4 main01_best4 ;
	Main01_best5 main01_best5 ;
	
	Main02_best1_korea main02_best1_korea ;
	Main02_best2_american main02_best2_american ;
	Main02_best3_china main02_best3_china ;
	Main02_best4_japan main02_best4_japan ;
	Main02_best5_cafe main02_best5_cafe ;
	Main02_best6_etc main02_best6_etc ;
	
	Main02_store1_korea main02_store1_korea ;
	Main02_store2_american main02_store2_american ;
	Main02_store3_china main02_store3_china ;
	Main02_store4_japan main02_store4_japan ;
	Main02_store5_cafe main02_store5_cafe ;
	Main02_store6_etc main02_store6_etc;
	
	Main03_random main03_random ;
	String cb_ck;
	db_VO k ;
	Main04_store1_main main04_store1_main;
	Main04_store2_map main04_store2_map ;
	
	// path 상화코드 수정해야 함
	
	File imageFile;
	int initialize_flag = 0;
	int imgIns_flag = 0;
	String id_for_pwchk = "";

	public Start_frame() {
		UIManager ui = new UIManager(); // 전체적인 UI시스템 이미지, 색상, 폰트 변경
	    ui.put("Button.font", new FontUIResource(new Font ("Sandoll 삼립호빵체 TTF Basic", Font.BOLD, 16))); // 버튼의 폰트 변경
	    ui.put("Button.background", new Color(65, 105, 225)); // 버튼의 색상변경
	    ui.put("Button.focus", new Color(65, 105, 225)); // 버튼의 글자 테두리의 색상 변경
	    ui.put("Label.font", new FontUIResource(new Font ("Sandoll 삼립호빵체 TTF Basic", Font.BOLD, 16))); // o
	    ui.put("OptionPane.background",new Color(255, 240, 245)); // 다이얼로그의 배경색 변경
	    ui.put("Panel.background",new Color(255, 240, 245)); // 다이얼로그의 패널부분 배경색 변경
	    setResizable(false);
	    
		// 연결하기
		connected();
		main_pg = new JPanel();
//		main_pg.setResizable(false);
		cardLayout = new CardLayout();
		main_pg.setLayout(cardLayout);
		vo = new db_VO();
//		cardLayout.set
		
		// 각종패널들 가져오기 (★ 패널들은 지역변수로 딱 한번만 선언해야 함)
		// 마이페이지 
		mypage01_main = new Mypage01_main(cardLayout,main_pg,this);
		mypage01_changePW = new Mypage01_changePW(cardLayout,main_pg,this);
		Mypage02_mypick mypage02_mypick = new Mypage02_mypick(cardLayout,main_pg);
		// 로그인 화면단
		login01_page = new Login01_page(cardLayout,main_pg ,this);	
		Login02_member_join login02_member_join = new Login02_member_join(cardLayout,main_pg,this);
		login03_Find_id = new Login03_Find_id(cardLayout,main_pg,this);
		login04_Find_pw = new Login04_Find_pw(cardLayout,main_pg,this);
		// 메인 맵 화면
		main00_Map = new Main00_Map(cardLayout,main_pg, this);
		main00_Home = new Main00_Home(cardLayout,main_pg,this);
		// 검색시 이동할 화면
		main00_store_search = new Main00_store_search(cardLayout, main_pg, this);
		// 메인(주간best1등~5등)
		main01_best1 = new Main01_best1(cardLayout,main_pg,this);
		main01_best2 = new Main01_best2(cardLayout,main_pg,this);
		main01_best3 = new Main01_best3(cardLayout,main_pg,this);
		main01_best4 = new Main01_best4(cardLayout,main_pg,this);
		main01_best5 = new Main01_best5(cardLayout,main_pg,this);
		// 음식 카테고리
		main02_category_select = new Main02_category_select(cardLayout,main_pg,this);
		// 메인02_best(카테고리)
		main02_best1_korea = new Main02_best1_korea(cardLayout,main_pg,this);
		main02_best2_american = new Main02_best2_american(cardLayout,main_pg,this);
		main02_best3_china = new Main02_best3_china(cardLayout,main_pg,this);
		main02_best4_japan = new Main02_best4_japan(cardLayout,main_pg,this);
		main02_best5_cafe = new Main02_best5_cafe(cardLayout,main_pg,this);
		main02_best6_etc = new Main02_best6_etc(cardLayout,main_pg,this);
		// 메인02_store(카테고리)
		main02_store1_korea = new Main02_store1_korea(cardLayout,main_pg,this);
		main02_store2_american = new Main02_store2_american(cardLayout,main_pg,this);
		main02_store3_china = new Main02_store3_china(cardLayout,main_pg,this);
		main02_store4_japan = new Main02_store4_japan(cardLayout,main_pg,this);
		main02_store5_cafe = new Main02_store5_cafe(cardLayout,main_pg,this);
		main02_store6_etc = new Main02_store6_etc(cardLayout,main_pg,this);
		// 메인03_랜덤게임
		main03_random = new Main03_random(cardLayout,main_pg, this);
		// 메인04_메인스토어화면
		main04_store1_main = new Main04_store1_main(cardLayout,main_pg, this);
		main04_store2_map = new Main04_store2_map(cardLayout,main_pg);
		main04_store3_review = new Main04_store3_review(cardLayout,main_pg, this);
		
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
							// ★   로그인한 ID 정보를 mypage에 띄워주는 코드
							mypage01_main.id_tf.setText(p.getVo().getId());
							mypage01_main.name_tf.setText(p.getVo().getName());
							mypage01_main.birth_tf.setText((p.getVo().getBirthday()).substring
									(0,p.getVo().getBirthday().length()-9));
							//mypage01_main.birth_tf.setText(p.getVo().getBirthday());
							mypage01_main.email_tf.setText(p.getVo().getEmail());
							// 확인용 아이디 전용 때문에 존재 나중에 null 이부분은 삭제 바람
							
							 cb_ck = p.getVo().getPassword_search_q();
							
							if (cb_ck.contains("1")) {
								mypage01_main.pw_comboBox.setSelectedIndex(0);
							}
							if (cb_ck.contains("2")) {
								mypage01_main.pw_comboBox.setSelectedIndex(1);
							}
							if (cb_ck.contains("3")) {
								mypage01_main.pw_comboBox.setSelectedIndex(2);
							}
							if (cb_ck.contains("4")) {
								mypage01_main.pw_comboBox.setSelectedIndex(3);
							}
							if (cb_ck.contains("5")) {
								mypage01_main.pw_comboBox.setSelectedIndex(4);
							}
							mypage01_main.pwanser_tf.setText(p.getVo().getPassword_search_a());
							System.out.println("start_frame 로그인 성공!");
							
							login01_page.id_textField.setText("");
							login01_page.passwordField.setText("");
							
							cardLayout.show(main_pg,"main00_map");
//							
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
//                            try {
//                            	connected();
//							} catch (Exception e) {
//								System.out.println("재연결 실패");
//							}
                            // ★ 성공하고 나면 연결이 끊어져 있음. 재연결 시도
//                            JOptionPane.showMessageDialog(login02_member_join, "회원가입 성공");
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
					
					case 22: // 재훈  메인페이지에 가게 이름으로 정보 보내기
						try {
							path = Main04_store1_main.class.getResource("/diner_image/" + p.getVo().getDiner_name() + "_1.png");
							if (path != null) {
								main04_store1_main.store_bestfood_img.setIcon(new ImageIcon(path));
							}else {
								main04_store1_main.store_bestfood_img.setIcon
								(new ImageIcon(Main04_store1_main.class.getResource("/diner_image/이미지준비중.png")));
							}
							// 여기 재훈이 코드인데 오류나서 바꿨음! (근데 다시 원위치 시킴)
							main04_store1_main.store_name.setText( p.getStore_name());
//						 main04_store1_main.store_name.setText( p.getVo().getDiner_name());							 
							
							
							try {
								System.out.println("메인에서 스타 " + p.getVo().getAvg_star());								
								Double final_star = 0.0;
								final_star = Double.parseDouble(p.getVo().getAvg_star());
								System.out.println(final_star);
								main04_store1_main.avg_score_lb.setText(final_star.toString());
//								System.out.println("sf에서의 별점은" + p.getVo().getStar());
							} catch (Exception e) {
//								System.out.println("메인에서 스타 오류");
//								System.out.println(e);
							}
							//					if(p.getVo().getAvg_star())
							
							main04_store1_main.store_area_t.setText(p.getVo().getRegion());
							main04_store1_main.store_addr_t.setText(p.getVo().getAddress());
							main04_store1_main.store_bestfd_t.setText(p.getVo().getMenu());
							main04_store1_main.store_phone_t.setText(p.getVo().getPhone_number());
							main04_store1_main.store_open_t.setText(p.getVo().getOpening_hours());
							// 비밀의 넘버에 추가 (재훈)
							main04_store1_main.store_no.setText(p.getVo().getDiner_no());
//							main04_store1_main.avg_score_lb.setText(p.getVo().getStar());
							System.out.println(p.getVo().getOpening_hours());
//	                     main04_store1_main.avg_score_lb.setText(p.getVo().getStar());
							if(p.getVo().getParking_or_not().equals("1")) {
								// 주차가능
								main04_store1_main.paking_t.setText("주차 가능");
							}else {
								main04_store1_main.paking_t.setText("주차 불가능");
								
							}
							String storeNo =  p.getVo().getDiner_no();	
			                  // 좋아요 정보를 가져와서 좋아요 채킹해주기 	
			                  System.out.println(mypage01_main.id_tf.getText());	
			                  db_VO vo22_ck =  new db_VO();	
		                      	
			                  // ID가 없을 경우 결과 반환하도록 mapper 수정 필요함
		                      vo22_ck = db_DAO.getIdFavorite_ck(mypage01_main.id_tf.getText());	
		                      if(vo22_ck != null) {	
		                      	List<db_VO> like_list = db_DAO.getIdFavorite(mypage01_main.id_tf.getText());	
		                      	p.setList(like_list);	
		                      	p.setResult(1);	
		                      	System.out.println("널이 아이다.");
		                      	System.out.println("1 0번임");
		                      }else {	
		                      	p.setResult(0);
		                      	System.out.println("널이다.");
		                      	System.out.println("p 0번임");
		                      }
		                      // p.list 사이즈가 오류
		                      
				              if(p.getResult() == 0) {	
			                      	System.out.println("p 0번임 (조건2)");

				            	  main04_store1_main.love_jrbt.setIcon(new ImageIcon(Main04_store1_main.class.getResource("/image/whiteheart.png")));	
				                  main04_store1_main.love_jrbt.setSelected(false);	
				                  System.out.println("조건문 off1");	
				              }else {	
				            	  String diner_no22[] = new String[p.list.size()];	
									String favorite_ck22[] = new String[p.list.size()];	
									System.out.println("테스트 ");	
									for (int i = 0; i < p.list.size(); i++) {	
									    k = p.list.get(i);	
									    diner_no22[i] = k.getDiner_no();	
									    favorite_ck22[i] = k.getFavorite_ck();	
									    System.out.println(k.getDiner_no());	
									    System.out.println(k.getFavorite_ck());	
									}	
				            	  // 널이 아니다
				            	  for (int i = 0; i < p.list.size(); i++) {	
				            	      if (storeNo.equals(diner_no22[i]) && favorite_ck22[i].equals("on")) {	
				            	    	   System.out.println("조건문 on");	
				            	    	  main04_store1_main.love_jrbt.setSelected(true);	
				            	    	  main04_store1_main.love_jrbt.setIcon(new ImageIcon(Main04_store1_main.class.getResource("/image/heart.png")));	
				            	    	  	
		//			            	          System.out.println("Store name: " + storeName);	
		//			            	          System.out.println("Diner name: " + diner_name22[i]);	
		//			            	          System.out.println("Favorite check: " + favorite_ck22[i]);	
				            	      }else if(storeNo.equals(diner_no22[i]) && favorite_ck22[i].equals("off")){	
				            	    	  System.out.println("조건문 off2");	
				            	    	  main04_store1_main.love_jrbt.setSelected(false);	
				            	    	  main04_store1_main.love_jrbt.setIcon(new ImageIcon(Main04_store1_main.class.getResource("/image/whiteheart.png")));	
				            	      }else if(! storeNo.equals(diner_no22[i])){
				            	    	  System.out.println("조건문 off3");	
				            	    	  System.out.println("성공이다");
				            	    	  main04_store1_main.love_jrbt.setSelected(false);	
				            	    	  main04_store1_main.love_jrbt.setIcon(new ImageIcon(Main04_store1_main.class.getResource("/image/whiteheart.png")));
				            	      }
				            	  }	
				              } 
			                      
							
				
							cardLayout.show(main_pg,"main04_store1_main");	
							System.out.println("6번까지 된다");
							
						} catch (Exception e) {
							System.out.println("main 22에서 오류");
							System.out.println(e);
						}
						
	                     
//	                     	// 상우 별점표시 추가한 부분
//	                        while (main01_best1.review_star.length() == 0) {
//	                        	
//	                        }
//	                        System.out.println("sf에서 받은 별점!!" + main01_best1.review_star);
//	                        main04_store1_main.avg_score_lb.setText(main01_best1.review_star); 
////	                        System.out.println((p.getVo().getStar()));
//	                         
//	                        main04_store1_main.avg_score_lb.setText(p.getVo().getStar()); 
////	                        System.out.println("sf에서 받은 별점!!" + main01_best2.review_star);
////	                        main04_store1_main.avg_score_lb.setText(main01_best2.review_star); 

	                        break;
					case 23:  // 재훈 카테고리별 이미지와 가게이름 넣기   
						
						 // 이미지 파일이 존재하는지 확인
						
						path = Main04_store1_main.class.getResource("/diner_image/" + p.getVo().getDiner_name() + "_1.png");
						 
						
						 if (p.getVo().getFood_category().equals("한식")) {
							 if (path != null) {
								 main02_best1_korea.store_food_img.setIcon
								 (new ImageIcon(path));
							 }else {
								 main02_best1_korea.store_food_img.setIcon
								 (new ImageIcon(Main04_store1_main.class.getResource("/diner_image/이미지준비중.png")));
								 
							 }	 
							 
							 
							 main02_best1_korea.store_name_bt.setText(p.getVo().getDiner_name());
							 
							 cardLayout.show(main_pg, "main02_best1_korea");
						 }
						 if (p.getVo().getFood_category().equals("양식")) {
							 
							 if (path != null) {
								 main02_best2_american.store_food_img.setIcon
								 (new ImageIcon(path));
							 }else {
								 main02_best2_american.store_food_img.setIcon
								 (new ImageIcon(Main04_store1_main.class.getResource("/diner_image/이미지준비중.png")));
								 
							 }	 
//							
							
							 main02_best2_american.store_name_bt.setText(p.getVo().getDiner_name());
							 
							 cardLayout.show(main_pg, "main02_best2_american");
						 }
						 if (p.getVo().getFood_category().equals("중식")) {
							 if (path != null) {
								 main02_best3_china.store_food_img.setIcon
								 (new ImageIcon(path));
							 }else {
								 main02_best3_china.store_food_img.setIcon
								 (new ImageIcon(Main04_store1_main.class.getResource("/diner_image/이미지준비중.png")));
								 
							 }	 
							
							
							 main02_best3_china.store_name_bt.setText(p.getVo().getDiner_name());
							 
							 cardLayout.show(main_pg, "main02_best3_china");
						 }
						 if (p.getVo().getFood_category().equals("일식")) {
							 
							 if (path != null) {
								 main02_best4_japan.store_food_img.setIcon
								 (new ImageIcon(path));
							 }else {
								 main02_best4_japan.store_food_img.setIcon
								 (new ImageIcon(Main04_store1_main.class.getResource("/diner_image/이미지준비중.png")));
								 
							 }	 
							 
							
							 main02_best4_japan.store_name_bt.setText(p.getVo().getDiner_name());
							 
							 cardLayout.show(main_pg, "main02_best4_japan");
						 }
						 if (p.getVo().getFood_category().equals("카페")) {
							 
							 if (path != null) {
								 main02_best5_cafe.store_food_img.setIcon
								 (new ImageIcon(path));
							 }else {
								 main02_best5_cafe.store_food_img.setIcon
								 (new ImageIcon(Main04_store1_main.class.getResource("/diner_image/이미지준비중.png")));
								 
							 }	 
							
							 main02_best5_cafe.store_name_bt.setText(p.getVo().getDiner_name());
							
							 cardLayout.show(main_pg, "main02_best5_cafe");
						 }
						 if (p.getVo().getFood_category().equals("기타")) {
							 
							 if (path != null) {
								 main02_best6_etc.store_food_img.setIcon
								 (new ImageIcon(path));
							 }else {
								 main02_best6_etc.store_food_img.setIcon
								 (new ImageIcon(Main04_store1_main.class.getResource("/diner_image/이미지준비중.png")));
								 
							 }	 
							 
							
							 main02_best6_etc.store_name_bt.setText(p.getVo().getDiner_name());
							
							 cardLayout.show(main_pg, "main02_best6_etc");
						 }
						
						  
						  
						 break;
					case 24: // 재훈 카테고리별 테이블에 정보 보내기 
						if(p.getResult() == 1) {
						String diner_name[] = new String[p.list.size()];
						String menu[] = new String[p.list.size()];
						
						for (int i = 0; i < p.list.size(); i++) {
						    k = p.list.get(i);
						    diner_name[i] = k.getDiner_name();
						    menu[i] = k.getMenu();
						}
						
						
						if(k.getFood_category().equals("한식")) {
							for (int i = 0; i < p.list.size(); i++) {
								main02_store1_korea.table.setValueAt(diner_name[i],i,0) ;
								main02_store1_korea.table.setValueAt(menu[i],i,1) ;
							}	
						cardLayout.show(main_pg, "main02_store1_korea");
						}
						
						if(k.getFood_category().equals("양식")) {
							for (int i = 0; i < p.list.size(); i++) {
								main02_store2_american.table.setValueAt(diner_name[i],i,0) ;
								main02_store2_american.table.setValueAt(menu[i],i,1) ;
							}	
							cardLayout.show(main_pg, "main02_store2_american");
						}
						
						if(k.getFood_category().equals("중식")) {
							for (int i = 0; i < p.list.size(); i++) {
								main02_store3_china.table.setValueAt(diner_name[i],i,0) ;
								main02_store3_china.table.setValueAt(menu[i],i,1) ;
							}	
							cardLayout.show(main_pg, "main02_store3_china");
						}
						
						if(k.getFood_category().equals("일식")) {
							for (int i = 0; i < p.list.size(); i++) {
								main02_store4_japan.table.setValueAt(diner_name[i],i,0) ;
								main02_store4_japan.table.setValueAt(menu[i],i,1) ;
							}	
							cardLayout.show(main_pg, "main02_store4_japan");
						}
						
						if(k.getFood_category().equals("카페")) {
							for (int i = 0; i < p.list.size(); i++) {
								main02_store5_cafe.table.setValueAt(diner_name[i],i,0) ;
								main02_store5_cafe.table.setValueAt(menu[i],i,1) ;
							}	
							cardLayout.show(main_pg, "main02_store5_cafe");
						}
						
						if(k.getFood_category().equals("기타")) {
							for (int i = 0; i < p.list.size(); i++) {
								main02_store6_etc.table.setValueAt(diner_name[i],i,0) ;
								main02_store6_etc.table.setValueAt(menu[i],i,1) ;
							}	
							cardLayout.show(main_pg, "main02_store6_etc");
						}

						}
						break;
					
						// 기존에 좋아요를 눌러놨었는지 검사하는 코드?
					case 25:	// 좋아요 업데이트
						System.out.println("메인 25번 도전!");
						try {
							System.out.println("메인 25번 시작");
							db_VO vo25 =  new db_VO();	
							vo25.setFavorite_ck(p.getVo().getFavorite_ck()); 	
							vo25.setDiner_no(p.getVo().getDiner_no()) ;	
							vo25.setId(mypage01_main.id_tf.getText());	
							System.out.println("DAO시작");	
							db_DAO.changeFavorite(vo25);	
							p.setResult(db_DAO.changeFavorite(vo25));	
							if(p.getResult() == 1) {	
								System.out.println("좋아요 성공");	
							}else {	
								System.out.println("좋아요 실패");	
							}	
							
							} catch (Exception e) {
								System.out.println("메인 25번 오류");
							}
						break;
						
					case 26: // 아이디찾기	
						if (p.getResult() == 1) {	
							String[] options = { "확인" };	
							int result = JOptionPane.showOptionDialog(getParent(), "당신의 ID는 " + vo.getId() + "입니다.",	
									"정보", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE,	
									new ImageIcon(Login03_Find_id.class.getResource("/image/icon_mini.png")), options,	
									options[0]);	
						} else {	
							JOptionPane.showMessageDialog(getParent(), "입력된 정보가 일치하지 않습니다.", null,	
									JOptionPane.INFORMATION_MESSAGE,	
									new ImageIcon(Login03_Find_id.class.getResource("/image/icon_mini.png")));	
						}	
						break;	
					case 27: // 비밀번호 찾기	
						if (p.getResult() == 1) {	
							JOptionPane.showMessageDialog(getParent(), " 당신의 PASSWORD는 " + vo.getPassword() + "입니다.",	
									null, JOptionPane.INFORMATION_MESSAGE,	
									new ImageIcon(Login04_Find_pw.class.getResource("/image/icon_mini.png")));
							login04_Find_pw.id_textField.setText("");
							login04_Find_pw.add_textField.setText("");							
						} else {	
							JOptionPane.showMessageDialog(getParent(), "입력된 정보가 일치하지 않습니다.", null,	
									JOptionPane.INFORMATION_MESSAGE,	
									new ImageIcon(Login04_Find_pw.class.getResource("/image/icon_mini.png")));	
						}	
						break;
						
					case 28 : // 가게이미지 불러오기
						main04_store2_map.store_addr_tf.setText(p.getVo().getAddress());
						path = Main04_store1_main.class.getResource("/diner_image/" + p.getVo().getDiner_name() + "_2.png");
						 
						URL path6 = Main04_store1_main.class.getResource("/diner_image/" + p.getVo().getDiner_name() + "_3.png");
						 if (path != null) {
							 main04_store2_map.store_img_lb.setIcon
							 (new ImageIcon(path));
						}else {
							main04_store2_map.store_img_lb.setIcon
							(new ImageIcon(Main04_store1_main.class.getResource("/diner_image/이미지준비중.png")));
							
						}
						 if (path6 != null) {
							 main04_store2_map.storeaddr_img_lb.setIcon
							 (new ImageIcon(path6));
						 }else {
							 main04_store2_map.storeaddr_img_lb.setIcon
							 (new ImageIcon(Main04_store1_main.class.getResource("/diner_image/이미지준비중.png")));
							 
						 }
						
						
						cardLayout.show(main_pg, "main04_store2_map");
						break;
					case 36: // Id 받아오기
						mypage01_changePW.id_forchk = id_for_pwchk;
						break;
						
					case 37: // 해당 ID에 있는 pw(db에서 받아옴)와 비번변경 페이지에 입력된 pw가 일치하는지 확인
						String getpw = db_DAO.getPwforChk();
						mypage01_changePW.pw_forchk = getpw;
						System.out.println("37번 sf password" + getpw);
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
//						main04_store3_review.id_forchk = id_for_pwchk;
				    	id_for_pwchk = mypage01_main.id_tf.getText();
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
						
					case 40: // 상우 즐겨찾기에서 가게 이름으로 정보 보내기
						 path40 = Main04_store1_main.class.getResource("/diner_image/" + p.getVo().getDiner_name() + "_1.png");
						 
						 
						 if (path40 != null) {
							 main04_store1_main.store_bestfood_img.setIcon
							 (new ImageIcon(path40));
						}else {
							main04_store1_main.store_bestfood_img.setIcon
							(new ImageIcon(Main04_store1_main.class.getResource("/diner_image/이미지준비중.png")));
							
						}
						 
	                     main04_store1_main.store_name.setText( p.getStore_name());
	                     main04_store1_main.store_area_t.setText(p.getVo().getRegion());
	                     main04_store1_main.store_addr_t.setText(p.getVo().getAddress());
	                     main04_store1_main.store_bestfd_t.setText(p.getVo().getMenu());
	                     main04_store1_main.store_phone_t.setText(p.getVo().getPhone_number());
	                     main04_store1_main.store_open_t.setText(p.getVo().getOpening_hours());
	                     System.out.println(p.getVo().getOpening_hours());
//	                     main04_store1_main.avg_score_lb.setText(p.getVo().getStar());
	                  if(p.getVo().getParking_or_not().equals("1")) {
	                	  	// 주차가능
	                	  main04_store1_main.paking_t.setText("주차 가능");
	                  }else {
	                	  main04_store1_main.paking_t.setText("주차 불가능");
	                	  
	                  }
	                     
	                     cardLayout.show(main_pg, "main04_store1_main");
	                        break;
					// 안쓰는 케이스 지워야?
					
					case 51: //하영이 완성 재훈수정완료
						// 보내줘야하는게 없음?!
						// main04_store3_review.review1_id.setText(p.list);
						// 아래껀 받는거
						// 받아온 결과를 입력, 화면 바꿔주기 (마지막)
						//for(VO k : list) {}
						
						// Main04_store1_main 생성자
						if (p.getResult() == 1) {
						
						List<db_VO> list51 = p.getList();
						int length_arr = list51.size();
						String id[] = new String[length_arr];
						String review_content[] = new String[length_arr];
						String review_time[] = new String[length_arr];
							
						for (int i = 0; i < length_arr; i++) {
							db_VO k = p.list.get(i);
							id[i] = k.getId();
							review_content[i] = k.getReview_content();
							review_time[i] = k.getReview_time();
							System.out.println("id : " + k.getId()+"나왔다");
							System.out.println("리뷰 : " +k.getReview_content()+"나왔다");
							System.out.println("리뷰 시간 : " + k.getReview_time()+"나왔다");
						}
						
						if (length_arr >= 1) {
							main04_store3_review.review1_id.setText(id[0]);
							main04_store3_review.review1_ta.setText(review_content[0]);
							main04_store3_review.review1_ta.setText(review_content[0]);
							main04_store3_review.date_1.setText(review_time[0]);
							if (length_arr >= 2) {
								main04_store3_review.review2_id.setText(id[1]);
								main04_store3_review.review2_ta.setText(review_content[1]);
								main04_store3_review.date_2.setText(review_time[1]);
								if (length_arr >= 3) {
									main04_store3_review.review3_id.setText(id[2]);
									main04_store3_review.review3_ta.setText(review_content[2]);	
									main04_store3_review.date_3.setText(review_time[2]);

								} 
							}
						}
						
						
						cardLayout.show(main_pg,"main04_store3_review");
				 		
						}else  {
							
							cardLayout.show(main_pg,"main04_store3_review");
						}
						
						break;
						
					case 77: //주간베스트 	
						p.getList();	
						String arr[] = new String[5];	
							
						for (int i = 0; i <arr.length; i++) {	
								
								db_VO k = p.list.get(i);	
								arr[i] = k.getDiner_name();	
									
								
						}	
						 
						path1 = Main04_store1_main.class.getResource("/diner_image/" + arr[0] + "_1.png");	
						 if (path1 != null) {
								main01_best1.store_food_image.setIcon(new ImageIcon(path1));	
								main01_best1.store_bt.setText(arr[0]);	
						 }else {
							main01_best1.store_food_image.setIcon
							(new ImageIcon(Main04_store1_main.class.getResource("/diner_image/이미지준비중.png")));
							
						}
						 
						 path2 = Main04_store1_main.class.getResource("/diner_image/" + arr[1] + "_1.png");	
						 if (path2 != null) {
								main01_best2.store_food_image2.setIcon(new ImageIcon(path2));	
								main01_best2.store_bt.setText(arr[1]);	 
						 }else {
							 main01_best2.store_food_image2.setIcon
							 (new ImageIcon(Main04_store1_main.class.getResource("/diner_image/이미지준비중.png")));
							 
						 }
						 
						 path3 = Main04_store1_main.class.getResource("/diner_image/" + arr[2] + "_1.png");	
						 if (path3 != null) {
								main01_best3.store_food_image3.setIcon(new ImageIcon(path3));	
								main01_best3.store_bt.setText(arr[2]);	
							 
						 }else {
							 main01_best3.store_food_image3.setIcon
							 (new ImageIcon(Main04_store1_main.class.getResource("/diner_image/이미지준비중.png")));
							 
						 }
						 
						 path4 = Main04_store1_main.class.getResource("/diner_image/" + arr[3] + "_1.png");	
						 if (path4 != null) {
								main01_best4.store_food_image4.setIcon(new ImageIcon(path4));	
								main01_best4.store_bt.setText(arr[3]);	
							 
						 }else {
							 main01_best4.store_food_image4.setIcon
							 (new ImageIcon(Main04_store1_main.class.getResource("/diner_image/이미지준비중.png")));
							 
						 }
						 
						 path5 = Main04_store1_main.class.getResource("/diner_image/" + arr[4] + "_1.png");	
						 if (path5 != null) {
							 main01_best5.store_food_image5.setIcon(new ImageIcon(path5));	
							 main01_best5.store_bt.setText(arr[4]);	
							 
						 }else {
							 main01_best5.store_food_image5.setIcon
							 (new ImageIcon(Main04_store1_main.class.getResource("/diner_image/이미지준비중.png")));
							 
						 }
						
						cardLayout.show(main_pg,"main00_Home");	
							
							
						break;
						// 안쓰는 케이스 지워야?
						
					}
				}
			} catch (Exception e) {
				System.out.println("best1번 sf에서 실패");
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