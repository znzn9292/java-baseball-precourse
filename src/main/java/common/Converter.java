package common;

import java.util.Arrays;
import java.util.List;

public class Converter {
    public static List<String> toList(String number) {
        return Arrays.asList(number.split(""));
    }
}
