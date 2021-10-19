package com.company;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

class BMIValuesTest {
    @Test
    public void testcase1() {
        Assert.assertEquals("Overweight" , BMIValues.bmiCalculator(205 , "pounds" , 73 , "inches") );
    }
    @Test
    public void testcase2() {
        Assert.assertEquals("Normal Weight" , BMIValues.bmiCalculator(55 , "kilos" , 1.65 , "meters") );
    }
    @Test
    public void testcase3() {
        Assert.assertEquals("Underweight" , BMIValues.bmiCalculator(154 , "pounds" , 2 , "meters") );
    }
    }

