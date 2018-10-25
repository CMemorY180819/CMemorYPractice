package cmemory.hikari.thread.cc181025;

/**
 * Created by gang.xu01@hand-china.com on 2018/10/25
 */
public class Practice1025Test {

    // notify并不会立即释放锁
    public static void main(String[] args) {
        Object lock = new Object();
        new Thread(() -> new Practice1025().threadWait(lock)).start();
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        new Thread(() -> new Practice1025().threadNotify(lock)).start();
    }

}
