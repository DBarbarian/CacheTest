package test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = CacheApplication.class)
public class CacheImplTest {

    @Autowired
    private CacheImpl<String> cacheImpl;

    @Test
    public void testPut() {
        cacheImpl.put("myKey", "myValue");
    }

}