package com.qfedu.ioc.test;

import com.qfedu.ioc.bean.Student;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test1 {
    public static void main(String[] args) {
        //ͨ��spring������������
//        ��Ҫ���غͳ�ʼ��spring������,����spring�����ļ�
        ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
//        ͨ��spring������ȡstudent����
        Student stu = (Student) classPathXmlApplicationContext.getBean("student");
        System.out.println(stu);

    }
}
