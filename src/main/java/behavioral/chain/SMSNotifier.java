package behavioral.chain;

public class SMSNotifier extends Notifier {
    @Override
    public void write(String message) {
        System.out.println("Sending SMS to manager: " + message);
    }

    public SMSNotifier(int priority) {
        super(priority);
    }
}