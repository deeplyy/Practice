package threadPractice;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;


public class Practice {

    public static void main(String[] args){
        ThreadPoolExecutor poolExecutor = new MyThreadPoolExecutor();
        ExecutorService exe = poolExecutor;
        for (int i=0;i<5;i++){
            exe.execute(new LiftOffTask(3));
        }
        exe.shutdown();
    }
}
