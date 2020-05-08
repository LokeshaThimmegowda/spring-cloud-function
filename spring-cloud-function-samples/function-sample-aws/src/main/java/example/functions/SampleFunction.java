package example.functions;

import java.util.function.Function;

public class SampleFunction implements Function<String, String> {
    @Override
    public String apply(String input) {
        String output = " Hello World!";
        return input + output;
    }
}
