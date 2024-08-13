package Á·Ï°Ìâ.Ëã·¨;

public class code01 {
    public static void print(int i){
        for (int a = 31 ;i>0;i--){
            System.out.print((a&(1<<i))==0?"0":"1");
        }
    }
    public static void main(String[] args) {
        int i = 808020;
        print(i);
    }
}
