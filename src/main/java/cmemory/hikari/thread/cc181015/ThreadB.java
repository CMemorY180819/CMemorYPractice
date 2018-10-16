package cmemory.hikari.thread.cc181015;

/**
 * Created by gang.xu01@hand-china.com on 2018/10/15
 */
public class ThreadB extends Thread {

    private TwoObjectLock two = new TwoObjectLock();
    private DoSthTask ds = new DoSthTask();

    public ThreadB(TwoObjectLock job){
        super();
        this.two = job;
    }

    public ThreadB(DoSthTask job){
        super();
        this.ds = job;
    }

    public ThreadB(){}

    @Override
    public void run(){
        super.run();
//        two.add("b");
        ds.doSth();
    }
}
