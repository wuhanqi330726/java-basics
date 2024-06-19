package 练习题.匿名内部类;

/**
 *
 */
public class demo {
    public static void main(String[] args) {
//        System.out.println(getTeacher().teach());
        person person = getperson();
        person.eat();
    }
    public static person getperson(){
        person person = new person(){
            private String name = "xiaom ";
            @Override
            public void eat() {
                System.out.println(name+"yaochiyouyingyangde chid ");
            }
        };
        return person;
    }
    public static teacher getTeacher(){
//        class englishTeacher implements teacher{
//
//            @Override
//            public void teach() {
//                System.out.println("syyk");
//            }
//        }

        teacher teacher = new teacher() {
            @Override
            public void teach() {
                System.out.println("syyk1");
            }
        };
        return teacher;
    }
}
interface teacher{
    void teach();
}
