package Question1;

public class Divider {

    public int[] divide(int divisor[], int remainder[]) {
        // Track the position of dividend
        int current = 0;

        while ((remainder.length - current) >= divisor.length) {

            // Do the xor operation when leftmost bit 1
            for (int i = 0; i < divisor.length; i++) {
                remainder[current + i] = (remainder[current + i] ^ divisor[i]);
            }
            // If leftmost bit is 0, increment current
            while (remainder[current] == 0 && current != remainder.length - 1) {
                current++;
            }

        }
        return remainder;
    }
}
