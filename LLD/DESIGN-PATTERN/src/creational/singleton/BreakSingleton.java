package creational.singleton;

import java.io.*;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class BreakSingleton {

    public void breakUsingSerializable() throws IOException, ClassNotFoundException {

        LazySingleton instance1 = LazySingleton.getInstance("");

        ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("object.obj"));
        objectOutputStream.writeObject(instance1);
        objectOutputStream.close();

        ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("object.obj"));
        LazySingleton instance2 = (LazySingleton) objectInputStream.readObject();
        objectInputStream.close();
        System.out.println("Object 1 :" + instance1.hashCode());
        System.out.println("Object 2 :" + instance2.hashCode());

    }

    public void breakUsingReflection() throws InvocationTargetException, InstantiationException, IllegalAccessException {
        LazySingleton instance1 = LazySingleton.getInstance("Instance 1");

        Constructor constructor[] = LazySingleton.class.getDeclaredConstructors();
        Constructor lazySingletonConstructor = constructor[0];
        lazySingletonConstructor.setAccessible(true);
        LazySingleton instance2 = (LazySingleton) lazySingletonConstructor.newInstance("Instance 2");

        System.out.println("Instance 1 hashcode " + instance1.hashCode());
        System.out.println("Instance 2 hashcode " + instance2.hashCode());

        System.out.println("Instance 1 Value " + instance1.value);
        System.out.println("Instance 2 Value " + instance2.value);
    }

}
