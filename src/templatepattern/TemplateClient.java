package templatepattern;

/**
 * @Auther:shen7me
 * @Description:DesignPattern
 */
public class TemplateClient {
    public static void main(String[] args) {
        AbstractClass template;

        template = new ConcreteClassA();
        template.templateMethod();

        template = new ConcreteClassB();
        template.templateMethod();
    }
}
