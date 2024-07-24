import java.util.Scanner;

public class Message {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the message: ");
        String name=sc.nextLine();

        String msg=generateMessage(name);
        System.out.println(msg);

    }
    public static String generateMessage(String name){
        return "Hello " + name + ", Welcome to Java World!";
    }
}
