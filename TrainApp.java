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
        trainConsist.add("Cargo Bogie");

        System.out.println("Total bogies in train: " + trainConsist.size());

        sc.close();
    }
}
