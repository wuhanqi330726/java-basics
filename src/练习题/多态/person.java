package 练习题.多态;

/**
 * 多态；
 * 1.定义：一种事物的多种形态
 * 2.多态的出现场景
 * 1）父类的引用指向子类对象的实体 == 也称为向上转型
 *      多态使用的情况下，编译时看等号的左边，运行时看右边
 *      如果一定要调用独有的方法，就需要通过向下转型来实现
 * 2)接口的引用指向接口实现类的实体（接口中）
 *     person 中会变成一个接口
 * 3）向下转型和向上转型
 * 向上转型：父类的引用指向子类的对象的实体
 * 向下转型：强制把子类的对象（的父类的引用）转换成子类的引用。
 *      向下转型会有数据转换的异常需要用到instanceof
 * instanceof出现布尔值用if进行判断
 */
public class person {
    private String name;
    private int age;

    public void dancing(){
        System.out.println("wd");
    }

    public person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public person() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

class man extends person{
    @Override
    public void dancing() {
        System.out.println("jxie");
    }
//    独有的
    public void sporting(){
        System.out.println("xhyd");
    }
}class woman extends person{
    @Override
    public void dancing() {
        System.out.println("民族");
    }
    public void shoping(){
        System.out.println("gouwu");
    }
}class demo1{
    public static void main(String[] args) {
        man man = new man();
        woman woman = new woman();
//        man.dancing();
//        woman.dancing();
        show(man);
        show(woman);
//多态时左边 当左边有这个方法存在时多态运行看右边
//        person person = new man();
//        person.sporting();
//        person person1 = new woman();

    }
//向下转型==》强制类型转换 instanceof来判断
    public static void show(person person){
//        person.dancing();
        if (person instanceof man){
            man man = (man) person;
            man.sporting();
        }else if (person instanceof woman){
            woman woman = (woman) person;
            woman.shoping();
        }

    }
}