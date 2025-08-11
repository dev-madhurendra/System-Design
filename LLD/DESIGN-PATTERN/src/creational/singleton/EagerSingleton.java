package creational.singleton;

public class EagerSingleton {

    private static final EagerSingleton instance = new EagerSingleton();

    public String value;

    private EagerSingleton() {}

    public static EagerSingleton getInstance(String value) {
        if (instance.value == null) {
            try {
                Thread.sleep(100);
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
            instance.value = value;
        }
        return instance;
    }

}
