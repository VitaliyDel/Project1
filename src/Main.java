import java.util.HashMap;
import java.util.List;


public class Main{
    public static List<String> words = List.of("Java", "JavaScript", "Python", "C", "Ruby", "Java","Java");

    public static void main(String[]args) {
        Occurrences occurrences = new Occurrences();
        occurrences.transfer(words);
        int sum = occurrences.searchWord("C");
        System.out.println(sum);

    }
}
