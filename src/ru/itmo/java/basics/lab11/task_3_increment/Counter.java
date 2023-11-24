package ru.itmo.java.basics.lab11.task_3_increment;

class Counter implements Runnable {
    Thread t;
    static int count = 0;

    // установил посути замок (монитор)
    public synchronized void increment() {
        count = count + 1;
        System.out.println(count);
    }
    public int getCount() {
        return count;
    }


    // Конструктор
    Counter(String threadName) {
        // Создать поток с именем threadName и запустить его на выполнение
        t = new Thread(this, threadName);

        // Поток еще не запущен, вывести состояние потока
        Thread.State ts = t.getState();
        System.out.println("State of MyThread in constructor: " + ProcessState.State(ts));

        // Запустить поток на выполнение
        t.start();
    }

    // Код выполнения потока
    @Override
    public void run() {
        Thread.State ts = t.getState();
        System.out.println("State of MyThread in run() method: " + ProcessState.State(ts));
        for (int i = 0; i <1000 ; i++) {
            this.increment();

        }


    }
}
