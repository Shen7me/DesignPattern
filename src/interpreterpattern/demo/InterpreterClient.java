package interpreterpattern.demo;

/**
 * @Auther:shen7me
 * @Description:DesignPattern
 */

/**
 * 正则化的小例子 该标准是 [单个数字-单个小写-单个大写]
 */
public class InterpreterClient {
    public static void main(String[] args) {
        Context people=new Context();
        people.jieshi("2-a-A");
        people.jieshi("11-A-5");
        people.jieshi("你-好-吖");
        people.jieshi("2aA");
    }
}
