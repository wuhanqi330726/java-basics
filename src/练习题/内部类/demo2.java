package 练习题.内部类;
//调用方法
/*
 成员内部类
 定义 内部类直接定义在类的内部，方法的外部
 使用
 外部类.内部类 名称 = 外部类.new 内部类（）
 */
public class demo2 {
    public static void main(String[] args) {
        A a = new A();
//        b的构造器只有在A中才能找到
        A.B b = a.new B();
//        创建静态内部类
        c.D d = new c.D();
    }
}
class A {
    class B{

    }
}
class c{
    static class D{}
}