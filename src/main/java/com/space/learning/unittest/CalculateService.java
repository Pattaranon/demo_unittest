package com.space.learning.unittest;

import org.springframework.stereotype.Service;

@Service
public class CalculateService {
    public int plus(int a, int b) {
        return a + b;
    }

    public int minus(int a, int b) {
        return a - b;
    }
}
