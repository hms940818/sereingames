package com.commom;

import java.io.IOException;
import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class InitSqlSessionFactory {
	private static SqlSessionFactory sqlSessionFactory;
    public static SqlSessionFactory  initSqlSessionFactory() throws IOException {
        //创建sqlSessionFactory
        //MyBatis配置文件
        String resource = "resources/application/spring-mybatis.xml";
        //得到配置文件流
        InputStream inputStream = Resources.getResourceAsStream(resource);
        //创建会话工厂，传入MyBatis的配置信息
        sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        
        return sqlSessionFactory;
    }
}
