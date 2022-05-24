package chainOfResponsibility.demo;

/**
 * @Auther:shen7me
 * @Description:DesignPattern
 */
public class chainORClient {
    public static void main(String[] args) {
        CommonManager jingli =new CommonManager("王经理");
        Majordomo zongjian = new Majordomo("王总监");
        GeneralManager zongjingli =new GeneralManager("王总经理");
        jingli.setSuperior(zongjian);
        zongjian.setSuperior(zongjingli);

        Request request=new Request();
        request.setRequestType("请假");
        request.setRequestContent("我要请假");
        request.setNumber(1);
        jingli.requestApplication(request);

        Request request2=new Request();
        request2.setRequestType("请假");
        request2.setRequestContent("我要请假");
        request2.setNumber(4);
        //也是jingli发起的，但实际谁决策（调用的谁）不知道
        jingli.requestApplication(request2);

        Request request3=new Request();
        request3.setRequestType("加薪");
        request3.setRequestContent("我要加薪");
        request3.setNumber(500);
        //也是jingli发起的，但实际谁决策（调用的谁）不知道
        jingli.requestApplication(request3);

        Request request4=new Request();
        request4.setRequestType("加薪");
        request4.setRequestContent("我要加薪");
        request4.setNumber(1000);
        //也是jingli发起的，但实际谁决策（调用的谁）不知道
        jingli.requestApplication(request4);
    }
}
