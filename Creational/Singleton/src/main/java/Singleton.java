/**
 * User: Sandeera Jayampathi (DS)
 * Date: 12/17/2023
 * Time: 4:37 PM
 */
public class Singleton {

    private static Singleton singleton;

    private Singleton() {
        // empty
    }

    public void print() {
        System.out.println("Singleton Object");
    }

    public static Singleton getInstance() {
        if (singleton == null) {
            synchronized (Singleton.class) {
                if (singleton == null) {
                    singleton = new Singleton();
                }
            }
        }
        return singleton;
    }
}
