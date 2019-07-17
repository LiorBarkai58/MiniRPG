import java.util.*;

public class Main {
    public static Scanner kb = new Scanner(System.in);

    public static void main(String[] args) {
        Player player = new Player("Player", 50, 3, 1);
        Monster m1 = new Monster("Goblin", 5, 1.5, 1);
        while(1 != 0){
            System.out.println("You enountared a " + m1.getName() + '!');
            System.out.println(m1 + "\n\n");

            System.out.println(player);
            System.out.println(player.getExp());
            player.attack(m1);

            System.out.println(kb.next());
            System.out.println(player.getExp());
        }

    }
}
