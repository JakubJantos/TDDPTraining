package SDA_Mapa;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.HashMap;

public class NameAggregator {

    public static Map<Character, List<String>> aggregate(List<String>names){
        Map<Character, List<String>> result = new HashMap<>();
        for (String name : names){
            if (result.containsKey(name.charAt(0))){
                result.get(name.charAt(0))
                        .add(name);
            }else {
                List<String>subNames = new  ArrayList<>();
                subNames.add(name);
                result.put(name.charAt(0),subNames);
            }
        }
        return result;
    }
}
