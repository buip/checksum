package Question2;

public class Driver {

    public static void main (String[] args) {
        // Creates words to send
        int[] words = {5, 13, 15, 3, 6};

        // Tests the traditional checksum.
        System.out.println("Traditional check sum");
        TraditionalCheckSum traditionalCheckSum = new TraditionalCheckSum();
        int[] message = traditionalCheckSum.sendMessage(words);

        int[] noisedMessage = generateNoisedMessage(message);
        System.out.println("Testing a noised message with ");
        printArray(noisedMessage);
        traditionalCheckSum.receiveMessage(noisedMessage);

        System.out.println("Testing a correct message with");
        printArray(message);
        traditionalCheckSum.receiveMessage(message);
    }

    public static int[] generateNoisedMessage(int[] message) {
        // Change the message to simulate noises.
        int[] noisedMessage = new int[message.length];
        for (int i = 0; i < message.length; i++) {
            noisedMessage[i] = message[i];
        }
        noisedMessage[1] = 8;
        noisedMessage[3] = 10;
        return noisedMessage;
    }

    private static void printArray(int[] message) {
        System.out.print("   {");
        for (int i = 0; i < message.length; i++) {
            System.out.printf("%d, ", message[i]);
        }
        System.out.print("}\n");
    }
}
