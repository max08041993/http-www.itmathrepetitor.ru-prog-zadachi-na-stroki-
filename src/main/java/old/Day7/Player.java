package old.Day7;

public class Player {
    public int getStamina() {
        return stamina;
    }

    public int stamina;
    private final int MAX_STAMINA=100;
    private final int MIN_STAMINA=0;

    private static int countPlayers = 0;

    public int run(){
        int aaa = getStamina();
        stamina=aaa-1;
        if (stamina == MIN_STAMINA){
            System.out.println("Нужен отдых, ты покидаешь поле");
            return 0;
        }
        return stamina;
    }

    public void info(){
        if (countPlayers<6){
            System.out.println("Команды неполные. На поле еще есть " + (6-countPlayers) +
                    " свободных мест");
        }else if (countPlayers>6){
            System.out.println("На поле нет свободных мест”");
        }
    }

}
