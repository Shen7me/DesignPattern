package builderpattern.demo;

import java.util.ArrayList;
import java.util.List;

/**
 * @Auther:shen7me
 * @Description:DesignPattern
 */

/**
 * Product类
 * Lunch，由多个步骤组成
 */
public class Lunch {
    List<String> parts = new ArrayList<String>();

    // 添加步骤
    public void add(String part) {
        parts.add(part);
    }

    // 列举所有的步骤
    public void show() {
        System.out.println("---这个饭需要---");

        for (String part : parts) {
            System.out.println(part);
        }
    }
}
