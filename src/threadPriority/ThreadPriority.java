package threadPriority;

class Thread1 extends Thread{
    public int getThreadPriority(){ return this.getPriority(); }
    public void setThreadPriority(int priority){ this.setPriority(priority); }
}
class Thread2 extends Thread{
    public int getThreadPriority(){ return this.getPriority(); }
    public void setThreadPriority(int priority){ this.setPriority(priority); }
}

public class ThreadPriority extends Thread{
    static Thread1 t1 = new Thread1();
    static Thread2 t2 = new Thread2();
    static ThreadPriority te = new ThreadPriority();

    public static void main(String []args){
        System.out.println("Priority of main thread : " + te.getPriority());
        System.out.println("Priority of thread1 : " + t1.getPriority());
        System.out.println("Priority of thread2 : " + t2.getPriority());

        t1.setThreadPriority(6);
        t2.setThreadPriority(3);
        te.setPriority(Thread.MAX_PRIORITY);

        System.out.println("Priority of main thread : " + te.getPriority());
        System.out.println("Priority of thread1 : " + t1.getPriority());
        System.out.println("Priority of thread2 : " + t2.getPriority());

        //throws Exception in thread "main" java.lang.IllegalArgumentException
        //te.setPriority(33);
    }
}

