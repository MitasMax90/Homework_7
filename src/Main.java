public class Main {
    public static void main(String[] args) {
        Commander commander = new Commander();
        /* Реализуем работу через анонимный класс,
         для этого не нужно будет создавать класс MySoldier и объект этого класса */
        commander.force(new Soldier() {
            @Override
            public String workingDays(int countOfDays) {
                return "Я кошу траву " + countOfDays + " дней";
            }
        }, 17);
    }
}
