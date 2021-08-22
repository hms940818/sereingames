package com.mybatis.dao;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import com.mybatis.dao.mapper.UserDao;
import com.mybatis.dao.model.User;

public class UserDaoImpl implements UserDao{

    // 需要向dao实现类中注入SqlSessionFactory
    // 这里通过构造方法注入
    private SqlSessionFactory sqlSessionFactory;

    public UserDaoImpl(SqlSessionFactory sqlSessionFactory) {
        super();
        this.sqlSessionFactory = sqlSessionFactory;
    }
    
    @Override
    public User findUserById(String id) {
        SqlSession sqlSession = sqlSessionFactory.openSession();//获取sqlSession
        User user = sqlSession.selectOne("findUserById", id);
        sqlSession.close();//关闭资源
        return user;
    }
    
    
    @Override
    public void insertUser(User user) {
        SqlSession sqlSession = sqlSessionFactory.openSession();
        //执行插入操作
        sqlSession.insert("insertUser", user);
        // 提交事务
        sqlSession.commit();
        // 释放资源
        sqlSession.close();
    }

	@Override
	public void updateUser(User user) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteUserById(User user) {

        SqlSession sqlSession = sqlSessionFactory.openSession();
        //执行插入操作
        sqlSession.delete("deleteUserById", user);
        // 提交事务
        sqlSession.commit();
        // 释放资源
        sqlSession.close();
		
	}
}