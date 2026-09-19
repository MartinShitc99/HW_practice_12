package test.java.practice_12;

public class DebugTask6 {
    public static void main(String[] args) {
        countdown(5);
    }
    public static void countdown(int n) {
        if (n <= 0) {
            return;
        }

        countdown(n - 1);
        System.out.println(n);
    }
}
