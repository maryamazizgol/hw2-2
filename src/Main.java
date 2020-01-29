import java.util.Scanner;

/**
 * Created by MM on 10/5/2019.
 */
public class Main {

    public static void main(String[] args) {
        MadarManteghi a = new MadarManteghi();

        Riazi2 b = new Riazi2();

        MadarElc c = new MadarElc();

        Fizik2 d = new Fizik2();


        System.out.println("choose num between 1-4:1)madarmanteghi  2)riazi2  3)madarelc  4)fizik2");
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        int i = Integer.parseInt(str);
        if (i == 1) {
            a.ph();


        } else if (i == 2) {
            b.ph();
        } else if (i == 3) {
            c.ph();
        } else if (i == 4) {
            d.ph();
        }


    }
}