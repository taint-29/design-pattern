package singleton;

import java.util.function.ToLongBiFunction;

public class TokyoTower {

    private TokyoTower(){

    }

    private static final TokyoTower INSTANCE = new TokyoTower();

    public static TokyoTower getInstance(){
        return INSTANCE;
    }
}
