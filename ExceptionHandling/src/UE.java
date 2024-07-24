public class UE {
    public static void main(String[] args) {
        System.out.println("UE");   //printed
        int i=100;
        int j=0;
        String string=null;
        try{
            System.out.println("try");   //printed
            j=i/0;                       // exception occured so moved to catch or finally block(ArithmeticException)
            System.out.println("Value : "+ j);  //skipped
        }
        catch(NullPointerException nullPointerException){
            //mentioned before Throwable cls becoz Throwable is a base cls
            System.out.println("NullPointerException" + nullPointerException.getMessage());
            //getMessage()-returns a message from one of several possible sources.
        }
        catch (Throwable throwable){
            System.out.println("catch");  //catched here so print statement works
        }

        finally {
            System.out.println("Finally");  //printed
        }
        string.toUpperCase();
        System.out.println(j); //will print when catch block given only!
    }
}
