package Question1;

public class Encoder {

    int dataWord;
    int divisor;

    public Encoder(int dataWord, int divisor) {
        this.dataWord = dataWord;
        this.divisor = divisor;
    }

    public int encode(int dataWord, int divisor) {
        int tempDataWord = dataWord;

        int numBits = 0;
        while (tempDataWord / 2 > 1) {
            tempDataWord = tempDataWord / 2;
            numBits++;
        }

        int addedDataWord = dataWord * 2 ^ numBits;

        int remainder = addedDataWord % divisor;

        int codeWord = addedDataWord + remainder;

        return codeWord;
    }

}
