package provider;

import org.springframework.stereotype.Service;
import service.DubboTest;

@Service
public class Test implements DubboTest {
    @Override
    public String sayHello() {
        return "hi, my name is lidp !";
    }
}
