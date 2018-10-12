package cmemory.hikari.thread.cc181011;

import static java.lang.Thread.interrupted;

/**
 * Created by gang.xu01@hand-china.com on 2018/10/11
 */
public class MyRunnable implements Runnable {

    @Override
    public void run(){
        try {
            for (int i = 0; i < 500000; i++) {
//                Thread.sleep(10000);
                if(interrupted()){
                    System.out.println("程序中断 -> 退出");
                    throw new InterruptedException();
//                    break;
                }
                System.out.println("i = " + (i + 1));
            }
        } catch (InterruptedException e) {
            System.out.println("异常中断 -> 退出");
            e.printStackTrace();
        }
    }

}
