package com.qfedu.ioc.bean;

import java.util.Date;

public class Student {

    private String stuNum;
    private String stuName;
    private String stuGender;//性别
    private int stuAge;
    private Date enterenceTime;//入学日期

    public String getStuNum() {
        return stuNum;
    }

    public void setStuNum(String stuNum) {
        this.stuNum = stuNum;
    }

    public String getStuName() {
        return stuName;
    }

    public void setStuName(String stuName) {
        this.stuName = stuName;
    }

    public String getStuGender() {
        return stuGender;
    }

    public void setStuGender(String stuGender) {
        this.stuGender = stuGender;
    }

    public int getStuAge() {
        return stuAge;
    }

    public void setStuAge(int stuAge) {
        this.stuAge = stuAge;
    }

    public Date getEnterenceTime() {
        return enterenceTime;
    }

    public void setEnterenceTime(Date enterenceTime) {
        this.enterenceTime = enterenceTime;
    }

    @Override
    public String toString() {
        return "Student{" +
                "stuNum='" + stuNum + '\'' +
                ", stuName='" + stuName + '\'' +
                ", stuGender='" + stuGender + '\'' +
                ", stuAge=" + stuAge +
                ", enterenceTime=" + enterenceTime +
                '}';
    }
}
