package com.qfedu.ioc.test;

import com.qfedu.ioc.bean.Student;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test1 {
    public static void main(String[] args) {
        //通过spring容器创建对象
//        需要加载和初始化spring的容器,加载spring配置文件
        ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
//        通过spring容器获取student对象
        Student stu = (Student) classPathXmlApplicationContext.getBean("student");
        System.out.println(stu);

    }
}
