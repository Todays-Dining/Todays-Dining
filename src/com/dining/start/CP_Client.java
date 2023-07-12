package com.dining.start;

import javax.swing.UIManager;	
import javax.swing.plaf.FontUIResource;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.util.List;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import java.awt.Component;
import java.awt.*;

import com.dining.admin.Admin02_Member;	
import com.dining.admin.Admin03_rest;	
import com.dining.admin.Admin04_review;
import com.dining.login.Login01_page;

// implements Runnble 하면, DB_Server에서 .start()가 작동 안됨!
public class CP_Client extends Thread {
	Socket s;
	DB_Server server;
	ObjectInputStream in;
	ObjectOutputStream out;
	List<db_VO> list = null;
	Admin02_Member member;	
	Admin04_review review;	
	int result = 0;

	public CP_Client(Socket s, DB_Server server) {
		UIManager ui = new UIManager(); // 전체적인 UI시스템 이미지, 색상, 폰트 변경	
	    ui.put("Button.font", new FontUIResource(new Font ("Sandoll 삼립호빵체 TTF Basic", Font.BOLD, 16))); // 버튼의 폰트 변경	
	    ui.put("Button.background", new Color(65, 105, 225)); // 버튼의 색상변경	
	    ui.put("Button.focus", new Color(65, 105, 225)); // 버튼의 글자 테두리의 색상 변경	
	    ui.put("Label.font", new FontUIResource(new Font ("Sandoll 삼립호빵체 TTF Basic", Font.BOLD, 16))); // o	
	    ui.put("OptionPane.background",new Color(255, 240, 245)); // 다이얼로그의 배경색 변경	
	    ui.put("Panel.background",new Color(255, 240, 245)); // 다이얼로그의 패널부분 배경색 변경
		this.s = s;
		this.server = server;
		try {
			// 객체 직렬화, 역 직렬화.
			in = new ObjectInputStream(s.getInputStream());
			out = new ObjectOutputStream(s.getOutputStream());
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	public void run() {
		esc: while (true) {
			try {
				Object obj = in.readObject();
				if (obj != null) {
					Protocol p = (Protocol) obj;
					switch (p.getCmd()) {
					case 0: // 종료
						break esc;
					case 1: // 로그인
//						System.out.println("cp_client 로그인 성공");
						db_VO vo = new db_VO();
						vo = p.getVo();
						vo = db_DAO.login(vo);
						p.setVo(vo);
						if(vo != null) {
							System.out.println("cpc 로그인 성공");
							p.setResult(1);
						}else {
							System.out.println("cpc 로그인 실패");
							p.setResult(0);
						}
						out.writeObject(p);
						out.flush();
//						System.out.println("cpc 전체 종료");
						break;
				    case 2: // 회원가입
                        db_VO vo2 = new db_VO();
                        vo2 = p.getVo();
                        try {
                        	p.setResult(db_DAO.insInfoMember(vo2));
                        	out.writeObject(p);
                        	out.flush();
                        	System.out.println("cp_client 회원가입 성공");
						} catch (Exception e) {
							// 생년월일 양식 이상하게 입력했을 때 나는 오류 잡아야 함!
//							System.out.println("회원가입 오류");
							System.out.println(e);
							// 아니면 메시지 띄워야 함
							
							// java.net.SocketException: 현재 연결은 사용자의 호스트 시스템의 소프트웨어의 의해 중단되었습니다
							// 회원가입 이후에 다시 접속 안됨 (위 메시지 때문에)
						}
                        break;	
                    	// 재훈 검색기능 
					case 21:
						db_VO vo21_ck =  new db_VO();
						vo21_ck = p.getVo();
						// 검색이 가능한 건지 확인후 
						vo21_ck = db_DAO.getSearch_Ck(vo21_ck);
						if(vo21_ck != null) {
							// null값이 아닌것 다시 검색해서 결과 가져오기
							List<db_VO> store_list ; 
							store_list = db_DAO.getSearch(p.getSearch());
							p.setList(store_list);
							p.setResult(1);
						}else {
							p.setResult(0);
						}
							
						out.writeObject(p);
						out.flush();
						break;
					case 22:// 재훈 가게 이름 다른 페이지 보내고 db정보 받아오기
						String avg_star = "";
						try {
							db_VO vo88 = new db_VO();
							// p.getVO 부분 때문에 문제? 
							vo88 = p.getVo();
							vo88 = db_DAO.getStoreStar(vo88);
							try {
								avg_star = vo88.getAvg_star();
							} catch (Exception e) {
								// TODO: handle exception
							}
							
							db_VO vo22 =  new db_VO();
							vo22 = db_DAO.getStoreInfo(p.getVo());
							try {
								vo22.setAvg_star(avg_star);
								
							} catch (Exception e) {
							}
							
							p.setVo(vo22);
							// vo를 바꿔치기
							out.writeObject(p);
							out.flush();
						} catch (Exception e) {
							System.out.println("cpc 22번에서 오류");
							System.out.println(e);
						}
                        break;	
					case 23: // 재훈 카테고리 정보 가져오기 
						db_VO vo23 =  new db_VO();
						 vo23 = db_DAO.getCategory(p.getVo());
						 p.setVo(vo23);
						 out.writeObject(p);
	                     out.flush();
						 
						 break;
					case 24: // 재훈 카테고리별 리스트 가져오기
						 db_VO vo24 =  new db_VO();
						 vo24 = p.getVo();
						List<db_VO> list24 = db_DAO.getCategory_tb(vo24);
						if(list24 != null) {
							p.setResult(1);
						}
						p.setList(list24);
						out.writeObject(p);
	                     out.flush();
						 break;
						 
					case 25:
						// cpc 25번으로는 들어와짐!
						try {
							System.out.println("cpc 25번 작동");
						} catch (Exception e) {
							System.out.println("cpc 25번 오류");
							System.out.println(e);
						}
						out.writeObject(p);
	                    out.flush();
						break;
						
					case 26 : // 좌현 아이디찾기	
						db_VO vo26 = new db_VO();	
						vo26 = p.getVo();	
						vo26 = db_DAO.findid2(vo26);	
						p.setVo(vo26);	
						if(vo26 != null){	
							System.out.println("아이디찾기 성공");	
							p.setResult(1);	
						} else {	
							System.out.println("아이디찾기 실패");	
							p.setResult(0);	
						}	
						out.writeObject(p);	
						out.flush();	
						break;	
						
					case 27 : // 좌현 비번찾기	
						
						db_VO vo27 = new db_VO();	
						vo27 = p.getVo();	
						vo27 = db_DAO.findpw(vo27);
						System.out.println("dao 완료");
						p.setVo(vo27);	
						if(vo27 != null){	
							System.out.println("비밀번호찾기 성공");	
							p.setResult(1);	
						} else {	
							System.out.println("비밀번호찾기 실패");	
							p.setResult(0);	
						}	
						out.writeObject(p);	
						out.flush();	
						break;	 
					case 28 : // 가게 이미지 불러오기
						db_VO vo28 = new db_VO();
						vo28 = p.getVo();
						p.setVo(vo28);
						out.writeObject(p);
						out.flush();
						break;

				    case 36: // 비밀번호 변경
				    	// id를 받아와야 함
//				    	  db_VO vo2 = new db_VO();
//	                        vo2 = p.getVo();
//	                        try {
//	                        	p.setResult(db_DAO.insInfoMember(vo2));
//	                        	out.writeObject(p);
//	                        	out.flush();
//	                        	System.out.println("cp_client 회원가입 성공");
//	                        	break;							
//							} catch (Exception e) {
//								// 생년월일 양식 이상하게 입력했을 때 나는 오류 잡아야 함!
////								System.out.println("회원가입 오류");
//								System.out.println(e);
//								// 아니면 메시지 띄워야 함
//								
//								// java.net.SocketException: 현재 연결은 사용자의 호스트 시스템의 소프트웨어의 의해 중단되었습니다
//								// 회원가입 이후에 다시 접속 안됨 (위 메시지 때문에)
//							}
				    	System.out.println("★★★cpc 36번 작동중");
				    	db_VO vo3 = new db_VO();
				    	vo3 = p.getVo();
				    	try {
				    		p.setResult(db_DAO.changePw(vo3));
				    		out.writeObject(p);
				    		out.flush();
				    		System.out.println("cpc에서 비번 변경 완료");
						} catch (Exception e) {
							System.out.println(e);
							System.out.println("cpc에서 에러");
						}
				    	break;
				    case 38: // 비밀번호 변경
//				    	System.out.println("★★★cpc 38번 작동중");
				    	db_VO vo38 = new db_VO();
				    	vo38 = p.getVo();
				    	
				    	System.out.println("cpc 안에서 비번" + vo38.getNew_pw());
				    	try {
				    		p.setResult(db_DAO.changePw(vo38));
				    		out.writeObject(p);
				    		out.flush();
				    		System.out.println("38번 cpc에서 비번 변경 완료");
				    	} catch (Exception e) {
				    		System.out.println(e);
				    		System.out.println("38번 cpc에서 비번 변경 에러");
				    	}
				    	break;
				    	// CPC와 main 동시에 case가 존재할 때, cpc에서 flush 안해주면 main으로 안 넘어간다??
				    case 39:
				    	System.out.println("cpc 39번 작동중");
//				    	db_VO vo1 = db_DAO.findDiner(p.getVo());
//				    	p.setVo(vo1);
//				    	out.writeObject(p);
//	                    out.flush();
//				    	Thread.sleep(2000);
				    	out.writeObject(p);
	                    out.flush();
	                    System.out.println("cpc 39번 완료");
				    	break;
			
				    	
				    	// 성훈 41~	
				    case 41: // Admin04_review 관리자 리뷰관리페이지 리뷰 모두 불러오기 기능	
                        List<db_VO> list41 = db_DAO.getreviewAll();                        	
                        p.setList(list41);	
                        out.writeObject(p);	
                        out.flush();	
                        break;	
                    case 42: // 리뷰페이지 가게이름 검색 불러오기	
                        db_VO vo42 = new db_VO();	
                        vo42 = p.getVo();	
                        List<db_VO> list42 = db_DAO.s_namereview(vo42.getDiner_name());	
                       	p.setList(list42);	
                       	out.writeObject(p);	
                       	out.flush();                        	
                        break;	
                    case 43: // 리뷰페이지 회원 아이디 검색 불러오기	
                        db_VO vo43 = new db_VO();	
                        vo43 = p.getVo();	
                        List<db_VO> list43 = db_DAO.getidreview(vo43.getId());	
                       	p.setList(list43);	
                       	out.writeObject(p);	
                       	out.flush();	
                        break;	
                    case 44: // Admin02_Member페이지 전체검색	
                        List<db_VO> list44 = db_DAO.getmeminfoAll();	
                        p.setList(list44);	
                        out.writeObject(p);	
                        out.flush();	
                        break;	
                    case 45: // Admin02_Member 회원아이디로 검색	
                        db_VO vo45 = p.getVo();	
                        p.setVo(db_DAO.IdinfoSh(vo45));	
                        if(p.getVo() == null) {		
                        		p.setCmd(40); // 아이디 검색시 정보가 없을경우	
                        out.writeObject(p);	
                        out.flush();	
                        }else {	
                       	out.writeObject(p);	
                       	out.flush();                      		
                        }	
                        break;
                        
                    case 46: // Admin02_Member 회원아이디로 삭제	
                    	db_VO vo46 = p.getVo();	
                    	int result46 = JOptionPane.showConfirmDialog(member, "정말 삭제하시겠습니까?", "confirm", JOptionPane.YES_NO_OPTION);	
//                    	new ImageIcon(Admin03_rest.class.getResource("/image/icon_mini.png"))	
                    	if(result46==0) {	
                    		db_DAO.delmember(vo46);                    			
                    		out.writeObject(p);	
                    		out.flush();                    			
                    	}else {	
                    		p.setCmd(47);	
                    		out.writeObject(p);	
                    		out.flush();       	
                    	}break;	
                    	// 47번은 회원 아이디 삭제실패	
                   case 48: // Admin03_rest페이지 가게정보 전부 불러오기	
                    	List<db_VO> list48 = db_DAO.getStoreInfoAll();	
                        p.setList(list48);	
                        out.writeObject(p);	
                        out.flush();	
                    	break;	
                   case 49: //Admin03_rest 페이지 음식점이름으로 불러오기	
                	   db_VO vo49 = p.getVo();	
                       p.setVo(db_DAO.callFsName(vo49));	
                       if(p.getVo() == null) {	
                    	   p.setCmd(58);	
                    	   out.writeObject(p);	
   		                out.flush();	
                       }else {	
                    	   out.writeObject(p);	
                    	   out.flush();                   	   	
                       }	
   						break;	
   				   case 50: //Admin03_rest 페이지 음식분류로 불러오기	
   					db_VO vo50 = p.getVo(); 	
   					List<db_VO> list50 = db_DAO.callFoodCtg(vo50);	
   					p.setList(list50);	
   					if(p.getList() == null) {	
						   p.setCmd(58);	
						out.writeObject(p);	
		                out.flush();	
					   }else {	
					out.writeObject(p);	
					out.flush();						   	
					   }	
   					break;
   					
   					
   					
   					
   				 case 51: // Admin03_rest 음식점 신규등록 성공	
 					   int result51 = 0;	
 					   try {	
 						   db_VO vo51 = p.getVo();	
 						   result51 = db_DAO.insStore(vo51);   						  	
 						   if(result51>0) {	
 							   out.writeObject(p);	
 							   out.flush();	
 						   }else {	
 							   p.setCmd(52);	
 							   out.writeObject(p);	
 							   out.flush();	
 						   }	
 						   break;	
					} catch (Exception e) {	
						// TODO: handle exception	
						System.out.println(e);	
					}	
 					   // 52번은 음식점 신규등록 실패	
 					   	
 				   case 53: // Admin03_rest 음식점 삭제	
 					int result53 = JOptionPane.showConfirmDialog(member, "정말 삭제하시겠습니까?", "confirm", JOptionPane.YES_NO_OPTION);	
 					   db_VO vo53 = p.getVo();	
 					   if(result53 == 0) {	
 						db_DAO.delStore(vo53);	
 						out.writeObject(p);	
						out.flush();	
					   }else {	
						p.setCmd(54);	
 						out.writeObject(p);	
						out.flush();	
 					   }	
// 					if(result46==0) {	
//              		db_DAO.delmember(vo46);                    			
//              		out.writeObject(p);	
//              		out.flush();                    			
//              	}else {	
//              		p.setCmd(47);	
//              		out.writeObject(p);	
//              		out.flush();       	
//              	}	
 					   break;	
 					   	
 				   case 55: // Admin03_rest 음식점 정보 불러오기	
 					   db_VO vo55 = p.getVo();	
 					   p.setVo(db_DAO.callStore(vo55));	
 					if(p.getVo() == null) {	
						   p.setCmd(58);	
						out.writeObject(p);	
		                out.flush();	
					   }else {	
						   out.writeObject(p);	
						   out.flush();						   	
					   }	
 					   break;	
 				case 56: // Admin03_rest 음식점 수정 성공	
 					db_VO vo56 = p.getVo();	
 					try {	
 						int result56 = db_DAO.storeUpdate(vo56);	
 						if(result56>0) {	
 							out.writeObject(p);	
 							out.flush();	
 						}else {	
 							p.setCmd(57);	
 							out.writeObject(p);	
 							out.flush();	
 						}	
					} catch (Exception e) {	
						System.out.println("오류" + e);	
					}	
					break;						
				case 57: // Admin03_rest 음식점 수정 실패	
					break;
   					
   					
   					
   					
				// 뒤로 밀기    	
//            case 51 : // 식당 리뷰
//            	
//		    	db_VO vo51_ck = new db_VO();
//		    	vo51_ck = p.getVo();
//				vo51_ck = db_DAO.getinfoReview_ck(vo51_ck);
//				if(vo51_ck != null) {
//					
//				List<db_VO> list51 ;
//				list51 = db_DAO.getinfoReview(p.getSearch());
//				
//					p.setList(list51);
//					p.setResult(1);
//				}else {
//					p.setResult(0);
//				}
//				out.writeObject(p);
//				out.flush();
//				System.out.println("성공");
//				break;  
                    case 77 : // 주간베스트	
                    	p.setList(db_DAO.getbestAll2());	
                    	out.writeObject(p);	
                    	out.flush();	
                    	break;
                    	
//            	    case 88: // 상우 식당 별점 받아오기
//				    	db_VO vo88 = new db_VO();
//				    	vo88 = p.getVo();
//				    	System.out.println("cpc에서 가게 이름" + vo88.getDiner_name());
//				    	vo88 = db_DAO.getStoreStar(vo88);
//				    	p.setVo(vo88);
//				    	System.out.println("cpc에서 별점은: " + p.getVo().getAvg_star());
//				    	out.writeObject(p);
//	                    out.flush();
////				    	vo40 = db_DAO.getStoreStar(vo2);
//				    	break;
					}
				}
			} 
//			catch (java.sql.SQLDataException e2) {
//				// JOptionPane.showMessageDialog(getParent(), "데이터 입력 오류 : 생년월일 입력양식을 확인하세요.", null, JOptionPane.INFORMATION_MESSAGE,
////				 new ImageIcon(Login01_page.class.getResource("/image/icon_mini.png")));
//		JOptionPane.showMessageDialog(login02_member_join, "회원가입 성공");
			catch (Exception e) {
//				JOptionPane.showMessageDialog(getParent(), "데이터 입력 오류 : 생년월일 입력양식을 확인하세요.", null, JOptionPane.INFORMATION_MESSAGE,
//				new ImageIcon(Login01_page.class.getResource("/image/icon_mini.png")));
//				System.out.println(e);
//				System.out.println("회원가입 오류");
			}
		} // while문 끝 (해당 코드 아래에서 소켓을 close 해야 함)
		try {
			out.close();
			in.close();
			s.close();
		} catch (Exception e) {
			System.out.println("cpc 오류");
		}

//	try {
//		out.close();
//		in.close();
//		s.close();
//	} catch (Exception e) {
//	}
	}
}