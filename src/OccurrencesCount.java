import java.util.Scanner;

public class OccurrencesCount {
    public static void main(String[] args) {
        String str = "Hello World";
        System.out.println("We Have a text - "+str);
        System.out.println("Please, enter a char that you want to find");
        Scanner sc = new Scanner(System.in);

        char ch = sc.next().charAt(0);
        char[] symbols = str.toCharArray();
        int count = 0;
        for (int i = 0; i < symbols.length; ++i) {
            if (symbols[i] == ch) {
                ++count;

            }

        }
        System.out.println("A char " +"'"+ ch +"'" + " occurrence in text "+ count + " times" );
    }
}
