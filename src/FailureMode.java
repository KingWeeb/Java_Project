import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class FailureMode {
    private String name;
    private String description;
    private Set<Component> affectedComponent = new HashSet<>();
    private Set<State> affectedState = new HashSet<>();
    private Set<Object> sourcesThatTriggerSelf = new HashSet<>();
    private HashMap<java.util.UUID, FailureMode> instanceMapByFailureMode= new HashMap<>();
    private final java.util.UUID UUID = java.util.UUID.randomUUID();

    public FailureMode(String name, String description, Set<Component> affectedComponent, Set<State> affectedState, Set<Object> sourcesThatTriggerSelf) {
        instanceMapByFailureMode.put(UUID, this);
        this.name = name;
        this.description = description;
        this.affectedComponent = affectedComponent;
        this.affectedState = affectedState;
        this.sourcesThatTriggerSelf = sourcesThatTriggerSelf;

    }
}
