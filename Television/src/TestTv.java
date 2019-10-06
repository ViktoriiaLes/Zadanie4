public class TestTv {
    public static void main(String[] args) {
        Televison televison = new Televison();
        televison.showStatus();

        televison.turnOn();
        televison.showStatus();

        televison.turnOff();
        televison.showStatus();
    }
}
