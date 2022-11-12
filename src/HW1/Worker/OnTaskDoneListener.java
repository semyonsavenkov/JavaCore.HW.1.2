package HW1.Worker;

@FunctionalInterface
public interface OnTaskDoneListener {
        void onDone(String result);
    }

