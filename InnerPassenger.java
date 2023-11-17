
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class InnerPassenger {
    private List<Passenger> passengers;

    public InnerPassenger() {
        passengers = new ArrayList<>();
        // Add the passenger to the list
        passengers.add(new Passenger("Ahmed Ali", "N12", 20507135, "13/12/1999", "Manama, Bahrain", 22244));
    }

    public void displayPassengerDetails() {
        // This method displays details for all passengers in the list.
        System.out.println("Passenger Details:");
        for (Passenger passenger : passengers) {
            System.out.println("\nName: " + passenger.getName() +
                    "\nSeat Number: " + passenger.getSeatNumber() +
                    "\nCPR: " + passenger.getCpr() +
                    "\nBirth Date: " + passenger.getBirthDate() +
                    "\nAddress: " + passenger.getAddress() +
                    "\nPassport Number: " + passenger.getPassportNum());
        }
    }

    public static void main(String[] args) {
        InnerPassenger flight = new InnerPassenger();
        Scanner scanner = new Scanner(System.in);
        String choice;

        // Ask the user to enter the cpr for the passenger 
        System.out.println("Enter passenger CPR:");
        int Cpr = scanner.nextInt();
        scanner.nextLine(); 

        boolean passengerExists = false;

        // Check if the entered CPR matches any passenger in the list
        for (Passenger passenger : flight.passengers) {
            if (Cpr == passenger.getCpr()) {
                passengerExists = true;
                break;
            }
        }
        // If the passenger exists, display menu options
        if (passengerExists) {
            System.out.println("1. Display Passenger Details");
            System.out.println("2. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextLine();

            switch (choice) {
                case "1":
                    flight.displayPassengerDetails();
                    break;
                case "2":
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice!");
            }
            // If the passenger doesn't exist, ask the user to try again
        } else {
            System.out.println("Passenger doesn't exist! Try again");
            Cpr = scanner.nextInt();
            scanner.nextLine(); 
        }
    }
}


        
    
    


    
