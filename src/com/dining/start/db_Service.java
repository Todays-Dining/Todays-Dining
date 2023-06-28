package com.dining.start;

import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class db_Service {
	
	private static SqlSessionFactory factory;
	
	static String resource = "com/dining/start/db_config.xml";
	
	static {
		try {
			InputStream inputStream = Resources.getResourceAsStream(resource);
			factory = new SqlSessionFactoryBuilder().build(inputStream);
		} catch (Exception e) {
		}
	}
	
	public static SqlSessionFactory getFactory() {
		return factory;
	}
	
}
