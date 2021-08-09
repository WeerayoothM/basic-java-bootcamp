package com.example.hellospring.exercise01;

public class FizzBuzz {
    public String getResult(int input) {
        String result = "";
        if (input % 3 == 0){
            result += "Fizz";
        }
        if(input % 5 == 0){
            result += "Buzz";
        }
        if (result.length() > 0){
            return result;
        }
        return String.valueOf(input) ;
    }
}
