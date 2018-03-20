package Question1;

public class Encoder {

    private String dataWordInput;
    private String divisorInput;

    public Encoder(String dataWordInput, String divisorInput) {
        this.dataWordInput = dataWordInput;
        this.divisorInput = divisorInput;
    }

    public int[] encode() {

        int length = dataWordInput.length() + divisorInput.length() - 1;

        int[] dataWord = new int[length];

        int[] remainder = new int[length];

        int[] codeWord = new int[length];

        int[] divisor = new int[divisorInput.length()];

        for (int i = 0; i < dataWordInput.length(); i++) {
            dataWord[i] = Character.getNumericValue(dataWordInput.charAt(i));
        }

        for (int i = 0; i < divisorInput.length(); i++) {
            divisor[i] = Character.getNumericValue(divisorInput.charAt(i));
        }

        for (int i = 0; i < dataWord.length; i++) {
            remainder[i] = dataWord[i];
        }

        Divider divider = new Divider();

        remainder = divider.divide(divisor, remainder);

        for (int i = 0; i < dataWord.length; i++) {
            codeWord[i] = (dataWord[i] ^ remainder[i]);
        }

        return codeWord;
    }

}
