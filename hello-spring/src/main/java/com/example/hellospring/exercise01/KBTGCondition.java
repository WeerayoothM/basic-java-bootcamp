package com.example.hellospring.exercise01;

public class KBTGCondition implements MyCondition {
    @Override
    public boolean check(int number) {
        return number  == 7;
    }

    @Override
    public String print() {
        return "KBTG";
    }
}
