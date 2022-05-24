package templatepattern.demo;

/**
 * @Auther:shen7me
 * @Description:DesignPattern
 */

/**
 * 有一份试题，而学生做试题只有答案不同。
 * 那么就把答案这一块代码封装起来。
 */
public class TemplateClient {
    public static void main(String[] args) {

        TestPaper sA=new PaperA();
        TestPaper sB=new PaperB();
        System.out.println("A的试卷：");
        sA.Q1();
        sA.Q2();
        sA.Q3();
        System.out.println();
        System.out.println("B的试卷：");
        sB.Q1();
        sB.Q2();
        sB.Q3();

        System.out.println("A的答案：");
        System.out.println(sA.a1()+"\t"+sA.a2()+"\t"+sA.a3());
        System.out.println();
        System.out.println("B的答案：");
        System.out.println(sB.a1()+"\t"+sB.a2()+"\t"+sB.a3());

    }
}
