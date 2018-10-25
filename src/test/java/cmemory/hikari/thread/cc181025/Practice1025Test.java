package cmemory.hikari.thread.cc181025;

/**
 * Created by gang.xu01@hand-china.com on 2018/10/25
 */
public class Practice1025Test {

    // notify并不会立即释放锁
    public static void main(String[] args) {
        Object lock = new Object();

//        while (true) {
//            new Thread(() -> new Practice1025().p(lock)).start();
//        try {
//            Thread.sleep(100);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//            new Thread(() -> new Practice1025().c(lock)).start();
//        }
        Practice1025 p = new Practice1025();
        new Thread(() -> p.joinA(p)).start();
        Thread a = new Thread(() -> p.joinB(p));
        a.start();
        try {
            a.join(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("hikarisama万岁！");
    }

}
