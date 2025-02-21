
public class Singleton {
    private static Singleton singleton;
    private GlobalHandler globalHandler; // like connection

    private Singleton() {
        System.out.println("Singleton instance created...!");
        globalHandler = new GlobalHandler();
    }

    public static Singleton getInstance() {
        if (singleton == null) {
            singleton = new Singleton();
        }
        return singleton;
    }

    public GlobalHandler getGlobalHandler() {
        return globalHandler;
    }
}
