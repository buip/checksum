package Question1;

import java.util.Scanner;

public class Driver {

    public static void main (String[] args) {

        Scanner scanner = new Scanner(System.in);

        int dataWord = scanner.nextInt();

        int divisor = scanner.nextInt();

        Encoder encoder = new Encoder(dataWord, divisor);

        int codeWord = encoder.encode(dataWord, divisor);



    }


}
