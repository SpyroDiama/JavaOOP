package Homework1_C;

public class Car {
    private String model;
    private String plateNumber;
    private int kilometers;
    private boolean isRented;


    public Car(String model, String plateNumber, int kilometers) {
        this.model = model;
        this.plateNumber = plateNumber;
        this.kilometers = kilometers;
        this.isRented = false;


    }
        public String getPlateNumber() {
        return plateNumber;
        }

        public boolean isRented() {
        return isRented;
        }

        public void returnCar(int newKilometers) {
        isRented = false;
        kilometers = newKilometers;
        }

        public void displayInfo() {
        System.out.println("Model: " + model +
                ", Kilometers: " + kilometers +
                ", Rented: " + (isRented? "Yes" : "No"));
        }
        public void rentCar() {
        isRented = true;
        }
}

