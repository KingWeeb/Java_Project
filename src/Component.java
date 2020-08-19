import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
public class Component {
    private HashMap<java.util.UUID, Component> instanceMapByComponent = new HashMap<>();
    private final java.util.UUID UUID = java.util.UUID.randomUUID();
    private String name;
    private ArrayList<String> stateList;
    private HashMap<String, Object> stateMap;
    private HashMap<String, Object> inflowMap;
    private HashMap<String, Object> outflowMap;
    private ArrayList<String> inflowRawList;
    private ArrayList<String> outflowRawList;
    private boolean isRepairable;
    private boolean isEndPoint;
    private boolean root;
    private String distro;
    private HashMap<String, Double> distroPara;
    private HashMap<String, PhysixBehav> physix;
    private boolean isRing;
    private int level;
    private int decompLevel;

    public Component(String name, ArrayList<String> stateList, HashMap<String, Object> stateMap,
                     ArrayList<String> inflowRawList, ArrayList<String> outflowRawList, boolean isRepairable,
                     String distro, HashMap<String, Double> distroPara, HashMap<String, PhysixBehav> physix) {
        this.name = name;
        this.stateList = stateList;
        this.stateMap = stateMap;
        this.inflowRawList = inflowRawList;
        this.outflowRawList = outflowRawList;
        this.isRepairable = isRepairable;
        this.distro = distro;
        this.distroPara = distroPara;
        this.physix = physix;
        instanceMapByComponent.put(UUID, this);

    }
    public void Propagationalize(){
        for (int i = 0; i < inflowRawList.size(); i++){
            inflowMap.put(inflowRawList.get(i), new PropagationVariable(inflowRawList.get(i)));
        }
        for (int i = 0; i < outflowRawList.size(); i++){
            inflowMap.put(outflowRawList.get(i), new PropagationVariable(outflowRawList.get(i)));
        }
    }
    public void StateLize(){
        for (int i = 0; i < stateList.size(); i++){
            stateMap.put(stateList.get(i), new State(stateList.get(i)));
        }
    }


    public Component getInstanceMapByComponent(java.util.UUID UUID){
        return instanceMapByComponent.get(UUID);
    }

    public String getName() {
        return name;
    }

    public ArrayList<String> getStateList() {
        return stateList;
    }

    public HashMap<String, Object> getStateMap() {
        return stateMap;
    }

    public HashMap<String, Object> getInflowMap() {
        return inflowMap;
    }

    public HashMap<String, Object> getOutflowMap() {
        return outflowMap;
    }

    public ArrayList<String> getInflowRawList() {
        return inflowRawList;
    }

    public ArrayList<String> getOutflowRawList() {
        return outflowRawList;
    }

    public boolean isRepairable() {
        return isRepairable;
    }

    public boolean isEndPoint() {
        return isEndPoint;
    }

    public boolean isRoot() {
        return root;
    }

    public String getDistro() {
        return distro;
    }

    public HashMap<String, Double> getDistroPara() {
        return distroPara;
    }

    public HashMap<String, PhysixBehav> getPhysix() {
        return physix;
    }

    public boolean isRing() {
        return isRing;
    }

    public int getLevel() {
        return level;
    }

    public int getDecompLevel() {
        return decompLevel;
    }

    public java.util.UUID getUUID() {
        return UUID;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setStateList(ArrayList<String> stateList) {
        this.stateList = stateList;
    }

    public void setStateMap(HashMap<String, Object> stateMap) {
        this.stateMap = stateMap;
    }

    public void setInflowMap(HashMap<String, Object> inflowMap) {
        this.inflowMap = inflowMap;
    }

    public void setOutflowMap(HashMap<String, Object> outflowMap) {
        this.outflowMap = outflowMap;
    }

    public void setRepairable(boolean repairable) {
        isRepairable = repairable;
    }

    public void setEndPoint(boolean endPoint) {
        isEndPoint = endPoint;
    }

    public void setRoot(boolean root) {
        this.root = root;
    }

    public void setDistro(String distro) {
        this.distro = distro;
    }

    public void setDistroPara(HashMap<String, Double> distroPara) {
        this.distroPara = distroPara;
    }

    public void setPhysix(HashMap<String, PhysixBehav> physix) {
        this.physix = physix;
    }

    public void setRing(boolean ring) {
        isRing = ring;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public void setDecompLevel(int decompLevel) {
        this.decompLevel = decompLevel;
    }

}
