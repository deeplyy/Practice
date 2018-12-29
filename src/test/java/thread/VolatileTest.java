package thread;

public class VolatileTest implements Runnable{

    TestPOJO t ;
    TestPOJO2 t2 ;
    int threadNo;

    public int getThreadNo() {
        return threadNo;
    }

    public void setThreadNo(int threadNo) {
        this.threadNo = threadNo;
    }

    public TestPOJO getT() {
        return t;
    }

    public void setT(TestPOJO t) {
        this.t = t;
    }

    public TestPOJO2 getT2() {
        return t2;
    }

    public void setT2(TestPOJO2 t2) {
        this.t2 = t2;
    }

    @Override
    public void run() {
        System.out.println("线程"+ threadNo);
        if (threadNo <= 2){
            try {
                Thread.sleep(10000);
            }catch (Exception e){
                System.out.println("err!");
            }

        }else {

        }

        System.out.println("线程"+ threadNo+ ":" + t.getClass().getSimpleName() + "状态"+t.getNumber());
        System.out.println("线程"+ threadNo+ ":" + t2.getClass().getSimpleName() + "状态"+t2.getNumber());

    }
}
