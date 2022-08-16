public class SafeHouse extends NormalLoc{
    public SafeHouse(Player player) {
        super(player, "Safe House", "Health");
    }

    @Override
    public boolean onLocation() {
        if (Cave.isIsFinish() && Forest.isIsFinish() && River.isIsFinish()){
            System.out.println("You have completed all the missions on this island.\n\nYOU ARE THE WINNER.");
            return false;
        }
        System.out.println("You are in the safe house.");
        this.getPlayer().setHealth(this.getPlayer().getDefaultHealth());
        System.out.println("Your healthy is full.");
        return true;
    }

    @Override
    public String getInfo() {
        return super.getInfo() + "It gives you rest and heals you.";
    }

}
