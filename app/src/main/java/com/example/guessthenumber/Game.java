package com.example.guessthenumber;

public class Game {

    public static String howCloseEasy(int num1, int num2) {
        String str;
        int diff = num1 - num2;
        if(Math.abs(diff) <= 3)
        {
            str = "Your guess is close!";
        }
        else if(3 < Math.abs(diff) && Math.abs(diff) <= 6)
        {
            str = "Your guess is not too far off!";
        }
        else
        {
            str = "Your guess is pretty far off";
        }
        return str;
    }

    public static String howCloseNormal(int num1, int num2) {
        String str;
        int diff = num1 - num2;
        if(Math.abs(diff) <= 10)
        {
            str = "Your guess is close!";
        }
        else if(10 < Math.abs(diff) && Math.abs(diff) <= 25)
        {
            str = "Your guess is not too far off!";
        }
        else
        {
            str = "Your guess is pretty far off";
        }
        return str;

    }

    public static String howCloseHard(int num1, int num2) {
        String str;
        int diff = num1 - num2;
        if(Math.abs(diff) <= 25)
        {
            str = "Your guess is close!";
        }
        else if(25 < Math.abs(diff) && Math.abs(diff) <= 50)
        {
            str = "Your guess is not too far off!";
        }
        else
        {
            str = "Your guess is pretty far off";
        }
        return str;

    }

}
