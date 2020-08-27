package RBDsimpilifier;

import java.util.ArrayList;

public class Collection {
    private ArrayList<ListOfString> collection = new ArrayList<>();
    private int unfinished = 0;

    public Collection(ListOfString list) {
        collection.add(list);
    }

    public void removeX() throws Exception {
        int index = findUnfinished();
        //System.out.println("index:" + index);
        if (index != -1) {
            //System.out.println(collection.get(index).getResult());
            collection.get(index).removeX(this);
            removeX();
        }
    }

    public void remove(ListOfString list) {
        collection.remove(list);
    }

    public void add(ListOfString list){
        collection.add(list);
    }

    public int findUnfinished() {
        for (int i = unfinished; i < collection.size(); i++) {
            if (!collection.get(i).isFinished()) {
                unfinished = i;
                return i;
            }
        }
        unfinished = -1;
        return -1;
    }

    public ArrayList<String> getResult() throws Exception{
        removeX();
        if (unfinished != -1) {
            /*for (ListOfString i : collection) {
                i.print();
            }*/
            throw new Exception("removex unfinished");
        }
        ArrayList<String> strings = new ArrayList<>();
        for (ListOfString i : collection) {
            strings.add(i.getResult());
        }
        return strings;
    }
}
