package Generics.SecondTask;

public class Demo {
    public static void main(String[] args) {
        Laptop lenovo = new Laptop("AMD", 8, 500);
        Laptop asus = new Laptop("AMD", 8, 500);
        Desktop conf1 = new Desktop("NVIDIA", 1024);
        Desktop conf2 = new Desktop("AMD", 500);
        System.out.println("Lets Compare few objects: ");
        System.out.println(GenericMethod.compareTo(lenovo, asus));
        System.out.println("We Compare two object, its have same params");
        System.out.println(GenericMethod.compareTo(conf1, conf2));
        System.out.println("Now we compare two another object, this time its different");
        System.out.println(GenericMethod.compareTo(lenovo, conf2));
    }
}
