package utils;

import java.util.regex.Pattern;

public class RegexValidators {

    // Regex patterns
    private static final String NAME_PATTERN = "^[A-Za-z ]{2,30}$";
    private static final String GLASS_TYPE_PATTERN = "^[A-Za-z ]{3,20}$";
    private static final String PREPARATION_METHOD_PATTERN = "^.{10,100}$";
    private static final String GARNISH_PATTERN = "^[A-Za-z ]{3,30}$";

    // Compiled regex patterns
    private static final Pattern NAME_REGEX = Pattern.compile(NAME_PATTERN);
    private static final Pattern GLASS_TYPE_REGEX = Pattern.compile(GLASS_TYPE_PATTERN);
    private static final Pattern PREPARATION_METHOD_REGEX = Pattern.compile(PREPARATION_METHOD_PATTERN);
    private static final Pattern GARNISH_REGEX = Pattern.compile(GARNISH_PATTERN);

    // Validators
    public static boolean isValidName(String name) {
        return NAME_REGEX.matcher(name).matches();
    }

    public static boolean isValidGlassType(String glassType) {
        return GLASS_TYPE_REGEX.matcher(glassType).matches();
    }

    public static boolean isValidPreparationMethod(String preparationMethod) {
        return PREPARATION_METHOD_REGEX.matcher(preparationMethod).matches();
    }

    public static boolean isValidGarnish(String garnish) {
        return GARNISH_REGEX.matcher(garnish).matches();
    }
}
