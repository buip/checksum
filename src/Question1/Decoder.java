package Question1;

public class Decoder {

    private String codewordToCheckInput;

    private String divisorInput;

    public Decoder(String codewordToCheckInput, String divisorInput) {
        this.codewordToCheckInput = codewordToCheckInput;
        this.divisorInput = divisorInput;
    }

    public String decode() {

        int length = codewordToCheckInput.length();

        int[] codeWord = new int[length];

        int[] remainder = new int[length];

        int[] divisor = new int[divisorInput.length()];

        for (int i = 0; i < length; i++) {
            codeWord[i] = Character.getNumericValue(codewordToCheckInput.charAt(i));
        }

        for (int i = 0; i < length; i++) {
            remainder[i] = codeWord[i];
        }

        for (int i = 0; i < divisorInput.length(); i++) {
            divisor[i] = Character.getNumericValue(divisorInput.charAt(i));
        }

        Divider divider = new Divider();

        remainder = divider.divide(divisor, remainder);

        for (int i = 0; i < remainder.length; i++) {
            if (remainder[i] != 0) {
                return "Dataword discarded";
            }
        }

        return "Dataword accepted";
    }

}
