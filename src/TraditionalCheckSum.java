public class TraditionalCheckSum {

    public int[] sendMessage(int[] words) {
        int checkSum = generateTraditionalCheckSum(words);
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

    private int generateTraditionalCheckSum(int[] words) {
        int sum = 0;
        int i = 0;
        while(i < words.length) {
            sum += words[i];
            i++;
        }
        int leftSum = sum / 16;
        int rightSum;

        while (leftSum != 0) {
            leftSum = sum / 16;
            rightSum = sum % 16;
            sum = leftSum + rightSum;
        }
        int complementSum = 15 - sum;
        System.out.printf("    complementSum: %d\n", complementSum);
        return complementSum;
    }

    public void receiveMessage(int[] message) {
        int[] words = getWords(message);
        int checkSum = generateTraditionalCheckSum(words);
        int receivedSum = getSum(message);
        if (checkSum == receivedSum) {
            System.out.println("    Message accepted.");
        } else {
            System.out.println("    Message declined.");
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
