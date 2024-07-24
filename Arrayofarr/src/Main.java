import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Laptop[] laptops = new Laptop[n];
        for (int i = 0; i < n; i++) {
            laptops[i]=new Laptop();
            laptops[i].SNo=sc.nextInt();
            laptops[i].Price=sc.nextInt();
            laptops[i].Model=sc.next();
            laptops[i].Employeename= sc.next();
        }

        System.out.println("Search for laptop by SNo ");
        int a=sc.nextInt();
        if(laptops[i]==a){
            System.out.println(a);
        }
        System.out.println("update for laptop by SNo");
        int b=sc.nextInt();
        if(laptops[i]==b){
            System.out.println(b);
        }

    }
}
