package simplefactory.demo;


/**
 * @Auther:shen7me
 * @Description:DesignPattern
 */
public class Calculator {
    public static void main(String[] args) {
        Operation operation;

        operation = OperationFactory.createOperation('+');
        operation.numberA = 11;
        operation.numberB = 2.22;

        System.out.println(operation.result());
    }
}
