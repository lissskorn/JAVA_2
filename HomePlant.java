public class HomePlant extends Plant {
    private int plantHeight;
    private int pot;
    private int smell;

    public HomePlant(int height, int pot, int smell, String variety, String name, String color) {
        super(variety, name, color);
        this.plantHeight = height;
        this.pot = pot;
        this.smell = smell;
    }

    public int getHeight() {
        return plantHeight;
    }

    public void setHeight(int height) {
        this.plantHeight = height;
    }

    public int getPot() {
        return pot;
    }

    public void setPot(int pot) {
        this.pot = pot;
    }

    public int getSmell() {
        return smell;
    }

    public void setSmell(int smell) {
        this.smell = smell;
    }
    
    public void smellPlant(){
        System.out.println("So pleasant smell");
    }
    
    public void showPot(){
        System.out.println("Wow this "+ this.getPot()+ " is so suitable");
    }
    
    public void plantHigh(){
        System.out.println("This plant is  "+ plantHeight +" centimeters' high ");
    }

    @Override
    public String toString() {
        return "height= " + plantHeight + ", pot= " + pot + ", smell= " + smell
                + ", variety= " + getVariety() + ", name= " + getName() + ", color= " + getColor();
    }
    
}