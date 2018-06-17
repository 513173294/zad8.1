import java.util.Arrays;
import java.util.Scanner;

public class kolo {
    public static void main(String[] args) {

        Karnet[] karnet = new Karnet[3];

        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < karnet.length; ) {

            System.out.println("podaj imie");
            String imie = scanner.nextLine();
            System.out.println("podaj wiek");
            int age = scanner.nextInt();
            scanner.nextLine();

            Karnet karnetToAdd = new Karnet(imie, age);
            boolean exist = false;

            for(int j = 0; j < i; j++) {
                String obj1 = karnet[j].toString();
                String obj2 = karnetToAdd.toString();

                if(obj1.equals(obj2)) {
                    exist = true;
                    System.out.println("taki element juz istnieje");
                    i--;
                    break;
                }
            }


            if (!exist)
                karnet[i] = karnetToAdd;
            i++;
        }

        System.out.println(Arrays.toString(karnet));
    }
}