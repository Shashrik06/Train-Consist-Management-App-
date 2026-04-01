import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TrainApp {
    public static void main(String[] args) {
        List<String> trainConsist = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        trainConsist.add("Engine");
        trainConsist.add("Passenger Bogie");
        trainConsist.add("Sleeper Bogie");

        String searchBogie = "Passenger Bogie";

        if (trainConsist.contains(searchBogie)) {
            System.out.println(searchBogie + " is present in the train.");
        } else {
            System.out.println(searchBogie + " is not present in the train.");
        }

        sc.close();
    }
}
