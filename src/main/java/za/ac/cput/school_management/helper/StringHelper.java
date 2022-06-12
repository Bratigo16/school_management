package za.ac.cput.school_management.helper;

import org.apache.commons.lang3.StringUtils;

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

    public static void checkStringParam(String paramName, String paramValue)
    {
        if(IsEmptyOrNull(paramValue))
            throw new IllegalArgumentException(String.format("Invalid value for param %s:", paramName));
    }
}
