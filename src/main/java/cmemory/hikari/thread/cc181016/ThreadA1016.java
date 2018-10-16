package cmemory.hikari.thread.cc181016;

/**
 * Created by gang.xu01@hand-china.com on 2018/10/16
 */
public class ThreadA1016 extends Thread {

    private Object1016 object1016;
    private ObjectService1016 objectService1016;

    public ThreadA1016(Object1016 object1016, ObjectService1016 objectService1016){
        this.object1016 = object1016;
        this.objectService1016 = objectService1016;
    }

    @Override
    public void run(){
        objectService1016.send(object1016);
    }
}
