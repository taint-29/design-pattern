package memento;

import java.util.Stack;

public class Memento {
    private Stack<String> stateStack = new Stack<>();

    public void addNewState(String state){
        stateStack.add(state);
    }

    public String takeLastState(){
        return stateStack.isEmpty() ? "" : stateStack.pop();
    }
}
