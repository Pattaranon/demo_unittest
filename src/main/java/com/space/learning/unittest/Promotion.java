package com.space.learning.unittest;

import org.springframework.stereotype.Component;

@Component
public class Promotion {

    public int come4Pay3(int come_x, int pay_y, int total_person, int per_head) {
        int personCome = (total_person / come_x) * (pay_y * per_head);
        int total = personCome + (total_person % come_x * per_head);

        return total;
    }
}
