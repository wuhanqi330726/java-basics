package ��ϰ��.��̬;

/**
 * ��̬��
 * 1.���壺һ������Ķ�����̬
 * 2.��̬�ĳ��ֳ���
 * 1�����������ָ����������ʵ�� == Ҳ��Ϊ����ת��
 *      ��̬ʹ�õ�����£�����ʱ���Ⱥŵ���ߣ�����ʱ���ұ�
 *      ���һ��Ҫ���ö��еķ���������Ҫͨ������ת����ʵ��
 * 2)�ӿڵ�����ָ��ӿ�ʵ�����ʵ�壨�ӿ��У�
 *     person �л���һ���ӿ�
 * 3������ת�ͺ�����ת��
 * ����ת�ͣ����������ָ������Ķ����ʵ��
 * ����ת�ͣ�ǿ�ư�����Ķ��󣨵ĸ�������ã�ת������������á�
 *      ����ת�ͻ�������ת�����쳣��Ҫ�õ�instanceof
 * instanceof���ֲ���ֵ��if�����ж�
 */
public class person {
    private String name;
    private int age;

    public void dancing(){
        System.out.println("wd");
    }

    public person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public person() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

class man extends person{
    @Override
    public void dancing() {
        System.out.println("jxie");
    }
//    ���е�
    public void sporting(){
        System.out.println("xhyd");
    }
}class woman extends person{
    @Override
    public void dancing() {
        System.out.println("����");
    }
    public void shoping(){
        System.out.println("gouwu");
    }
}class demo1{
    public static void main(String[] args) {
        man man = new man();
        woman woman = new woman();
//        man.dancing();
//        woman.dancing();
        show(man);
        show(woman);
//��̬ʱ��� ������������������ʱ��̬���п��ұ�
//        person person = new man();
//        person.sporting();
//        person person1 = new woman();

    }
//����ת��==��ǿ������ת�� instanceof���ж�
    public static void show(person person){
//        person.dancing();
        if (person instanceof man){
            man man = (man) person;
            man.sporting();
        }else if (person instanceof woman){
            woman woman = (woman) person;
            woman.shoping();
        }

    }
}