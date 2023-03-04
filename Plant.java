public class Plant {
    private String variety;
    private String name;
    private String color;

    public Plant(String variety, String name, String color) {
        this.variety = variety;
        this.name = name;
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getVariety() {
        return variety;
    }

    public void setVariety(String variety) {
        this.variety = variety;
    }

    public String getPhoneName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public void waterPlant(String waterPlant) {
        System.out.println(name+ " was watering by you ");
    }
    public void palntInspo() {
        System.out.println("That "+ variety+" so beautiful ");
    }
    public void dangerPlant() {
        System.out.println("That "+ color+" so dangerous ");
    }

    @Override
    public String toString() {
        return "variety= " + variety + ", name= " + name + ", color= " + color;
    }
    
}