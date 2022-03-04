package enums;

public class EnumDemo {

    public static void main(String[] args) {

                enums.Color c1 = enums.Color.RED;

        System.out.println("red Enum name: " + c1.name());
        System.out.println("red Enum name: " + c1.getValue());

        for (enums.Color color: enums.Color.values()){
            System.out.println("Enum value:" + color.getValue());
        }



    }
}
