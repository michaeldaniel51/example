package threadsynchronization;

public class MathUtils {

    void getMultiples(int n) {

        /*
        using synchronized to lock the the block of code
        allowing the code to run simultaneously not together
         */

        synchronized (this) {
            for (int i = 0; i <= 5; i++) {
                System.out.println(n * i);
                try {
                    Thread.sleep(400);
                } catch (Exception ex) {
                    System.out.println(ex);
                }

            }

        }
    }
}
