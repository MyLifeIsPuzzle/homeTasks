package homeTaskTwelve;

public class Factory extends Thread {

    private final Dump dump;

    Factory(Dump dump) {
        this.dump = dump;
    }

    @Override
    public void run() {
        for (int i = 0; i < Constants.AMOUNT_OF_DAYS; i++) {
            synchronized (dump) {
                putDetailsToTheDump();
                try {
                    dump.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    private void putDetailsToTheDump() {
        for (int j = 0; j < Constants.RANDOM.nextInt(Constants.MAX_AMOUNT_OF_DETAILS_TO_ADD_PER_DAY) + 1; j++) {
            dump.getDetails().merge(DetailsUtil.randomDetail(), Constants.AMOUNT_OF_DETAILS_TO_ADD, Integer::sum);
        }
    }
}
