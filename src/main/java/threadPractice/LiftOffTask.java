package threadPractice;

public class LiftOffTask implements Runnable {
    private static int taskCount = 0;
    protected int countDown = 10;
    private final int id = taskCount ++;

    public LiftOffTask(int countDown){
        System.out.println("线程thread "+ id +" start!");
        this.countDown = countDown;
    }

    public String status(){
        return "#"+id+"("+(countDown >= 0 ? countDown:"LiftOffTask!") +"),";
    }

    @Override
    public void run() {
        while (countDown-- >= 0){
            System.out.println("thread "+ id +" yield, 1:"+status());
            Thread.yield();
            System.out.println("thread "+ id +" yield, 2:"+status());
            Thread.yield();
            System.out.println("thread "+ id +" yield, 3:"+status());
            Thread.yield();
        }
        System.out.println("thread "+ id +" end!");
    }
}
