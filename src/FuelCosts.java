import java.util.Scanner;

public class FuelCosts {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double gallons = 0, mpg = 0, pricePerGallon = 0;
        boolean done = false;

        do {
            System.out.print("Enter gallons of gas in the tank: ");
            if (in.hasNextDouble()) {
                gallons = in.nextDouble();
                done = true;
            } else {
                System.out.println("Invalid input! Please enter a numeric value.");
                in.nextLine();
            }
        } while (!done);

        done = false;

        do {
            System.out.print("Enter fuel efficiency (miles per gallon): ");
            if (in.hasNextDouble()) {
                mpg = in.nextDouble();
                done = true;
            } else {
                System.out.println("Invalid input! Please enter a numeric value.");
                in.nextLine();
            }
        } while (!done);

        done = false;

        do {
            System.out.print("Enter price of gas per gallon: ");
            if (in.hasNextDouble()) {
                pricePerGallon = in.nextDouble();
                done = true;
            } else {
                System.out.println("Invalid input! Please enter a numeric value.");
                in.nextLine();
            }
        } while (!done);

        double costToDrive100Miles = (100 / mpg) * pricePerGallon;
        double distanceWithFullTank = gallons * mpg;

        System.out.println("Cost to drive 100 miles: " + costToDrive100Miles);
        System.out.println("Distance the car can go with a full tank: " + distanceWithFullTank);

        in.close();
    }
}
