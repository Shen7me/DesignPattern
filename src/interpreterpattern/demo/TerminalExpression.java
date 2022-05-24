package interpreterpattern.demo;

import java.util.HashSet;
import java.util.Set;

/**
 * @Auther:shen7me
 * @Description:DesignPattern
 */
public class TerminalExpression extends AbstractExpression{

    private Set<String> set =new HashSet<String>();

    public TerminalExpression(String[] data)
    {
        for(int i=0; i<data.length;i++)
            set.add(data[i]);
    }

    @Override
    public boolean interpret(String info) {
        if(set.contains(info))
        {
            return true;
        }
        return false;
    }
}
