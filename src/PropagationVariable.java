import java.util.ArrayList;
import java.util.HashMap;

public class PropagationVariable {
    public HashMap<String, PropagationVariable> instanceDictByPropagationVariable
    private String name;
    private boolean booleanState;
    private ArrayList<String> sigConcatList;
    private String gateOutToState;
    private String gateInAllToEachIn;
    private String gateEachInToOut;
    private String FT_definition;
    private int VOTING_PARA_N;
    private int VOTING_PARA_K;
    private Component component;
    private Physix physix;

    public HashMap<String, PropagationVariable> getInstanceDictByPropagationVariable() {
        return instanceDictByPropagationVariable;
    }

    public void setInstanceDictByPropagationVariable(HashMap<String, PropagationVariable> instanceDictByPropagationVariable) {
        this.instanceDictByPropagationVariable = instanceDictByPropagationVariable;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isBooleanState() {
        return booleanState;
    }

    public void setBooleanState(boolean booleanState) {
        this.booleanState = booleanState;
    }

    public ArrayList<String> getSigConcatList() {
        return sigConcatList;
    }

    public void setSigConcatList(ArrayList<String> sigConcatList) {
        this.sigConcatList = sigConcatList;
    }

    public String getGateOutToState() {
        return gateOutToState;
    }

    public void setGateOutToState(String gateOutToState) {
        this.gateOutToState = gateOutToState;
    }

    public String getGateInAllToEachIn() {
        return gateInAllToEachIn;
    }

    public void setGateInAllToEachIn(String gateInAllToEachIn) {
        this.gateInAllToEachIn = gateInAllToEachIn;
    }

    public String getGateEachInToOut() {
        return gateEachInToOut;
    }

    public void setGateEachInToOut(String gateEachInToOut) {
        this.gateEachInToOut = gateEachInToOut;
    }

    public String getFT_definition() {
        return FT_definition;
    }

    public void setFT_definition(String FT_definition) {
        this.FT_definition = FT_definition;
    }

    public int getVOTING_PARA_N() {
        return VOTING_PARA_N;
    }

    public void setVOTING_PARA_N(int VOTING_PARA_N) {
        this.VOTING_PARA_N = VOTING_PARA_N;
    }

    public int getVOTING_PARA_K() {
        return VOTING_PARA_K;
    }

    public void setVOTING_PARA_K(int VOTING_PARA_K) {
        this.VOTING_PARA_K = VOTING_PARA_K;
    }

    public Component getComponent() {
        return component;
    }

    public void setComponent(Component component) {
        this.component = component;
    }

    public Physix getPhysix() {
        return physix;
    }

    public void setPhysix(Physix physix) {
        this.physix = physix;
    }

    public ComponentPOJO(String name0){
        name = name0;


    }


}
