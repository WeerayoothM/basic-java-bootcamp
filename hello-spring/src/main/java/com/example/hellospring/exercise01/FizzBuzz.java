package com.example.hellospring.exercise01;

public class FizzBuzz {
    public String getResult(int number) {
        FizzBuzzCondition fizzBuzzCondition = new FizzBuzzCondition();
        if (fizzBuzzCondition.check(number)){
            return fizzBuzzCondition.print();
        }
        if (number % 3 == 0){
            return "Fizz";
        }
        if(number % 5 == 0){
            return "Buzz";
        }
        return String.valueOf(number) ;
    }
}
