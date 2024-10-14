import java.util.Scanner;

public class Rectangleinfo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double width = 0, height = 0;
        boolean done = false;

        do {
            System.out.print("Enter the width of the rectangle: ");
            if (in.hasNextDouble()) {
                width = in.nextDouble();
                done = true;
            } else {
                System.out.println("Invalid input! Please enter a numeric value.");
                in.nextLine();
            }
        } while (!done);

        done = false;

        do {
            System.out.print("Enter the height of the rectangle: ");
            if (in.hasNextDouble()) {
                height = in.nextDouble();
                done = true;
            } else {
                System.out.println("Invalid input! Please enter a numeric value.");
                in.nextLine();
            }
        } while (!done);

        double area = width * height;
        double perimeter = 2 * (width + height);
        double diagonal = Math.sqrt((width * width) + (height * height));

        System.out.println("Area of the rectangle: " + area);
        System.out.println("Perimeter of the rectangle: " + perimeter);
        System.out.println("Diagonal of the rectangle: " + diagonal);

        in.close();
    }
}
