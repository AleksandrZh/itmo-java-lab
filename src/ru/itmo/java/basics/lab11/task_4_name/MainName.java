package ru.itmo.java.basics.lab11.task_4_name;

public class MainName {
    public static void main(String[] args) throws InterruptedException {

        Person john = new Person("John");
        Person david = new Person("David");
        Thread johnThread = new Thread(john);
        Thread davidThread = new Thread(david);
        johnThread.start();
        davidThread.start();
//        while (true){
//            Thread.sleep(3000);
//            Person.LOCK.notify();
//        }


    }
}
