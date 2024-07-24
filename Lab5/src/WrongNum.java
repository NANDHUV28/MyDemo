public class WrongNum {
    public static void main(String[] args) {
        int number=-10;
        try {
            if(number<0) {
                throw new WrongInputException("Number entered is negative: "+number);
            }
            System.out.println("Or else positive value"+number);
        }catch (WrongInputException wrongInputException){
            System.out.println(wrongInputException.getMessage());
        }
    }
}

class WrongInputException extends RuntimeException {
    public WrongInputException (){
        super();
    }
    //Message - the detail message (which is saved for later retrieval by the getMessage() method)
    public WrongInputException(String message){
        super((message));
    }
    //. cause – the cause (which is saved for later retrieval by the getCause() method). (A null value is permitted, and indicates that the cause is nonexistent or unknown.)
    public WrongInputException (String message, Throwable cause){
        super(message, cause);
    }
    //enableSuppression – whether or not suppression is enabled or disabled
    //writableStackTrace – whether or not the stack trace should be writable
//    public WrongInputException (String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace){
//        super(message, cause, enableSuppression, writableStackTrace);
//    }

}