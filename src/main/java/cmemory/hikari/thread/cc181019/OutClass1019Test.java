package cmemory.hikari.thread.cc181019;

import cmemory.hikari.thread.cc181019.OutClass1019.InnerClass1;
import cmemory.hikari.thread.cc181019.OutClass1019.InnerClass2;

/**
 * Created by gang.xu01@hand-china.com on 2018/10/19
 */
public class OutClass1019Test {
    public static void main(String[] args) {
        final InnerClass1 in1 = new InnerClass1();
        final InnerClass2 in2 = new InnerClass2();
        new Thread(() -> in1.method1(in2)).start();
        new Thread(() -> in1.method2()).start();
        new Thread(() -> in2.method1()).start();
    }
}
