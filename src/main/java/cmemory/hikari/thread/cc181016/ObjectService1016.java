package cmemory.hikari.thread.cc181016;

/**
 * Created by gang.xu01@hand-china.com on 2018/10/16
 */
public class ObjectService1016 {

    public void send(Object1016 o){
        synchronized (o) {
            try {
                System.out.println("service thread " + Thread.currentThread().getName());
                Thread.sleep(2000);
                System.out.println("service end " + Thread.currentThread().getName());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

}
