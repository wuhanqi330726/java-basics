package 练习题.多态.场景一;

/**
 * 动都有吃饭的功能，但是小狗吃的是狗粮，
 * 小猫吃的猫粮，当们将小猫小狗体貌特征遮盖住的时候，
 * 如何判定吃东西的是小猫还是小狗？如果是小猫就调用粘人的功能
 * 小狗就是看门的功能 编程模拟
 */
public class demo1 {
    public static void main(String[] args) {
        animal a1 = new cat();
        animal a2 = new dog();
        checkAnimal(a1);
        checkAnimal(a2);
    }
    public static void checkAnimal(animal animal){
        if (animal instanceof cat){
            System.out.print("cat:");
            cat cat = (cat) animal;
            cat.show();
        }else if(animal instanceof dog){
            System.out.printf("dog:");
            dog dog = (dog) animal;
            dog.show();
        }
    }
}
class animal{
    public int eat(){
        System.out.println("cf");
        return 0;
    }
}
class cat extends animal{
    @Override
    public int eat() {
        System.out.println("ml");
        return 1;
    }
    public void show(){
        System.out.println("nr");
    }
}
class dog extends animal{
    @Override
    public int eat() {
        System.out.println("gl");
        return 2;
    }
    public void show(){
        System.out.println("km");
    }
}