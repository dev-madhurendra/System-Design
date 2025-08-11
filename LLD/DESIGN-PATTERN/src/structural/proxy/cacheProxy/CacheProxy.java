package structural.proxy.cacheProxy;

import java.util.HashMap;
import java.util.Map;

public class CacheProxy implements DBService {
    private QueryResult queryResult;
    private Map<String, String> cache;
    private Map<String, Long> timestamps;
    private static final long CACHE_EXPIRY = 5000; // 5 seconds

    public CacheProxy() {
        this.queryResult = new QueryResult();
        this.cache = new HashMap<>();
        this.timestamps = new HashMap<>();
    }

    @Override
    public String fetchData(String key) {
        if (isCacheValid(key)) {
            System.out.println("Cache hit for key: " + key);
            return cache.get(key);
        }

        System.out.println("Cache miss for key: " + key);
        String data = queryResult.fetchData(key);
        cache.put(key, data);
        timestamps.put(key, System.currentTimeMillis());
        return data;
    }

    private boolean isCacheValid(String key) {
        if (!cache.containsKey(key)) {
            return false;
        }

        long currentTime = System.currentTimeMillis();
        long cacheTime = timestamps.get(key);
        return (currentTime - cacheTime) < CACHE_EXPIRY;
    }
}
