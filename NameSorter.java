import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class NameSorter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<String> names = new ArrayList<>();
        System.out.println("Enter names (enter 'done' to finish input):");

        // Input names until the user enters "done"
        String input;
        while (true) {
            input = scanner.nextLine();
            if (input.equalsIgnoreCase("done")) {
                break;
            }
            names.add(input);
        }

        System.out.print("Order (A/D): ");
        char order = scanner.next().charAt(0);

        if (order == 'A' || order == 'a') {
            Collections.sort(names);
        } else if (order == 'D' || order == 'd') {
            Collections.sort(names, Collections.reverseOrder());
        } else {
            System.out.println("Invalid input. Please enter 'A' or 'D' for ascending or descending order.");
            System.exit(1);
        }

        System.out.println("Sorted Names:");
        for (String name : names) {
            System.out.println(name);
        }

        scanner.close();
    }
}
