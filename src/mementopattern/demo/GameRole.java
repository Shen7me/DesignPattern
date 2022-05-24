package mementopattern.demo;


/**
 * @Auther:shen7me
 * @Description:DesignPattern
 */
public class GameRole {
    //属性
    private int hp;//血条
    private int mp;//蓝量
    private int atk;//攻击力
    private int def;//防御力

    //状态显示
    public void stateDisplay()
    {
        System.out.println("角色当前状态：");
        System.out.println("HP："+this.hp);
        System.out.println("MP："+this.mp);
        System.out.println("ATK："+this.atk);
        System.out.println("DEF："+this.def);
    }

    //获得初始状态
    public void getInitState()
    {
        //数据通常来源于本机磁盘或者远程数据库
        this.hp=100;
        this.mp=100;
        this.atk=100;
        this.def=100;
    }

    //战斗
    public void fight()
    {
        this.hp=0;
        this.mp=0;
        this.atk=0;
        this.def=0;
    }

    //保存角色状态
    public RoleStateMemento saveState()
    {
        return (new RoleStateMemento(hp,mp,atk,def));
    }

    //回复角色状态
    public void recoveryState(RoleStateMemento memento)
    {
        this.hp=memento.getHp();
        this.mp=memento.getMp();
        this.atk=memento.getAtk();
        this.def=memento.getDef();
    }

//-------------------------------------------
    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getMp() {
        return mp;
    }

    public void setMp(int mp) {
        this.mp = mp;
    }

    public int getAtk() {
        return atk;
    }

    public void setAtk(int atk) {
        this.atk = atk;
    }

    public int getDef() {
        return def;
    }

    public void setDef(int def) {
        this.def = def;
    }
}
