public class JavaExceptionExample2 {
    public static void main(String[] args) {
        try {
            // Code that may raise exception
            int data = 100 / 0;
        }
        catch (ArithmeticException e) {
            System.out.println(e);
        }

        // Rest of the program
        System.out.println("Rest of the code...");
    }
}