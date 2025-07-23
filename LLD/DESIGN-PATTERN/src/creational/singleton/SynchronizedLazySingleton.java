package creational.singleton;

public class SynchronizedLazySingleton {

    private static SynchronizedLazySingleton instance;
    public String value;

    private SynchronizedLazySingleton(String value) {
        this.value = value;
    }

    public static synchronized SynchronizedLazySingleton getInstance(String value) {
        if (instance == null) {
            instance = new SynchronizedLazySingleton(value);
        }
        return instance;
    }
}
