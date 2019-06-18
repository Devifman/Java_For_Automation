package ObjectsBasicsMandatory;

import java.util.Scanner;

public class DogDemo{
    public enum DogSize{
        SMALL("small"),
        MEDIUM("medium"),
        BIG("big");
        public final String namestring;
        DogSize(String s){
            namestring = s;
        }
    }

    public static void main(String[] args){
        System.out.println("Enter number of Dogs");
        Scanner sc = new Scanner(System.in);
        int dognum = sc.nextInt();
        if (dognum<0){
            System.out.println("Please enter a number of the dogs");

        }
        else {
            System.out.println("We Have "+dognum + " dogs");
        }
        Dogs[] dogarray = new Dogs[dognum];

        for (int i =0;i<dognum;i++){
            String name;
            String size;
            int age;
            System.out.print("Name of dog №"+ (i+1) + " is: ");
            name = sc.next();
            if (name.isEmpty()){
                name = Dogs.RandName();
            }
            sc.nextLine();
            System.out.print("Size of dog №" +(i+1)  + " is ");
            size = sc.next();
            sc.nextLine();
            System.out.print("Age of dog № "+(i+1) +" is: ");
            age = sc.nextInt();
            // Решил упростить немного enum
            size=size.toLowerCase();
            if (size.equals("big") || size.equals("small") || size.equals("medium")){
            }
            else{
                System.out.println("Incorrect input of size");
                size = Dogs.RandSize();
            }

            if (age<=0 || age>20){
                System.out.println("Incorrect age, age will be generate automaticaly and age must be in range 1-20");
                age = Dogs.RandAge();
            }

            dogarray[i] = new Dogs(name,size,age);
        }
        for (Dogs dogs : dogarray) {
            System.out.println(dogs.toString());


        }


        }

    }


