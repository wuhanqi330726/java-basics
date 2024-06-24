package com.qfedu.ioc.test;

import com.qfedu.ioc.bean.Student;

public class Test {
    public static void main(String[] args) {
        Student student = new Student();
        student.setStuAge(1);
        student.setStuNum("1001");
        student.setStuName("fofa");
        System.out.println(student);
    }
}
