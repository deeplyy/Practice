package provider;

import org.springframework.stereotype.Service;
import service.DubboTest;
import vo.TestReq;
import vo.TestResp;

import java.util.Map;
import java.util.Set;

@Service
public class Test implements DubboTest {
    @Override
    public String sayHello() {
        return "hi, my name is lidp !";
    }

    @Override
    public String sayIn(String in) {
        return in;
    }

    @Override
    public String sayMap(Map<String, Object> map) {
        Set<String> set = map.keySet();
        StringBuilder sb = new StringBuilder("内容是:");
        for (String s : set){
            sb.append(map.get(s));
        }
        return sb.toString();
    }

    @Override
    public TestResp sayObject(TestReq req) {
        Map<String, Object> m = req.getMap();
        System.out.println(m.get("1"));
        System.out.println(req.getWords());
        TestResp resp = new TestResp();
        resp.setAns(req.getWords());
        return resp;
    }

}
