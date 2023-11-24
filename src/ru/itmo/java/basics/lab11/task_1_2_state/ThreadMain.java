package ru.itmo.java.basics.lab11.task_1_2_state;

public class ThreadMain {

    public static void main(String[] args) {
        // 1. Определить состояние дочернего потока
        Counter mt=null;
        for (int i = 0; i <10 ; i++) {
             mt = new Counter("mt"); // Создать и запустить поток
        }

// join - показал состояние - waiting
        try {
            mt.t.join();
            System.out.println("State after join(): " + ProcessState.State(mt.t.getState()));
        }
        catch (InterruptedException e) {
            e.printStackTrace();
        }
        // 2. Определить состояние главного потока
        Thread thr = Thread.currentThread();
//            mt.t.stop();
        try {
            Thread.sleep(2000);
            System.out.println("Main thread after sleep(): " + mt.t.getState());
//            System.out.println("Main thread STATE " + Thread.currentThread().getState());
            System.out.println("Main thread after sleep(): " +Thread.currentThread().getName()+ " "+ ProcessState.State(thr.getState()));

//            System.out.println("Main thread after sleep(): " + thr.getState());
        }
        catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}