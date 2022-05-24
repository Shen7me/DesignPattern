package statepattern.demo;

/**
 * @Auther:shen7me
 * @Description:DesignPattern
 */
public class StateClient {
    public static void main(String[] args) {
        //紧急项目
        Work emergencyProjects = new Work();
        emergencyProjects.setHour(9);
        emergencyProjects.code();
        emergencyProjects.setHour(10);
        emergencyProjects.code();
        emergencyProjects.setHour(11);
        emergencyProjects.code();
        emergencyProjects.setHour(12);
        emergencyProjects.code();
        emergencyProjects.setHour(13);
        emergencyProjects.code();
        emergencyProjects.setHour(14);
        emergencyProjects.code();
        emergencyProjects.setHour(17);
        emergencyProjects.code();

        //emergencyProjects.setFinish(true);
        //为true时，我们使用下班回家状态
        emergencyProjects.setFinish(false);

        //加班
        emergencyProjects.setHour(19);
        emergencyProjects.code();
        emergencyProjects.setHour(22);
        emergencyProjects.code();
        /**
         * 若新加20点必须回家，则添加强制回家状态；
         * 并在傍晚状态中使其转为强制回家
         */



    }
}
