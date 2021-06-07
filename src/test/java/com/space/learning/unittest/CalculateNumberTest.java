package com.space.learning.unittest;

import org.junit.jupiter.api.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class CalculateNumberTest {

    @Autowired
    private CalculateService calculateService;

    @Order(1)
    @Test
    public void plus_Normal_ResultSucessValueTest() {
        int a = 2;
        int b = 8;
        int expectResult = 10;

        Assertions.assertEquals(expectResult, calculateService.plus(a,b));
    }

    @Order(2)
    @Test
    public void minus_Normal_ResultSuccessValueTest() {
        Assertions.assertEquals(MockDataTest.expectResult, calculateService.minus(MockDataTest.a, MockDataTest.b));
    }

    interface MockDataTest {
        int a = 30;
        int b = 10;

        int expectResult = 20;
    }
}
