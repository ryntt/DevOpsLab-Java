package edu.sjsu;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class NameChecker {
    /**
     * Checks if a given string is a valid name following these rules:
     * - Between 2 to 40 characters
     * - Contains only alphabetic characters, non-consecutive hyphens, or a single
     * quote
     * - Cannot start with a hyphen or single quote
     * 
     * @param input Name to check
     * @return True if input is a valid name, else false
     */
    public static boolean check(String input) {
        Pattern regex = Pattern.compile("^[a-zA-Z][a-zA-Z-']{1,39}$");
        Matcher stringInput = regex.matcher(input);
        if (stringInput.matches()) {
            String quotedPattern = "''";
            String dashedPattern = "--";
            if (input.contains(quotedPattern) || input.contains(dashedPattern)) {
                return false;
            } else {
                return true;
            }
        } else {
            return false;
        }
    }
}
