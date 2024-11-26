import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int radius, centralAngle;

        double PI = 3.14, area, perimeter, angleArea;

        System.out.print("Yarıçapı giriniz => ");
        radius = input.nextInt();

        System.out.print("Merkez açıyı giriniz => ");
        centralAngle = input.nextInt();

        area = PI * radius * radius;

        perimeter = 2 * PI * radius;

        angleArea = ((PI * (radius*radius) * centralAngle) / 360);

        System.out.println("Dairenin alanı => " + area);
        System.out.println("Dairenin çevresi => " + perimeter);
        System.out.println("Daire diliminin alanı => " + angleArea);

    }
}
