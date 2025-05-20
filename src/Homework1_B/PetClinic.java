package Homework1_B;
//Importing scanner for user input.
import java.util.Scanner;

public class PetClinic {
    public static void main(String[] args) {
//Array of 10 pets.
        Pets[] pets = new Pets[10];
        pets[0] = new Pets("Billy", "Dog");
        pets[1] = new Pets("Jack", "Cat");
        pets[2] = new Pets("Jane", "Dog");
        pets[3] = new Pets("Rick", "Rabbit");
        pets[4] = new Pets("Bob", "Cat");
        pets[2] = new Pets("Jason", "Duck");
        pets[3] = new Pets("Edgar", "Crow");
        pets[4] = new Pets("Loyd", "Parrot");
        pets[5] = new Pets("Fiodor", "Turtle");
        pets[6] = new Pets("Briana", "Mouse");
        pets[7] = new Pets("Malcom", "Cow");
        pets[8] = new Pets("Bourne", "Lizard");
        pets[9] = new Pets("Spike", "Dog");

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Pet Type: ");
        String inputType = sc.nextLine();
//Shows the pets to the user.
        boolean found = false;
        System.out.println("Pets Of Type " + inputType + "Are: ");

//For loop for printing the pet names.
        for (Pets pet : pets) {
            if (pet.getType().equalsIgnoreCase(inputType)) {
                System.out.println("--" + pet.getName());
                found = true;
            }
        }     //Case if pet type not found.
                if (!found) {
                    System.out.println("Pet Of This Type Not Found");
                }
    }
}
