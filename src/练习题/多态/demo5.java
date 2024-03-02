package ¡∑œ∞Ã‚.∂‡Ã¨;

public class demo5 {
    public static void main(String[] args) {
        mapTeacher mapTeacher = new mapTeacher();
        englishTeacher englishTeacher = new englishTeacher();
        show(mapTeacher);
        show(englishTeacher);
    }
    public static void show(Teacher teacher){
        teacher.teach();
        teacher.guide();
    }
}
interface Teacher{
    void teach();
    void guide();
}
class englishTeacher implements Teacher{
    @Override
    public void teach() {
        System.out.println("csfy");
    }

    @Override
    public void guide() {
        System.out.println("tyw");
    }
}
class mapTeacher implements Teacher{
    @Override
    public void teach() {
        System.out.println("xx");
    }

    @Override
    public void guide() {
        System.out.println("cz");
    }
}
