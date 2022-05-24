package statepattern.demo;

/**
 * @Auther:shen7me
 * @Description:DesignPattern
 */

//这样没有了过长分支语句
public class Work {
    private State current;
    public Work()
    {
        current=new ForenoonState();
    }

    private double hour;

    public double getHour() {
        return hour;
    }

    public void setHour(double hour) {
        this.hour = hour;
    }

    private Boolean finish =false;

    public Boolean getFinish() {
        return finish;
    }

    public void setFinish(Boolean finish) {
        this.finish = finish;
    }

    public void setState(State current) {
        this.current = current;
    }

    public void code()
    {
        current.code(this);
    }
}
