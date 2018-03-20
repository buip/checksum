package Question2;

public class Driver {

    public static void main (String[] args) {
        // Creates words to send
        int[] words = {5, 13, 15, 3, 6};

        // Tests the traditional checksum.
        System.out.println("Testing Traditional check sum");
        TraditionalCheckSum traditionalCheckSum = new TraditionalCheckSum();
        int[] message = traditionalCheckSum.sendMessage(words);
        int[] noisedMessage = generateNoisedMessage(message);
        traditionalCheckSum.receiveMessage(noisedMessage);
        traditionalCheckSum.receiveMessage(message);
    }

    public static int[] generateNoisedMessage(int[] message) {
        // Change the message to simulate noises.
        message[1] = 8;
        message[3] = 10;
        return message;
    }
}
