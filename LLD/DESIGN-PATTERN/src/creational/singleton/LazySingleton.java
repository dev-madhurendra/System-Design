package creational.singleton;

public class LazySingleton {

    private static LazySingleton instance;
    public String value;

    private LazySingleton(String value) {
        try {
            Thread.sleep(10);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        this.value = value;
    }

    public static LazySingleton getInstance(String value) {

        if ( instance == null ) {
            instance = new LazySingleton(value);
        }
        return instance;
    }

}
