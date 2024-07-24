package accessmodifiers.p1;

public class C1P1 {
    private int privateVar=1;
    public static void main(String[] args) {
        C1P1 c1p1 = new C1P1();
        //private variable is not accessible in other classes
        System.out.println(c1p1.privateVar);
    }
}
