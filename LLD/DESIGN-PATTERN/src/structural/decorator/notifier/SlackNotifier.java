package structural.decorator.notifier;

public class SlackNotifier extends NotifierDecorator {
    public SlackNotifier(Notifier notifier) {
        super(notifier);
    }

    @Override
    public void send(String message) {
        super.send(message);
        sendSlack(message);
    }

    private void sendSlack(String message) {
        System.out.println("Sending Slack: " + message);
    }
}

