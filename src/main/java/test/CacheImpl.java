package test;

import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.CachePut;
import org.springframework.stereotype.Component;

@Component
@CacheConfig(cacheNames = "testCache")
public class CacheImpl<T> {

    @CachePut(key = "#key")
    public T put(String key, T entry) {
        return entry;
    }
}
