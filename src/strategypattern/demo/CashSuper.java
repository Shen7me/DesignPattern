package strategypattern.demo;

/**
 * @Auther:shen7me
 * @Description:DesignPattern
 */
//现金收费接口
public interface CashSuper {
    //方法
    public double acceptCash(double money);
}


//正常收费子类，原价返回
class CashNormal implements CashSuper {
    @Override
    public double acceptCash(double money)
    {
        return money;
    }
}

//打折收费子类
class CashDiscount implements CashSuper {
    private double discount;
    public CashDiscount(double discount)
    {
        this.discount=discount;
    }
    @Override
    public double acceptCash(double money)
    {
        return money*discount;
    }
}

//返利收费子类
class CashReturn implements CashSuper {
    //in case:满300 减50这种
    private double condition;
    private double moneyReturn;
    public CashReturn(double condition,double moneyReturn)
    {
        this.condition=condition;
        this.moneyReturn=moneyReturn;
    }
    @Override
    public double acceptCash(double money)
    {
        double result=0;
        if(money>=condition)
            result=money-(Math.floor(money/condition)*moneyReturn);
        return result;
    }
}
