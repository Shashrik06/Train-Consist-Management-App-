import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TrainApp {
    public static void main(String[] args) {
        List<String> trainConsist = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        System.out.println("=== Train Consist Management App ===");
        System.out.println("Train consist initialized successfully.");
        System.out.println("Initial bogie count: " + trainConsist.size());

        sc.close();
    }
}
