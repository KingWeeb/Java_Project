import java.util.HashMap;

public class State {
    private String name;
    private String stateDescription;
    private final java.util.UUID UUID = java.util.UUID.randomUUID();
    private HashMap<java.util.UUID, State> instanceMapByState;
    private HashMap<String, PropagationVariable> affectedOut;
    private HashMap<String, PropagationVariable> affectedIn;
    private HashMap<String, State> affectedStateOtherComponent;
    private HashMap<String, PropagationVariable> affectedVarOtherComponent;
    private HashMap<String, ComponentLevel> affectedLevelOtherComponent;
    private HashMap<String, PropagationVariable> affectedVarSelf;
    private HashMap<String, PropagationVariable> affectedStateSelf;
    private HashMap<String, Event> affectedEvent;
    private Component component;

    public State(String name, String stateDescription, HashMap<java.util.UUID, State> instanceMapByState,
                 HashMap<String, PropagationVariable> affectedOut, HashMap<String, PropagationVariable> affectedIn,
                 HashMap<String, State> affectedStateOtherComponent, HashMap<String, PropagationVariable> affectedVarOtherComponent, HashMap<String, ComponentLevel> affectedLevelOtherComponent, HashMap<String, PropagationVariable> affectedVarSelf, HashMap<String, PropagationVariable> affectedStateSelf, HashMap<String, Event> affectedEvent, Component component) {
        this.name = name;
        this.stateDescription = stateDescription;
        this.instanceMapByState = instanceMapByState;
        this.affectedOut = affectedOut;
        this.affectedIn = affectedIn;
        this.affectedStateOtherComponent = affectedStateOtherComponent;
        this.affectedVarOtherComponent = affectedVarOtherComponent;
        this.affectedLevelOtherComponent = affectedLevelOtherComponent;
        this.affectedVarSelf = affectedVarSelf;
        this.affectedStateSelf = affectedStateSelf;
        this.affectedEvent = affectedEvent;
        this.component = component;
    }

    public State(String name){
        this.name = name;
    }

    public java.util.UUID getUUID() {
        return UUID;
    }

    public State getInstanceMapByState(java.util.UUID UUID) {
        return instanceMapByState.get(UUID);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStateDescription() {
        return stateDescription;
    }

    public void setStateDescription(String stateDescription) {
        this.stateDescription = stateDescription;
    }

    public HashMap<String, PropagationVariable> getAffectedOut() {
        return affectedOut;
    }

    public void setAffectedOut(HashMap<String, PropagationVariable> affectedOut) {
        this.affectedOut = affectedOut;
    }

    public HashMap<String, PropagationVariable> getAffectedIn() {
        return affectedIn;
    }

    public void setAffectedIn(HashMap<String, PropagationVariable> affectedIn) {
        this.affectedIn = affectedIn;
    }

    public HashMap<String, State> getAffectedStateOtherComponent() {
        return affectedStateOtherComponent;
    }

    public void setAffectedStateOtherComponent(HashMap<String, State> affectedStateOtherComponent) {
        this.affectedStateOtherComponent = affectedStateOtherComponent;
    }

    public HashMap<String, PropagationVariable> getAffectedVarOtherComponent() {
        return affectedVarOtherComponent;
    }

    public void setAffectedVarOtherComponent(HashMap<String, PropagationVariable> affectedVarOtherComponent) {
        this.affectedVarOtherComponent = affectedVarOtherComponent;
    }

    public HashMap<String, ComponentLevel> getAffectedLevelOtherComponent() {
        return affectedLevelOtherComponent;
    }

    public void setAffectedLevelOtherComponent(HashMap<String, ComponentLevel> affectedLevelOtherComponent) {
        this.affectedLevelOtherComponent = affectedLevelOtherComponent;
    }

    public HashMap<String, PropagationVariable> getAffectedVarSelf() {
        return affectedVarSelf;
    }

    public void setAffectedVarSelf(HashMap<String, PropagationVariable> affectedVarSelf) {
        this.affectedVarSelf = affectedVarSelf;
    }

    public HashMap<String, PropagationVariable> getAffectedStateSelf() {
        return affectedStateSelf;
    }

    public void setAffectedStateSelf(HashMap<String, PropagationVariable> affectedStateSelf) {
        this.affectedStateSelf = affectedStateSelf;
    }

    public HashMap<String, Event> getAffectedEvent() {
        return affectedEvent;
    }

    public void setAffectedEvent(HashMap<String, Event> affectedEvent) {
        this.affectedEvent = affectedEvent;
    }

    public Component getComponent() {
        return component;
    }

    public void setComponent(Component component) {
        this.component = component;
    }
}
