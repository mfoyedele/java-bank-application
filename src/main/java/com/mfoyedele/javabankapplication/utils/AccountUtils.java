package com.mfoyedele.javabankapplication.utils;

import java.time.Year;

public class AccountUtils {

    /**
     * 2004 + randomSixDigits
     */

    Year currentYear = Year.now();
    int min = 100000;
    int max = 900000;

    // Generate a random number between min and max
    int randomNumber = (int) Math.floor(Math.random() * (max - min + 1) +  min);
    // Convert the current year and randomNumber to strings, then concatenate them.
}
