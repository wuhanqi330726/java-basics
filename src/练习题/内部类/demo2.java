package ��ϰ��.�ڲ���;
//���÷���
/*
 ��Ա�ڲ���
 ���� �ڲ���ֱ�Ӷ���������ڲ����������ⲿ
 ʹ��
 �ⲿ��.�ڲ��� ���� = �ⲿ��.new �ڲ��ࣨ��
 */
public class demo2 {
    public static void main(String[] args) {
        A a = new A();
//        b�Ĺ�����ֻ����A�в����ҵ�
        A.B b = a.new B();
//        ������̬�ڲ���
        c.D d = new c.D();
    }
}
class A {
    class B{

    }
}
class c{
    static class D{}
}