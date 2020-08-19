import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import java.util.UUID;

public class FailureMode {
    private String name;
    private String description;
    private Set<Component> affectedComponent = new HashSet<>();
    private Set<State> affectedState = new HashSet<>();
    private Set<Object> sourcesThatTriggerSelf = new HashSet<>();
    private HashMap<java.util.UUID, FailureMode> instanceMapByFailureMode= new HashMap<>();
    private final java.util.UUID UUID = java.util.UUID.randomUUID();

    public FailureMode(String name, String description, Set<Component> affectedComponent, Set<State> affectedState, Set<Object> sourcesThatTriggerSelf) {

        this.name = name;
        this.description = description;
        this.affectedComponent = affectedComponent;
        this.affectedState = affectedState;
        this.sourcesThatTriggerSelf = sourcesThatTriggerSelf;
        instanceMapByFailureMode.put(UUID, this);

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

    public Set<Component> getAffectedComponent() {
        return affectedComponent;
    }

    public void setAffectedComponent(Set<Component> affectedComponent) {
        this.affectedComponent = affectedComponent;
    }

    public Set<State> getAffectedState() {
        return affectedState;
    }

    public void setAffectedState(Set<State> affectedState) {
        this.affectedState = affectedState;
    }

    public Set<Object> getSourcesThatTriggerSelf() {
        return sourcesThatTriggerSelf;
    }

    public void setSourcesThatTriggerSelf(Set<Object> sourcesThatTriggerSelf) {
        this.sourcesThatTriggerSelf = sourcesThatTriggerSelf;
    }

    public HashMap<java.util.UUID, FailureMode> getInstanceMapByFailureMode() {
        return instanceMapByFailureMode;
    }

    public void setInstanceMapByFailureMode(HashMap<java.util.UUID, FailureMode> instanceMapByFailureMode) {
        this.instanceMapByFailureMode = instanceMapByFailureMode;
    }

    public java.util.UUID getUUID() {
        return UUID;
    }
}
