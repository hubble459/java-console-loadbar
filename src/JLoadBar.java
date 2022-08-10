public class JLoadBar {
    private final int to;
    private final String type;

    public JLoadBar() {
        this("%", 100);
    }

    public JLoadBar(String type, int to) {
        this.type = type;
        this.to = to;
        setProgress(0);
    }

    public void setProgress(int progress) {
        clear();
        int dots = to / 100 * progress;
        System.out.print('[');
        for (int i = 0; i < to; i++) {
            if (i < dots) {
                System.out.print('.');
            } else {
                System.out.print(' ');
            }
        }
        System.out.print(']');
        System.out.printf(" %d%s", dots, type);
    }

    private void clear() {
        for (int i = 0; i < to + 3 + String.valueOf(to).length() + type.length(); i++) {
            System.out.print('\b');
        }
    }
}
