public class UnhandledException {
    public static void main(String[] args) {
        //System.out.println("The calculator app");
//        int num1=0;
//        int num2=100;
//        int result=num1/num2;
//        System.out.println(result); //arithmetic exception

//        int arr[]=new int[3];
//        arr[0]=10;
//        arr[1]=20;
//        arr[2]=30;
//        System.out.println(arr[0]);
//        System.out.println(arr[5]);  //exception in thread "main" java.lang.ArrayIndexOutOfBoundsException

        String testString="welcome";
        String upperCase=testString.toUpperCase();
        System.out.println(upperCase);
        System.out.println("Caller begin");
        called();   //so this will not be called and will be returned here & send to jvm
        System.out.println("Back to caller");


    }

    public static void called(){
        System.out.println("The calculator app");
        int num1=0;
        int num2=100;
        int result=num1/num2;   //exception will be thrown  here
        System.out.println(result);  //will not be executed
    }
}
