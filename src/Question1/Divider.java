package Question1;

public class Divider {

    public int[] divide(int divisor[], int dividend[]) {
        int current = 0;

        while ((dividend.length - current) >= divisor.length) {

            for (int i = 0; i < divisor.length; i++)
                dividend[current + i] = (dividend[current + i] ^ divisor[i]);

            while (dividend[current] == 0 && current != dividend.length - 1)
                current++;

        }
        return dividend;
    }
}
