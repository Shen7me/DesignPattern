package mediatorpattern.demo;

/**
 * @Auther:shen7me
 * @Description:DesignPattern
 */

/**
 * 美国伊拉克冲突，  安理会充当中介
 */
public class MediatorClient {
    public static void main(String[] args) {
        UnitedNationsSecurityCouncil unitedNationsSecurityCouncil=new UnitedNationsSecurityCouncil();
        //国家认识一下安理会
        USA c1=new USA(unitedNationsSecurityCouncil);
        Iraq c2=new Iraq(unitedNationsSecurityCouncil);

        //安理会认识一下国家
        unitedNationsSecurityCouncil.setColeague1(c1);
        unitedNationsSecurityCouncil.setColleaque2(c2);

        c1.declare("不准核武器，否则打你");
        c2.declare("我们只有洗衣粉！！");
    }
}
