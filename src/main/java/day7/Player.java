package day7;

public class Player {

    private int stamina;
    private static int countPlayers;
    public final int MAX_STAMINA = 100;
    public final int MIN_STAMINA = 0;

    public int getStamina() {
        return stamina;
    }

    public static int getCountPlayers() {
        return countPlayers;
    }

    public Player(int stamina){
        this.stamina = stamina;
        if (countPlayers < 6)
         countPlayers++;
    }


    public void run(){
        if (stamina == 0)
            return ;

        stamina--;

        if (stamina == 0)
            countPlayers--;
    }



    public static void info(){
        if (countPlayers == 5){
            System.out.println("Команды не полные, на поле есть ещё 1 место.");
        }else if (countPlayers == 4){
            System.out.println("Команды не полные, на поле есть ещё 2 места.");
        } else if (countPlayers < 6){
            System.out.println("Команды неполные, на поле есть ещё " + (6 - countPlayers) + " мест.");
        }else {
            System.out.println("На поле нет свободных мест");
        }
    }
}
