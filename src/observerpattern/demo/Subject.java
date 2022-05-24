package observerpattern.demo;

/**
 * @Auther:shen7me
 * @Description:DesignPattern
 */

/**
 * 通知者接口
 */
interface Subject {
    void attach(Observer observer);
    void detach(Observer observer);
    void notifyObserver();

    String getSubjectState();
    void setSubjectState(String value);
}
