public class FletcherCheckSum {

    public int[] sendMessage(int[] words) {
        int checkSum = generateFletcherCheckSum(words);
        int[] message = combineWordsAndCheckSum(words, checkSum);
        return message;
    }

    private int[] combineWordsAndCheckSum(int[] words, int checkSum) {
        int[] message = new int[words.length + 1];
        int i = 0;
        while (i < words.length) {
            message[i] = words[i];
            i++;
        }
        message[i] = checkSum;
        return message;
    }

    private int generateFletcherCheckSum(int[] words) {
        int left = 0;
        int right = 0;
        int i = 0;
        while (i < words.length) {
            right = (right + words[i]) % 256;
            left = (left + right) % 256;
            i++;
        }
        int checkSum = left * 256 + right;
        return checkSum;
    }

    public void receiveMessage(int[] message) {
        int[] words = getWords(message);
        int checkSum = generateFletcherCheckSum(words);
        int receivedSum = getSum(message);
        if (checkSum == receivedSum) {
            System.out.println("Message is accepted.");
        } else {
            System.out.println("Message is declined.");
        }
    }

    private int[] getWords(int[] message) {
        int[] words = new int[message.length - 1];
        int i = 0;
        while (i < words.length) {
            words[i] = message[i];
            i++;
        }
        return words;
    }

    private int getSum(int[] message) {
        return message[message.length - 1];
    }
}
