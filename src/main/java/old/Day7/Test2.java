package old.Day7;

import java.util.Random;

public class Test2 {
    public static void main(String[] args) {
        Player player = new Player();
        Random random = new Random();


        for (int i=0; i<100;i++){
            System.out.println(player.stamina = random.nextInt(11)+90);
        }

    }
}
