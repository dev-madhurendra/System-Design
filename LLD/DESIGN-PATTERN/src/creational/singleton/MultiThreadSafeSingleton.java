package creational.singleton;

public class MultiThreadSafeSingleton {

    private static MultiThreadSafeSingleton instance;
    public String value;

    private MultiThreadSafeSingleton(String value) {
        this.value = value;
    }

    public static MultiThreadSafeSingleton getInstance(String value) {
        if ( instance == null ) {

            synchronized (MultiThreadSafeSingleton.class) {
                if (instance == null) {
                    instance = new MultiThreadSafeSingleton(value);
                }
            }

        }
        return instance;
    }
}
