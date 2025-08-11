package structural.proxy.cacheProxy;

import java.util.HashMap;
import java.util.Map;

public class QueryResult implements DBService {

    Map<String, String> db_result = new HashMap<String, String>() {
        {
            put("id_1", "abc1@gmail.com");
            put("id_2", "abc2@gmail.com");
            put("id_3", "abc3@gmail.com");
            put("id_4", "abc4@gmail.com");
            put("id_5", "abc5@gmail.com");
        }
    };

    @Override
    public String fetchData(String key) {
        System.out.println("Fetching data from database for key: " + key + " ......");

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
        return "Data for " + key + " from database " + db_result.get(key);
    }
}
