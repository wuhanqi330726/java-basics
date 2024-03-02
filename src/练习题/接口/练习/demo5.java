package Á·Ï°Ìâ.½Ó¿Ú.Á·Ï°;

public class demo5 {
    public static void main(String[] args) {
        
    }
}
interface te{
    void teach();
    void guide();
}
class english implements te{

    @Override
    public void teach() {
        System.out.println("csfy");
    }

    @Override
    public void guide() {
        System.out.println("ts");
    }
}
class computer implements te{

    @Override
    public void teach() {
        System.out.println("sbsjx");
    }

    @Override
    public void guide() {
        System.out.println("fxdm");
    }
}
