package com.example.hellospring.exercise01;

public class FizzBuzz {
    public String getResult(int number) {
        // Prepare all conditions
        MyCondition[] conditions = new MyCondition[]{
                new FizzBuzzCondition(),
                new FizzCondition(),
                new BuzzCondition(),
                new KBTGCondition()
        };

        for (MyCondition condition : conditions) {
            if (condition.check(number)){
                return condition.print();
            }
        }

//        MyCondition fizzBuzzCondition = new FizzBuzzCondition();
//        if (fizzBuzzCondition.check(number)){
//            return fizzBuzzCondition.print();
//        }
//        MyCondition fizzCondition = new FizzCondition();
//        if (fizzCondition.check(number)){
//            return fizzCondition.print();
//        }
//        MyCondition buzzCondition = new BuzzCondition();
//        if(buzzCondition.check(number)){
//            return buzzCondition.print();
//        }
        return String.valueOf(number) ;
    }
}
