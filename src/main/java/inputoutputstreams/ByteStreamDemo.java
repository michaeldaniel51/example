package inputoutputstreams;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteStreamDemo {


    public static void main(String[] args) throws IOException {

        FileInputStream inputStream = null;
        FileOutputStream outputStream = null;

        try{
            inputStream = new FileInputStream("C:\\Users\\MAICON\\Downloads\\Test2.txt");
             outputStream = new FileOutputStream("C:\\Users\\MAICON\\Downloads\\Test5.txt");


            /*
            reading the file and writing it to another file
            -1,means it reads the file till the end of it
             */
        int content;
        while((content = inputStream.read()) != -1){
            outputStream.write((byte)content);
        }

     }finally {
            if (inputStream != null){
                inputStream.close();
            }
            if (outputStream != null){
                outputStream.close();
            }
        }



    }
}
