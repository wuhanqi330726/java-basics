package 练习题.算法;
//冒泡排序
//选择排序与冒泡排序有点相似但是方法不一样而已原理相同
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
