package Generics.SecondTask;

public class Laptop implements Comparable<Laptop> {
    private String cpu;
    private int ram;
    private int price;

    public Laptop(String CPU, int RAM, int price) {
        this.cpu = CPU;
        this.ram = RAM;
        this.price = price;
    }

    @Override
    public int compareTo(Laptop laptop) {
        int res = this.cpu.compareTo(laptop.cpu);
        if (res == 0)
            res = Integer.compare(this.ram, laptop.ram);
        if (res == 0)
            res = Integer.compare(this.price, laptop.price);
        return Integer.compare(res, 0);
    }
}
