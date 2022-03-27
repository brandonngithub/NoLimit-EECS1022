package com.example.bmi.BMITest;

import com.example.bmi.BMIModel;
import org.junit.Test;

public class BMIModelTest
{
    @Test
    public void getBMITest()
    {
        double w, h;
        System.out.println("Testing BMI.getBMI");

        w = 90; h = 1.8;
        System.out.println(w + "," + h);
        System.out.println(BMIModel.getBMI(w, h));
    }
}
