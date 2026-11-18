
public class typecasting {
    public static void main(String[] args) {

        // Widening Casting
        int a = 10;
        double b = a;

        System.out.println("Widening Casting:");
        System.out.println("Integer value: " + a);
        System.out.println("Double value: " + b);

        // Narrowing Casting
        double x = 25.75;
        int y = (int) x;

        System.out.println("\nNarrowing Casting:");
        System.out.println("Double value: " + x);
        System.out.println("Integer value: " + y);
    }
}


