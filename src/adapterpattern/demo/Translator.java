package adapterpattern.demo;

/**
 * @Auther:shen7me
 * @Description:DesignPattern
 */

/**
 * 翻译          (Adapter)
 */
public class Translator extends Player{

    private ForeignPlayer foreignPlayer=new ForeignCenter();
    //给中锋的翻译
    public Translator(String name) {
        super(name);
        foreignPlayer.name=name;
    }


    @Override
    public void attack() {
        foreignPlayer.jingong();
    }

    @Override
    public void defence() {
        foreignPlayer.fangshou();
    }
}
