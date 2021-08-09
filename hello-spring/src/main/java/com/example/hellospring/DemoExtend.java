package com.example.hellospring;

public class DemoExtend {
    public static void main(String[] args) {
        Report1 report1 = new Report1();
        report1.build();
    }
}

class Person {

}

// flow or template
abstract class Report {
    abstract void generateHeader();
    abstract void generateBody();
    abstract void generateFooter();
    public void build(){
        generateHeader();
        generateBody();
        generateFooter();
    }
}

// class which extends abstract class must have abstract method
class Report1 extends Report{
    @Override
    void generateHeader() {
        System.out.println("Generate Header");
    }

    @Override
    void generateBody() {
        System.out.println("Generate Body");
    }

    @Override
    void generateFooter() {
        System.out.println("Generate Footer");
    }
}

// Lego not flow
interface Lego {
    void generateHeader();
    void generateBody();
    void generateFooter();
}

class Process implements Lego{

    @Override
    public void generateHeader() {

    }

    @Override
    public void generateBody() {

    }

    @Override
    public void generateFooter() {

    }
}



