import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TrainApp {
    public static void main(String[] args) {
        List<String> trainConsist = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        trainConsist.add("Engine");
        trainConsist.add("Sleeper Bogie");

        trainConsist.add(1, "Passenger Bogie");

        System.out.println("Train Consist after insertion:");
        for (int i = 0; i < trainConsist.size(); i++) {
            System.out.println((i + 1) + ". " + trainConsist.get(i));
        }

        sc.close();
    }
}
