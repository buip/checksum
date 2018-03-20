package Question3;

public class Driver {

    public static void main (String[] args) {

        // Creates words to send
        int[] words = {5, 13, 15, 3, 6};

        // Fletcher check sum for question 3
        System.out.println("Testing Fletcher check sum");
        FletcherCheckSum fletcherCheckSum = new FletcherCheckSum();
        int[] message = fletcherCheckSum.sendMessage(words);
        int[] noisedMessage = generateNoisedMessage(message);
        fletcherCheckSum.receiveMessage(noisedMessage);
        fletcherCheckSum.receiveMessage(message);
    }

    public static int[] generateNoisedMessage(int[] message) {
        // Change the message to simulate noises.
        message[1] = 8;
        message[3] = 10;
        return message;
    }
}

