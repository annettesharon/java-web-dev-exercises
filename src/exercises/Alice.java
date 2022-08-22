package exercises;
import java.util.Scanner;

public class Alice {
    public static void main(String[] args) {
        Scanner inputString = new Scanner(System.in);
        String story ="Alice was beginning to get very tired of sitting by her sister on the bank, and of having nothing to do: once or twice she had peeped into the book her sister was reading, but it had no pictures or conversations in it, 'and what is the use of a book,' thought Alice 'without pictures or conversation?'";
        System.out.println("Enter the word to be searched: ");
        String searchWord = inputString.nextLine();
        if(story.contains(searchWord)){
            System.out.println("The word is found!");
            Integer index = story.indexOf(searchWord);
            Integer length = searchWord.length();
            System.out.println("Your search word first appears at index " + index + ". Your word is " + length + " characters long.");
            String modifiedSentence = story.replace(searchWord, "");
            System.out.println(modifiedSentence);
        } else {
            System.out.println("The word is not found!");
        }

    }
}
