package ��ϰ��.�ֲ��ڲ���;

/**
 * �ֲ������еķ������ڲ�
 * Ӧ�ó���
 * ����һ��������Ҫ���ص��ǳ�������߽ӿڵĶ��󡣴�ʱ��Ϊ��������߽ӿڲ��ܴ�������
 * �����ȴ���һ�������̳л�ʵ�ֳ����࣬�ٴ�������Ķ���
 * �����������ڷ����ڲ����࣬Ŀ����Ϊ�˽�ʡ�ഴ�������Ŀ���
 */
public class demo1 {
    public static void main(String[] args) {
//        ������������þֲ��ڲ���
        getAnimal();
//        dog dog = new dog();
//        dog.eat();
    }
    public static animal getAnimal(){
//        �ֲ��ڲ��� ==
        class cat extends animal{

            @Override
            public void eat() {
                System.out.println("è��è��");
            }
        }
        cat cat = new cat();
//        animal�����ʵ����һ��cat����Լ���� animal cat = new cat����
//        �����һ�ֶ�̬
        cat.eat();
        return cat;
    }
}
abstract class animal{
    public abstract void eat();
}

