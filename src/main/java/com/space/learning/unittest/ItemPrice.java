package com.space.learning.unittest;

public class ItemPrice {
    public int calculate(int operand, int item, int price) {
        if(operand == 0)
            // * Multiple
            return item * price;
        if(operand == 1)
            // + Plus
            return item + price;
        return 250;
    }
}
