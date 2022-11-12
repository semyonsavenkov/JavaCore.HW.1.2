package HW1.Worker;

@FunctionalInterface
public interface OnTaskErrorListener {
    void onError(String result);
}
