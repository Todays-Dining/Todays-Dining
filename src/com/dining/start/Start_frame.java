package com.dining.start;

import java.awt.CardLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;

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

public class Start_frame extends JFrame{
	JPanel main_pg ;
	CardLayout cardLayout;
	int member_num = 1 ;
	
	public Start_frame() {
		// 상속받아서 하는게 아니라서 새로 생성을 해줘야한다
		main_pg = new JPanel(); 
		cardLayout = new CardLayout();
		main_pg.setLayout(cardLayout);
		// 각종패널들 가져오기
		// 로그인 화면단
		Login01_page login01_page = new Login01_page(cardLayout,main_pg);
		Login02_member_join login02_member_join = new Login02_member_join(cardLayout,main_pg);
		Login03_Find_id login03_Find_id = new Login03_Find_id(cardLayout,main_pg);
		Login04_Find_pw login04_Find_pw = new Login04_Find_pw(cardLayout,main_pg);
		// 메인 맵 화면
		Main00_Map main00_Map = new Main00_Map(cardLayout,main_pg);
		Main00_Home main00_Home = new Main00_Home(cardLayout,main_pg);
		// 검색시 이동할 화면
		Main00_store_search main00_store_search = new Main00_store_search(cardLayout, main_pg);
		// 메인(주간best1등~5등)
		Main01_best1 main01_best1 = new Main01_best1(cardLayout,main_pg);
		Main01_best2 main01_best2 = new Main01_best2(cardLayout,main_pg);
		Main01_best3 main01_best3 = new Main01_best3(cardLayout,main_pg);
		Main01_best4 main01_best4 = new Main01_best4(cardLayout,main_pg);
		Main01_best5 main01_best5 = new Main01_best5(cardLayout,main_pg);
		// 음식 카테고리
		Main02_category_select main02_category_select = new Main02_category_select(cardLayout,main_pg);
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
		Main04_store1_main main04_store1_main = new Main04_store1_main(cardLayout,main_pg);
		Main04_store2_map main04_store2_map = new Main04_store2_map(cardLayout,main_pg);
		Main04_store3_review main04_store3_review = new Main04_store3_review(cardLayout,main_pg);
		
		
		
		// 로그인
		main_pg.add("login01_page",login01_page);
		main_pg.add("login02_member_join",login02_member_join);
		main_pg.add("login03_Find_id",login03_Find_id);
		main_pg.add("login04_Find_pw",login04_Find_pw);
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


	}
	public int getMember_num() {
		return member_num;
	}
	public void setMember_num(int member_num) {
		this.member_num = member_num;
	}
	public static void main(String[] args) {
		new Start_frame();
	}
}
