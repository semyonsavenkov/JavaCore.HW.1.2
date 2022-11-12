package HW1.Worker;

public class Main {
    public static void main(String[] args) {
        OnTaskDoneListener listener = System.out::println;
        OnTaskErrorListener errorListener = System.out::println;

        Worker myWorker = new Worker(listener, errorListener);
        myWorker.start();
    }
}
