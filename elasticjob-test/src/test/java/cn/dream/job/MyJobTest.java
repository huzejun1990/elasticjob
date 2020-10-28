package cn.dream.job;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by huzejun
 * on 2020/10/28 23:45
 */
public class MyJobTest {
    public static void main(String[] args) {
        new ClassPathXmlApplicationContext("applicationContext-elasticjob.xml");
    }
}
