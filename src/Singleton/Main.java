package Singleton;

import java.io.Serializable;

public class Main implements Serializable {

    enum MySingleton {
        INSTANCE;

        public void doJob() {

        }
    }

    private static final Main main = new Main();

    private Main() {
    }

    public static Main getInstance() {
        return main;
    }

    private Object readResolve() {
        return main;
    }

    //approaches
    //advantages
    //serializable
    //enum
    public static void main(String[] args) {
//        singleton.someMethod();
//        someOterhLocalMethod();
        Main.getInstance();
    }
}