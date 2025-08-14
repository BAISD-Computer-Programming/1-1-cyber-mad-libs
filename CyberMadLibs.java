import java.util.Scanner;

public class CyberMadLibs {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // TODO: Create variables for:
        // adjective, verb, nounServer, pluralNoun, techTerm, exclamationPhrase
        // Example:
        // String adjective;

        // TODO: Prompt the user for each value using Scanner
        // Example:
        // System.out.print("Enter an adjective (e.g., glitchy): ");
        // adjective = in.nextLine();

        // Repeat for each variable...

        // DO NOT CHANGE ANYTHING BELOW
        // Output the story
        String story =
            "It was a " + adjective + " day in the Code Dojo. " +
            "I was about to " + verb + " my " + nounServer + " when suddenly the " +
            pluralNoun + " crashed into the " + techTerm + ". " +
            "My instructor yelled, \"" + exclamationPhrase + "\"";

        System.out.println();
        System.out.println("Your story:");
        System.out.println(story);

        // Close the scanner
        in.close();
    }
}
