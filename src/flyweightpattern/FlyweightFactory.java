package flyweightpattern;

import java.util.HashMap;

/**
 * @Auther:shen7me
 * @Description:DesignPattern
 */

/**
 * 享元工厂，用来创建并管理Flyweight对象。
 * 它主要时用来确保合理地共享Flyweight，当用户请求一个Flyweight时，FlyweightFactory
 * 对象提供一个已创建的实例或者创建一个（如果不存在）。
 */
public class FlyweightFactory {
    //初始化工厂，生成若干实例
    private HashMap<String, Flyweight> flyweights = new HashMap<String, Flyweight>();

    public Flyweight getFlyweight(String key) {
        if (!flyweights.containsKey(key)) {
            flyweights.put(key, new ConcreteFlyweight());
        }

        return flyweights.get(key);
    }
}
