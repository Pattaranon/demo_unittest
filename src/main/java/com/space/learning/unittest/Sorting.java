package com.space.learning.unittest;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

public class Sorting {
    public static int counterSort;

    public void QuickSortAsc(int[] arr, int startPoint, int endPoint)
    {
        if (startPoint < endPoint)
        {
            int pivot = Pointer(arr, startPoint, endPoint);

            if (pivot > 1)
            {
                QuickSortAsc(arr, startPoint, pivot - 1);
            }
            if (pivot + 1 < endPoint)
            {
                QuickSortAsc(arr, pivot + 1, endPoint);
            }
        }
    }

    public int Pointer(int[] arr, int startPoint, int endPoint)
    {
        int pivot = arr[startPoint];
        while (true)
        {
            while (arr[startPoint] < pivot)
            {
                startPoint++;
            }

            while (arr[endPoint] > pivot)
            {
                endPoint--;
            }

            if (startPoint < endPoint)
            {
                if (arr[startPoint] == arr[endPoint])
                {
                    return endPoint;
                }

                int temp = arr[startPoint];
                arr[startPoint] = arr[endPoint];
                arr[endPoint] = temp;
                counterSort++;
            }
            else
            {
                return endPoint;
            }
        }
    }

    public int getQuickSort() {
        return counterSort;
    }
}
