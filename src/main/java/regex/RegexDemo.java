package regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexDemo {

    public static void main(String[] args) {
        String regexstr = ".*[a-z][0-9]";
        Pattern pattern = Pattern.compile(regexstr);

        Matcher matcher = pattern.matcher("12345hbsdg635762");

        boolean matchfound = matcher.find();
        if (matchfound){
            System.out.println("match found");
        }else {
            System.out.println("match not found");
        }
    }
}
