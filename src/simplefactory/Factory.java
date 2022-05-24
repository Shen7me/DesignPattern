package simplefactory;


/**
 * @Auther:shen7me
 * @Description:DesignPattern
 */
public class Factory {
    public static Procudt createProcudt(char c)
    {
        Procudt p=null;
        if(c=='A') p=new ConcreteProductA();
        else if(c=='B') p=new ConcreteProductB();
        return p;
    }
}
