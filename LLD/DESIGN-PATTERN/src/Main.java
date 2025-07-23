import creational.abstractFactory.GUIFactory;
import creational.abstractFactory.factory.MacFactory;
import creational.abstractFactory.factory.WinFactory;
import creational.builder.User;
import creational.factory.ShapeFactory;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import creational.prototype.Document;
import structural.decorator.coffee.*;
import structural.decorator.notifier.*;
import structural.proxy.cacheProxy.CacheProxy;
import structural.proxy.cacheProxy.DBService;
import structural.proxy.protectionProxy.BankAccount;
import structural.proxy.protectionProxy.BankAccountProxy;
import structural.proxy.virtualProxy.Image;
import structural.proxy.virtualProxy.ImageProxy;

class Main {

    public static Scanner sc = new Scanner(System.in);

    public static void demoPrototype() {
        Document resumeTemplate = new Document("Resume", "Basic Resume Template");
        Document userResume = (Document) resumeTemplate.clone();
        userResume.setContent("Resume of John Doe with skills and projects");

        resumeTemplate.display();
        userResume.display();


    }

    public static void demoBuilderDesign() {
        User user = new User.UserBuilder("Madhurendra", "dev.madhurendra@gmail.com")
                .age(24)
                .address("Khalilabad Sant Kabir Nagar")
                .build();

        user.getUserDetails();
    }

    public static void demoAbstractFactoryDesign() {
        GUIFactory factory;
        String type = sc.nextLine();
        if ( type.equals("win") ) {
            factory = new WinFactory();
        } else {
            factory = new MacFactory();
        }

        factory.createButton().render();
        factory.createCheckbox().render();
    }

    public static void demoFactoryDesign() {
        ShapeFactory shapeFactory = new ShapeFactory();
        shapeFactory.getShape("circle").draw();
    }

    public static void decoratorDemo() {
//        Notifier notifier =
//            new SMSNotifier(
//                new SlackNotifier(
//                    new EmailNotifier(
//                        new BasicNotifier()
//                    )
//                )
//            );

        Notifier notifier = new BasicNotifier();
        notifier = new EmailNotifier(notifier);
        notifier = new SlackNotifier(notifier);
        notifier = new SMSNotifier(notifier);

        notifier.send("Server is down!");

    }

    public static void decoratorDemoV2() {
        Coffee coffee = new SimpleCoffee();
        System.out.println(coffee.description() + " - " + coffee.cost());

        coffee = new MilkCoffee(coffee);
        System.out.println(coffee.description() + " - " + coffee.cost());

        coffee = new SugarCoffee(coffee);
        System.out.println(coffee.description() + " - " + coffee.cost());

        coffee = new WhippedCreamCoffee(coffee);
        System.out.println(coffee.description() + " - " + coffee.cost());

//        Coffee coffee =
//                new WhippedCreamCoffee(
//                        new SugarCoffee(
//                                new MilkCoffee(
//                                        new SimpleCoffee()
//                                )
//                        )
//                );
//        System.out.println(coffee.description() + " - " + coffee.cost());
    }

    public static void proxy_CacheDesignPatternDemo() {
        DBService service = new CacheProxy();

        System.out.println("First request:");
        System.out.println(service.fetchData("id_1"));

        System.out.println("\nSecond request (should hit cache):");
        System.out.println(service.fetchData("id_1"));

        System.out.println("\nWait for cache to expire...");
        try {
            Thread.sleep(6000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }

        System.out.println("\nRequest after cache expiry:");
        System.out.println(service.fetchData("id_1"));
    }

    public static void proxy_virtualDesignPattnerDemo() {
        private static void virtualProxyDemo() {
            System.out.println("Creating image proxies...");
            List<Image> images = Arrays.asList(
                    new ImageProxy("photo1.jpg"),
                    new ImageProxy("photo2.jpg"),
                    new ImageProxy("photo3.jpg")
            );

            System.out.println("\nGetting info without loading:");
            for (Image img : images) {
                System.out.println(img.getInfo());
            }

            System.out.println("\nDisplaying first image (triggers loading):");
            images.get(0).display();

            System.out.println("\nGetting info after loading:");
            System.out.println(images.get(0).getInfo());
        }
    }

    public static void proxy_protectionDesignPatternDemo() {
        BankAccount adminAccount = new BankAccountProxy("123456", 1000.0, "admin");
        BankAccount userAccount = new BankAccountProxy("789012", 1000.0, "user");
        BankAccount readOnlyAccount = new BankAccountProxy("345678", 1000.0, "readonly");

        System.out.println("Admin operations:");
        adminAccount.deposit(500);
        adminAccount.withdraw(200);
        System.out.println("Balance: $" + adminAccount.getBalance());

        System.out.println("\nUser operations:");
        userAccount.deposit(300);
        userAccount.withdraw(100); // This should be denied
        System.out.println("Balance: $" + userAccount.getBalance());

        System.out.println("\nReadOnly operations:");
        readOnlyAccount.deposit(100); // This should be denied
        readOnlyAccount.withdraw(50); // This should be denied
        System.out.println("Balance: $" + readOnlyAccount.getBalance())
    }
    public static void main(String[] args) throws InvocationTargetException, InstantiationException, IllegalAccessException, IOException, ClassNotFoundException {

        // LazySingleton lazySingleton = LazySingleton.getInstance("FOO");
        // System.out.println(lazySingleton.value);
        // LazySingleton lazySingletonNew = LazySingleton.getInstance("BAR");
        // System.out.println(lazySingletonNew.value);

        // Runnable task1 = () -> {
        //    LazySingleton singleton = LazySingleton.getInstance("Thread 1");
        //    System.out.println("Instance value from Thread 1: " + singleton.value);
        // };

        // Runnable task2 = () -> {
        //    LazySingleton singleton = LazySingleton.getInstance("Thread 2");
        //    System.out.println("Instance value from Thread 2: " + singleton.value);
        // };

        // Thread thread1 = new Thread(task1);
        // Thread thread2 = new Thread(task2);

        // thread1.start();
        // thread2.start();

        // Runnable task1 = () -> {
        //    EagerSingleton singleton = EagerSingleton.getInstance("Thread 1");
        //    System.out.println("Instance value from Thread 1: " + singleton.value);
        // };

        // Runnable task2 = () -> {
        //    EagerSingleton singleton = EagerSingleton.getInstance("Thread 2");
        //    System.out.println("Instance value from Thread 2: " + singleton.value);
        // };

        // Thread thread1 = new Thread(task1);
        // Thread thread2 = new Thread(task2);

        // thread1.start();
        // thread2.start();

        // BreakSingleton breakSingleton = new BreakSingleton();
        // breakSingleton.breakUsingReflection();
        // breakSingleton.breakUsingSerializable();

        // demoFactoryDesign();

        // demoAbstractFactoryDesign();

        // demoBuilderDesign();

        // decoratorDemo();

        // decoratorDemoV2();

        // proxy_CacheDesignPatternDemo();

        // proxy_virtualDesignPattnerDemo();

        // proxy_CacheDesignPatternDemo();
    }
}