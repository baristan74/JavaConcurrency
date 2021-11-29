package synchorizedKeyword;

public class Synchronized {
    private int count;

    public synchronized void increment(){
        String tName = Thread.currentThread().getName();
        System.out.println(tName);
        setCount(getCount()+1);
    }

    public void setCount(int count){
        this.count=count;
    }
    public int getCount(){
        return count;
    }
}
