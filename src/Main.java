public class Main {
    public static void main(String[] args) {
        new Main().run();
    }

    public void run() {
        JLoadBar loadBar = new JLoadBar();
        for (int i = 1; i <= 100; i++) {
            loadBar.setProgress(i);
            if ((int) (Math.random() * 5) == 0) {
                i += (int) (Math.random() * 5);
            }
            sleep((int) (Math.random() * 700) + 300);
        }
    }

    public void sleep(long millis) {
        try {
            Thread.sleep(millis);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
