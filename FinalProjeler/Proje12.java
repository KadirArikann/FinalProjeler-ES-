import java.util.Scanner;

public class Proje12 {

    public static void main(String[] args) {
        Scanner yazScanner = new Scanner(System.in);

        System.out.print("Kaydırma Yapılacak Metni Giriniz:  ");
        String kelime = yazScanner.nextLine();

        System.out.print("Kaydırma Yapılma Sayısını Giriniz: ");
        int kaydirmaSayisi = yazScanner.nextInt();
        for (int kaydırma = 1; kaydırma <= kaydirmaSayisi; kaydırma++) {
            System.out.println("Kaydırma " + kaydırma + ": " + yazıkaydır(kelime, kaydırma));
        }

        yazScanner.close();
    }

    public static String yazıkaydır(String kelime, int kaydırma) {
        int kelimeuzunluk = kelime.length();
        StringBuilder sonuc = new StringBuilder();

        for (int i = 0; i < kelimeuzunluk; i++) {
            int indeks = (i + kaydırma) % kelimeuzunluk;
            sonuc.append(kelime.charAt(indeks));
        }

        return sonuc.toString();
    }
}
