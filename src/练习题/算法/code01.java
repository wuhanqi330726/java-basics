package Á·Ï°Ìâ.Ëã·¨;

public class code01 {
    public static void print(int num){
        for (int a = 31 ;a>=0;a--){
            System.out.print((num & (1<<a) )==0?"0":"1");
        }
    }
    public static void main(String[] args) {
        int i = 8989;
        print(i);
    }
}
