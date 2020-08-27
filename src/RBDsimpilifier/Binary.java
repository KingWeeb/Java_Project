package RBDsimpilifier;

import java.util.ArrayList;
import java.util.HashSet;

public class Binary {
    private ArrayList<String> strings;

//根据queue把list转为1和x的字符串，再把1和x的字符串转换成01字符串之和。
    public Binary(ArrayList<Object> queue, ArrayList<Object> list) throws Exception {
        HashSet<Object> set = new HashSet<Object>(list);
        ArrayList<String> primitive = new ArrayList<>();
        for (Object i : queue) {
            if (set.contains(i)) {
                primitive.add("1");
            }
            else {
                primitive.add("x");
            }
        }
        ListOfString listOfString = new ListOfString(primitive);
        Collection collection = new Collection(listOfString);
        strings = collection.getResult();
    }

    public ArrayList<Integer> getValues() {
        ArrayList<Integer> result = new ArrayList<>();
        for (String i : strings) {
            result.add(Integer.parseInt(i, 2));
        }
        return result;
    }

}
