package nio;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public class NioExample {

    public NioExample() throws FileNotFoundException {
    }

    public static void main(String[] args) throws IOException {
        FileInputStream fin = new FileInputStream("C:\\Users\\MAICON\\Downloads\\Test.txt");
        FileChannel readchannel = fin.getChannel();
        ByteBuffer readBuffer = ByteBuffer.allocate(1024);
        int result = readchannel.read(readBuffer);
        System.out.println("file read successfully " + result);


        FileOutputStream fout = new FileOutputStream("C:\\Users\\MAICON\\Downloads\\dest.txt");
        FileChannel writeChannel = fout.getChannel();
        ByteBuffer writeBuffer = ByteBuffer.allocate(1024);
        String message = "this is a test";
        writeBuffer.put(message.getBytes());
        writeBuffer.flip();
        writeChannel.write(writeBuffer);
        System.out.println("file written successfully");

    }


}
