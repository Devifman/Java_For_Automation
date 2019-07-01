package Exeptions.Task5;

public class Demo {
    public static void main(String[] args){
     try {
         throw new C("Here is 'C' execption");
     }catch (A e){
         System.out.println(e.getText());
     }
    }
}
