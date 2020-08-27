package RBDsimpilifier;

import java.util.ArrayList;
import java.util.HashSet;


public class ExtractCommonFactor {
    private HashSet<HashSet<Object>> sets = new HashSet<>();
    private Node root;
    public ExtractCommonFactor(ArrayList<ArrayList<Object>> input) {
        for (ArrayList<Object> i : input) {
            sets.add(new HashSet<>(i));
        }
        Node tree = new Node();
        this.root = new Node(sets, tree);
    }

    public void print() {
        ArrayList<Node> printList = new ArrayList<>();
        printList.add(root);
        while(printList.size() > 0) {
            Node here = printList.remove(0);
            if (here.getLinked() != null) {
                printList.add(here.getLinked());
            }
            if (here.getUnlinked() != null) {
                printList.add(here.getUnlinked());
            }
            here.print();
        }
    }

    public Node getRoot() {
        return root;
    }
}
