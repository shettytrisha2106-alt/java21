import java.util.Scanner ;
class studentmarks{
    public static void main(String[] args)  {
        Scanner sc = new Scanner(System.in);
        String topper = "";
        int highest = 0;
        for (int i = 1; i <= 5; i++) {
            System.out.print("Enter name: ");
            String name = sc.next();
            System.out.print("Enter age: ");
            int age = sc.nextInt();
            System.out.print("Enter 5 subject marks: ");
            int s1 = sc.nextInt();
            int s2 = sc.nextInt();
            int s3 = sc.nextInt();
            int s4 = sc.nextInt();
            int s5 = sc.nextInt();
            int total = s1 + s2 + s3 + s4 + s5;
            double average = total / 5.0;
            System.out.println("Total = " + total);
            System.out.println("Average = " + average);
            if (total > highest) {
                highest = total;
                topper = name;
            }
        }
        System.out.println("Topper = " + topper);
        System.out.println("Highest Total = " + highest);
        sc.close();
    }
}