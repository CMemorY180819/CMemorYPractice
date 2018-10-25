package cmemory.hikari.thread.cc181025;

/**
 * Created by gang.xu01@hand-china.com on 2018/10/25
 */
public class Practice1025 {

    String value = "";

    public Practice1025(){
        super();
    }

    public void threadWait(Object lock) {
        synchronized (lock) {
            try {
                System.out.println("start time : " + System.currentTimeMillis());
                lock.wait(1000);
                System.out.println("end time : " + System.currentTimeMillis());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public void threadNotify(Object lock) {
        synchronized (lock) {
            for (int i = 0; i < 10; i++) {
                if (i == 5) {
                    lock.notify();
                    System.out.println("通知你了小baby");
                }
                System.out.println("i = " + i);
            }
        }
    }

    public void p(Object lock) {
        try {
            synchronized (lock) {
                if(!ValueObject1025.value.equals("")) {
                    System.out.println(value);
                    lock.wait();
                }
                String now = System.currentTimeMillis() + "_" + System.nanoTime();
                System.out.println("set值是: " + now);
                ValueObject1025.value = now;
                lock.notify();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void c(Object lock) {
        try {
            synchronized (lock) {
                if(ValueObject1025.value.equals("")) {
                    lock.wait();
                }
                System.out.println("get值是: " + ValueObject1025.value);
                ValueObject1025.value = "";
                lock.notify();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void joinB(Practice1025 p) {
        synchronized (p) {
            System.out.println("start B");
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("end B");
        }
    }

    public void joinA (Practice1025 p) {
        synchronized (p) {
            System.out.println("start A");
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("end A");
        }
    }

}
