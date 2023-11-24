package ru.itmo.java.basics.lab11.task_4_name;

public class Person implements Runnable {
     static  Object LOCK = new Object();
    private String name;
    static boolean initialized = false;

    @Override
    public void run() {
        while (true) {

        synchronized (LOCK) {


                System.out.println(this.getName());
            try {
                LOCK.wait(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }finally {
                LOCK.notifyAll();
            }
        }
        }
    }

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
