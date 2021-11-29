package synchorizedKeyword;

public class SynchronizedBlock {
    private int count;

    public void increment(){
        String tName = Thread.currentThread().getName();
        System.out.println(tName);
        synchronized (this){
            setCount(getCount()+1);
        }
    }

    public void setCount(int count){
        this.count=count;
    }
    public int getCount(){
        return count;
    }}
