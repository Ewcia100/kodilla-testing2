package com.kodilla.spring.calculator;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CalculatorTestSuite {
    @Test
    public void testAddMethod() {
        //Given
        ApplicationContext context =
                new AnnotationConfigApplicationContext("com.kodilla.spring");
        Calculator calculator = context.getBean(Calculator.class);
        //When
        double val = calculator.add(7.8, 2.2);
        //Then
        Assert.assertEquals(10.0, val, 0.00001);
    }

    @Test
    public void testSubBfromAMethod() {
        //Given
        ApplicationContext context =
                new AnnotationConfigApplicationContext("com.kodilla.spring");
        Calculator calculator = context.getBean(Calculator.class);
        //When
        double val = calculator.subBFromA(7.8, 2.2);
        //Then
        Assert.assertEquals(5.6, val, 0.00001);
    }

    @Test
    public void testMulMethod() {
        //Given
        ApplicationContext context =
                new AnnotationConfigApplicationContext("com.kodilla.spring");
        Calculator calculator = context.getBean(Calculator.class);
        //When
        double val = calculator.mul(7.8, 2.2);
        //Then
        Assert.assertEquals(17.16, val, 0.00001);
    }

    @Test
    public void testDivAByBNot0Method() {
        //Given
        ApplicationContext context =
                new AnnotationConfigApplicationContext("com.kodilla.spring");
        Calculator calculator = context.getBean(Calculator.class);
        //When
        double val = calculator.divAbyB(7.8, 2.2);
        //Then
        Assert.assertEquals(3.54545, val, 0.00001);
    }
    @Test
    public void testDivAByB0Method() {
        //Given
        ApplicationContext context =
                new AnnotationConfigApplicationContext("com.kodilla.spring");
        Calculator calculator = context.getBean(Calculator.class);
        //When
        double val = calculator.divAbyB(7.8, 0);
        //Then
        Assert.assertEquals(-1, val, 0.00001);
    }
}
