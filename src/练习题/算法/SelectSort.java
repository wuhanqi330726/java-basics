package ��ϰ��.�㷨;

import java.util.Arrays;

//��������
public class SelectSort {
    public static void main(String[] args) {
        int[] a = {1,2,3,5,6,7,89,3,6,15,63};
        for (int i = 1 ; i < a.length;i++){
            int j = i;
            int target = a[i];
            while (j>0 && target < a[j-1]){
                a[j] = a[j-1];
                j --;
            }
//            System.out.println(Arrays.toString(a));

            a[j] = target;
        }
        System.out.println(Arrays.toString(a));
    }
}
