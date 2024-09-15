package CS_homework.Interfaces;

import java.text.MessageFormat;

import CS_homework.CacheImpl.FIFOCache;
import CS_homework.CacheImpl.LFUCacheBuilder;
import CS_homework.CacheImpl.*;

public class CahceFactory {
    public static ICache createCacheInstance (CS_homework.CacheImpl.CacheTypeEnum type, int capacity) {
        switch(type) {
            case CacheTypeEnum.FIFO:
                 return new FIFOCache(capacity);
            case CacheTypeEnum.LFU:
                 LFUCacheBuilder lfuCacheBuilder = new LFUCacheBuilder().setCapacity(capacity).setServerName("localhost:8080");
                  return lfuCacheBuilder.build();
             default:
                  System.out.println(MessageFormat.format("cache with type {0} is not implemented yet", type));
                  return null;

        }
    }
    
}
