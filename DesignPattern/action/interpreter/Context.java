package action.interpreter;

import java.util.HashMap;
import java.util.Map;

public class Context {
    private Map<Variable, Integer> map = new HashMap<>();

    public void assign(Variable variable, int value) {
        map.put(variable, value);
    }

    public int getValue(Variable variable) {
        return map.get(variable);
    }
}
