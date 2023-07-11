package com.dining.start;

import java.awt.CardLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.io.File;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.InvocationTargetException;
import java.net.Socket;
import java.util.List;
import java.util.Vector;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.UIManager;
import javax.swing.plaf.FontUIResource;

import com.dining.admin.Admin00_Login;
import com.dining.admin.Admin01_main;
import com.dining.admin.Admin02_AdMember_add;
import com.dining.admin.Admin02_Member;
import com.dining.admin.Admin03_rest;
import com.dining.admin.Admin04_review;
import com.dining.login.Login01_page;


public class Admin_frame extends JFrame implements Runnable{
	
	
	
	JPanel admin_pg ;
	CardLayout cardLayout;
	public db_VO vo;
	public Socket s;
	public ObjectOutputStream out;
	public ObjectInputStream in;
	
	//관리자화면
	Admin00_Login admin00_Login;;
	Admin01_main admin01_main ; 
	Admin02_AdMember_add admin02_AdMember_add ;
	Admin02_Member member ;
	Admin03_rest rest ;
	Admin04_review review ; 
	
	public Admin_frame() {
		UIManager ui = new UIManager(); // 전체적인 UI시스템 이미지, 색상, 폰트 변경
	    ui.put("Button.font", new FontUIResource(new Font ("Sandoll 삼립호빵체 TTF Basic", Font.BOLD, 16))); // 버튼의 폰트 변경
	    ui.put("Button.background", new Color(65, 105, 225)); // 버튼의 색상변경
	    ui.put("Button.focus", new Color(65, 105, 225)); // 버튼의 글자 테두리의 색상 변경
	    ui.put("Label.font", new FontUIResource(new Font ("Sandoll 삼립호빵체 TTF Basic", Font.BOLD, 16))); // o
	    ui.put("OptionPane.background",new Color(255, 240, 245)); // 다이얼로그의 배경색 변경
	    ui.put("Panel.background",new Color(255, 240, 245)); // 다이얼로그의 패널부분 배경색 변경
		
		
		connected();
		admin_pg = new JPanel(); 
		cardLayout = new CardLayout();
		admin_pg.setLayout(cardLayout);
		admin01_main = new Admin01_main(cardLayout,admin_pg , this);
		admin02_AdMember_add = new Admin02_AdMember_add(cardLayout,admin_pg , this);
		member = new Admin02_Member(cardLayout,admin_pg , this);
		rest = new Admin03_rest(cardLayout,admin_pg , this);
		review = new Admin04_review(cardLayout,admin_pg , this);
		admin00_Login = new Admin00_Login(cardLayout, admin_pg , this);
//		// 관리자화면
//		Admin01_main admin01_main = new Admin01_main(cardLayout,admin_pg); 
//		Admin02_AdMember_add admin02_AdMember_add = new Admin02_AdMember_add(cardLayout,admin_pg);
//		Admin02_Member admin02_Member = new Admin02_Member(cardLayout,admin_pg);
//		Admin03_rest admin03_rest = new Admin03_rest(cardLayout,admin_pg);
//		Admin04_review admin04_review = new Admin04_review(cardLayout,admin_pg); 
		// 관리자화면
		admin_pg.add("admin00_Login",admin00_Login);
		admin_pg.add("admin01_main",admin01_main);
		admin_pg.add("admin02_AdMember_add",admin02_AdMember_add);
		admin_pg.add("admin02_Member",member);
		admin_pg.add("admin03_rest",rest);
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
				case 40: // Admin02_Member 가게이름 검색시 아이디 없을때
					JOptionPane.showMessageDialog(member, "없는 아이디입니다.", null, JOptionPane.INFORMATION_MESSAGE,
							new ImageIcon(Login01_page.class.getResource("/image/icon_mini.png")));
					member.select_tf.setText("");
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
					member.select_tf.setText("");
					break;
				case 45: // Admin02_Member 회원id 검색 버튼
					db_VO vo = p.getVo();
					String arr45[] = {vo.getStatus() , vo.getId() , vo.getPassword() ,
					vo.getBirthday() , vo.getEmail() , vo.getPassword_search_q() ,
					vo.getPassword_search_a() , vo.getFavorite_list() , vo.getReported_count()};
					member.dtm.addRow(arr45);
					
					if(member.dtm.getColumnCount() != 0) {
						member.del_bt.setEnabled(true);
					}
					break;
				case 46: // Admin02_Member 회원아이디 검색했을시 삭제 성공했을때
					JOptionPane.showMessageDialog(member, "삭제 성공", null, JOptionPane.INFORMATION_MESSAGE,
							new ImageIcon(Login01_page.class.getResource("/image/icon_mini.png")));
					member.select_tf.setText("");
					member.dtm.setNumRows(0);
					member.del_bt.setEnabled(false);
					break;
				case 47: // Admin02_Member 회원아이디 검색했을시 삭제 실패했을때
					JOptionPane.showMessageDialog(member, "삭제 취소 다시 확인 부탁드립니다.", null, JOptionPane.INFORMATION_MESSAGE,
							new ImageIcon(Login01_page.class.getResource("/image/icon_mini.png")));
					member.select_tf.setText("");
					member.dtm.setNumRows(0);
					member.del_bt.setEnabled(false);
					break;
				case 48: //Admin03_rest 페이지 가게정보 전부 불러오기
					List<db_VO> list48 = p.getList();					
					for (db_VO k : list48) {
						Vector<Object> rowAdd = new Vector<>();
						rowAdd.add(k.getDiner_no());
						rowAdd.add(k.getDiner_name());
						rowAdd.add(k.getRegion());
						rowAdd.add(k.getAddress());
						rowAdd.add(k.getFood_category());
						rowAdd.add(k.getMenu());
						rowAdd.add(k.getPhone_number());
						rowAdd.add(k.getOpening_hours());
						rowAdd.add(k.getParking_or_not());					
						rest.dtm.addRow(rowAdd);
					}	
					break;
				case 49: //Admin03_rest 페이지 음식점이름으로 불러오기
					db_VO vo49 = p.getVo();
					String arr49[] = {vo49.getDiner_no() , vo49.getDiner_name() , vo49.getRegion(),
					vo49.getAddress() , vo49.getFood_category() , vo49.getMenu() , vo49.getPhone_number() ,
					vo49.getOpening_hours() , vo49.getParking_or_not()
					};
					rest.dtm.addRow(arr49);
					break;
				case 50: //Admin03_rest 페이지 음식분류로 불러오기
					List<db_VO> list50 = p.getList();
					for (db_VO k : list50) {
					Vector<Object> rowAdd50 = new Vector<>();
					rowAdd50.add(k.getDiner_no());
					rowAdd50.add(k.getDiner_name());
					rowAdd50.add(k.getRegion());
					rowAdd50.add(k.getAddress());
					rowAdd50.add(k.getFood_category());
					rowAdd50.add(k.getMenu());
					rowAdd50.add(k.getPhone_number());
					rowAdd50.add(k.getOpening_hours());
					rowAdd50.add(k.getParking_or_not());
					rest.dtm.addRow(rowAdd50);						
					}
					break;
				case 51: // Admin03_rest 음식점 신규등록 성공
					JOptionPane.showMessageDialog(rest, "음식점 신규등록 성공", null, JOptionPane.INFORMATION_MESSAGE,
							new ImageIcon(Admin03_rest.class.getResource("/image/icon_mini.png")));
					rest.newstore_tf.setText("");
					rest.newopentime_tf.setText("");
					rest.newbestfood_tf.setText("");
					rest.newstorephone_tf.setText("");
					rest.newstoreAddr_tf.setText("");
					rest.newstore_img_tf.setText("");
					rest.newbestfood_img_tf.setText("");
					rest.newstoreAddr_img_tf.setText("");
					rest.comboBox_newfoodcate.setSelectedIndex(0);
					rest.comboBox_newparking.setSelectedIndex(0);
					break;
				case 52: // Admin03_rest 음식점 신규등록 실패
					JOptionPane.showMessageDialog(rest, "음식점 신규등록 실패 확인 부탁드립니다.", null, JOptionPane.INFORMATION_MESSAGE,
							new ImageIcon(Admin03_rest.class.getResource("/image/icon_mini.png")));
					break;
				case 53: // Admin03_rest 음식점 삭제 성공					
					JOptionPane.showMessageDialog(rest, "음식점 삭제 성공!", null, JOptionPane.INFORMATION_MESSAGE,
							new ImageIcon(Admin03_rest.class.getResource("/image/icon_mini.png")));
					rest.store_tf.setText("");
					rest.storeAddr_tf.setText("");
					rest.bestfood_tf.setText("");
					rest.storephone_tf.setText("");
					rest.opentime_tf.setText("");
					rest.search_tf.setText("");
					rest.comboBox_parking.setSelectedIndex(0);
					rest.comboBox_foodcate.setSelectedIndex(0);
					rest.alldel_1.setEnabled(false);
					rest.update_bt.setEnabled(false);
					break;
				case 54: // Admin03_rest 음식점 삭제 실패
					JOptionPane.showMessageDialog(rest, "음식점 삭제 실패 확인 부탁드립니다.", null, JOptionPane.INFORMATION_MESSAGE,
							new ImageIcon(Admin03_rest.class.getResource("/image/icon_mini.png")));
					break;
				case 55: // Admin03_rest 음식점 정보 불러오기
					db_VO vo55 = p.getVo();
					if(p.getVo() != null) {
						rest.update_bt.setEnabled(true);
						rest.alldel_1.setEnabled(true);
						rest.store_tf.setEditable(false);
					rest.store_tf.setText(vo55.getDiner_name());
					rest.storeAddr_tf.setText(vo55.getAddress());
					rest.bestfood_tf.setText(vo55.getMenu());
					rest.storephone_tf.setText(vo55.getPhone_number());
					rest.opentime_tf.setText(vo55.getOpening_hours());
//					String combo_sel = rest.comboBox_foodcate.getSelectedItem().toString();
					if(vo55.getFood_category().equals("한식")) {						
						rest.comboBox_foodcate.setSelectedIndex(0);	
					}else if(vo55.getFood_category().equals("양식")) {
						rest.comboBox_foodcate.setSelectedIndex(1);
					}else if(vo55.getFood_category().equals("중식")) {
						rest.comboBox_foodcate.setSelectedIndex(2);
					}else if(vo55.getFood_category().equals("일식")) {
						rest.comboBox_foodcate.setSelectedIndex(3);
					}else if(vo55.getFood_category().equals("카페")) {
						rest.comboBox_foodcate.setSelectedIndex(4);
					}else if(vo55.getFood_category().equals("기타")) {
						rest.comboBox_foodcate.setSelectedIndex(5);
					}
					
					if(vo55.getParking_or_not().equals("1")) {
						rest.comboBox_parking.setSelectedIndex(0);
					}else if(vo55.getParking_or_not().equals("0")) {
						rest.comboBox_parking.setSelectedIndex(1);
					}	
					}else {
						JOptionPane.showMessageDialog(rest, "없는 가게 입니다.", null, JOptionPane.INFORMATION_MESSAGE,
								new ImageIcon(Admin03_rest.class.getResource("/image/icon_mini.png")));
						rest.update_bt.setEnabled(false);
						rest.alldel_1.setEnabled(false);
						rest.search_tf.setText("");
					}
					break; 
				case 56: // Admin03_rest 음식점 수정 성공
					JOptionPane.showMessageDialog(rest, "업데이트 성공!", null, JOptionPane.INFORMATION_MESSAGE,
							new ImageIcon(Admin03_rest.class.getResource("/image/icon_mini.png")));
					rest.store_tf.setText("");
					rest.storeAddr_tf.setText("");
					rest.bestfood_tf.setText("");
					rest.storephone_tf.setText("");
					rest.opentime_tf.setText("");
					rest.comboBox_foodcate.setSelectedIndex(0);
					rest.comboBox_parking.setSelectedIndex(0);
					rest.store_tf.setEditable(true);
					rest.update_bt.setEnabled(false);
					rest.alldel_1.setEnabled(false);
					rest.search_tf.setText("");
					break;
				case 57: // Admin03_rest 음식점 수정 실패
					JOptionPane.showMessageDialog(rest, "수정 실패 다시 입력하세요", null, JOptionPane.INFORMATION_MESSAGE,
							new ImageIcon(Admin03_rest.class.getResource("/image/icon_mini.png")));
					break;
				case 58: // Admin03_rest 음식점 없는 가게 불러올 경우
					JOptionPane.showMessageDialog(rest, "없는 가게 입니다. 다시 입력하세요", null, JOptionPane.INFORMATION_MESSAGE,
							new ImageIcon(Admin03_rest.class.getResource("/image/icon_mini.png")));
					rest.store_tf.setText("");
					rest.storeAddr_tf.setText("");
					rest.bestfood_tf.setText("");
					rest.storephone_tf.setText("");
					rest.opentime_tf.setText("");
					rest.search_tf.setText("");
					rest.select_tf.setText("");
					rest.comboBox_foodcate.setSelectedIndex(0);
					rest.comboBox_parking.setSelectedIndex(0);
					rest.store_tf.setEditable(true);
					rest.update_bt.setEnabled(false);
					rest.alldel_1.setEnabled(false);
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