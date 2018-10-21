package cmemory.hikari.thread.cc181021;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * Created by gang.xu01@hand-china.com on 2018/10/21
 */
class Practice1021 {

    private AtomicInteger count = new AtomicInteger(0);

    /**
     * description: atomic包中的方法可以保证可见性和原子性
     * TODO 分析源码(WHY??)
     *
     * @date 2018/10/21 上午10:29
     * @author gang.xu01@hand-china.com
     *
     * @return
     * @throws
     */
    void addCount(){
        for (int i = 0; i < 1000; i++) {
            System.out.println("hikari will love ycc in " + count.incrementAndGet() + " days" );
        }
    }

}
