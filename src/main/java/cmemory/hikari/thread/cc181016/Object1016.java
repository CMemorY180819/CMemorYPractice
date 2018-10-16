package cmemory.hikari.thread.cc181016;

/**
 * Created by gang.xu01@hand-china.com on 2018/10/16
 */
public class Object1016 {
    public void send(){
        synchronized (this){
            System.out.println("object thread " + Thread.currentThread().getName());
        }
    }
}
