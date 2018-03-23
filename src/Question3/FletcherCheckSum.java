package Question3;

public class FletcherCheckSum {
    public static void main (String[] args) {
        short[] message = {7, 11, 12, 0, 6};
        int checkSum = generateFletcherCheckSum(message);
        System.out.printf("check sum is %d", checkSum);
    }

    public static int generateFletcherCheckSum(short[] message) {
        short right = 1;
        short left = 0;
        for (int i = 0; i < message.length; i++) {
            right = (short) ((right + message[i]) % 65521);
            left = (short) ((left + right) % 65521);
        }
        // int checkSum = left * 65521 + right;
        int checkSum = (left << 16) | right;// Does the same thing as the multiplication and addition;
        return checkSum;
    }
}
