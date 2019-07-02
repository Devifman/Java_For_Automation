package RegularExpressions;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExp {
    public static void main(String[] args){
        System.out.println("Find all words starting with a capital letter in the string.");
        String text = "Word cAT DATA A site Java tExt";
        System.out.println("We have a text");
        System.out.println(text);
        String regex = "(\\b[A-Z].*?\\b('s|-|\\.|,)?(\\s((the|and|of|de)\\s)*)?)+";
        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(text);
        System.out.println("Let's Edit our text");
        while (m.find()){
            System.out.print(text.substring(m.start(),m.end())+" ");
        }
        System.out.println();
        String text2 = "Removing Extra Spaces Between Words in the       text";
        System.out.println("Here a text - "+text2);
        String regex2="[\\s]{2,}";
        System.out.println("Now we delete extra spaces");
        System.out.println(text2.trim().replaceAll(regex2," "));
        System.out.println();
        System.out.println("let's remove word with a double letters");
        String text3 = "password wword word Heeeeeeello";
        System.out.println("We have text -"+text3);
        String regex3 = "\\w*(\\w)\\1+\\w*";
        System.out.println("We got only");
        String []words = text3.replaceAll(regex3,"").split("\\s+");
        for (String s: words){
            System.out.println(s);
        }

    }
}
