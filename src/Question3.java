import java.util.Scanner;

public class Question3 {


    public static void main (String[] args) {

        Scanner scanner = new Scanner(System.in);

        int num = scanner.nextInt();

        int[] words = new int[num];

        for (int i = 0; i < num; i++) {
            words[i] = scanner.nextInt();
        }

        int left = 0;
        int right = 0;

        int i = 0;

        while (i < num) {
            right = (right + words[i]) % 256;
            left = (left + right) % 256;
            i++;
        }

        int sum = left * 256 + right;

        System.out.println(sum);
    }
}
