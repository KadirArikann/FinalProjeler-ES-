import java.util.Scanner;

public class Proje9 {
    public static void main(String[] args) {
        Scanner tarat = new Scanner(System.in);

        System.out.print("Bir Decimal Sayısı Giriniz: ");
        int decimaal = tarat.nextInt();
        StringBuilder binary = new StringBuilder();
        while (decimaal > 0) {
            binary.insert(0, decimaal % 2);
            decimaal /= 2;
        }
        if (binary.length() == 0) {
            binary.append(0);
        }
        System.out.println("Decimalden Binarye Dönüşen Sayı: " + binary.toString());
        tarat.close();
    }
}
