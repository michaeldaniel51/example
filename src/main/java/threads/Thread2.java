package threads;

public class Thread2 implements Runnable {
    @Override
    public void run() {

        try{
            System.out.println("Thread2 is running");
        }catch (Exception e){
            //throws an exception
            System.out.println("Exception is caught");
        }

    }
}
