package ru.itmo.java.basics.lab11.task_4_name;
// это эксперементы
public class Tester {

    public static final Object LOCK = new Object();

    public static void main(String[] args) {
        MyRunnable r = new MyRunnable("John");
        MyRunnable r2 = new MyRunnable("David");
        Thread t = new Thread(r);
        t.start();
        Thread t2 = new Thread(r2);
        t2.start();
        synchronized (LOCK) {
            try {
//                System.out.println("wating for t to complete");
                while (true) {
                    LOCK.wait();
                    Thread.sleep(5000);
                    LOCK.notify();
                }

//                System.out.println("wait over");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static class MyRunnable implements Runnable {
        private String name;

        public void run() {
            while (true) {
//                System.out.println("entering run method");
                synchronized (LOCK) {
                    System.out.println(this.getName());
//                    System.out.println("entering syncronised block");
                    LOCK.notify();
                    try {
                        Thread.currentThread().sleep(3000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
//                    System.out.println("leaving syncronized block");
                }
//                System.out.println("leaving run method");
            }
        }

        public MyRunnable(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }
}