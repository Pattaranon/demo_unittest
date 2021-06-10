package com.space.learning.unittest;

import org.junit.jupiter.api.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class YoutubeFamilyTest {

    @Autowired
    private YoutubeFamily youtubeFamily;

    @Order(1)
    @Test
    public void comeTwoShouldBePayTwo_ResultSuccessTest () {
        Assertions.assertEquals("119", youtubeFamily.calPayment(239, 2));
    }

    @Order(2)
    @Test
    public void comeSixShouldBePaySix_ResultSuccessTest () {
        // Arrange
        int pricePerMonth = 239;
        int familyPerson = 6;
        String expectResult = "39";

        // Act
        String actualResult = youtubeFamily.calPayment(pricePerMonth, familyPerson);

        // Assert
        Assertions.assertEquals(expectResult, actualResult);
    }
}
