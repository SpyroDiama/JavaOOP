package Homework1_C;
//Importing Scanner for user input.
import java.util.Scanner;

public class CarRental {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Car array with a fleet of cars, a fleet is 5 cars.
        Car[] cars = {
                new Car("Nissan Navara", "H2342", 72000),
                new Car("Honda Civic", "S4231", 4100),
                new Car("Ford Focus ST line", "M2312", 60000),
                new Car("BMW X6", "123X2", 32300),
                new Car("Audi S3", "6521J", 432000),

        };


        while (true) {
            //Menu Output.
            System.out.println("Menu:");
            System.out.println("1. Rent a car");
            System.out.println("2. Return a car");
            System.out.println("3. Display all cars");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");

            int choice = scanner.nextInt();
            scanner.nextLine();

            Scanner sc;
            if (choice == 1) {
                // Rent a car
                System.out.print("Enter plate number: ");
                String plate = scanner.nextLine();
                boolean found = false;

                for (Car car : cars) {
                    if (car.getPlateNumber().equalsIgnoreCase(plate)) {
                        found = true;


                        if (!car.isRented()) {
                            car.rentCar();
                            System.out.println("Car rented successfully.");
                        } else {
                            System.out.println("Sorry, this car is already rented.");
                        }
                        break;
                    }
                }

                //Case if vehile is not found.
                if (!found) {
                    System.out.println("Car not found.");
                }

            } else if (choice == 2) {

                System.out.print("Enter plate number: ");
                String plate = scanner.nextLine();
                boolean found = false;

            }
        }


    }
}