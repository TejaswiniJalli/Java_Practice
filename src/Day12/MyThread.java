package Day12;

public class MyThread extends Thread {

    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        MyThread thread = new MyThread();
        thread.start();
    }
}
