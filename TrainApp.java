import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TrainApp {
    public static void main(String[] args) {
        List<String> trainConsist = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        System.out.println("=== Train Consist Management App ===");

        trainConsist.add("Engine");
        trainConsist.add("Passenger Bogie");
        trainConsist.add("Sleeper Bogie");

        System.out.println("Train Consist:");
        for (int i = 0; i < trainConsist.size(); i++) {
            System.out.println((i + 1) + ". " + trainConsist.get(i));
        }

        sc.close();
    }
}
