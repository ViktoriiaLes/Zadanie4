public class TestTv {
    public static void main(String[] args) {
        Television television = new Television();
        television.showStatus();

        television.turnOn();
        television.showStatus();

        television.turnOff();
        television.showStatus();
    }
}
