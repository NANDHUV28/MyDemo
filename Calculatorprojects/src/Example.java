import java.util.Scanner;

public class Example {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        double a = sc.nextDouble();
        System.out.println("Enter the second number: ");
        double b = sc.nextDouble();

        double sum = cal.add(a, b);
        System.out.println("The sum is: " + sum);

        double difference = cal.sub(a, b);
        System.out.println("The difference is: " + difference);

        double product = cal.mul(a, b);
        System.out.println("The product is: " + product);

        double division = cal.div(a, b);
        System.out.println("The division is: " + division);
    }
}
