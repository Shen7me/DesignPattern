package observerpattern.demo;

/**
 * @Auther:shen7me
 * @Description:DesignPattern
 */

/**
 * 老板回办公室，秘书提前看到会跟摸鱼的同时打电话通知。
 * 但有时秘书并没有功夫打电话通知。
 *
 * 这里的通知者、主题(Subject) 有老板和秘书两个
 * 观察者有看股票的看球的。
 */
public class ObserverClient {
    public static void main(String[] args) {

        /**
         * 老板回来了，秘书提前通知同事
         */
        {
            System.out.println("情景：老板回来，秘书打电话通知。");
            //秘书:小秘
            Secretary xiaomi =new Secretary();

            //看股票的人：阿股
            StockObserver agu =new StockObserver("阿股",xiaomi);

            //看球赛的人：球球
            BallObserver qiuqiu=new BallObserver("球球",xiaomi);

            //通知
            xiaomi.attach(agu);
            xiaomi.attach(qiuqiu);

            //老板胡汉三回来了，设置其状态
            xiaomi.setSubjectState("秘书看见老板回来，打电话通知。");
            //发出通知-->然后各个观察者的就要update了
            xiaomi.notifyObserver();
        }

        System.out.println();
        /**
         * 这里老板径直回来了，秘书来不及通知
         */
        {
            System.out.println("情景：老板回来了。");
            //老板：胡汉三
            Boss huhansan =new Boss();

            //看股票的人：阿股
            StockObserver agu =new StockObserver("阿股",huhansan);

            //看球赛的人：球球
            BallObserver qiuqiu=new BallObserver("球球",huhansan);

            //通知
            huhansan.attach(agu);
            huhansan.attach(qiuqiu);

            //阿股没看见老板(没通知到)，把他减去
            huhansan.detach(agu);

            //老板胡汉三回来了，设置其状态
            huhansan.setSubjectState("我胡汉三回来了!");
            //发出通知-->然后各个观察者的就要update了
            huhansan.notifyObserver();
        }
    }
}
