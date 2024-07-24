import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        System.out.println(main.addof(10,20));
        System.out.println(main.addof(10,20,30));
        System.out.println(main.addof(10.5,20.1));
        System.out.println(main.addof("Hello",20));
    }


        int addof(int a, int b) {
            return a + b;
        }
        int addof(int a, int b, int c) {
            return a + b + c;
        }
        double addof(double a, double b) {
            return a+b;
        }
        String addof(String a, int b) {
            return a + " " + b;
        }



}
