import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int a, b, toplam, faca = 1, facb = 1, facab = 1;

        Scanner input = new Scanner(System.in);
        System.out.print("Hangi sayının kombinasyonunu almak istiyorsunuz ? Giriniz : ");
        a = input.nextInt();
        System.out.print("Kaçlı kombinasyon almak istediğinizi yazınız : ");
        b = input.nextInt();

        for (int i = 1; i<=a; i++){
            faca *= i;
        }

        for (int i = 1; i<=b; i++){
            facb *= i;
        }

        for (int i = 1; i <= (a-b); i++){
            facab *= i;
        }

        toplam = faca/(facb*facab);
        System.out.println("Buyrun : " + toplam);

    }
}