package map;

import java.util.HashMap;
import java.util.Map;

public class MapDemo {
    public static void main(String[] args) {
        // Truong hop dac biet cua List, key bat cu thu gi
        Map<String, Integer> map = new HashMap<>();
        map.put("Khoa", 3);
        map.put("Long", 1);
        map.put("Dat", 2);
        map.put("Ha", 0);
        map.put("Khoa", 0);

        // Lap map
        for (Map.Entry<String, Integer> pair : map.entrySet()) {
            String key = pair.getKey();
            Integer value = pair.getValue();
            System.out.printf("😊😊 %s : %d%n", key, value);
            // Window + .
        }
        // map.keySet();
        // map.values();
        System.out.println(map.keySet());
        System.out.println(map.values());
        System.out.println("map.entrySet() = " + map.entrySet());

    }
}
