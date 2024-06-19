package 练习题.习题1;

/**
 * 使用编程语言描述小狗,并调用方法打印
 * 属性：品种，性别年龄
 * 方法:吃饭，看门，tostring()
 */
public class demo {
    public static void main(String[] args) {
        dog dog =new dog("中国",true,12);

        System.out.println(dog.toString());

    }
}
class dog {
    private String variety;//品种属性
    private boolean gender;//性别属性
    private int age; //年龄属性

    public dog() {
    }
//方法会吃饭
    public static void eat(){
        System.out.println("小狗会吃饭");
    }
//    会看门
    public static void professional(){
        System.out.println("小狗会看门");
    }

    public dog(String variety, boolean gender, int age) {
        this.variety = variety;
        this.gender = gender;
        this.age = age;
    }

    public String getVariety() {
        return variety;
    }

    public void setVariety(String variety) {
        this.variety = variety;
    }

    public boolean isGender() {
        return gender;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
//
        eat();
        professional();
        return "dog{" +
                "variety='" + variety + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                '}';
    }
}