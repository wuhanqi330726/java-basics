package ��ϰ��.�㷨;
//ð������
//ѡ��������ð�������е����Ƶ��Ƿ�����һ������ԭ����ͬ
import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] a = {1,2,3,5,6,7,89,3,6,15,63};
        for (int i = 0; i <a.length-1;i++){
            for (int f = a.length-1; f > i; f--){
                if (a[f]<a[f-1]){
                    int temp = a[f-1];
                    a[f-1] = a[f];
                    a[f] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(a));
    }
}
