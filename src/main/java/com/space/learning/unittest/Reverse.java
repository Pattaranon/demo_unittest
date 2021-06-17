package com.space.learning.unittest;

public class Reverse {

    public Reverse() {
    }

    public String getReverseString(String inputText) {
        byte[] strAsByteArray = inputText.getBytes();

        byte[] result = new byte[strAsByteArray.length];

        for (int i = 0; i < strAsByteArray.length; i++) {
            result[i] = strAsByteArray[strAsByteArray.length - i - 1];
        }

        return new String(result);
    }

    public String getReverseFunction(String inputText) {
        StringBuffer sb = new StringBuffer(inputText);
        sb.reverse();
        return sb.toString();
    }

    public int getReverseInteger(int inputInt) {
        int num = inputInt;
        int reversed = 0;

        while (num != 0) {
            int digit = num % 10;
            reversed = reversed * 10 + digit;
            num /= 10;
        }

        return reversed;
    }
}
