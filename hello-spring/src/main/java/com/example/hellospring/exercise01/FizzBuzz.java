package com.example.hellospring.exercise01;

public class FizzBuzz {
    // Prepare all conditions
    private MyCondition[] conditions = new MyCondition[]{
            new FizzBuzzCondition(),
            new FizzCondition(),
            new BuzzCondition(),
            new KBTGCondition(),
    };
    public String getResult(int number) {
        for (MyCondition condition : conditions) {
            if (condition.check(number)){
                return condition.print();
            }
        }
        return String.valueOf(number) ;
    }

}
