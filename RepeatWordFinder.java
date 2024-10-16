import java.util.Scanner;
import java.util.regex.Pattern;

public class RepeatWordFinder {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter a text to search for repeated words:");
    String text = scanner.nextLine();

    System.out.println("Enter a word to search for:");
    String targetWord = scanner.nextLine();

    int count = countRepeatedWords(text, targetWord);

    if (count > 0) {
      System.out.println("The word '" + targetWord + "' is repeated " + count + " times.");
    } else {
      System.out.println("The word '" + targetWord + "' is not repeated in the text.");
    }
  }

  public static int countRepeatedWords(String text, String targetWord) {
    String[] words = text.split("\\s+"); // split on one or more whitespace characters
    int count = 0;

    for (String word : words) {
      if (word.equalsIgnoreCase(targetWord)) {
        count++;
      }
    }

    return count;
  }
}