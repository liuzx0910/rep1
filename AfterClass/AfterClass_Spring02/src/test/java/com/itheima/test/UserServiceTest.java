package com.itheima.test;

import com.itheima.configuration.UserConfiguration;
import com.itheima.dao.UserDao;
import com.itheima.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;

@RunWith(SpringJUnit4ClassRunner.class)
//@ContextConfiguration("classpath:applicationContext.xml")
@ContextConfiguration(classes={UserConfiguration.class})
public class UserServiceTest {

    @Autowired
    private UserService userService;

    @Autowired
//    @Qualifier("dataSource")
    private DataSource dataSource;


    @Test
    public void test01(){
        userService.save();
    }

    @Test
    public void test02() throws SQLException {
        Connection connection = dataSource.getConnection();
        System.out.println(connection);
    }
}
