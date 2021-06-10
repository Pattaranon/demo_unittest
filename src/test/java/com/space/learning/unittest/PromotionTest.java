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
        Assertions.assertEquals(600, promotion.come4Pay3(4, 3, 4, 200));
    }

    @Order(2)
    @Test
    public void comeNineShouldBePayThree_ResultSuccessTest () {
        Assertions.assertEquals(400, promotion.come4Pay3(MockDataForTestOrder2.come_x, MockDataForTestOrder2.pay_y, MockDataForTestOrder2.total_person, MockDataForTestOrder2.per_head));
    }

    interface MockDataForTestOrder2 {
        int come_x = 4;
        int pay_y = 3;
        int per_head = 100;
        int total_person = 4;
    }
}
