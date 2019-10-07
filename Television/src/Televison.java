public class Television {
    boolean state;
    // true - TV is turned On, false - turned Off;

    public void turnOn() {
        state = true;
    }

    public void turnOff() {
        state = false;
    }

    public void showStatus() {
        System.out.println("Television in turned on:" + state);
    }
}
