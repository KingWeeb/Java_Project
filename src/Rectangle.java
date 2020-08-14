import java.util.HashMap;

public class Rectangle {
    public static void main(String[] args){
        HashMap<Integer, String> map1 = new HashMap<>();
        map1.put(1, "L");
        map1.put(2, "M");
        map1.put(3, "N");

        HashMap<Integer, String> map2 = new HashMap<>();
        map2.put(1, "B");
        map2.put(2, "G");
        map2.put(3, "R");
        // provide value for new key which is absent
        // using computeIfAbsent method
        map2.forEach((key, value)-> map1.merge(key,value,(v1, v2) -> v1.equalsIgnoreCase(v2) ? v1 : v1 + ", " + v2));
    }
}