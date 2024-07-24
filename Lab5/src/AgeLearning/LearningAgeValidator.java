package AgeLearning;

import java.util.Scanner;

public class LearningAgeValidator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Name: ");
        String name = input.nextLine();
        System.out.print("Enter Age: ");
        int age = input.nextInt();

        LearningModule learningModule=new LearningModule();
        try{
            String learningCode=learningModule.getLearningcode(name,age);
            System.out.println("Your learningCode: "+ learningCode);
        }catch (WrongInputException wrongInputException){
            System.out.println(wrongInputException.getMessage());
        }

    }
}

//For InvalidAgeException
class InvalidAgeException extends Exception {
    public InvalidAgeException (){
        super();
    }
    public InvalidAgeException(String message){
        super((message));
    }
    public InvalidAgeException (String message, Throwable cause){
        super(message, cause);
    }
//    public InvalidAgeException (String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace){
//        super(message, cause, enableSuppression, writableStackTrace);
//    }
}

//For WrongInputException
class WrongInputException extends RuntimeException {
    public WrongInputException (){
        super();
    }
    public WrongInputException(String message){
        super((message));
    }
    public WrongInputException (String message, Throwable cause){
        super(message, cause);
    }
//    public WrongInputException (String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace){
//        super(message, cause, enableSuppression, writableStackTrace);
//    }
}

//For ageValidator
class AgeValidator{
    public String getAgeCode(int age) throws InvalidAgeException {
        if(age<0){
            throw new InvalidAgeException("Invalid Age");
        }
        else if(age<=18){
            return "Child";
        }else {
            return "Adult";
        }
    }
}

//Learning Module
class LearningModule{
    public String getLearningcode(String name,int age) throws WrongInputException {
        try {
            String ageCode="";
            AgeValidator ageValidator = new AgeValidator();
            return name + ageValidator.getAgeCode(age);
        }catch (InvalidAgeException invalidAgeException){
            throw new WrongInputException("Invalid age: " + invalidAgeException.getCause());
        }
    }
}
