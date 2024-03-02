package 练习题.局部内部类;

public class demo1 {
    public static void main(String[] args) {

    }
    public static animal getAnimal(){
        class cat extends animal{

            @Override
            public void eat() {
                System.out.println("猫吃猫粮");
            }
        }
        cat cat = new cat();
//        animal对象的实体是一个cat对象约等于 animal cat = new cat（）
//        情况是一种多态
        return cat;
    }
}
abstract class animal{
    public abstract void eat();
}
