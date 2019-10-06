public class Televison {
    boolean turnedOnOff;
    // true - TV is turned On, false - turned Off;

    public void turnOn() {
        turnedOnOff = true;
    }

    public void turnOff() {
        turnedOnOff = false;

    }

    public void showStatus() {
        System.out.println("Television in turned on:" + turnedOnOff);
    }
}
