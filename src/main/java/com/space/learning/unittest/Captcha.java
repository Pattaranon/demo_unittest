package com.space.learning.unittest;

import org.apache.tomcat.util.bcel.Const;

public class Captcha {
    private int leftOperand;
    public Captcha (int pettern, int leftOperand, int operator, int rightOperand) {
        this.leftOperand = leftOperand;
    }
    public String getLeft() {
        return String.valueOf(this.leftOperand);
    }
}
