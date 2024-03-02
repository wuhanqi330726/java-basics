package 练习题.内部类;

/**
 * 内部类
 * 用内部类的原因：类中有一些成员，
 * 没有办法通过一个属性或者一个方法就能完成描述，比如人类中的大脑
 * 此时可以用一个类来充分描述
 *
 * 内部类的分类：
 * 成员内部类：普通的成员内部类、静态的成员内部类
 * 局部内部类（重点）：普通的局部内部类、匿名的局部内部类
 * 类的五大成员：属性，方法，构造器，代码块，内部类
 *
 * 成员内部类
 * 定义
 * 内部类直接定义在类的内部，方法的外部
 */
public class demo1 {
}
class person {
    private String name;
    private int age;
//    private bra;
    class brain{
        String n ;
        int a ;
        public void working(){}
    }

}
