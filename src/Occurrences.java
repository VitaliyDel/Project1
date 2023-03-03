import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;


public class Occurrences {
    private final HashMap<String,Integer> map = new HashMap<>();
    private final List<String> list;

    public Occurrences(List<String> list) {
        this.list = new ArrayList<>(list);
        AfilterList();
        System.out.println(this.list);
        transfer();

    }
    private void AfilterList(){
        list.removeIf(String::isEmpty);
    }
    private void transfer() {
        for(String word:list){
            if(!map.containsKey(word)){
                map.put(word,1);
                continue;
            }
            map.put(word,map.get(word) + 1);
        }
    }
    public void getSumValues(String word){
        if(map.containsKey(word)){
            System.out.println(map.get(word));
        }
        else{
            System.out.println("Информация отсутствует.");
        }
    }
}