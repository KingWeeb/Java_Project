import org.jetbrains.annotations.NotNull;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class PhysixBehav {
    public static String UUID = java.util.UUID.randomUUID().toString();
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


}
