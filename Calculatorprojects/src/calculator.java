import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the first number: ");
//        double a = sc.nextDouble();
//        System.out.println("Enter the second number: ");
//        double b = sc.nextDouble();

//        double sum=cal.add(a,b);
//        System.out.println("The sum is: "+sum);
//
//        double difference=cal.sub(a,b);
//        System.out.println("The difference is: "+difference);
//
//        double product=cal.mul(a,b);
//        System.out.println("The product is: "+product);
//
//        double division=cal.div(a,b);
//        System.out.println("The division is: "+division);

        System.out.println("Enter the first number: ");
        double a = sc.nextDouble();
        System.out.println("Enter the second number: ");
        double b = sc.nextDouble();
        boolean exit = false;
        while (!exit) {
            System.out.println("Enter the operator (+, -, *, /): ");
            System.out.println("1.addition");
            System.out.println("2.subtraction");
            System.out.println("3. multiplication");
            System.out.println("4.division");
            System.out.println("5.invalid");


            int choice = sc.nextInt();
//            System.out.println("Enter the first number: ");
//            double a = sc.nextDouble();
//            System.out.println("Enter the second number: ");
//            double b = sc.nextDouble();

            switch (choice) {
                case 1:
                    System.out.println(cal.add(a, b));
                    break;

                case 2:
                    System.out.println(cal.sub(a, b));
                    break;

                case 3:
                    System.out.println(cal.mul(a, b));
                    break;

                case 4:
                    System.out.println(cal.div(a, b));
                    break;

                default:
                    exit = true;
                    System.out.println("Exist calculator");
                    break;
            }
        }



    }
}

