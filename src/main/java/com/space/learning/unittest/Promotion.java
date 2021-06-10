package com.space.learning.unittest;

import org.springframework.stereotype.Component;

@Component
public class Promotion {

    public int come4Pay3(int comePromotion, int payPromotion, int comePerson, int perHead) {
        int adveratePerson = comePerson / comePromotion;
        int total = adveratePerson * (payPromotion * perHead);

        return total;
    }
}
