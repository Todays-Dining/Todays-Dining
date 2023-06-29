package com.dining.start;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class db_Service {
	// MyBatis를 사용하기 위해서 SqlSession 클래스가 필요하고
		// SqlSessionFactory클래스를 가지고 SqlSession 클래스를 만든다.
		private static SqlSessionFactory factory;
		// config.xml 파일 위치
		static String resource = "com/dining/start/db_Config.xml";
		
		static {
			try {
				InputStream inputStream = Resources.getResourceAsStream(resource);
				factory = new SqlSessionFactoryBuilder().build(inputStream);
			} catch (Exception e) {
				System.out.println("db서버 연결중 문제 발생");
				e.printStackTrace();

			}
		}
		
		// DAO에서 factory를 호출할 메서드
		static SqlSessionFactory getFactory() {
			return factory;
		}
	
	
}
