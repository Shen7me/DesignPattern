package statepattern.demo;

/**
 * @Auther:shen7me
 * @Description:DesignPattern
 */

//抽象状态
public abstract class State {
    public abstract void code(Work w);
}

//上午工作状态
class ForenoonState extends State
{
    @Override
    public void code(Work w) {
        if(w.getHour()<12){
            System.out.println("现在"+w.getHour()+"点，很有精神！");
        }
        else{
            w.setState(new NoonState());
            w.code();
        }
    }
}

//中午工作状态
class NoonState extends State
{

    @Override
    public void code(Work w) {
        if(w.getHour()<13){
            System.out.println("现在"+w.getHour()+"点，吃完午饭，好困！");
        }
        else{
            w.setState(new AfterNoonState());
            w.code();
        }
    }
}

//下午工作状态
class AfterNoonState extends State
{

    @Override
    public void code(Work w) {
        if(w.getHour()<17){
            System.out.println("现在"+w.getHour()+"点，下午工作时间，挺有精神！");
        }
        else{
            w.setState(new EveningState());
            w.code();
        }
    }
}

//晚上工作状态
class EveningState extends State
{

    @Override
    public void code(Work w) {
        if(w.getHour()<21){
            System.out.println("现在"+w.getHour()+"点，好困哦！");
        }
        else{
            w.setState(new SleepingState());
            w.code();
        }
    }
}

//夜间睡眠状态
class SleepingState extends State
{

    @Override
    public void code(Work w) {
        System.out.println("现在"+w.getHour()+"点，睡觉！");
    }
}

//下班休息状态
class RestState extends State
{

    @Override
    public void code(Work w) {
        System.out.println("现在"+w.getHour()+"点，下班回家玩！");
    }
}