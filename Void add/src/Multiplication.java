import java.util.Scanner;

public class Multiplication {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        int i=1;  //intialise
        while(i<=10){   // iterate
            int prod=a*i;
            System.out.println(a + " * " + i + " = " +prod);
            i++;   // increment the count
        }
    }
}
