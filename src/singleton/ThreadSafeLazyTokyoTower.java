package singleton;

public class ThreadSafeLazyTokyoTower {
    private static ThreadSafeLazyTokyoTower instance;

    private ThreadSafeLazyTokyoTower(){
    }

    /**
     * The instance doesn't get created until the method is called for the first time.
     */
    public static synchronized ThreadSafeLazyTokyoTower getInstance() {
        if (instance == null) {
            instance = new ThreadSafeLazyTokyoTower();
        }
        return instance;
    }
}
