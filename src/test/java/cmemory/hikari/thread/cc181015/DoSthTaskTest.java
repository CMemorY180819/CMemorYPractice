package cmemory.hikari.thread.cc181015;

/**
 * Created by gang.xu01@hand-china.com on 2018/10/15
 */
public class DoSthTaskTest {

    public static void main(String[] args) {

        // 初始化一个对象
        DoSthTask ds = new DoSthTask();

        // 赋予A和B同一个对象
        ThreadA a = new ThreadA(ds);
        a.setName("For Hikari");
        a.start();

        ThreadB b = new ThreadB(ds);
        b.setName("For Juno");
        b.start();

    }

}
