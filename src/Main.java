public class Main {
    public static void main(String[] args) {
        Commander commander = new Commander();
        MySoldier mySoldier = new MySoldier();
        commander.force(mySoldier, 14);
    }
}
