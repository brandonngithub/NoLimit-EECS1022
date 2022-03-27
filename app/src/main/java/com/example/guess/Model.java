package com.example.guess;

import java.text.DecimalFormat;

public class Model {
    public static double getBMI(double weight, double height) {
        double result = weight/height/height;
        return result;
    }

    public static double toInt(String s) {
        return Integer.parseInt(s);
    }

    public static String formatBMI(double bmi) {
        DecimalFormat df = new DecimalFormat("##.#");
        String oneDecimal = df.format(bmi);
        return oneDecimal;
    }
}
