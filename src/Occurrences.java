import java.util.HashMap;
import java.util.List;
import java.util.Collections;

public class Occurrences {
    private final HashMap<String,Integer> map = new HashMap<>();

    private String count;
    public HashMap<String,Integer> transfer(List<String> list) {
        for (int i = 0; i < list.toArray().length; i++) {
            count = list.get(i);
            if(map.containsKey(count)){
                map.put(count,map.get(count) + 1);
            }
            else{
            map.put(count,1);
            }
        }
        return map;
    }

    public int searchWord(String word){
        if(map.containsKey(word)){
            return map.get(word);
        }
        else{
            System.out.println("Такого слова в колекции нет.");
            return  0;
        }
    }
}