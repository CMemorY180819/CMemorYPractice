package cmemory.hikari.thread.cc181011;

/**
 * Created by gang.xu01@hand-china.com on 2018/10/11
 */
public class MyThreadTest {

    public static void main(String args[]) {
        try{
            MyThread myThread = new MyThread();
            Thread t1 = new Thread(myThread);
            System.out.println("run alive: " + t1.isAlive());
            t1.start();
            System.out.println("run alive: " + t1.isAlive());
            t1.setName("ycc thread");
            System.out.println("Hikari loves");
            for (int i = 0; i < 10; i++) {
                int time = (int)(Math.random() * 1000);
                Thread.sleep(time);
                System.out.println("main = " + Thread.currentThread().getName());
            }
        }catch (InterruptedException e){
            e.printStackTrace();
        }

    }
}
