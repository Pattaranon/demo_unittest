package com.space.learning.unittest;


import org.springframework.stereotype.Component;

@Component
public class FizzBuzzConverter {

    public String CalculateFizzBuss(int inputData){
        String result = "";
        if(inputData % 15 == 0){
            result = "fizz buzz";
        }
        else if(inputData % 3 == 0) {
            result = "fizz";
        }
        else if(inputData % 5 == 0) {
            result = "buzz";
        }
        else {
            result = String.valueOf(inputData);
        }

        return result;
    }
}
