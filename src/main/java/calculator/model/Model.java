package calculator.model;


import java.util.Arrays;

public class Model {
    private static final calculator.model.Parser parser = new Parser();

    public static int getSum(String[] numbers) {
        return Arrays.stream(numbers)
                .mapToInt(parser::toInt)
                .sum();
    }
}