package ��ϰ��.��̬.����һ;

/**
 * �����гԷ��Ĺ��ܣ�����С���Ե��ǹ�����
 * Сè�Ե�è�������ǽ�СèС����ò�����ڸ�ס��ʱ��
 * ����ж��Զ�������Сè����С���������Сè�͵���ճ�˵Ĺ���
 * С�����ǿ��ŵĹ��� ���ģ��
 */
public class demo1 {
    public static void main(String[] args) {
        animal a1 = new cat();
        animal a2 = new dog();
        checkAnimal(a1);
        checkAnimal(a2);
    }
    public static void checkAnimal(animal animal){
        if (animal instanceof cat){
            System.out.print("cat:");
            cat cat = (cat) animal;
            cat.show();
        }else if(animal instanceof dog){
            System.out.printf("dog:");
            dog dog = (dog) animal;
            dog.show();
        }
    }
}
class animal{
    public int eat(){
        System.out.println("cf");
        return 0;
    }
}
class cat extends animal{
    @Override
    public int eat() {
        System.out.println("ml");
        return 1;
    }
    public void show(){
        System.out.println("nr");
    }
}
class dog extends animal{
    @Override
    public int eat() {
        System.out.println("gl");
        return 2;
    }
    public void show(){
        System.out.println("km");
    }
}