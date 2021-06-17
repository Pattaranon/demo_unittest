package com.space.learning.unittest;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class ReverseTest {

    @Test
    public void reverseStringLeftShouldBeRightDisplay_ResultSuccess() {
        // Arrange
        String expectResult = "nonarattaP";
        String inputText = "Pattaranon";
        Reverse reverse = new Reverse();

        // Act
        String actualResult = reverse.getReverseString(inputText);

        // Assert
        Assertions.assertEquals(expectResult, actualResult);
    }

    @Test
    public void inputABCReverseFunctionShouldBeCBA_ResultSuccess() {
        // Arrange
        String expectResult = "CBA";
        String inputText = "ABC";

        // Act
        Reverse reverse = new Reverse();
        String actualResult = reverse.getReverseFunction(inputText);

        // Assert
        Assertions.assertEquals(expectResult, actualResult);
    }

    @Test
    public void inputIntegerShouldBeReverseInteger_ResultSuccess() {
        // Arrange
        short expectResult = 345;
        short inputInt = 543;

        // Act
        Reverse reverse = new Reverse();
        int actualResult = reverse.getReverseInteger(inputInt);

        //Assert
        Assertions.assertEquals(expectResult, actualResult);

    }
}
