package accessmodifiers.p1;

public class C2P1 {
    public static void main(String[] args) {
        //'privateVar' has priavte access in 'accessmodifiers.p1.C1P1'
        C1P1 c1p1 = new C1P1();
        //private variable is not accessible in other classes
        System.out.println(c1p1.privateVar);
    }
}
