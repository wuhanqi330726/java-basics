package 练习题.集合;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

@SuppressWarnings("all")
public class ArrayListDamoTest {
    public static void main(String[] args) {
        int[] a = {1,2,3,4,5,6,12,3,1,34,12,3};
//        应用arraylist类进行对arraylist的存储类型的自定义
//        用int来测试
        ArrayList array = new ArrayList<Integer>();
//        把a中的数据传输到array中去是array中的可以存储案a中的数据
        for (int i = 0; i<a.length;i++){
            array.add(a[i]);
        }
//        在指定的位置插入数据
        array.add(1,2);
//        用addall方法进行多个一起写了
        array.addAll(Collections.singleton(Arrays.toString(a)));
//        对array进行输出
        System.out.println(array);
        System.out.println(array.toArray().length);
        System.out.println(array.get(1));

    }
}
