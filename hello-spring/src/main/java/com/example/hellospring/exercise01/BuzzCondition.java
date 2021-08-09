package com.example.hellospring.exercise01;

public class BuzzCondition implements MyCondition {

    @Override
    public boolean check(int number) {
        return number % 5 == 0;
    }

    @Override
    public String print() {
        return "Buzz";
    }
}
