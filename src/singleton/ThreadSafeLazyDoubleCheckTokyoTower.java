package singleton;

public class ThreadSafeLazyDoubleCheckTokyoTower {
    private static ThreadSafeLazyDoubleCheckTokyoTower instance;

    private ThreadSafeLazyDoubleCheckTokyoTower(){
        if (instance != null){
            throw new IllegalStateException("Already initialized.");
        }
    }

    /**
     * The instance doesn't get created until the method is called for the first time.
     */
    public static synchronized ThreadSafeLazyDoubleCheckTokyoTower getInstance() {
        if (instance == null) {
            synchronized (ThreadSafeLazyDoubleCheckTokyoTower.class) {
                if (instance == null) {
                    instance = new ThreadSafeLazyDoubleCheckTokyoTower();
                }
            }
        }
        return instance;
    }
}
