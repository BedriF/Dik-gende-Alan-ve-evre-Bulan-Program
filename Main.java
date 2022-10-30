import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        double alan,kenar1,kenar2,kenar3,çevre,u;
        Scanner input = new Scanner(System.in);
        System.out.println("1.Kenar uzunluğunu giriniz. : ");
        kenar1 = input.nextDouble();
        Scanner input1 = new Scanner(System.in);
        System.out.println("2.Kenar uzunluğunu giriniz. : ");
        kenar2 = input1.nextDouble();
        Scanner input2 = new Scanner(System.in);
        System.out.println("3.Kenar uzunluğunu giriniz. : ");
        kenar3 = input2.nextDouble();
        u=(kenar1+kenar2+kenar3)/2;
        çevre=2*u;
        alan=Math.sqrt(u*(u-kenar1)*(u-kenar2)*(u-kenar3));
        System.out.println("Üçgenin çevresi :" + çevre);
        System.out.println("Üçgenin alanı :" + alan);

    }
}