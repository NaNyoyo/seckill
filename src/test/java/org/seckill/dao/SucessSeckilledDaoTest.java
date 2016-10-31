package org.seckill.dao;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.seckill.model.SuccessKilled;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

import static org.junit.Assert.*;

/**
 * Created by youmxia on 2016/10/6.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:spring/spring-dao.xml"})
public class SucessSeckilledDaoTest {
    @Resource
    private SucessSeckilledDao dao ;

    @Test
    public void insertSuccessSeckilled() throws Exception {
        int num = dao.insertSuccessSeckilled(1000L,15862663403L);
        System.out.println(num);

    }

    @Test
    public void queryByIdWithSeckill() throws Exception {
       SuccessKilled sk =  dao.queryByIdWithSeckill(1000L,15862663403L);
        System.out.println(sk.toString());
        System.out.println(sk.getSeckill().toString());
    }

}