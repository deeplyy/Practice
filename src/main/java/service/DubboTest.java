package service;

import vo.TestReq;
import vo.TestResp;

import java.util.Map;

public interface DubboTest {
    String sayHello();
    String sayIn(String in);
    String sayMap(Map<String, Object> map);
    TestResp sayObject(TestReq req);
}
