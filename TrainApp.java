import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TrainApp {
    public static void main(String[] args) {
        List<String> trainConsist = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int choice;

        System.out.println("=== Train Consist Management App ===");

        do {
            System.out.println("\n--- MENU ---");
            System.out.println("1. Add Bogie");
            System.out.println("2. Display Train Consist");
            System.out.println("3. Remove Bogie");
            System.out.println("4. Search Bogie");
            System.out.println("5. Count Bogies");
            System.out.println("6. Clear Train Consist");
            System.out.println("7. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter bogie name: ");
                    String bogie = sc.nextLine();
                    trainConsist.add(bogie);
                    System.out.println("Bogie added successfully.");
                    break;

                case 2:
                    if (trainConsist.isEmpty()) {
                        System.out.println("Train consist is empty.");
                    } else {
                        System.out.println("Train Consist:");
                        for (int i = 0; i < trainConsist.size(); i++) {
                            System.out.println((i + 1) + ". " + trainConsist.get(i));
                        }
                    }
                    break;

                case 3:
                    System.out.print("Enter bogie name to remove: ");
                    String removeBogie = sc.nextLine();
                    if (trainConsist.remove(removeBogie)) {
                        System.out.println("Bogie removed successfully.");
                    } else {
                        System.out.println("Bogie not found.");
                    }
                    break;

                case 4:
                    System.out.print("Enter bogie name to search: ");
                    String searchBogie = sc.nextLine();
                    if (trainConsist.contains(searchBogie)) {
                        System.out.println("Bogie found in the train.");
                    } else {
                        System.out.println("Bogie not found.");
                    }
                    break;

                case 5:
                    System.out.println("Total bogies: " + trainConsist.size());
                    break;

                case 6:
                    trainConsist.clear();
                    System.out.println("Train consist cleared.");
                    break;

                case 7:
                    System.out.println("Exiting application...");
                    break;

                default:
                    System.out.println("Invalid choice. Try again.");
            }

        } while (choice != 7);

        sc.close();
    }
}