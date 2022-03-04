package autoboxingandunboxing;

public class AutoBoxingAndUnBoxingDemo {


    public static void main(String[] args) {
        int i = 10;

        //Autoboxing
        Integer iObj = Integer.valueOf(i);
        System.out.println("value of Integer obj: " + iObj);

        //UnBoxing
        int i1 = iObj;
        System.out.println("value of i1: " + i1);

        char x = 'a';
        //AutoBoxing
        Character charObj = Character.valueOf(x);
        System.out.println("value of charObj: " + charObj );

        //UnBoxing
        char ch = charObj;
        System.out.println("value of ch: " + ch);


    }

}
