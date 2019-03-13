package vo;

import java.io.Serializable;
import java.util.Map;

public class TestReq implements Serializable {
    private String words;
    private Map<String, Object> map;

    public String getWords() {
        return words;
    }

    public void setWords(String words) {
        this.words = words;
    }

    public Map<String, Object> getMap() {
        return map;
    }

    public void setMap(Map<String, Object> map) {
        this.map = map;
    }
}
