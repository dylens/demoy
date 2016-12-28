package fory.play;

import org.apache.commons.lang3.StringUtils;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class PlayF {

    public static void main(String[] args) {
        Map<String, Map<String, String>> mapMap = new HashMap<>();
        mapMap.put("1", new HashMap<>());

        Map<String, String> map = mapMap.get("1");
        Set<Map.Entry<String, String>> entrySet = map.entrySet();
        for (Map.Entry<String, String> entry : entrySet) {
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
        }
        System.out.println(StringUtils.contains("abc", "bc"));
    }

}
