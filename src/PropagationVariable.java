import org.jetbrains.annotations.NotNull;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import
public class PropagationVariable {
    public static HashMap<String, PropagationVariable> instanceMapByPropagationVariable;
    private String name;
    private boolean booleanState;
    private ArrayList<String> sigConcatList;
    private String gateOutToState;
    private String gateInAllToEachIn;
    private String gateEachInToOut;
    private String FT_definition;
    private int VotingParaN;
    private int VotingParaK;
    private Component component;
    private HashMap<String, ArrayList<PhysixBehav>> physix;
    private static final String UUID = java.util.UUID;.randomUUID().toString();
    private static int IDcounter = 0;
    private final int ID;

    public PropagationVariable(String name, boolean booleanState, ArrayList<String> sigConcatList,
                               String gateOutToState, String gateInAllToEachIn, String gateEachInToOut,
                               String FT_definition, int votingParaN, int votingParaK, Component component,
                               HashMap<String, ArrayList<PhysixBehav>> physix, int ID) {
        instanceMapByPropagationVariable.put(UUID, this);
        this.name = name;
        this.booleanState = booleanState;
        this.sigConcatList = sigConcatList;
        this.gateOutToState = gateOutToState;
        this.gateInAllToEachIn = gateInAllToEachIn;
        this.gateEachInToOut = gateEachInToOut;
        this.FT_definition = FT_definition;
        VotingParaN = votingParaN;
        VotingParaK = votingParaK;
        this.component = component;
        this.physix = physix;
        this.ID = ID;
    }

    public PropagationVariable(String name) {
        this.name = name;
    }

    public void AddComponentLabel(Component component){
        this.component = component;
    }

    public void SigConcatListChange(ArrayList<String> newList){
        sigConcatList = newList;
    }
    public void SigConcatListAppend(ArrayList<String> newList){
        for (int i = 0; i < newList.size(); i++){
            sigConcatList.add(newList[i]);
        }
    }
    public void AddPhysix(@NotNull HashMap<String, ArrayList<PhysixBehav>> input){
        for (Map.Entry<String, ArrayList<PhysixBehav>> entry : input.entrySet()) {
            this.physix.put(entry.getKey(), entry.getValue());
        }
    }

    public String getName() {
        return name;
    }

    public boolean isBooleanState() {
        return booleanState;
    }

    public ArrayList<String> getSigConcatList() {
        return sigConcatList;
    }

    public String getGateOutToState() {
        return gateOutToState;
    }

    public String getGateInAllToEachIn() {
        return gateInAllToEachIn;
    }

    public String getGateEachInToOut() {
        return gateEachInToOut;
    }

    public String getFT_definition() {
        return FT_definition;
    }

    public int getVotingParaN() {
        return VotingParaN;
    }

    public int getVotingParaK() {
        return VotingParaK;
    }

    public Component getComponent() {
        return component;
    }

    public HashMap<String, ArrayList<PhysixBehav>> getPhysix() {
        return physix;
    }

    public static String getUUID() {
        return UUID;
    }

    public static int getIDcounter() {
        return IDcounter;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBooleanState(boolean booleanState) {
        this.booleanState = booleanState;
    }

    public void setSigConcatList(ArrayList<String> sigConcatList) {
        this.sigConcatList = sigConcatList;
    }

    public void setGateOutToState(String gateOutToState) {
        this.gateOutToState = gateOutToState;
    }

    public void setGateInAllToEachIn(String gateInAllToEachIn) {
        this.gateInAllToEachIn = gateInAllToEachIn;
    }

    public void setGateEachInToOut(String gateEachInToOut) {
        this.gateEachInToOut = gateEachInToOut;
    }

    public void setFT_definition(String FT_definition) {
        this.FT_definition = FT_definition;
    }

    public void setVotingParaN(int votingParaN) {
        VotingParaN = votingParaN;
    }

    public void setVotingParaK(int votingParaK) {
        VotingParaK = votingParaK;
    }

    public void setComponent(Component component) {
        this.component = component;
    }

    public static void main(String[] args){
        for (int i = 0; i < 3; i++){ //test
            ArrayList<PropagationVariable> test_list = new ArrayList<PropagationVariable>();
            test_list.add(new PropagationVariable("test"));
            System.out.println(test_list.get(i).ID);
            System.out.println(test_list.get(i).IDcounter);

        }


    }
}
