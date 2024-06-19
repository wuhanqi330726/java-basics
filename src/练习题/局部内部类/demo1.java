package 练习题.局部内部类;

/**
 * 局部在类中的方法的内部
 * 应用场景
 * 往往一个方法需要返回的是抽象类或者接口的对象。此时因为抽象类或者接口不能创建对象，
 * 于是先创建一个类来继承或实现抽象类，再创建该类的对象。
 * 把这样定义在方法内部的类，目的是为了节省类创建带来的开销
 */
public class demo1 {
    public static void main(String[] args) {
//        用这个方法调用局部内部类
        getAnimal();
//        dog dog = new dog();
//        dog.eat();
    }
    public static animal getAnimal(){
//        局部内部类 ==
        class cat extends animal{

            @Override
            public void eat() {
                System.out.println("猫吃猫粮");
            }
        }
        cat cat = new cat();
//        animal对象的实体是一个cat对象约等于 animal cat = new cat（）
//        情况是一种多态
        cat.eat();
        return cat;
    }
}
abstract class animal{
    public abstract void eat();
}

