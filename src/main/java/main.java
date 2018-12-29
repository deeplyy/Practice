import org.springframework.context.support.ClassPathXmlApplicationContext;

public class main {

    public static void main(String[] args) throws Exception{
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("provider.xml");
        context.start();
        System.in.read();
    }
}
