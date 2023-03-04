import java.util.Scanner;

public class Mainproject2 {

    public static void main(String[] args) {
    System.out.println("Вариант 4, РИБО-04-21,  Коргуева Олеся");
    Scanner sood = new Scanner(System.in);
    System.out.println("Plant or Home plant? ");
    String plantType = sood.nextLine();
    
    System.out.println("What variety? ");
    String variety = sood.nextLine();
    
    System.out.println("What name? ");
    String name = sood.nextLine();
    
    System.out.println("What color? ");
    String color = sood.nextLine();
    
    if (plantType.equals("Plant")){
        Plant plant = new Plant(variety, name, color);
        System.out.println(plant.toString());
        }
    else if (plantType.equals("Home plant")){
        System.out.println("What plant high? ");
        int plantHeight = Integer.parseInt(sood.nextLine());

        System.out.println("What pot is it? ");
        int pot = Integer.parseInt(sood.nextLine());

        System.out.println("What a smell? ");
        int smell = Integer.parseInt(sood.nextLine());
        
        HomePlant plant = new HomePlant(height, pot, smell, variety, name, color);
        System.out.println(plant.toString());
        }
    }
}