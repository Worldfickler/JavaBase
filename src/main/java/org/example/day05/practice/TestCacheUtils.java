package org.example.day05.practice;

/**
 * @author Fickler
 * @date 2024/4/19 14:58
 */
public class TestCacheUtils {
    public static void main(String[] args) {
        CacheUtils cacheUtils = new CacheUtils();
        cacheUtils.put("aa", "aaa");
        cacheUtils.put("bb", "bbb");
        Object bb = cacheUtils.get("bb", String.class);
        System.out.println(bb);
        Object bb1 = cacheUtils.get("bb", Integer.class);
        System.out.println(bb1);
        Object cc = cacheUtils.get("cc", String.class);
        System.out.println(cc);
    }
}
