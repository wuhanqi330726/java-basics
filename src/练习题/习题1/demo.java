package ��ϰ��.ϰ��1;

/**
 * ʹ�ñ����������С��,�����÷�����ӡ
 * ���ԣ�Ʒ�֣��Ա�����
 * ����:�Է������ţ�tostring()
 */
public class demo {
    public static void main(String[] args) {
        dog dog =new dog("�й�",true,12);

        System.out.println(dog.toString());

    }
}
class dog {
    private String variety;//Ʒ������
    private boolean gender;//�Ա�����
    private int age; //��������

    public dog() {
    }
//������Է�
    public static void eat(){
        System.out.println("С����Է�");
    }
//    �ῴ��
    public static void professional(){
        System.out.println("С���ῴ��");
    }

    public dog(String variety, boolean gender, int age) {
        this.variety = variety;
        this.gender = gender;
        this.age = age;
    }

    public String getVariety() {
        return variety;
    }

    public void setVariety(String variety) {
        this.variety = variety;
    }

    public boolean isGender() {
        return gender;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
//
        eat();
        professional();
        return "dog{" +
                "variety='" + variety + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                '}';
    }
}