package RBDsimpilifier;

import java.util.ArrayList;

public class ListOfString {
    private ArrayList<String> list;
    private int positionX = -1;

    public ListOfString(ArrayList<String> list) {
        this.list = list;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).equals("x")) {
                positionX = i;
                break;
            }
        }
    }

    public ListOfString(ListOfString origin, String str) throws Exception{
        if (origin.positionX == -1) {
            throw new Exception("Listofstring has no x");
        }
        ArrayList<String> temp = (ArrayList<String>) origin.list.clone();
        temp.set(origin.positionX, str);
        list = temp;
        /*for (String i : list) {
            System.out.print(i);
        }
        System.out.println();
        System.out.println("origin:" + origin.positionX);*/
        for (int i = origin.positionX; i < list.size(); i++) {
            if (list.get(i).equals("x")) {
                positionX = i;
                break;
            }
        }
        //System.out.println(positionX);
    }

    public void removeX(Collection collection) throws Exception{
        if (isFinished()) {
            throw new Exception("ListOfString already finished");
        }
        else {
            ListOfString temp1 = new ListOfString(this, "1");
            ListOfString temp2 = new ListOfString(this, "0");
            collection.remove(this);
            collection.add(temp1);
            collection.add(temp2);
        }
    }
    public boolean isFinished() {
        return positionX == -1;
    }

    public String getResult() throws Exception{
        /*if (positionX != -1) {
            throw new Exception("listofstring still has x");
        }*/
        return String.join("", list);
    }

    public void print() {
        for (String i : list) {
            System.out.print(i);
        }
        System.out.println();
    }
}
