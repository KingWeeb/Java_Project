package RBDsimpilifier;

import java.util.ArrayList;
import java.util.Arrays;

class RBDsimplifierTest {

    @org.junit.jupiter.api.Test
    void test() throws Exception {
        String obj1 = "1";
        String obj2 = "2";
        String obj3 = "3";
        String obj4 = "4";
        String obj5 = "5";

        ArrayList<Object> list1 = new ArrayList<>(Arrays.asList(obj1, obj2, obj3, obj4));
        ArrayList<Object> list2 = new ArrayList<>(Arrays.asList(obj2, obj3, obj4, obj5));
        ArrayList<Object> list3 = new ArrayList<>(Arrays.asList(obj1, obj2, obj3, obj5));
        ArrayList<Object> list4 = new ArrayList<>(Arrays.asList(obj1, obj2, obj3, obj4, obj5));


        ArrayList<ArrayList<Object>> lists = new ArrayList<>(Arrays.asList(list1, list2, list3, list4));
        RBDsimplifier RBDsimplifier = new RBDsimplifier(lists);
        for (ArrayList<Object> i : RBDsimplifier.getResultQM()) {
            for (Object j : i) {
                System.out.print(j);
            }
            System.out.println();
        }
        RBDsimplifier.printTree();
    }

    @org.junit.jupiter.api.Test
    void test2() throws Exception {
        String obj1 = "1";
        String obj2 = "2";
        String obj3 = "3";
        String obj4 = "4";
        String obj5 = "5";

        ArrayList<Object> list1 = new ArrayList<>(Arrays.asList(obj1, obj2, obj3));
        ArrayList<Object> list2 = new ArrayList<>(Arrays.asList(obj1, obj2, obj5));
        ArrayList<Object> list3 = new ArrayList<>(Arrays.asList(obj1, obj2, obj4));
        ArrayList<Object> list4 = new ArrayList<>(Arrays.asList(obj1, obj2, obj3));


        ArrayList<ArrayList<Object>> lists = new ArrayList<>(Arrays.asList(list1, list2, list3, list4));
        RBDsimplifier RBDsimplifier = new RBDsimplifier(lists);
        for (ArrayList<Object> i : RBDsimplifier.getResultQM()) {
            for (Object j : i) {
                System.out.print(j);
            }
            System.out.println();
        }
        RBDsimplifier.printTree();
    }
}