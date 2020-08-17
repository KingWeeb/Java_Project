import java.util.HashMap;
import java.util.UUID;

public class Event {
    private String name;
    private String description;
    private HashMap<String, Component> affectedComponent;
    private HashMap<String, State> affectedState;
    private HashMap<String, Object> sourceThatTriggersSelf; //propagations / states / events
    private HashMap<java.util.UUID, Event> instanceMapByEvent = new HashMap<>();
    private final java.util.UUID UUID = java.util.UUID.randomUUID();

    public Event(String name, String description, HashMap<String, Component> affectedComponent, HashMap<String, State> affectedState, HashMap<String, Object> sourceThatTriggersSelf) {
        this.name = name;
        this.description = description;
        this.affectedComponent = affectedComponent;
        this.affectedState = affectedState;
        this.sourceThatTriggersSelf = sourceThatTriggersSelf;
        instanceMapByEvent.put(UUID, this);
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

    public HashMap<String, Component> getAffectedComponent() {
        return affectedComponent;
    }

    public void setAffectedComponent(HashMap<String, Component> affectedComponent) {
        this.affectedComponent = affectedComponent;
    }

    public HashMap<String, State> getAffectedState() {
        return affectedState;
    }

    public void setAffectedState(HashMap<String, State> affectedState) {
        this.affectedState = affectedState;
    }

    public HashMap<String, Object> getSourceThatTriggersSelf() {
        return sourceThatTriggersSelf;
    }

    public void setSourceThatTriggersSelf(HashMap<String, Object> sourceThatTriggersSelf) {
        this.sourceThatTriggersSelf = sourceThatTriggersSelf;
    }

    public Event getInstanceMapByEvent(java.util.UUID UUID) {
        return instanceMapByEvent.get(UUID);
    }

    public java.util.UUID getUUID() {
        return UUID;
    }
}
