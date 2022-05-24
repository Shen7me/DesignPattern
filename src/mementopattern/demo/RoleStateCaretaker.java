package mementopattern.demo;

/**
 * @Auther:shen7me
 * @Description:DesignPattern
 */
public class RoleStateCaretaker {
    public RoleStateMemento roleStateMemento;

    public RoleStateMemento getRoleStateMemento() {
        return roleStateMemento;
    }

    public void setRoleStateMemento(RoleStateMemento roleStateMemento) {
        this.roleStateMemento = roleStateMemento;
    }
}
