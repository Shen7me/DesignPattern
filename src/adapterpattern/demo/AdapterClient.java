package adapterpattern.demo;

/**
 * @Auther:shen7me
 * @Description:DesignPattern
 */

/**
 * 火箭队(目标target)打球，姚明作为外籍球员(适配者)打球，刚进队听不懂，需要翻译(即适配器)
 */
public class AdapterClient {
    public static void main(String[] args) {
        Player b=new Forwards("巴蒂尔");
        b.attack();
        Player m=new Guards("麦克格雷迪");
        m.attack();

        Player ym =new Translator("姚明");
        ym.attack();
        ym.defence();
    }
}
