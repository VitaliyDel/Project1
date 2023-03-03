import java.util.List;

public class Main{
    public static List<String> words = List.of("" ,"Java", "JavaScript", "Python", "C", "Ruby", "Java","Java","","null");
    public static void main(String[]args) {
        Occurrences occurrences = new Occurrences(words);
        int sum = occurrences.getSumValues("Java");
        System.out.println(sum);
    }
}
