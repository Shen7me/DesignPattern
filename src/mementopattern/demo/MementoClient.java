package mementopattern.demo;

/**
 * @Auther:shen7me
 * @Description:DesignPattern
 */
public class MementoClient {
    public static void main(String[] args) {
        //大战前
        //初始游戏状态，属性都是100
        GameRole wanjia =new GameRole();
        wanjia.getInitState();
        wanjia.stateDisplay();

        //保存进度
        //现在保存的都是100
        RoleStateCaretaker rsc=new RoleStateCaretaker();
        rsc.setRoleStateMemento(wanjia.saveState());

        //大战boss，死掉了
        //死掉了，fight()写的都为0了
        wanjia.fight();
        wanjia.stateDisplay();

        //恢复之前状态
        //恢复到上面写的存档
        wanjia.recoveryState(rsc.getRoleStateMemento());
        wanjia.stateDisplay();
    }
}
