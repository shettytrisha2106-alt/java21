import java.util.Scanner;
public class Areaperimeter {


    static void square(double side) {
        double area = side * side;
        double perimeter = 4 * side;

        System.out.println("Square Area = " + area);
        System.out.println("Square Perimeter = " + perimeter);
    }


    static void rectangle(double length, double breadth) {
        double area = length * breadth;
        double perimeter = 2 * (length + breadth);

        System.out.println("Rectangle Area = " + area);
        System.out.println("Rectangle Perimeter = " + perimeter);
    }


    static void triangle(double a, double b, double c) {
        double s = (a + b + c) / 2;
        double area = Math.sqrt(s * (s - a) * (s - b) * (s - c));
        double perimeter = a + b + c;

        System.out.println("Triangle Area = " + area);
        System.out.println("Triangle Perimeter = " + perimeter);
    }

    // Circle
    static void circle(double radius) {
        double area = Math.PI * radius * radius;
        double perimeter = 2 * Math.PI * radius;

        System.out.println("Circle Area = " + area);
        System.out.println("Circle Perimeter = " + perimeter);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter side of square: ");
        double side = sc.nextDouble();
        square(side);

        System.out.print("\nEnter length and breadth of rectangle: ");
        double length = sc.nextDouble();
        double breadth = sc.nextDouble();
        rectangle(length, breadth);

        System.out.print("\nEnter three sides of triangle: ");
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();
        triangle(a, b, c);

        System.out.print("\nEnter radius of circle: ");
          double radius = sc.nextDouble();
        circle(radius);

        sc.close();
    }
}