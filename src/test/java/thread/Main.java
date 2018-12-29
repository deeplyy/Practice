package thread;

import provider.Test;

public class Main {
    private static ThreadPool pool = new ThreadPool();

    public static void main(String[] args){
        pool.initialize();
        TestPOJO t = new TestPOJO();
        TestPOJO2 t2 = new TestPOJO2();
        for (int i=0; i<5; i++){
            VolatileTest volatileTest = new VolatileTest();
            volatileTest.setT(t);
            volatileTest.setT2(t2);
            volatileTest.setThreadNo(i);
            pool.execute(volatileTest);
        }

    }
}
