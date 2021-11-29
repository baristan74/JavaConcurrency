package synchorizedKeyword;

public class SyncDemo {
    public static void main(String[] args){
        Synchronized counter= new Synchronized();
        SynchronizedBlock counterBlock = new SynchronizedBlock();
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i=1;i<=10000;i++){
                  //  counter.increment();
                    counterBlock.increment();
                }
            }
        });

        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i=1;i<=10000;i++){
                   // counter.increment();
                    counterBlock.increment();
                }
            }
        });
        thread1.start();
        thread2.start();

        try{
            thread1.join();
            thread2.join();
        }catch (InterruptedException e){
            e.printStackTrace();
        }

       // System.out.println("Count:" + counter.getCount());
        System.out.println("Counter Block: "+ counterBlock.getCount());
    }
}
