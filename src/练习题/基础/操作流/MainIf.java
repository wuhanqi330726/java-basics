package ��ϰ��.����.������;

import java.util.Scanner;

/**
 * ����ǰ��Ĳ�������ϰ-BMI���������жϵĸĽ���
 *
 * ʹ��Scanner�ռ����������أ�����������BMIֵ�Ƕ���
 *
 * BMI�ļ��㹫ʽ�� ����(kg) / (���*���)
 *
 * ������������������72kg, �����1.69����ô��λͬѧ��BMI����
 * 72 / (1.69*1.69) = ?
 *
 * Ȼ��ͨ�������ж�BMI�ķ�Χ����ӡ���ǳ��ػ�������
 *
 */
public class MainIf {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("�������");
        double mi = in.nextDouble();
        System.out.println("��������");
        double kg = in.nextDouble();
        double BMI = kg/(mi*mi);
        System.out.println(BMI);
        if (BMI < 18.5){
            System.out.println("����");
        }else if (18.5 <= BMI & BMI <24){
            System.out.println("����");
        }else if (24<= BMI) {
            System.out.println("����");
        }

    }

}
