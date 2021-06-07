package com.space.learning.unittest;

import org.junit.jupiter.api.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class FizzBuzzTest {

    @Autowired
    private FizzBuzzConverter fizzBuzzConverter;

    @Order(1)
    @Test
    public void OneShouldBeOneTest(){

        Assertions.assertEquals("1", fizzBuzzConverter.CalculateFizzBuss(1));
    }

    @Order(2)
    @Test
    public void TwoShouleBeTwoTest() {
        Assertions.assertEquals("2", fizzBuzzConverter.CalculateFizzBuss(2));
    }

    @Order(3)
    @Test
    public void ThreeShouleBeThreeExpectToFizzTest() {
        Assertions.assertEquals("fizz", fizzBuzzConverter.CalculateFizzBuss(3));
    }

    @Order(4)
    @Test
    public void cal_FizzBuzz_Normal_ResultSuccessValueTest() {
        // Arange
        String expectResult = "fizz";
        int input = 9;

        // Act
        String actualResult = fizzBuzzConverter.CalculateFizzBuss(input);

        // Assert
        Assertions.assertEquals(expectResult, actualResult);
    }
    @Order(4)
    @Test
    public void cal_FizzBuzz_Normal_ResultFailValueTest() {
        // Arange
        String expectResult = "fizz buzz";
        int input = 9;

        // Act
        String actualResult = fizzBuzzConverter.CalculateFizzBuss(input);

        // Assert
        Assertions.assertNotEquals(expectResult, actualResult);
    }
}
