package templatepattern.demo;

/**
 * @Auther:shen7me
 * @Description:DesignPattern
 */

//学生A的试卷，具体类
public class PaperA extends TestPaper{
    @Override
    protected String a1()
    {
        return "a";
    }
    @Override
    protected String a2()
    {
        return "b";
    }
    @Override
    protected String a3()
    {
        return "c";
    }
}
