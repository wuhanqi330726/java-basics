public class ConcurrencyTest {
    private static final long count = 100000001;

    public static void main(String[] args) throws Exception{
        concurrency();
    }
    public static void concurrency() throws Exception{
        long start = System.currentTimeMillis();
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                int a = 0;
                for (int i = 0; i < count; i++) {
                    a += 5;
                }


            }
        });
        thread.start();
        int b = 0;
        for (int i = 0; i < count; i++) {
            b += 5;
        }
        long time = System.currentTimeMillis() - start;
        thread.join();
        System.out.println("concurrency:"+time+" "+"b:"+b);
    }
}
