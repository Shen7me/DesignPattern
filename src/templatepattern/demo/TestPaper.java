package templatepattern.demo;

/**
 * @Auther:shen7me
 * @Description:DesignPattern
 */

//试题试卷：抽象类
public abstract class TestPaper {
    public void Q1()
    {
        System.out.println("1+1=___ \na)1\tb)2\tc)3\td)4");
    }
    public void Q2()
    {
        System.out.println("1+2=___ \na)1\tb)2\tc)3\td)4");
    }
    public void Q3()
    {
        System.out.println("2+2=___ \na)1\tb)2\tc)3\td)4");
    }

    protected String a1()
    {
        return "";
    }
    protected String a2()
    {
        return "";
    }
    protected String a3()
    {
        return "";
    }
}
