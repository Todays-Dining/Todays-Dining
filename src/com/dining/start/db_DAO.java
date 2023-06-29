
package com.dining.start;

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
		return list;
	}
}
