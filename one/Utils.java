package aston.homeWork.one;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BiConsumer;

public final class Utils {

    private Utils(){};

    public static Map<String, Map<String, String>> mapMapCopy(Map<String, Map<String, String>> map){
        Map<String, Map<String, String>> target = new HashMap<>();
        map.forEach(new BiConsumer<String, Map<String, String>>() {
            @Override
            public void accept(String s, Map<String, String> stringStringMap) {
                Map<String, String> m = map.get(s);
                target.put(s, Map.copyOf(m));
            }
        });
        return target;
    }

    public static List<String > listCopy(List<String> someList){
        return new ArrayList<>(someList);
    }
}
