package cmemory.hikari.thread.cc181015;

/**
 * Created by gang.xu01@hand-china.com on 2018/10/15
 */
public class TwoBojectLockTest {

    public static void main(String[] args) {
        TwoObjectLock two = new TwoObjectLock();
        TwoObjectLock too = new TwoObjectLock();
        ThreadA threadA = new ThreadA(two);
        threadA.start();
        ThreadB threadB = new ThreadB(too);
        threadB.start();
    }
}
