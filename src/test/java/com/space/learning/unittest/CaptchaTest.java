package com.space.learning.unittest;

import org.junit.jupiter.api.*;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class CaptchaTest {
    @Order(1)
    @Test
    public void leftOperandShouldBe_1() {
        Captcha captcha = new Captcha(1,1,1,1);
        Assertions.assertEquals("1", captcha.getLeft());
    }

    @Order(2)
    @Test
    public void leftOperandShouldBe_5() {
        Captcha captcha = new Captcha(1,5,1,1);
        Assertions.assertEquals("5", captcha.getLeft());
    }

    @Order(3)
    @Test
    public void leftOperandShouldBe_9() {
        Captcha captcha = new Captcha(1,9,1,1);
        Assertions.assertEquals("9", captcha.getLeft());
    }
}
