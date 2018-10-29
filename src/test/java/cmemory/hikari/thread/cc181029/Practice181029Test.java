package cmemory.hikari.thread.cc181029;

/**
 * Created by gang.xu01@hand-china.com on 2018/10/29
 */
public class Practice181029Test {

    public static void main(String[] args) {
        Practice181029 practice181029 = new Practice181029();
        new Thread(() -> practice181029.runA()).start();
        new Thread(() -> practice181029.runB()).start();
        practice181029.runA_signal();
    }

}
