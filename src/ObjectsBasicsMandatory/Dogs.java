package ObjectsBasicsMandatory;

import java.util.Random;


public class Dogs{
    String name;
    DogDemo.DogSize size;
    int age;
    public static  String RandSize(){
        int randsize = (int) (Math.random()*2);
        return DogDemo.DogSize.values()[randsize].namestring;
    }
    public  static int RandAge (){

        return  Math.max(1,new Random().nextInt(20));

    }
    public static String RandName(){
        String[] Names = {"Milton","Spike","Peter","Frank","Bake","Roy","Buddy","Cletus"};
        String rn = (Names[new Random().nextInt(Names.length)]);
        return rn;
    }


    Dogs(String name, String size, int age){
        this.name = name;
        this.size =  DogDemo.DogSize.valueOf(size.toUpperCase());
        this.age = age;

    }

    @Override
    public String toString() {
        return this.name + " " + this.size + " " + this.age;
    }
}