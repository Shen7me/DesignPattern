package interpreterpattern.demo;

/**
 * @Auther:shen7me
 * @Description:DesignPattern
 */
public class Context {
    private String[] shuzis={"1","2","3","4","5","6","7","8","9","0"};
    private String[] xiaoxiezimus={"a","b","c","d","e","f","g","h","i","j","k","l"};
    private String[] daxiezimus={"A","B","C","D","E","F","G"};
    private AbstractExpression infomation;

    public Context()
    {
        AbstractExpression shuzi=new TerminalExpression(shuzis);
        AbstractExpression xiaoxiezimu=new TerminalExpression(xiaoxiezimus);
        AbstractExpression daxiezimu=new TerminalExpression(daxiezimus);
        infomation=new NonTerminalExpression(shuzi,xiaoxiezimu,daxiezimu);
    }

    public void jieshi(String info)
    {
        boolean ok=infomation.interpret(info);
        if(ok) System.out.println("正确！ ["+info+"] 满足  [单个数字-单个小写-单个大写]  的条件");
        else System.out.println("错误！ ["+info+"] 不满足  [单个数字-单个小写-单个大写]  的条件");
    }

}
