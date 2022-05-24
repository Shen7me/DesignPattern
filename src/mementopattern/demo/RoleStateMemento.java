package mementopattern.demo;

/**
 * @Auther:shen7me
 * @Description:DesignPattern
 */
public class RoleStateMemento {
    private int hp;//血条
    private int mp;//蓝量
    private int atk;//攻击力
    private int def;//防御力


    //get set
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

    //构造方法，导入数据
    public RoleStateMemento(int hp,int mp,int atk,int def)
    {
        this.hp=hp;
        this.mp=mp;
        this.atk=atk;
        this.def=def;
    }
}
