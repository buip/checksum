package Question1;

public class Divider {

    public int[] divide(int divisor[], int remainder[]) {
        int current = 0;

        while ((remainder.length - current) >= divisor.length) {

            for (int i = 0; i < divisor.length; i++)
                remainder[current + i] = (remainder[current + i] ^ divisor[i]);

            while (remainder[current] == 0 && current != remainder.length - 1)
                current++;

        }
        return remainder;
    }
}
