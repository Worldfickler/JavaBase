package org.example.day06.singleton;

import java.util.HashMap;
import java.util.Map;

/**
 * 登记式单例，将类名注册，下次直接从里面获取
 * @author Fickler
 * @date 2024/4/22 13:31
 */
public class SingletonRegister {
    private static Map<String, SingletonRegister> map = new HashMap<String, SingletonRegister>();
    static {
        SingletonRegister single = new SingletonRegister();
        map.put(single.getClass().getName(), single);
    }

    protected SingletonRegister() {
    }

    public static SingletonRegister getInstance(String name) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
        if (name == null) {
            name = SingletonRegister.class.getName();
            System.out.println("name == null --> " + name);
        }
        if (map.get(name) == null) {
            map.put(name, (SingletonRegister) Class.forName(name).newInstance());
        }
        return map.get(name);
    }

    public String about() {
        return "Hello, I am SingletonRegister";
    }

    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
        SingletonRegister instance = SingletonRegister.getInstance(null);
        System.out.println(instance.about());
    }
}
