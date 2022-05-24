package facadepattern;

/**
 * @Auther:shen7me
 * @Description:DesignPattern
 */


/**
 * 四个子系统和其方法
 * 子系统中没有facade的任何信息，
 */
class SubSystemOne {
    public void methodOne() {
        System.out.println("子系统一，方法一");
    }
}

class SubSystemTwo  {
    public void methodTwo() {
        System.out.println("子系统二，方法二");
    }
}

class SubSystemThree {
    public void methodThree() {
        System.out.println("子系统三，方法三");
    }
}

class SubSystemFour {
    public void methodFour() {
        System.out.println("子系统四，方法四");
    }
}