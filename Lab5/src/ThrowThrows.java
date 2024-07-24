public class ThrowThrows {
    public static void main(String args[]) {
        try {
            int i = divideOf(10, 0);
            System.out.println("Result: " + i);
        } catch (ArithmeticException arithmeticException) {
            System.out.println("Caught Arithmetic Exception: " + arithmeticException.getMessage());
        } finally {
            System.out.println("Block executed");
        }
        System.out.println("Done ");
    }


    public static int divideOf(int a, int b) throws ArithmeticException {
        if (a == 0 || b == 0) {
            throw new ArithmeticException();
        }
        return a / b;
    }
}
