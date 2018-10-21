package cmemory.hikari.thread.cc181019;

/**
 * Created by gang.xu01@hand-china.com on 2018/10/19
 */
class OutClass1019 {
    /**
     * description: 这个表明内置类的同步，使用了class2的锁，使得class2中静态方法同步调用
     *
     * @date 2018/10/19 下午4:32
     * @author gang.xu01@hand-china.com
     *
     * @return
     * @throws 
     */
    static class InnerClass1{
        void method1(InnerClass2 class2){
            String threadName = Thread.currentThread().getName();
            synchronized (class2) {
                System.out.println(threadName + " 进入InnerClass1类中method1方法");
                for (int i = 0; i < 10; i++) {
                    System.out.println("i = " + i);
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                System.out.println(threadName + " 离开InnerClass1中method1");
            }
        }

        synchronized void method2(){
            String threadName = Thread.currentThread().getName();
            System.out.println(threadName + " 进入InnerClass1类中method2方法");
            for (int i = 0; i < 10; i++) {
                System.out.println("j = " + i);
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.println(threadName + " 离开InnerClass1中method2");
        }
    }

    static class InnerClass2{
        synchronized void method1(){
            String threadName = Thread.currentThread().getName();
            System.out.println(threadName + " 进入InnerClass2类中method1方法");
            for (int i = 0; i < 10; i++) {
                System.out.println("k = " + i);
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.println(threadName + " 离开InnerClass2中method1");
        }
    }
}
