package Generics.SecondTask;

public class Desktop implements Comparable<Desktop> {
    private String gpu;
    private int hdd;

    public Desktop(String gpu, int hdd) {
        this.gpu = gpu;
        this.hdd = hdd;
    }

    @Override
    public int compareTo(Desktop desktop) {
        int res = Integer.compare(this.hdd, desktop.hdd);
        if (res == 0) {
            res = this.gpu.compareTo(desktop.gpu);
        }
        return Integer.compare(res, 0);
    }
}

