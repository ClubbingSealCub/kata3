package kata3;

import java.util.HashMap;
import java.util.Map;

public class Kata3 {

    public Map.Entry<Object, Integer> maxEntry(Object[] vFuente) {
        Map<Object, Integer> mapa = new HashMap() {
        };
        for (Object vFuente1 : vFuente) {
            if (mapa.containsKey(vFuente1)) {
                mapa.put(vFuente1, mapa.get(vFuente1) + 1);
            } else {
                mapa.put(vFuente1, 1);
            }
        }
        Map.Entry<Object, Integer> maxEntry = null;
        for (Map.Entry<Object, Integer> entry : mapa.entrySet()) {
            if (maxEntry == null || entry.getValue().compareTo(maxEntry.getValue()) > 0) {
                maxEntry = entry;
            }
        }
        return maxEntry;
    }

    public static void main(String[] args) {

    }

}
