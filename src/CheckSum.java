public class CheckSum {

    public static void main (String[] args) {

        short[] words = {7, 11, 12, 0, 6};

        System.out.println(checksum(words));

//        System.out.println("Binary from is: " + Integer.toBinaryString(words))
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

        short finalSum = (short) ~sum;

        return finalSum;
    }

}
