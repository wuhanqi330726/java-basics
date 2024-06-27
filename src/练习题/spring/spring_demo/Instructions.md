# Spring ioc 项目练习

>spring ioc 容器组件，可以完成对象的创建、对象属性赋值、对象管理

## 	1.1jar包的导入

jar包使用spring-beans，spring-context，spring-croe

```xml
    <!-- https://mvnrepository.com/artifact/org.springframework/spring-beans -->
        <dependency>
            <groupId>org.springframework</groupId>
            <artifactId>spring-beans</artifactId>
            <version>6.1.7</version>
        </dependency>

        <!-- https://mvnrepository.com/artifact/org.springframework/spring-beans -->
        <dependency>
            <groupId>org.springframework</groupId>
            <artifactId>spring-core</artifactId>
            <version>6.1.7</version>
        </dependency>     
 		<dependency>
            <groupId>org.springframework</groupId>
            <artifactId>spring-context</artifactId>
            <version>5.0.2.RELEASE</version>
        </dependency>
```

可以上[Maven Repository: Search/Browse/Explore (mvnrepository.com)](https://mvnrepository.com/)网站进行搜索

同时也可以只导入一个jar包依赖使用spring-context包

![image-20240624173442412](C:\Users\10766\AppData\Roaming\Typora\typora-user-images\image-20240624173442412.png)

因为在导入的jar包spring-context中就包含了spring-beans和spring-core的依赖

```xml
 <dependency>
            <groupId>org.springframework</groupId>
            <artifactId>spring-context</artifactId>
            <version>5.0.2.RELEASE</version>
        </dependency>
```

## 1.2创建spring配置文件

>通过配置文件告诉spring容器创建什么对象，给对象属性赋什么值

- 在resources目录下创建一个名为**appicationContext.xml**的文件(文件名可以自定义，)

```xml
<?xml version="1.0" encoding="UTF-8"?>
<beans xmlns="http://www.springframework.org/schema/beans"
       xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
       xsi:schemaLocation="http://www.springframework.org/schema/beans
       http://www.springframework.org/schema/beans/spring-beans.xsd">
</beans>

```

> 注意对于一个xml文件如果作为框架的配置问及那，需要的遵守配置规则
>
> 通常一个框架为了让开发者能够正确的配置，都会提供xml的规范文件（DTD规范和xsd模式）

## 1.3创建一个实体类

```java
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

```

## 1.4spring框架中的方法与常规方法进行对比

常规方法中

```java
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

```

- 缺点：需要一个一个进行new的使用无法动态实现类的引用

在spring的配置文件中进行创建实例

用第二个方法的spring配置文件代码加入<bean>标签

代码如下

```xml
<beans xmlns="http://www.springframework.org/schema/beans"
       xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
       xsi:schemaLocation="http://www.springframework.org/schema/beans
       http://www.springframework.org/schema/beans/spring-beans.xsd">
        <!--    通过bean标签将实体类交给spring容器管理-->
        <bean id="student" class="com.qfedu.ioc.bean.Student">
        </bean>
</beans>

```

同时测试文件的调用需要用到ClassPathXmlApplicationContext类来实现spring容器的初始化

同时调用这个类中的getBean方法写入上面代码的id

代码如下

```java
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

```

当spring需要获取对象时可以用<property>标签实现对对象的赋值

代码如下

```xml
<beans xmlns="http://www.springframework.org/schema/beans"
       xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
       xsi:schemaLocation="http://www.springframework.org/schema/beans
       http://www.springframework.org/schema/beans/spring-beans.xsd">
        <!--    通过bean标签将实体类交给spring容器管理-->
        <bean id="student" class="com.qfedu.ioc.bean.Student">
                <property name="stuName" value="fofa"></property>
        </bean>
</beans>

```

同时这个也是一个控制反转ioc

## 1.5srping di依赖注入与ioc控制反转的区别

ioc：控制反转，通过spring对象工厂完成对对象的创建

di：依赖注入，在spring完成对象创建的同时依赖spring容器完成对象属性的赋值



