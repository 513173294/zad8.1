import java.awt.image.Kernel;
import java.util.Arrays;
import java.util.Scanner;

public class kolo {
    public static void main(String[] args) {

        Karnet marek = new Karnet("Marek,", 3);
        Karnet[] karnet = new Karnet[3];
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < karnet.length; i++) {

            System.out.println("podaj imie");
            String imie = scanner.nextLine();
            System.out.println("podaj wiek");
            int age = scanner.nextInt();
            scanner.nextLine();
            karnet[i] = new Karnet(imie, age);

            }
            System.out.println(Arrays.toString(karnet));

        }


    }
