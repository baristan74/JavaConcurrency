package killJavaThread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.atomic.AtomicBoolean;

public class InterruptedExceptionExample implements  Runnable {


    private final AtomicBoolean running = new AtomicBoolean(true);

    @Override
    public void run() {
        try{

            while (running.get()){
                for(int i =0; i<3 ; i++){
                    System.out.println(i);
                }

                Thread.sleep(2000);
            }
        }
        catch (InterruptedException e){
            Thread.currentThread().interrupt();
        }
    }

    public static void main(String[] args) throws InterruptedException {
        ExecutorService executor = Executors.newSingleThreadExecutor();
        Future<?> future = executor.submit(new InterruptedExceptionExample());
        Thread.sleep(3000);
        executor.shutdownNow();
    }
}
