package synchronization;

public class Counter {
    private int count = 0;

//    With Synchronized Option - 01
//    public synchronized void increment() {
//        count++;
//    }

//    With Synchronized Option - 02
//    public void increment() {
//        synchronized (this) {
//            count++;
//        }
//    }

//  without synchronized
    public void increment() {
        count++;
    }

    public int getCount() {
        return count;
    }
}
