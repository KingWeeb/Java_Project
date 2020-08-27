package RBDsimpilifier;

import java.util.ArrayList;

public class RBDsimplifier {
    private ArrayList<ArrayList<Object>> input; //input是一个list，其每个元素是一条路径，路径用list来存储。
    private ArrayList<ArrayList<Object>> resultQM = new ArrayList<>();
    private Node result;                //result是化简后的RBD的根节点
    private ExtractCommonFactor extracter;

    public RBDsimplifier(ArrayList<ArrayList<Object>> input) throws Exception {
        this.input = input;
        ArrayList<Object> queue = new ArrayList<>();
        for (ArrayList<Object> i : input) {
            for (Object j : i) {
                if (!queue.contains(j)) {
                    queue.add(j);
                }
            }
        }
        ArrayList<String> list = new ArrayList<>();
        for (ArrayList<Object> i : input) {
            Binary binary = new Binary(queue, i);
            for (Integer j : binary.getValues()) {
                list.add(j.toString());
            }
        }
        //前面这部分目的是把输入转化为QM算法所需的的二进制最小项格式。

        String qmInput = String.join(" ", list);
        Implicant.numOfVariable = queue.size();
        ArrayList<Implicant> implicantArrayList = new ArrayList<>();//用来储存最小项的集合
        if(!qmInput.equals(" "))
            getImplicant(implicantArrayList, qmInput,false);
        //自此已经完成了信息的收集工作

        //开始准备进行QM算法的实现
        QmMath qmMath = new QmMath();
        ArrayList<String> qmOutput = qmMath.setImplicantArrayList(implicantArrayList);
        for (String i : qmOutput) {
            ArrayList<Object> temp = new ArrayList<>();
            for (int j = 0; j < i.length(); j++) {
                if (i.charAt(j) == '1') {
                    temp.add(queue.get(j));
                }
                if (i.charAt(j) == '0') {
                    throw new Exception("qmoutput wrong");
                }
            }
            resultQM.add(temp);
        }

        //把最简逻辑表达式转化为最简RBD的格式
        extracter = new ExtractCommonFactor(resultQM);
        result = extracter.getRoot();
    }

    //获取最小项的工具方法
    private void getImplicant(ArrayList<Implicant> implicantArrayList, String basicImplicantLine, boolean isNCI) {
        int begin = 0;
        int tail ;
        for (int i = 0; i < basicImplicantLine.length(); i++) {
            if (basicImplicantLine.charAt(i) == ' ') {
                tail = i;
                Implicant implicant = new Implicant();
                implicant.setDoubleTypeString(Integer.parseInt(basicImplicantLine.substring(begin, tail)));
                implicant.setNCI(isNCI);
                if(!isNCI)
                    implicant.addCovers(implicant.doubleTypeString);
                implicantArrayList.add(implicant);
                begin = tail + 1;
            }
        }
        Implicant implicant = new Implicant();
        implicant.setDoubleTypeString(Integer.parseInt(basicImplicantLine.substring(begin)));
        implicant.setNCI(isNCI);
        if(!isNCI)
            implicant.addCovers(implicant.doubleTypeString);
        implicantArrayList.add(implicant);
    }

    // 获取无关变量的工具方法
    /*
    private void getNCI(ArrayList<Implicant>implicantArrayList,String nciLine){
        getImplicant(implicantArrayList,nciLine,true);
    }*/

    public ArrayList<ArrayList<Object>> getResultQM() {
        return resultQM;
    }

    public void printTree() {
        extracter.print();
    }
}
