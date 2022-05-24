package templatepattern.demo;

/**
 * @Auther:shen7me
 * @Description:DesignPattern
 */

//学生B的试卷，具体类
public class PaperB extends TestPaper{
    @Override
    protected String a1()
    {
        return "b";
    }
    @Override
    protected String a2()
    {
        return "c";
    }
    @Override
    protected String a3()
    {
        return "d";
    }
}
