package com.space.learning.unittest;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class SortingTest {

    @Test
    public void quickSortShouldBeCounterSort_ResultSuccess() {
        // Arrange
        int[] arr = new int[]{1, 15, 9, 7, 5, 17};
        int expectResult = 2;

        // Act
        Sorting sorting = new Sorting();
        sorting.QuickSortAsc(arr, 0, arr.length - 1);
        int actualResult = sorting.getQuickSort();

        // Assert
        Assertions.assertEquals(2, actualResult);
    }
}
