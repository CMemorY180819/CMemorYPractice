package cmemory.hikari.thread.cc181021;

/**
 * Created by gang.xu01@hand-china.com on 2018/10/21
 */
public class Practice1021Test {
    public static void main(String[] args) {
        Practice1021 practice1021 = new Practice1021();
        new Thread(() -> practice1021.addCount()).start();
        new Thread(() -> practice1021.addCount()).start();
        new Thread(() -> practice1021.addCount()).start();
        new Thread(() -> practice1021.addCount()).start();
        new Thread(() -> practice1021.addCount()).start();
        new Thread(() -> practice1021.addCount()).start();
    }
}
