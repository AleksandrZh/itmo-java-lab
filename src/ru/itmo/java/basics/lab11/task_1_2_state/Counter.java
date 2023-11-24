package ru.itmo.java.basics.lab11.task_1_2_state;

class Counter implements Runnable {
    Thread t;

    // Конструктор
    Counter(String threadName) {
        // Создать поток с именем threadName и запустить его на выполнение
        t = new Thread(this, threadName);

        // Поток еще не запущен, вывести состояние потока
        Thread.State ts = t.getState();
        System.out.println("State of MyThread in constructor: " + ProcessState.State(ts));
        //System.out.println("State of MyThread in constructor: " + t.getState());

        // Запустить поток на выполнение
        t.start();
    }

    // Код выполнения потока
    @Override
    public void run() {
        Thread.State ts = t.getState();
        System.out.println("State of MyThread in run() method: " + ProcessState.State(ts));
        for (int i = 0; i <101 ; i++) {
            System.out.println(i);
        }
    }
}
