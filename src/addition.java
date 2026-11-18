public class addition {

    // addition method
    public static int add(int x, int y) {
        int c = x + y;
        return c;
    }

    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int c;

        System.out.println("Welcome");
        c = add(a, b);
        System.out.println("Addition " + c);
        System.out.println("Thank you");
    }
}