package cmemory.hikari.thread.cc181011;

/**
 * Created by gang.xu01@hand-china.com on 2018/10/11
 */
public class MyRunnableTest {

    public static void main(String args[]){
        try {
            MyRunnable runnable = new MyRunnable();
            Thread thread = new Thread(runnable);
            thread.start();
            Thread.sleep(200);
            thread.interrupt();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("end");
    }
}
