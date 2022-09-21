package behavioral.mediator;

public class SimpleChatRunner {
    public static void main(String[] args) {

        SimpleTextChat chat = new SimpleTextChat();

        User admin = new Admin(chat,"Admin");
        User user = new SingleUser(chat,"Hakobik");
        User user1 = new SingleUser(chat,"Gven");

        chat.setAdmin(admin);
        chat.addUserToChat(user);
        chat.addUserToChat(user1);


        //user.sendMessage("Hello I am Hakobik");
admin.sendMessage("es adminn em");
       // admin.sendMessage("I am admin");

    }
}
