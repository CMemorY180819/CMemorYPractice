package cmemory.hikari.thread.cc181015;

/**
 * Created by gang.xu01@hand-china.com on 2018/10/15
 */
public class DoSthTask {

    private String lockStr;
    private String time1;
    private String time2;

    // 为什么出现异步，是因为对象锁
    // synchronized同时也是锁定当前对象的，它会锁定代码块
    public void doSth(){
//        synchronized (this) {
//            lockStr = "begin this task for maomao and cc";
//            System.out.println(lockStr);
//            try {
//                Thread.sleep(2000);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//            String t1 = "maomao loves ycc " + Thread.currentThread().getName();
//            String t2 = "ycc loves maomao " + Thread.currentThread().getName();
//            synchronized (this) {
//                time1 = t1;
//                time2 = t2;
//            }
//            System.out.println(time1);
//            System.out.println(time2);
//            System.out.println("end this loving task");
//        }
        for (int i = 0; i < 100; i++) {
            System.out.println("syn threanName: " + Thread.currentThread().getName() + " i = " + i);
        }
        synchronized (this){
            for (int i = 0; i < 100; i++) {
                System.out.println("asyn threadName: " + Thread.currentThread().getName() + " i = " + i);

            }
        }
    }

}
