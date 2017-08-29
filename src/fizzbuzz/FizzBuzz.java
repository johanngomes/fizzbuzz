package fizzbuzz;

public class FizzBuzz {
    public String convert(int number) throws NonPositiveNumberException {
        if (isNegative(number)) {
            throw new NonPositiveNumberException();
        }

        return buildFizzBuzz(number);
    }

    private String buildFizzBuzz(int number) {
        String convertedNumber = "";

        if (isMultipleOf3(number)) {
            convertedNumber += "fizz";
        }

        if (isMultipleOf5(number)) {
            convertedNumber += "buzz";
        }

        return convertedNumber;
    }

    private boolean isNegative(int number) {
        return number < 0;
    }

    private boolean isMultipleOf5(int number) {
        return number % 5 == 0;
    }

    private boolean isMultipleOf3(int number) {
        return number % 3 == 0;
    }
}
