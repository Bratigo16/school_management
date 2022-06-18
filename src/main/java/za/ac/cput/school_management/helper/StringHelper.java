package za.ac.cput.school_management.helper;

import org.apache.commons.lang3.StringUtils;

import java.util.regex.Pattern;

public class StringHelper
{
    public static boolean IsEmptyOrNull(String str)
    {
        return StringUtils.isEmpty(str);
    }

    public static String setEmptyIfNull(String str)
    {
        if(IsEmptyOrNull(str)) return StringUtils.EMPTY;
        return str;
    }

    public static boolean patternMatches(String email, String regexPattern) {
        return Pattern.compile(regexPattern)
                .matcher(email)
                .matches();
    }

    public static void checkStringParam(String paramName, String paramValue)
    {
        if(IsEmptyOrNull(paramValue))
            throw new IllegalArgumentException(String.format("Invalid value for param %s:", paramName));
    }
}
