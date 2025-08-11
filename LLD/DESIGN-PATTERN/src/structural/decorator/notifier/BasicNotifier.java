package structural.decorator.notifier;

public class BasicNotifier implements Notifier {
    @Override
    public void send(String message) {
        System.out.println("Default Notification: " + message);
    }
}

