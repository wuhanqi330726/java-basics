package 练习题.基础.操作流;

import java.util.Scanner;

/**
 * 基于前面的操作符练习-BMI，做基于判断的改进：
 *
 * 使用Scanner收集你的身高体重，并计算出你的BMI值是多少
 *
 * BMI的计算公式是 体重(kg) / (身高*身高)
 *
 * 比如邱阳波的体重是72kg, 身高是1.69，那么这位同学的BMI就是
 * 72 / (1.69*1.69) = ?
 *
 * 然后通过条件判断BMI的范围，打印出是超重还是正常
 *
 */
public class MainIf {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("输入身高");
        double mi = in.nextDouble();
        System.out.println("输入体重");
        double kg = in.nextDouble();
        double BMI = kg/(mi*mi);
        System.out.println(BMI);
        if (BMI < 18.5){
            System.out.println("过轻");
        }else if (18.5 <= BMI & BMI <24){
            System.out.println("正常");
        }else if (24<= BMI) {
            System.out.println("过重");
        }

    }

}
