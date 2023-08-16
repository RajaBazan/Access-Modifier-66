package hello.com;
class C1{
    public int a = 5;
    protected int b = 10;
    int c = 15;
    private int d =20;
    public void meth1(){
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
    }
}
public class Lec_66_Acess_Modifier {
    public static void main(String[] args) {
        C1 c = new C1();
//        c.meth1();
        System.out.println(c.a);
        System.out.println(c.b);
        System.out.println(c.c);
//        System.out.println(c.d);
    }
}
