package ¡∑œ∞Ã‚.À„∑®;

public class feiBoNaqie {
    private static int fib(int i){
        if (i == 1 || i == 2){
            return i-1;
        }
        int n = fib(i-1)+fib(i-2);
        return n;
    }

    public static void main(String[] args) {
        int res = fib(5);
        System.out.println(res);
    }
}
