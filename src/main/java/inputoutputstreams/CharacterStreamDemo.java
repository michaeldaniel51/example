package inputoutputstreams;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CharacterStreamDemo {

    public static void main(String[] args) throws IOException {
        FileReader readerStream = null;
        FileWriter writerStream = null;

        try{
            readerStream = new FileReader("C:\\Users\\MAICON\\Downloads\\Test2.txt");
            writerStream = new FileWriter("C:\\Users\\MAICON\\Downloads\\Test3.txt");

            //Reading the file and writing it to another file
            int content;
            while((content = readerStream.read()) != -1){
                writerStream.write((char)content);
            }
        } finally {
            if(readerStream != null){
                readerStream.close();
            }
        }
        if (writerStream != null){
            writerStream.close();
        }
    }








}
