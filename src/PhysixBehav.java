import java.util.HashMap;

public class PhysixBehav {
    private HashMap<java.util.UUID, PhysixBehav> instanceMapByPhysixBehav = new HashMap<>();
    private final java.util.UUID UUID = java.util.UUID.randomUUID();
    private String name;
    private String description;
    private HashMap<String, Object> affectedOut;
    private HashMap<String, Object> affectedIn;
    private HashMap<String, Object> affectedStateOtherComponent;
    private HashMap<String, Object> affectedVarOtherComponent;
    private HashMap<String, Object> affectedLevelOtherComponent;
    private HashMap<String, Object> affectedVarSelf;
    private HashMap<String, Object> affectedStateSelf;
    private HashMap<String, Object> affectedEvents;

    public PhysixBehav(String name, String description, HashMap<String, Object> affectedOut, HashMap<String, Object> affectedIn, HashMap<String, Object> affectedStateOtherComponent, HashMap<String, Object> affectedVarOtherComponent, HashMap<String, Object> affectedLevelOtherComponent, HashMap<String, Object> affectedVarSelf, HashMap<String, Object> affectedStateSelf, HashMap<String, Object> affectedEvents) {
        instanceMapByPhysixBehav.put(UUID, this);
        this.name = name;
        this.description = description;
        this.affectedOut = affectedOut;
        this.affectedIn = affectedIn;
        this.affectedStateOtherComponent = affectedStateOtherComponent;
        this.affectedVarOtherComponent = affectedVarOtherComponent;
        this.affectedLevelOtherComponent = affectedLevelOtherComponent;
        this.affectedVarSelf = affectedVarSelf;
        this.affectedStateSelf = affectedStateSelf;
        this.affectedEvents = affectedEvents;
    }

    public PhysixBehav getInstanceMapByPhysixBehav(java.util.UUID UUID){
        return instanceMapByPhysixBehav.get(UUID);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public HashMap<String, Object> getAffectedOut() {
        return affectedOut;
    }

    public void setAffectedOut(HashMap<String, Object> affectedOut) {
        this.affectedOut = affectedOut;
    }

    public HashMap<String, Object> getAffectedIn() {
        return affectedIn;
    }

    public void setAffectedIn(HashMap<String, Object> affectedIn) {
        this.affectedIn = affectedIn;
    }

    public HashMap<String, Object> getAffectedStateOtherComponent() {
        return affectedStateOtherComponent;
    }

    public void setAffectedStateOtherComponent(HashMap<String, Object> affectedStateOtherComponent) {
        this.affectedStateOtherComponent = affectedStateOtherComponent;
    }

    public HashMap<String, Object> getAffectedVarOtherComponent() {
        return affectedVarOtherComponent;
    }

    public void setAffectedVarOtherComponent(HashMap<String, Object> affectedVarOtherComponent) {
        this.affectedVarOtherComponent = affectedVarOtherComponent;
    }

    public HashMap<String, Object> getAffectedLevelOtherComponent() {
        return affectedLevelOtherComponent;
    }

    public void setAffectedLevelOtherComponent(HashMap<String, Object> affectedLevelOtherComponent) {
        this.affectedLevelOtherComponent = affectedLevelOtherComponent;
    }

    public HashMap<String, Object> getAffectedVarSelf() {
        return affectedVarSelf;
    }

    public void setAffectedVarSelf(HashMap<String, Object> affectedVarSelf) {
        this.affectedVarSelf = affectedVarSelf;
    }

    public HashMap<String, Object> getAffectedStateSelf() {
        return affectedStateSelf;
    }

    public void setAffectedStateSelf(HashMap<String, Object> affectedStateSelf) {
        this.affectedStateSelf = affectedStateSelf;
    }

    public HashMap<String, Object> getAffectedEvents() {
        return affectedEvents;
    }

    public void setAffectedEvents(HashMap<String, Object> affectedEvents) {
        this.affectedEvents = affectedEvents;
    }

    public java.util.UUID getUUID() {
        return UUID;
    }

}
