package interpreterpattern.demo;

/**
 * @Auther:shen7me
 * @Description:DesignPattern
 */
public class NonTerminalExpression extends AbstractExpression{

    private AbstractExpression address=null;
    private AbstractExpression name=null;
    private AbstractExpression id=null;

    public NonTerminalExpression(AbstractExpression address, AbstractExpression name, AbstractExpression id) {
        this.address = address;
        this.name = name;
        this.id = id;
    }

    @Override
    public boolean interpret(String info) {
        String s[]=info.split("-");
        return address.interpret(s[0])&&name.interpret(s[1])&&id.interpret(s[2]);
    }
}
