package RBDsimpilifier;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class CollectionTest {



    @org.junit.jupiter.api.Test
    void getResult() throws Exception {
        String str1 = "1";
        String str2 = "x";
        String str3 = "0";
        String str4 = "x";
        String str5 = "1";
        String str6 = "0";
        String str7 = "x";
        String str8 = "x";
        ArrayList<String> strings = new ArrayList<>(Arrays.asList(str1, str2, str3, str4, str5, str6, str7, str8));
        ListOfString listOfString = new ListOfString(strings);
        Collection collection = new Collection(listOfString);

        for (String i : collection.getResult()) {
            System.out.println(i);
        }
    }
}