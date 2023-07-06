package com.dining.start;

import java.awt.CardLayout;
import java.awt.EventQueue;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.InvocationTargetException;
import java.net.Socket;
import java.util.List;
import java.util.Vector;

import javax.swing.JFrame;
import javax.swing.JPanel;

import com.dining.admin.Admin01_main;
import com.dining.admin.Admin02_AdMember_add;
import com.dining.admin.Admin02_Member;
import com.dining.admin.Admin03_rest;
import com.dining.admin.Admin04_review;

public class Admin_frame extends JFrame implements Runnable{
	
	JPanel admin_pg ;
	CardLayout cardLayout;
	public db_VO vo;
	public Socket s;
	public ObjectOutputStream out;
	public ObjectInputStream in;
	
	//관리자화면
	Admin01_main admin01_main ; 
	Admin02_AdMember_add admin02_AdMember_add ;
	Admin02_Member member ;
	Admin03_rest admin03_rest ;
	Admin04_review review ; 
	
	public Admin_frame() {
		connected();
		admin_pg = new JPanel(); 
		cardLayout = new CardLayout();
		admin_pg.setLayout(cardLayout);
		admin01_main = new Admin01_main(cardLayout,admin_pg , this);
		admin02_AdMember_add = new Admin02_AdMember_add(cardLayout,admin_pg , this);
		member = new Admin02_Member(cardLayout,admin_pg , this);
		admin03_rest = new Admin03_rest(cardLayout,admin_pg , this);
		review = new Admin04_review(cardLayout,admin_pg , this);
//		// 관리자화면
//		Admin01_main admin01_main = new Admin01_main(cardLayout,admin_pg); 
//		Admin02_AdMember_add admin02_AdMember_add = new Admin02_AdMember_add(cardLayout,admin_pg);
//		Admin02_Member admin02_Member = new Admin02_Member(cardLayout,admin_pg);
//		Admin03_rest admin03_rest = new Admin03_rest(cardLayout,admin_pg);
//		Admin04_review admin04_review = new Admin04_review(cardLayout,admin_pg); 
		// 관리자화면
		admin_pg.add("admin01_main",admin01_main);
		admin_pg.add("admin02_AdMember_add",admin02_AdMember_add);
		admin_pg.add("admin02_Member",member);
		admin_pg.add("admin03_rest",admin03_rest);
		admin_pg.add("admin04_review",review);
		
		add(admin_pg);
		setSize(1200, 840);
		setVisible(true);
		setLocationRelativeTo(null);

	} // 생성자 끝
	
	@Override
	public void run() {
	esc: while(true) {
		try {
			Object obj = in.readObject();
			if(obj != null) {
				Protocol p = (Protocol)obj;
				vo = p.getVo();
				switch(p.getCmd()) {
				case 0: // 접속종료
					break esc;
				case 1: // 
					break;
				case 2:
					break;
				case 41: // 리뷰페이지 리뷰 모두 불러오기 Admin04_review
		            List<db_VO> list41 = p.getList();					
					for (db_VO k : list41) {
						Vector<Object> rowAdd = new Vector<>();
						rowAdd.add(k.getReview_number());
						rowAdd.add(k.getDiner_name());
						rowAdd.add(k.getId());
						rowAdd.add(k.getReview_content());
						rowAdd.add(k.getStar());
						review.dtm.addRow(rowAdd);	
					}
					break;
				case 42: // 리뷰페이지 가게이름 검색 불러오기
					 List<db_VO> list42 = p.getList();					
						for (db_VO k : list42) {
							Vector<Object> rowAdd = new Vector<>();
							rowAdd.add(k.getReview_number());
							rowAdd.add(k.getDiner_name());
							rowAdd.add(k.getId());
							rowAdd.add(k.getReview_content());
							rowAdd.add(k.getStar());
							review.dtm.addRow(rowAdd);	
						}
					break;
				case 43: // 리뷰페이지 회원 아이디 검색 불러오기
					List<db_VO> list43 = p.getList();					
					for (db_VO k : list43) {
						Vector<Object> rowAdd = new Vector<>();
						rowAdd.add(k.getReview_number());
						rowAdd.add(k.getDiner_name());
						rowAdd.add(k.getId());
						rowAdd.add(k.getReview_content());
						rowAdd.add(k.getStar());
						review.dtm.addRow(rowAdd);	
					}		            
					break;
				case 44: // Admin02_Member 전체검색 버튼
					List<db_VO> list44 = p.getList();					
					for (db_VO k : list44) {
						Vector<Object> rowAdd = new Vector<>();
						rowAdd.add(k.getStatus());
						rowAdd.add(k.getId());
						rowAdd.add(k.getPassword());
						rowAdd.add(k.getBirthday());
						rowAdd.add(k.getEmail());
						rowAdd.add(k.getPassword_search_q());
						rowAdd.add(k.getPassword_search_a());
						rowAdd.add(k.getFavorite_list());
						rowAdd.add(k.getReported_count());
						
						member.dtm.addRow(rowAdd);	
					}	
					break;
				case 45: // Admin02_Member 회원id 검색 버튼
					db_VO vo = p.getVo();
					String arr[] = {vo.getStatus() , vo.getId() , vo.getPassword() ,
					vo.getBirthday() , vo.getEmail() , vo.getPassword_search_q() ,
					vo.getPassword_search_a() , vo.getFavorite_list() , vo.getReported_count()};
					member.dtm.addRow(arr);
					break;
				case 46: // Admin02_Member 회원아이디 검색했을시 삭제버튼
					
					break;
				}// switch 문 끝
				   
			}
		} catch (Exception e) {
		}
	}// while문 끝
	closed();		
	}
	
	// 접속
		public void connected() {
			try {
				s = new Socket("192.168.0.69", 7778);
				out = new ObjectOutputStream(s.getOutputStream());
				in = new ObjectInputStream(s.getInputStream());
				new Thread(this).start();
			} catch (Exception e) {
			}
		}
		
		public void closed() {
			try {
				out.close();
				in.close();
				System.exit(0);
			} catch (Exception e) {
			}
		}
	
	public static void main(String[] args) throws InvocationTargetException, InterruptedException {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					new Admin_frame();
				} catch (Exception e) {
					System.out.println("시작페이지오류");
					System.out.println(e);
				}
			}
		});
	}
}