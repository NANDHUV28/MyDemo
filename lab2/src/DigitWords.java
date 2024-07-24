import java.util.Scanner;

public class DigitWords {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a digit: ");
        int digit = sc.nextInt();
        printDigitInWords(digit);
    }

    public static void printDigitInWords(int digit) {
        if(digit<100 || digit>999){
            System.out.println("Input must be 3 digit number");
        }
        String[] ones={"Zero","One","Two","Three","Four","Five","Six","Seven","Eight","Nine"};
        String output="";
        while(digit!=0){
            int rem=digit%10;   //gives remainder value
            digit=digit/10;
            output=ones[rem]+" "+output;
//            System.out.println(output);

        }
        System.out.println(output);
    }
}
