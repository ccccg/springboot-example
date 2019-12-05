package com.example.testcache.service;

import com.example.testcache.model.User;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

//@CacheConfig(cacheNames = "user")
//当我们需要缓存的地方越来越多，你可以使用@CacheConfig(cacheNames = {"myCache"})
// 注解来统一指定value的值，这时可省略value
// 如果你在你的方法依旧写上了value，那么依然以方法的value值为准
@Service
public class UserService {
    User user;


    @Cacheable(cacheNames = "user", key = "#username")
    public User getUserByUsername(String username){
        System.out.println("未启用缓存");
        User user = new User();
        user.setUsername(username);
        user.setPassword("xxxxx");
        return user;
    }

    //@CachePut 更新数据，并且更新key的缓存，cachemanager有许多cache
    //cache里有许多key，缓存时要注意名称保持一致
    //必须与@cacheable一起使用
    @CachePut(cacheNames = "user", key = "#user.username")
    public User updateUser(User user){
        System.out.println("更新缓存");
        user.setPassword("xaaaa");
        return user;
    }

    //@CacheEvict清空缓存
    //allEntries是否清空所有缓存内容，缺省为 false，如果指定为 true，则方法调用后将立即清空所有缓存
    // beforeInvocation	是否在方法执行前就清空，缺省为 false，如果指定为 true，则在方法还没有执行的时候就清空缓存
    // 默认情况下，如果方法执行抛出异常，则不会清空缓存
    @CacheEvict(cacheNames = "user", key = "#username")
    public void clearUser(String username){
        System.out.println("清空缓存");
    }
}
