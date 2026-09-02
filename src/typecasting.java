public class typecasting {
    public static void main(String[] args) {

        // Implicit Typecasting (Widening)
        int num = 100;
        double decimal = num; // int to double

        System.out.println("Implicit Typecasting:");
        System.out.println("Integer value: " + num);
        System.out.println("Converted to double: " + decimal);

        // Explicit Typecasting (Narrowing)
        double price = 99.99;
        int newPrice = (int) price; // double to int

        System.out.println("\nExplicit Typecasting:");
        System.out.println("Double value: " + price);
        System.out.println("Converted to int: " + newPrice);
    }
}