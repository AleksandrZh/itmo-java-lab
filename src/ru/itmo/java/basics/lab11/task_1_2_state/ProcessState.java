package ru.itmo.java.basics.lab11.task_1_2_state;

class ProcessState {
    public static String State(Thread.State ts) {
        if (ts == Thread.State.BLOCKED)
            return "BLOCKED";
        if (ts == Thread.State.NEW)
            return "NEW";
        if (ts == Thread.State.RUNNABLE)
            return "RUNNABLE";
        if (ts == Thread.State.TIMED_WAITING)
            return "TIMED_WAITING";
        return "WAITING";
    }
}
