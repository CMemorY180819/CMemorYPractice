package cmemory.hikari.thread.cc181025;

/**
 * Created by gang.xu01@hand-china.com on 2018/10/25
 */
public class Practice1025 {

    public void threadWait(Object lock) {
        synchronized (lock) {
            try {
                System.out.println("start time : " + System.currentTimeMillis());
                lock.wait(1000);
                System.out.println("end time : " + System.currentTimeMillis());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public void threadNotify(Object lock) {
        synchronized (lock) {
            for (int i = 0; i < 10; i++) {
                if (i == 5) {
                    lock.notify();
                    System.out.println("通知你了小baby");
                }
                System.out.println("i = " + i);
            }
        }
    }
}
