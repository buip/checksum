package Question2;

public class CheckSum {

    public static void main (String[] args) {

        short[] words = {32000, 400, 30022, 5400, 0};

        int binaryWords = 0xFFFF & checksum(words);

        System.out.println("Binary from is: " + Integer.toBinaryString(binaryWords));

        System.out.println("Decimal form is " + binaryWords);
    }


    public static short checksum(short[] words) {
        int sum = 0;

        int i = 0;

        while (i < words.length) {
            sum += words[i];
            i++;
        }

        short leftSum;
        short rightSum;

        leftSum = (short) (sum >>> 16);
        rightSum = (short) (sum & 0x0000FFFF);
        sum = leftSum + rightSum;

        return (short) ~sum;
    }

}
