import java.util.Scanner;

public class Question1 {

    public static void main (String[] args) {

        Scanner scanner = new Scanner(System.in);

        int dataword = scanner.nextInt();

        int temp = dataword;

        int divisor = scanner.nextInt();

        int numBits = 0;
        while (temp / 2 > 0) {
            temp = temp / 2;
            numBits++;
        }

        int addedDataWord = dataword * (int) Math.pow(2, numBits);

        System.out.println(addedDataWord);

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
