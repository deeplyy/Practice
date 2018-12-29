package thread;

public class TestPOJO2 {
    public volatile int test = 2;
    public int getNumber(){
        return test = test + 2;
    }
}
