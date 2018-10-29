package cmemory.hikari.thread.cc181029;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Created by gang.xu01@hand-china.com on 2018/10/29
 */
public class Practice181029 {
    Lock lock = new ReentrantLock();
    Condition conditionA = lock.newCondition();
    Condition conditionB = lock.newCondition();
    public void runA() {
        try {
            lock.lock();
            for (int i = 0; i < 10; i++) {
                System.out.println("awaitA前 " + Thread.currentThread().getName() + " : " + i);
            }
            conditionA.await();
            for (int j = 0; j < 10; j++) {
                System.out.println("awaitA后 " + Thread.currentThread().getName() + " : " + j);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }

    public void runB() {
        try {
            lock.lock();
            for (int i = 0; i < 10; i++) {
                System.out.println("awaitB前 " + Thread.currentThread().getName() + " : " + i);
            }
            Thread.sleep(3000);
            conditionB.await();
            for (int j = 0; j < 10; j++) {
                System.out.println("awaitB后 " + Thread.currentThread().getName() + " : " + j);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }

    public void runA_signal() {
        try {
            lock.lock();
            conditionA.signalAll();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
            System.out.println("解锁啦");
        }
    }
}
