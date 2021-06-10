package com.space.learning.unittest;

import org.springframework.stereotype.Component;

@Component
public class DiscountConvert {
    public double promotion(int item, int price) {
        double discountPercent = 0;
        if(price == 0) {
            return 0;
        }

        if(item == 1) {
            discountPercent = .25;
        }
        else if(item == 2) {
            discountPercent = .50;
        }

        return item * price * (1 - discountPercent);
    }
}
