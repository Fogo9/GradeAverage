import java.util.Scanner;

public class Main{
    public static void main(String[] args) {

        int mathematics, physics, chemical, turkish, history, music;

        Scanner input   =   new Scanner(System.in);

        System.out.print("Your Mathematics Grade :");
        mathematics = input.nextInt();

        System.out.print("Your Physics Grade :");
        physics = input.nextInt();

        System.out.print("Your Chemical Grade :");
        chemical = input.nextInt();

        System.out.print("Your Turkish Grade :");
        turkish = input.nextInt();

        System.out.print("Your History Grade :");
        history = input.nextInt();

        System.out.print("Your Music Grade :");
        music = input.nextInt();

        int total  = (mathematics + physics + chemical + turkish + history + music);

        double result    = total / 6;

        System.out.println("Your Average :" + result);


        int a = 60, b = 60;

        boolean value1 = result > a;
        boolean value2 = result > b;

        boolean name1 = value1 || value2;
        boolean name2 = (result > a) || (result > b);

        String str = (name2) ? "Passed The Class" : "Failed The Class";

        System.out.println(str);








    }
}
