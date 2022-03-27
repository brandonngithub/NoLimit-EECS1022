package com.example.guess.Test;

import com.example.guess.Model;
import org.junit.Test;

public class ModelTest
{
    @Test
    public void getBMITest()
    {
        double w, h;
        System.out.println("Testing BMI.getBMI");

        w = 90; h = 1.8;
        System.out.println(w + "," + h);
        System.out.println(Model.getBMI(w, h));
    }
}
