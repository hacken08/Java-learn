package home;

import java.util.Scanner;

public class Archii {

    public static void main(String[] argh) {

        Scanner input = new Scanner(System.in);

        System.out.print("Who is changing clothes = ");
        String name = input.nextLine();

        Child_Clothes Archii = new Child_Clothes(
            "red", 
            38, name, 
            5, 
            true
        );
        
        Archii.output(name);
    }
}

class Cloths {

    int totalClothes;
    Boolean UpperOrDownCloth;

    Cloths(int totalClothes, boolean UpperOrDownCloth, String name) {

        this.totalClothes = totalClothes;
        this.UpperOrDownCloth = UpperOrDownCloth;
        wearing(name, false);

    }

    void wearing(String name, boolean wearing) {

        if (wearing == false) {
            System.out.println("status: " +name + " is still naked ;) ");
            return;
        } else {
            System.out.println(name + " is wearing clothes... ");
            System.out.println(name + " is in clothes :( ");
        }
    }
}

class Child_Clothes extends Cloths {

    String favColor;
    int size;
    String name;

    /**
     * @param favColor
     * @param size
     * @param name
     * @param totalClothes
     * @param UpperOrDownCloth
     */
    Child_Clothes(
            String favColor,
            int size,
            String name,
            int totalClothes,
            Boolean UpperOrDownCloth) {

        super(totalClothes, UpperOrDownCloth, name);
        this.favColor = favColor;
        this.size = size;
        this.name = name;
    }

    void removing(String name, boolean wearing) {

        if (wearing == false) {
            System.out.println("status: " + name + " is in cloths  :( \n");
            return;
        } else {
            System.out.println(name + " is removing clothes... ");
            System.out.println(name + " is now naked ;) ");
        }
    }

    void output (String name) {
        
        Scanner input = new Scanner(System.in);
        System.out.println();
        System.out.println("--------------------------------");

        System.out.print("sure want to wear = ");
        boolean confirm = input.nextBoolean();
        wearing(name, confirm);

        System.out.println();

        System.out.print("sure want to remove = ");
        confirm = input.nextBoolean();
        removing(name, confirm);
    }

}