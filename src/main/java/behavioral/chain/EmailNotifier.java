package behavioral.chain;

public class EmailNotifier extends Notifier{
    @Override
    public void write(String message) {
        System.out.println("Sending email: " +message);
    }

    public EmailNotifier(int priority) {
        super(priority);
    }
}