import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);

        int a, ort, sonuc = 0;

        System.out.print("Sayı girin: ");
        a = scan.nextInt();

        while (a != 0) {

            ort = a % 10;
            sonuc += ort;
            a = a / 10;

        }
        System.out.println("Sayının rakamları toplamı: " + sonuc);
    }
}

