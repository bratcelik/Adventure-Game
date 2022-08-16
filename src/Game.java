import java.util.Scanner;

public class Game {
    private Scanner input = new Scanner(System.in);
    private Player player;
    private Location location;


    public void start(){
        System.out.println("Welcome to Adventure Game !");
        System.out.print("Please enter a name : ");
        String playerName = input.nextLine();
        this.player = new Player(playerName);
        System.out.println("Dear " + player.getName() + ", welcome to this dark and foggy island !! Everything that happens here is real!\n");
        player.selectChar();

        while (selectLoc()){

            if (!this.location.onLocation()){
                System.out.println("GAME OVER!!");
                break;
            }
        }

    }

    public boolean selectLoc(){
        Location[] locList = {
                new SafeHouse(this.player),
                new ToolStore(this.player),
                new Cave(this.player),
                new Forest(this.player),
                new River(this.player),
                new Mine(this.player)
        };

            System.out.println("\n  ====== LOCATIONS ======");
        do {
            System.out.println("ID\tLocation Name\t Benefit");
            System.out.println("--\t-------------\t---------");
            for(int i = 0; i < locList.length; i++){
                System.out.printf("%-1d\t%-13s\t%-9s\t-->%s\n",i+1,locList[i].getName(),locList[i].getBenefit(),locList[i].getInfo());
            }
            System.out.print("\nPlease select a Location ID ('-1' for Exit): ");
            int selectLoc = input.nextInt();

            if (selectLoc ==-1){
                return false;
            }

            if (selectLoc > 0 && selectLoc <= locList.length){
                this.location = locList[selectLoc-1];
                break;
            }
            else {
                System.out.println("Invalid Value! Try again.");
            }
        }while (true);

        return true;
    }
}
