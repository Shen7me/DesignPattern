package visitorpattern;

import java.util.ArrayList;
import java.util.List;

/**
 * @Auther:shen7me
 * @Description:DesignPattern
 */

/**
 * 提供一个高层的接口以允许访问者访问它的元素
 */
public class ObjectStructure  {
    private List<Element> elements = new ArrayList<>();

    public void attach(Element element) {
        elements.add(element);
    }

    public void detach(Element element) {
        elements.remove(element);
    }

    public void accept(Visitor visitor) {
        for (Element element : elements) {
            element.accept(visitor);
        }
    }
}
