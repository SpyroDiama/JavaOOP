package Homework1_C;

import java.util.Scanner;

public class CarRental {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Car array with a fleet of cars, a fleet is 5 cars.
        Car[] cars = {
                new Car("HIV690", "Nissan Navara", 72000),
                new Car("SPI420", "Honda Civic", 4100),
                new Car("JWX999", "Ford Focus ST line", 60000),
                new Car("AL4K5O", "BMW X6", 32300),
                new Car("GPK100", "Audi S3", 432000),

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