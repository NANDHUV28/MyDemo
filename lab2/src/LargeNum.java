import java.util.Scanner;

public class LargeNum {
    public int findLargeNum(int num1,int num2,int num3){
        int largestnum=num1;
        if(num2>largestnum){
            largestnum=num2;
        }
        if(num3>largestnum){
            largestnum=num3;
        }
        return largestnum;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the first number");
        int num1=sc.nextInt();
        System.out.println("Enter the second number");
        int num2=sc.nextInt();
        System.out.println("Enter the third number");
        int num3=sc.nextInt();
        LargeNum largeNum=new LargeNum();
        System.out.println(largeNum.findLargeNum(num1,num2,num3));
    }
}
