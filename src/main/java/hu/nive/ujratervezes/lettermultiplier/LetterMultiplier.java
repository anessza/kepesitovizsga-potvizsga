package hu.nive.ujratervezes.lettermultiplier;

public class LetterMultiplier {
    String multiply(String input, int number) {
        StringBuilder resolve;

        if (input == null || input.equals("") || number < 0) {
            throw new IllegalArgumentException("hibás bemeneti paraméterek");
        }
        else
            {
            resolve = new StringBuilder();
            for (char item : input.toCharArray()) {
                for (int i = 0; i < number; i++) {
                    resolve.append(item);
                }
            }
        }
        return resolve.toString();
    }

}
