public class SingleTryBlock {
    public static void main(String args[]){
        try{
            int i=10/0;
            System.out.println("Result: "+i);
        }catch (ArithmeticException arithmeticException){
            System.out.println("Caught Arithmetic Exception: "+arithmeticException.getMessage());
        }finally {
            System.out.println("Block executed");
        }
        System.out.println("Done ");
    }

}
