import java.util.ArrayList;
import java.util.List;


public class Main{
    public static List<String> words = List.of("Java", "JavaScript", "Python", "C", "Ruby", "Java","Java","");
    public static void main(String[]args) {
        Occurrences occurrences = new Occurrences(words);
        occurrences.getSumValues("Java");




    }
}
