import java.util.Scanner;

public class Question1 {

    public static void main (String[] args) {

        Scanner scanner = new Scanner(System.in);

        int dataword = scanner.nextInt();

        int temp = dataword;

        int divisor = scanner.nextInt();

        int numBits = 0;
        while (temp / 2 > 1) {
            temp = temp / 2;
            numBits++;
        }

        int addedDataWord = dataword * 2 ^ numBits;

        int remainder = addedDataWord % divisor;

        int codeWord = addedDataWord + remainder;

        System.out.println(codeWord);

        if (codeWord % divisor != 0) {
            System.out.println("Discarded dataword");
        } else if (codeWord % divisor == 0) {
            System.out.println("Accepted dataword");
        }

    }
}
