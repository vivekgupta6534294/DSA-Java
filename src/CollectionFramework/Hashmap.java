package CollectionFramework;

import java.util.HashMap;
import java.util.Set;

public class Hashmap {
    public static void main(String[] args) {
        HashMap<String,Integer> hm=new HashMap<>();
        hm.put("India",135);
        hm.put("US",200);
        hm.put("China",300);
        hm.put("Nepal",15);
        hm.put("Bhutan",135);
        System.out.println(hm);
        hm.put("Nigeria",5);
        hm.put("US",25);
        System.out.println(hm);
        System.out.println(hm.get("India"));
        System.out.println(hm.get("US"));
        Set<String> keys =hm.keySet();
        System.out.println(keys);
        for(String key : hm.keySet()){
            Integer val=hm.get(key);
            System.out.println(key + " " + val);
        }
    }
    
}
