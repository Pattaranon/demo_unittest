package com.space.learning.unittest;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class LotusTest {

    @Test
    public void inputOneItemShouldBeMultiplePricePerItem_ResultSuccess() {
        ItemPrice itemPrice = new ItemPrice();
        Assertions.assertEquals(250, itemPrice.calculate(0, 1, 250));
    }

    @Test
    public void inputTwoItemShouldBePlusPricePerItem_ResultSuccess() {
        ItemPrice itemPrice = new ItemPrice();
        Assertions.assertEquals(251, itemPrice.calculate(1, 1, 250));
    }
}
