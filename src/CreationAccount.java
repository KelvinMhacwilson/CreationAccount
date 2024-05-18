import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CreationAccount {

    public static void main(String[] args) {
        // Initialize creation events
        Map<Integer, String[]> creationEvents = new HashMap<>();
        creationEvents.put(1, new String[]{"Light", "Genesis 1:3-5"});
        creationEvents.put(2, new String[]{"Sky and Water", "Genesis 1:6-8"});
        creationEvents.put(3, new String[]{"Land, Seas, and Vegetation", "Genesis 1:9-13"});
        creationEvents.put(4, new String[]{"Sun, Moon, and Stars", "Genesis 1:14-19"});
        creationEvents.put(5, new String[]{"Birds and Sea Creatures", "Genesis 1:20-23"});
        creationEvents.put(6, new String[]{"Animals and Humankind", "Genesis 1:24-31"});
        creationEvents.put(7, new String[]{"Rest", "Genesis 2:1-3"});

        // User input
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the day of the creation week (1-7): ");
        int day = scanner.nextInt();

        // Display events and verse
        if (creationEvents.containsKey(day)) {
            String[] event = creationEvents.get(day);
            System.out.println("Events: " + event[0]);
            System.out.println("Verse: " + event[1]);
        } else {
            System.out.println("Invalid day. Please enter a number between 1 and 7.");
        }

        scanner.close();
    }
}
