public class Age {
    public static void main(String[] args) {
        int age = 130;
        try {
            if (age < 21 || age > 80) {
//                InvalidAgeException invalidAgeException = new InvalidAgeException();
//                throw invalidAgeException;
                //If above method not done we should throw the exception
                throw new InvalidAgeException("Invalid age");
            }
            System.out.println("Great! You are eligible!");
        } catch (InvalidAgeException invalidAgeException) {
            System.out.println(invalidAgeException.getMessage());
        }

    }
}
    class InvalidAgeException extends Exception {
        public InvalidAgeException (){
            super();
        }
        //Message - the detail message (which is saved for later retrieval by the getMessage() method)
        public InvalidAgeException(String message){
            super((message));
        }
        //. cause – the cause (which is saved for later retrieval by the getCause() method). (A null value is permitted, and indicates that the cause is nonexistent or unknown.)
        public InvalidAgeException (String message, Throwable cause){
            super(message, cause);
        }
        //enableSuppression – whether or not suppression is enabled or disabled
        //writableStackTrace – whether or not the stack trace should be writable
//        public InvalidAgeException (String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace){
//            super(message, cause, enableSuppression, writableStackTrace);
//        }

    }


