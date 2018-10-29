package cmemory.hikari.thread.cc181029;

/**
 * Created by gang.xu01@hand-china.com on 2018/10/29
 */
public class ThreadLocalExt extends ThreadLocal {

    @Override
    public Object initialValue() {
        return "hikarisama!!!";
    }
}
