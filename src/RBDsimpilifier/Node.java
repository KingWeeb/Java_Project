package RBDsimpilifier;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class Node { //father是父节点，object是该节点对应的Object， linked是子节点， unlinked是与此节点同一级的节点，和此节点共有一个father
    private Node linked;
    private Node father;
    private Node unlinked;
    private Object object;
    private HashSet<HashSet<Object>> linkedSets = new HashSet<>();

    public Node getLinked() {
        return linked;
    }

    public Node getUnlinked() {
        return unlinked;
    }

    public Object getObject() {
        return object;
    }

    public void print() {
        String str = getObject().toString();
        if (linked != null) {
            str = str + " linked:" + linked.getObject().toString();
        }
        if (unlinked != null) {
            str = str + " unlinked:" + unlinked.getObject().toString();
        }
        System.out.println(str);
    }

    private HashSet<HashSet<Object>> unlinkedSets = new HashSet<>();

    public Node() {}

    public Node(HashSet<HashSet<Object>> sets, Node father) {
        this.father = father;
        HashMap<Object, Integer> num = new HashMap<>();
        for (HashSet i : sets) {
            for (Object j : i) {
                if (!num.containsKey(j)) {
                    num.put(j, 1);
                } else {
                    num.computeIfPresent(j, (k, v) -> v + 1);
                }
            }
        }
        Integer max = 0;
        Object maxObj = null;
        for (Map.Entry<Object, Integer> i : num.entrySet()) {
            if (i.getValue() > max) {
                maxObj = i.getKey();
                max = i.getValue();
            }
        }
        this.object = maxObj;
        for (HashSet i : sets) {
            if (i.size() > 0)
                if (i.contains(maxObj)) {
                    HashSet<Object> temp = (HashSet<Object>) i.clone();
                    temp.remove(maxObj);
                    if (temp.size() > 0 ) {
                        linkedSets.add(temp);
                    }
                } else {
                    HashSet<Object> temp = (HashSet<Object>) i.clone();
                    unlinkedSets.add(temp);
                }
        }
        if (linkedSets.size() > 0) {
            this.linked = new Node(linkedSets, this);
        }
        if (unlinkedSets.size() > 0) {
            this.unlinked = new Node(unlinkedSets, this.father);
        }
    }
}
