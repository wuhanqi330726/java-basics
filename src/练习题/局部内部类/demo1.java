package ��ϰ��.�ֲ��ڲ���;

public class demo1 {
    public static void main(String[] args) {

    }
    public static animal getAnimal(){
        class cat extends animal{

            @Override
            public void eat() {
                System.out.println("è��è��");
            }
        }
        cat cat = new cat();
//        animal�����ʵ����һ��cat����Լ���� animal cat = new cat����
//        �����һ�ֶ�̬
        return cat;
    }
}
abstract class animal{
    public abstract void eat();
}
