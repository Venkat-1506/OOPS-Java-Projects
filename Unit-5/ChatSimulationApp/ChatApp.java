import javax.swing.*;
import java.awt.*;

class Message {
    private String text;

    public Message(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }
}

class ChatService {
    public void sendMessage(String msg, JTextArea area) {
        area.append("You: " + msg + "\n");
    }

    public void autoReply(JTextArea area) {
        new Thread(() -> {
            try {
                Thread.sleep(1000);
                area.append("Friend: Hello!\n");
                Thread.sleep(1500);
                area.append("Friend: How are you?\n");
                Thread.sleep(2000);
                area.append("Friend: Nice chatting with you!\n");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }).start();
    }
}

class ChatController {
    private ChatService service;

    public ChatController(ChatService service) {
        this.service = service;
    }

    public void handleSend(String msg, JTextArea area) {
        service.sendMessage(msg, area);
        service.autoReply(area);
    }
}

class ChatUI extends JFrame {
    private JTextArea chatArea;
    private JTextField inputField;
    private JButton sendButton;
    private ChatController controller;

    public ChatUI() {
        controller = new ChatController(new ChatService());

        setTitle("Chat Simulation App");
        setSize(400, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        chatArea = new JTextArea();
        chatArea.setEditable(false);

        inputField = new JTextField();
        sendButton = new JButton("Send");

        setLayout(new BorderLayout());
        add(new JScrollPane(chatArea), BorderLayout.CENTER);

        JPanel panel = new JPanel(new BorderLayout());
        panel.add(inputField, BorderLayout.CENTER);
        panel.add(sendButton, BorderLayout.EAST);

        add(panel, BorderLayout.SOUTH);

        sendButton.addActionListener(e -> sendMessage());
        inputField.addActionListener(e -> sendMessage());

        setVisible(true);
    }

    private void sendMessage() {
        String msg = inputField.getText();
        if (!msg.isEmpty()) {
            controller.handleSend(msg, chatArea);
            inputField.setText("");
        }
    }
}

public class ChatApp {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(ChatUI::new);
    }
}