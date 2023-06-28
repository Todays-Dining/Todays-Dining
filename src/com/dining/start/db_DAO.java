package com.dining.start;

import org.apache.ibatis.session.SqlSession;

public class db_DAO {
	
	private static SqlSession ss;
	
	private synchronized static SqlSession getSession(){
		if(ss == null) {
			ss = db_Service.getFactory().openSession();
		}
		return ss;
	}
	// 아이디 불러오는 메서드
	public static db_VO getID() {
		db_VO vo = getSession().selectOne("ID");
		return vo;
	}
}
