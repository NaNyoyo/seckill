package org.seckill.dao;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.seckill.model.Seckill;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.Date;
import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by youmxia on 2016/10/6.
 *
 * 配置spring和juit整合，juit启动时加载spring IOC容器
 * spring-test junit
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:spring/spring-dao.xml"})//告诉junitspring的配置文件
public class SeckillDaoTest {

    //注入dao实现类
    @Autowired
    private SeckillDao seckillDao;

    @Test
    public void reduceNumber() throws Exception {

        Date killTime = new Date();
        int num = seckillDao.reduceNumber(1000,killTime);
        System.out.println(num);
    }

    @Test
    public void queryById() throws Exception {
        Seckill seckill = seckillDao.queryById(1000);
        System.out.print(seckill.toString());
    }

    @Test
    /**
     * Parameter 'offset' not found
     *java运行不会去保存形参
     */
    public void queryAll() throws Exception {
        List<Seckill> list = seckillDao.queryAll(0,5);
        for (Seckill seckill:list )
        {
            System.out.println(seckill.toString());

        }

    }

}