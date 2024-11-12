package lesson13;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapMain {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("k1", 4);
        map.put("k2", 5);
        System.out.println(map);
        map.put("k3", 11);
        map.put("k2", 11);
        System.out.println(map);
        Set<String> keys = map.keySet();
        System.out.println(keys);
        Collection<Integer> values = map.values();
        System.out.println(values);
        Integer k3 = map.get("k3");

        String str = "askdjasldjjasfsdkjfhsdkljasdljasdljas";

        Map<String, Integer> result = new HashMap<>();
        for (int i = 0; i < str.length(); i++) {
            String c = String.valueOf(str.charAt(i));
            Integer currentValue = result.get(c);
            if (currentValue == null) {
                result.put(c, 1);
            } else {
                result.put(c, currentValue + 1);
            }
        }

        Integer maxCount = -1;
        String maxKey = "";
        for (var entry :result.entrySet())  {
            if (entry.getValue() > maxCount) {
                maxKey = entry.getKey();
                maxCount = entry.getValue();
            }
        }

        for (String key :result.keySet())  {
            Integer val = result.get(key);
            if (val > maxCount) {
                maxKey = key;
                maxCount = val;
            }
        }

        System.out.println(maxKey);


    }
}
