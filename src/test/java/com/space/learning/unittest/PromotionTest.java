package com.space.learning.unittest;

import org.junit.jupiter.api.*;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import java.math.BigDecimal;
import java.text.DecimalFormat;

@SpringBootTest
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class PromotionTest {

    /*
    Promotion มา4 จ่าย 3 ตกต่อหัวคนต้องจ่ายคนละเท่าไหร่
    ราคาต่อหัวคือ 100บาท
    */

    @Autowired
    public Promotion promotion;

    @Order(1)
    @Test
    public void comeFourPayThree_ResultSuccessTest() {
        /*
        int intPerson = MockData.comePerson / MockData.comeX;
        int payTotal = MockData.payY * MockData.perHead;
        int roundFirst = intPerson * payTotal;
        int modPerson = MockData.comePerson % MockData.comeX * MockData.perHead;
        int total = roundFirst + modPerson;
        */


        Assertions.assertEquals(600, promotion.come4Pay3(4, 3, 4, 200));
    }
}
