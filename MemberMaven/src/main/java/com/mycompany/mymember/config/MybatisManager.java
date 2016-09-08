package com.mycompany.mymember.config;

import java.io.Reader;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;



public class MybatisManager {
	public static SqlSessionFactory sqlMapper;
	static {
		try {
			String resource = "com/mycompany/mymember/config/Configuration.xml";
			Reader reader = Resources.getResourceAsReader(resource);
			sqlMapper = new SqlSessionFactoryBuilder().build(reader);
		} catch (Exception e) {
		e.printStackTrace();
		throw new RuntimeException("Error initializ ing class. Cause:" + e);
		}
		}
		public static SqlSessionFactory getMapper() {
			return sqlMapper;
		}
}
