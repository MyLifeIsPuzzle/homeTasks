package homeTaskTwelve;

import java.util.List;

public class Harvest extends Thread {

    private final Dump dump;
    private final Thread factory;
    private final List<Servant> servants;

    public Harvest(Dump dump, Thread factory, List<Servant> servants) {
        this.dump = dump;
        this.factory = factory;
        this.servants = servants;
    }

    @Override
    public void run() {
        synchronized (dump) {
            startHarvest();
            for (int i = 0; i < Constants.AMOUNT_OF_DAYS; i++) {
                dump.notifyAll();
                try {
                    dump.wait(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            dump.notifyAll();
        }
    }

    private void startHarvest() {
        factory.start();
        servants.forEach(Servant::start);
    }
}
