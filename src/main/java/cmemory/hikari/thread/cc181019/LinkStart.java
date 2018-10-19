package cmemory.hikari.thread.cc181019;

/**
 * Created by hikari on 2018/10/19(2months)
 */
public class LinkStart {

    private String[] hikari = new String[0];
    private static int day = 365;

    private String[] getReady() {
        return new String[]{
                "Thread", "Concurrency", "Spring Cloud",
                "RPC", "Dubbo", "Redis", "RabbitMQ", "ZooKeeper",
                "Zipkin", "Hystrix"
        };
    }

    private void learn(){
        this.hikari = this.getReady();
    }

    private void go(){
        synchronized (this) {
            this.learn();
            for (int time = 0; time < day; time++) {
                for (String tech : this.hikari) {
                    System.out.println("hikari is now learning " + tech + " for " + (time + 1) + " days");
                }
            }
        }
    }

    public static void main(String[] args) {
        new LinkStart().go();
    }

}



