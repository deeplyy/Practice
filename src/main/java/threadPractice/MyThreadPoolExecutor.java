package threadPractice;

import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * @author lidp
 */
public class MyThreadPoolExecutor extends ThreadPoolExecutor {

    public MyThreadPoolExecutor(){
        super(2, 10, 60L, TimeUnit.SECONDS, new SynchronousQueue<Runnable>(), new MyThreadFactory());
    }
}
