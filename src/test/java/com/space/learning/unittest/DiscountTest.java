package com.space.learning.unittest;

import org.junit.jupiter.api.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class DiscountTest {

    @Autowired
    private DiscountConvert discountConvert;

    @Order(1)
    @Test
    public void AddOneShouldBeDiscount25Percent_ResultSuccessTest () {
        // Arrange
        double expectResult = 37.5;

        // Act
        double actualResult = discountConvert.promotion(MockDataAddOneShouldBeDiscount25Percent.item, MockDataAddOneShouldBeDiscount25Percent.price);

        // Assert
        Assertions.assertEquals(37.5, actualResult);
    }

    @Order(2)
    @Test
    public void AddTwoShouldBeDiscount50Percent_ResultSuccessTest () {
        // Arrange
        int expectResult = 200;

        // Act
        double actualResult = discountConvert.promotion(MockDataAddTwoShouldBeDiscount50Percent.item, MockDataAddTwoShouldBeDiscount50Percent.price);

        // Assert
        Assertions.assertEquals(expectResult, actualResult);
    }

    interface MockDataAddOneShouldBeDiscount25Percent {
        int item = 1;
        int price = 50;
    }

    interface MockDataAddTwoShouldBeDiscount50Percent {
        int item = 2;
        int price = 200;
    }
}
