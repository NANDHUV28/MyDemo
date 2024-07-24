public class NestedTryCatch {
    public static void main(String args[]){
        try{
            int[] arr={1,2,3};
            System.out.println(arr[5]);
            System.out.println("Outer Try Block");
            try {
                int i=10/0;
                System.out.println("Inner try block: "+i);
            }catch (ArithmeticException arithmeticException){
                System.out.println("Inner catch block: "+arithmeticException.getMessage());
            }
        }catch (ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException){
            System.out.println("Outer catch block: "+arrayIndexOutOfBoundsException.getMessage());
        }
    }
}
