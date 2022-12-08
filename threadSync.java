class Transfer {
    public void sendMessage(String message) {
        System.out.println(message + " is Sending.....");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(message + " is Sent..!");
    }
}

class MessageTransfer extends Thread {
    private String message;
    Transfer msgTransfer;
    public MessageTransfer(String msg, Transfer trans) {
        message = msg;
        msgTransfer = trans;
    }
    @Override
    public void run() {
        synchronized(msgTransfer) {
            msgTransfer.sendMessage(message);
        }
    }
}

public class threadSync {
    public static void main(String[] args) {
        Transfer trans = new Transfer();
        MessageTransfer msg1 = new MessageTransfer("Hello", trans);
        MessageTransfer msg2 = new MessageTransfer("world", trans);
        MessageTransfer msg3 = new MessageTransfer("java", trans);

        msg1.start();
        msg2.start();
        msg3.start();
    }
}
