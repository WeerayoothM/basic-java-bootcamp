package com.example.hellospring.exercise01;

public class FizzBuzz {
    public String getResult(int number) {
        FizzBuzzCondition fizzBuzzCondition = new FizzBuzzCondition();
        if (fizzBuzzCondition.check(number)){
            return fizzBuzzCondition.print();
        }
        FizzCondition fizzCondition = new FizzCondition();
        if (fizzCondition.check(number)){
            return fizzCondition.print();
        }
        if(number % 5 == 0){
            return "Buzz";
        }
        return String.valueOf(number) ;
    }
}
