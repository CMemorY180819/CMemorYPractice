package cmemory.hikari.thread.cc181015;

/**
 * Created by gang.xu01@hand-china.com on 2018/10/15
 */
public class TwoObjectLock {

    private int num = 0;

    /**
     * description: 此例表明synchronized取得的锁是对象锁
     *
     * @date 2018/10/15 下午12:51
     * @author gang.xu01@hand-china.com
     * @param userName
     *
     * @return
     * @throws 
     */
    synchronized public void add(String userName) {
        try {
            if("a".equals(userName)) {
                num = 100;
                System.out.println("a set over!");
                Thread.sleep(20);
            }else{
                num = 200;
                System.out.println("b set over!");
            }
            System.out.println(userName + " num = " + num);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
