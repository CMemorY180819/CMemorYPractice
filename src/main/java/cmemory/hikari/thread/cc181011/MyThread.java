package cmemory.hikari.thread.cc181011;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

/**
 * Created by gang.xu01@hand-china.com on 2018/10/11
 */
public class MyThread extends Thread {

    public MyThread(){
        System.out.println("构造方法Name: " + Thread.currentThread().getName());
    }

    @Override
    public void run(){
        System.out.println("Ycc");
        System.out.println("run---" + Thread.currentThread().getName());
        try{
            for (int i = 0; i < 10; i++) {
                int time = (int) (Math.random() * 1000);
                Thread.sleep(time);
                System.out.println("run = " + Thread.currentThread().getName());
            }
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}