package ��ϰ��.����;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

@SuppressWarnings("all")
public class ArrayListDamoTest {
    public static void main(String[] args) {
        int[] a = {1,2,3,4,5,6,12,3,1,34,12,3};
//        Ӧ��arraylist����ж�arraylist�Ĵ洢���͵��Զ���
//        ��int������
        ArrayList array = new ArrayList<Integer>();
//        ��a�е����ݴ��䵽array��ȥ��array�еĿ��Դ洢��a�е�����
        for (int i = 0; i<a.length;i++){
            array.add(a[i]);
        }
//        ��ָ����λ�ò�������
        array.add(1,2);
//        ��addall�������ж��һ��д��
        array.addAll(Collections.singleton(Arrays.toString(a)));
//        ��array�������
        System.out.println(array);
        System.out.println(array.toArray().length);
        System.out.println(array.get(1));

    }
}
