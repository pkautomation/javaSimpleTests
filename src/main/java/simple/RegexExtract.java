package simple;

import java.util.regex.Pattern;

public class RegexExtract {
    public static void PrintRegex(String string){
        System.out.println("regex:");
        var matcher = Pattern.compile("" +
                "[0-3][0-9](JAN|FEB|MAR|APR|MAY|JUN|JUL|AUG|OCT|NOV|DEC)2(?!000)([0-9]){3}" +
                "").matcher(string);
        if(matcher.find()) {
            System.out.println(matcher.group());
        } else {
            System.out.println("Match not found");
        }
    }
}
