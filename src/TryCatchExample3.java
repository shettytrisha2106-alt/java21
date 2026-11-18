public class TryCatchExample3 {
    public static void main(String[] args) {
        try {
            int data = 50 / 0;  // May throw exception
            System.out.println("Rest of the code");
        }
        catch (ArithmeticException e) {
            System.out.println(e);
        }
    }
}