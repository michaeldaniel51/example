package stringhandling;

import java.util.Arrays;

public class StringHandlingDemo {

    public static void main(String[] args) {
        String str1 = "Dan is studying";
        String str2 = " in school";

        System.out.println(str1.length());

        String result = str1.concat(str2);
        System.out.println(result);

        String f = String.format("The name of student is " + "%s, and the age is %d,","Daniel",12);
        System.out.println(f);

        System.out.println(str1.charAt(5));

        if (str1.equals(str2)){
            System.out.println("both strings are same");
        }else {
            System.out.println("both strings are different");
        }

        System.out.println(str1.indexOf('i'));

        String s2 = str1.replace('D','s');
        System.out.println(s2);

        String [] arr = str1.split(" ");
        Arrays.asList(arr).forEach(s -> System.out.println(s));

        String newStr1 = str1.substring(1,5);
        System.out.println(newStr1);







    }




}
