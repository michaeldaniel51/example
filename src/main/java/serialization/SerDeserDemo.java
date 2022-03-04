package serialization;

import java.io.*;

public class SerDeserDemo {

    public static void main(String[] args) {


        Student student = new Student(1, "John");
        student.setX(10);

        String filename = "C:\\Users\\MAICON\\Downloads\\Test.txt";
        FileOutputStream fileOut = null;
        ObjectOutputStream objOut = null;

        /*
        Serialization
         */


        try {
            fileOut = new FileOutputStream(filename);
            objOut = new ObjectOutputStream(fileOut);
            objOut.writeObject(student);

            objOut.close();
            fileOut.close();

            System.out.println("object has been serialised: \n" + student);
        }catch (IOException ex){
            System.out.println("IOException is caught");
        }

        /*
        Deserialization
         */
        FileInputStream fileIn = null;
        ObjectInputStream objIn = null;

        try {
            fileIn = new FileInputStream(filename);
            objIn = new ObjectInputStream(fileIn);

            Student object = (Student) objIn.readObject();

            System.out.println("Object has been deserialised:\n" + object);
            System.out.println("the deserialized value of x is:" + object.getX());

            objIn.close();
            fileIn.close();

        }catch (IOException ex){
            System.out.println("IOException is caught");
        }catch (ClassNotFoundException ex){
            System.out.println("ClassNotFoundException" + " is caught");
        }


    }
}