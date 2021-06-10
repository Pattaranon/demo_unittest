package com.space.learning.unittest;

import org.springframework.stereotype.Component;

@Component
public class Promotion {

    public int come4Pay3(int come_x, int pay_y, int total_person, int per_head) {
        int personCome = (total_person / come_x) * (pay_y * per_head);
        int total = personCome + (total_person % come_x * per_head);

        return total;
    }

    public double calculatePromotion(int item, int price) {
        double discountPercent = 0;
        if(item == 1) {
            discountPercent = .25;
        }
        else if( item == 2) {
            discountPercent = .50;
        }
        else {
            discountPercent = .100;
        }

        return item * price * (1 - discountPercent);
    }
}
