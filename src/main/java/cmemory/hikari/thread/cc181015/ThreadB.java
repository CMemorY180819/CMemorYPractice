package cmemory.hikari.thread.cc181015;

/**
 * Created by gang.xu01@hand-china.com on 2018/10/15
 */
public class ThreadB extends Thread {

    private TwoObjectLock two = new TwoObjectLock();

    public ThreadB(TwoObjectLock job){
        super();
        this.two = job;
    }

    @Override
    public void run(){
        super.run();
        two.add("b");
    }
}
