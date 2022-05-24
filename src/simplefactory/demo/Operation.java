package simplefactory.demo;

/**
 * @Auther:shen7me
 * @Description:DesignPattern
 */

/**
 * 操作类抽象类
 */

/**
 * 简单工厂这个是抽象类啊，原书不是
 */

public abstract class Operation {

    public double numberA;
    public double numberB;

    public abstract double result();
}

class OperationAdd extends Operation
{
    @Override
    public double result() {
        return numberA + numberB;
    }

}

class OperationSub extends Operation {

    @Override
    public double result() {
        return numberA - numberB;
    }

}

class OperationMul extends Operation {

    @Override
    public double result() {
        return numberA * numberB;
    }

}

class OperationDiv extends Operation {

    @Override
    public double result() {
        if (numberB == 0) {
            throw new RuntimeException("除数不能为0");
        }
        return numberA / numberB;
    }

}