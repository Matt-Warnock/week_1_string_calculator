public class StringCalculator {
    public int add(String numbers) {
        if (numbers.equals("")) {
            return 0;
        }

        if (numbers.length() == 3) {
            int value1 = charToInt(numbers.charAt(0));
            int value2 = charToInt(numbers.charAt(2));

            return value1 + value2;
        }

        return Integer.parseInt(numbers);

    }

    private static int charToInt(char value) {
        return Character.getNumericValue(value);
    }
}
