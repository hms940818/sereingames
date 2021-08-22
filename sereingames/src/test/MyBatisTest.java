package test;

import java.io.IOException;
import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;

import com.mybatis.dao.UserDaoImpl;
import com.mybatis.dao.mapper.UserDao;
import com.mybatis.dao.model.User;
 
public class MyBatisTest {
    private SqlSessionFactory sqlSessionFactory;
    @Before
    public void init() throws IOException{
        //创建sqlSessionFactory
        //MyBatis配置文件
        String resource = "resources/application/spring-mybatis.xml";
        //得到配置文件流
        InputStream inputStream = Resources.getResourceAsStream(resource);
        //创建会话工厂，传入MyBatis的配置信息
        sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
    }
    @Test
    public void testFindUserById() throws Exception{
        //创建UserDao对象
        UserDao userDao = new UserDaoImpl(sqlSessionFactory);
        //调用UserDao的方法，根据ID查找user
        User user = userDao.findUserById("test@test.com");
        //打印客户信息
        System.out.println(user);
    }
}