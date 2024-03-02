package 练习题.多态.练习;
//属性无法被覆盖
public class demo {
    public static void main(String[] args) {
        father father = new son();
        System.out.println(father.getName());
    }
}
class father{
    private String name = "xm";

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
class son extends father{
    private String name = "xh";

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}