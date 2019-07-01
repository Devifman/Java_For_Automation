package Exeptions.Task4;

import java.util.Random;

public class Demo {
    public static void main(String[] args){
        First first = new First("Exception number 1");
        Second second = new Second("Exception number 2");
        Third third = new Third("Exception number 3");

        Random randomException = new Random();
        try {
            switch (Math.max(1,randomException.nextInt(4))){
                case 1:
                    throw first;
                case 2:
                    throw second;
                case 3:
                    throw third;
            }
        }catch (First | Second | Third e){
            System.out.println(e.getMessage());
        }
    }
}
