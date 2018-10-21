package cmemory.hikari.thread.cc181016;

/**
 * Created by gang.xu01@hand-china.com on 2018/10/16
 */
public class Object1016Test {

    public static void main(String[] args) {
        Object1016 object1016 = new Object1016();
        ObjectService1016 objectService1016 = new ObjectService1016();
        ThreadA1016 threadA1016 = new ThreadA1016(object1016, objectService1016);
        threadA1016.setName("hikari");
        threadA1016.start();
        ThreadB1016 threadB1016 = new ThreadB1016(object1016, objectService1016);
        threadB1016.setName("juno");
        threadB1016.start();

        Thread t = new Thread(() -> new Object1016().send());
        t.start();
    }

}
