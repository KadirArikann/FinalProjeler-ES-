import java.util.Scanner;

public class Proje6 {
    public static void main(String[] args) {
        Scanner tara = new Scanner(System.in);

        System.out.println("Lütfen Sayı Giriniz");

        int[] girensayi = new int[10];

        for (int i = 0; i < 10; i++) {
            System.out.print((i + 1) + ". sayıyı giriniz: ");
            girensayi[i] = tara.nextInt();
        }
        int SayiBuy = girensayi[0];
        int SayiBuySıra = 1;

        for (int i = 1; i < 10; i++) {
            if (girensayi[i] > SayiBuy) {
                SayiBuy = girensayi[i];
                SayiBuySıra = i + 1;
            }
        }
        System.out.println("En büyük sayı: " + SayiBuy);
        System.out.println("En büyük sayı " + SayiBuySıra + ". sırada.");
        
        tara.close();
    }
}
