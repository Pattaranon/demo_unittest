package com.space.learning.unittest;

import org.springframework.stereotype.Component;

@Component
public class YoutubeFamily {

    public String calPayment(int priceYoutube, int personFamily) {
        int resultCal = (int) Math.ceil(priceYoutube / personFamily);
        return String.valueOf(resultCal);
    }
}
