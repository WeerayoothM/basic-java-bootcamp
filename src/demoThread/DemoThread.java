package demoThread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class DemoThread {
    public static void main(String[] args) {
//        Task t1 = new Task("task 1");
//        t1.start();
//        Task t2 = new Task("task 2");
//        t2.start();
//
//        System.out.println("Task t1 with id : " + t1.getId());
//        System.out.println("Task t2 with id : " + t2.getId());

        ExecutorService services = Executors.newFixedThreadPool(10);
        for (int i = 0; i < 2; i++) {
            services.execute(new Task("name " + i));
        }

        System.out.println("Finish at Main thread id : " + Thread.currentThread().getId());
    }
}

// Thread
//class Task extends Thread{
//    private String name;

//    public Task(String name) {
//        this.name = name;
//    }
//
//    @Override
//    public void run() {
//        System.out.println("Task name : " + this.name);
//    }
//}

// Runnable
class Task implements Runnable{
    private String name;

    public Task(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        System.out.println("Task name : " + this.name);
    }
}