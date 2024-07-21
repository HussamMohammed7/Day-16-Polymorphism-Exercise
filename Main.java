import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int user_input = 0;
        List<Vehicle> rentedVehicles = new ArrayList<>();

        do {
            System.out.println("Vehicle Rental System\n" +
                    "1. Rent a Car\n" +
                    "2. Rent a Bike\n" +
                    "3. Rent a Truck\n" +
                    "4. View Rented Vehicles\n" +
                    "5. Exit ");

            try {
                user_input = input.nextInt();

                switch (user_input) {
                    case 1:
                        input.nextLine();
                        System.out.println("Enter Car Model: ");
                        String user_car_model = input.nextLine();
                        System.out.println("Enter Rental Days: ");
                        int user_rental_days = input.nextInt();
                        Car car = new Car(user_rental_days, user_car_model);
                        rentedVehicles.add(car);
                        break;

                    case 2:
                        input.nextLine();
                        System.out.println("Enter Bike Brand: ");
                        String user_bike_brand = input.nextLine();
                        System.out.println("Hourly Rental Rate: ");
                        int user_bike_hour = input.nextInt();
                        Bike bike = new Bike(user_bike_brand, user_bike_hour);
                        rentedVehicles.add(bike);
                        break;

                    case 3:
                        input.nextLine();
                        System.out.println("Enter Truck Type: ");
                        String user_truck_type = input.nextLine();
                        System.out.println("Weekly Rental Rate: ");
                        int user_rental_weekly = input.nextInt();
                        Truck truck = new Truck(user_truck_type, user_rental_weekly);
                        rentedVehicles.add(truck);
                        break;

                    case 4:
                        System.out.println("*****************************************************");
                        System.out.println("Rented Vehicles: ");
                        for (Vehicle vehicle : rentedVehicles) {
                            vehicle.displayDetails();
                            System.out.println("___________________________________________________");
                        }
                        break;

                    case 5:
                        System.out.println("Thank you for using the Vehicle Rental System!");
                        break;

                    default:
                        System.out.println("Invalid choice! Please enter a number between 1 and 5.");
                        break;
                }
            } catch (Exception e) {
                System.out.println("Invalid input. Please enter the correct data type.");
                input.nextLine();
            }
        } while (user_input != 5);

        input.close();
    }
}

