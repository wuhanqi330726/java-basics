package ��ϰ��.���󷽷�.test.cat;

public class demo {
    public static void main(String[] args) {

    }
}
abstract class car{
//    ��װ����
    public  abstract void setParts();
}
class houche extends car{
    @Override
    public void setParts() {
        System.out.println("��װ����");
    }
}
class keche extends car{
    @Override
    public void setParts(){
        System.out.println("��װ��λ");
    }
}
