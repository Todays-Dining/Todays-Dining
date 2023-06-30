
package com.dining.start;

import java.util.Collection;
import java.util.List;

import org.apache.ibatis.session.SqlSession;

public class db_DAO {
	
	// 실제 사용하는 클래스 : SqlSession
	private static SqlSession ss;
	// 싱글턴 패턴 (동기화 처리) : 프로그램이 종료될 때 까지 한번 만들어진 객체를 재 사용한다.
	private synchronized static SqlSession getSession() {
		if (ss == null) {
			ss = db_Service.getFactory().openSession();
		}
		return ss;
	} // 아이디 불러오는 메서드 getID

	public static db_VO getid() {
		db_VO vo = getSession().selectOne("getID");
		return vo;
	}
	
	public static List<db_VO> getidAll(){
		List<db_VO> list = getSession().selectList("ID");
		// ID 리스트를 받아온다.
		return list;
	}
	
//	public static db_VO findYourId(db_VO vo){
////		vo = getSession().selectOne("findyourid");
//		db_VO vo2 = new db_VO();
//		vo2 = getSession().selectOne("findyourid",vo);
//		
//		// ID 리스트를 받아온다.
//		return vo2;
//	}
//	
	public static db_VO findYourId(db_VO vo) {
        vo = getSession().selectOne("getID",vo);
        return vo; 
    }
	
	public static boolean getidChk(String ID){
        boolean result = false;
        db_VO vo = getSession().selectOne("idChk",ID);
        if(vo == null) {
            result = true;
        }
        return result;
	}
	
	public static int insInfoMember(db_VO vo){
        int result = getSession().insert("infoIns",vo);
        ss.commit();
        return result;
    }
	
	// 하영 재훈 마이페이지 정보 불러오기
		public static db_VO getmyid(String id) {
	        db_VO vo = getSession().selectOne("getmyid" , id);
	        return vo;
	    }
		
		public static db_VO getpwChk(String ID){
			db_VO vo = getSession().selectOne("pwChk", ID );
		
			return vo;
		}
	
//	public static db_VO getid2(String name, String email, String birth){
//		List<db_VO> = db_VO 
//		
//		db_VO vo = getSession().selectOne(name);
//		db_VO vo2 = getSession().selectOne(email);
//		db_VO vo3 = getSession().selectOne(birth);
//
//		retrun result;
//
//	}
}
