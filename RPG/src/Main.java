import java.util.*;

public class Main {
    public static Scanner kb = new Scanner(System.in);

    public static void main(String[] args) {
        Monster goblin = new Monster("lava giants", 5, 1.5, 1);
        Monster darkElf = new Monster("Dark Elf", 8, 3, 1);
        Monster ogre = new Monster("Ogoblin", 12, 1, 1);
        Monster Naga = new Monster( "Naga" , 15 , 2, 1);
        Monster[] monsters = {goblin, darkElf, ogre, Naga};
        Player player = new Player("Player", 50, 3, 1);
        Monster m1 = monsters[(int)(Math.random()*4)].copy();

        while(player.getHP() > 0){
            if (m1.getHP() <= 0) {
                m1 = monsters[(int) (Math.random() * 4)].copy();
                System.out.println("you have encountered a " + m1.getName() + '!');
            }
            System.out.println(player + "\n\n");
            System.out.println(m1 + "\n");

            System.out.println("what would you like to do?");
            System.out.println("1 - exchange blows");
            System.out.println("2 - enter the shop");
            int choice;
            do{
                choice = kb.nextInt();
            }while((choice != 1) && (choice != 2));
            if (choice == 1) {
                player.attack(m1);
                m1.attack(player);
            }
            else{
                System.out.println("what would you like to do with your exp?");
                System.out.println("1 - sharpen your sword and increase your attack by 2 (20 EXP)");
                System.out.println("2 - heal for 7HP (30 EXP)");
                System.out.println("3 - upgrade your armor and gain 1 extra armor (31 EXP");
                System.out.println("4 - Exit the shop");
                do{
                    choice = kb.nextInt();
                    switch (choice){
                        case 1:
                            if (player.getExp() > 20) {
                                player.setAttack(player.getAttack() + 2);
                                player.setExp(player.getExp() - 20);
                            }
                            else
                                System.out.println("you have insufficient funds for this purchase ");
                            break;
                        case 2:
                            if (player.getExp() > 30){
                                if (player.getHP()+7 < player.getMaxHP())
                                    player.setHP(player.getHP()+7);
                                else
                                    player.setHP(player.getMaxHP());
                                player.setExp(player.getExp()-30);
                            }
                            else
                                System.out.println("you have insufficient funds for this purchase ");
                            break;
                        case 3:
                            if (player.getExp() > 31){
                                player.setArmor(player.getArmor()+1);
                                player.setExp(player.getExp() - 31);
                            }
                            break;
                        default:
                            System.out.println("you have entered an incorrect number, please try again");
                            break;
                    }

                }while(choice <0 ||choice > 5);
            }




        }
        System.out.println("game over, your final stats were : ");
        System.out.println(player);

    }
}
