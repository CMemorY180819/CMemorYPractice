package cmemory.hikari.thread.cc181015;

/**
 * Created by gang.xu01@hand-china.com on 2018/10/15
 */
public class ThreadA extends Thread {

    private TwoObjectLock two = new TwoObjectLock();

    public ThreadA(TwoObjectLock job){
        super();
        this.two = job;
    }

    @Override
    public void run(){
        super.run();
        two.add("a");
    }
}
