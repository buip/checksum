package Question3;

public class FletcherCheckSum {
    public static void main (String[] args) {
        short[] message = {43, 63, 106, 175};
        int checkSum = generateFletcherCheckSum(message);
        System.out.println("Binary from is: " + Integer.toBinaryString(checkSum));
        System.out.println("Decimal form is " + checkSum);
    }

    public static int generateFletcherCheckSum(short[] message) {
        short right = 0;
        short left = 0;
        for (int i = 0; i < message.length; i++) {
            right = (short) ((right + message[i]) % 256);
            left = (short) ((left + right) % 256);
        }
        return left * 256 + right;
    }
}
