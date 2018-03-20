package Question1;

import java.util.Arrays;
import java.util.Scanner;

public class Driver {

    public static void main (String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter the dataword: ");

        String dataWord = scanner.next();

        System.out.println("Please enter the divisor: ");

        String divisor = scanner.next();

        Encoder encoder = new Encoder(dataWord, divisor);

        int[] codeWord = encoder.encode();

        System.out.println("Your code word is: \n" + Arrays.toString(codeWord));

        System.out.println("Please enter the codeword you want to check: (It has to be in " + codeWord.length + " bits )");

        String codeWordToCheck = scanner.next();

        while (codeWordToCheck.length() != codeWord.length) {
            System.out.println("Your code is wrong. Please re-enter codeword you want to check: ");
            codeWordToCheck = scanner.next();
        }

        Decoder decoder = new Decoder(codeWordToCheck, divisor);

        System.out.println(decoder.decode());
    }


}
