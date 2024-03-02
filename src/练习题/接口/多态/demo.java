package 练习题.接口.多态;

public class demo {
    public static void main(String[] args) {
        cxy cxy = new cxy();
        hr hr = new hr();
        show(cxy);
        show(hr);
    }
    public static void show(employee employee){
        employee.work();
    }
}
interface employee{
    void work();
}
class cxy implements employee{

    @Override
    public void work() {
        System.out.println("dadaim");
    }
}
class hr implements employee{

    @Override
    public void work() {
        System.out.println("zhaoren");
    }
}
