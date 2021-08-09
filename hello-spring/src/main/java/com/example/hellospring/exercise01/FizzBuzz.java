package com.example.hellospring.exercise01;

public class FizzBuzz {
    public String getResult(int input) {
        if (input == 3){
            return "Fizz";
        }
        if(input == 5){
            return "Buzz";
        }
        return String.valueOf(input) ;
    }
}
