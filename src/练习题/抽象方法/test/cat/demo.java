package 练习题.抽象方法.test.cat;

public class demo {
    public static void main(String[] args) {

    }
}
abstract class car{
//    安装部件
    public  abstract void setParts();
}
class houche extends car{
    @Override
    public void setParts() {
        System.out.println("安装货箱");
    }
}
class keche extends car{
    @Override
    public void setParts(){
        System.out.println("安装座位");
    }
}
