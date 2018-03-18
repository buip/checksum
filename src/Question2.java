import java.util.Scanner;

public class Question2 {

    public static void main (String[] args) {

        Scanner scanner = new Scanner(System.in);

        int num = scanner.nextInt();

        int[] words = new int[num];

        for (int i = 0; i < num; i++) {
            words[i] = scanner.nextInt();
        }

        int sum = 0;
        int i = 0;
        while(i < num) {
//            int decimal = Integer.parseInt(words[i], 16);
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

        System.out.println(complementSum);

    }

}
