import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;
import java.time.format.DateTimeFormatter;

public class Proje14 {

    public static void main(String[] args) {
        Scanner tarih = new Scanner(System.in);

        
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");

        
        System.out.print("Başlangıç tarihini girin (dd.MM.yyyy): ");
        String tarih1Str = tarih.nextLine();
        LocalDate tarih1 = LocalDate.parse(tarih1Str, formatter);

        
        System.out.print("Bitiş tarihini girin (dd.MM.yyyy): ");
        String tarih2Str = tarih.nextLine();
        LocalDate tarih2 = LocalDate.parse(tarih2Str, formatter);

       
        long gunfark = hesaplaTarihFarki(tarih1, tarih2);
        long ayfark = hesaplaAyFarki(tarih1, tarih2);
        long yılfark = hesaplaYilFarki(tarih1, tarih2);

        
        System.out.println("İki tarih arasındaki gün farkı: " + gunfark + " gün");
        System.out.println("İki tarih arasındaki ay farkı: " + ayfark + " ay");
        System.out.println("İki tarih arasındaki yıl farkı: " + yılfark + " yıl");

        tarih.close();
    }

    public static long hesaplaTarihFarki(LocalDate tarih1, LocalDate tarih2) {
        return ChronoUnit.DAYS.between(tarih1, tarih2);
    }

    public static long hesaplaAyFarki(LocalDate tarih1, LocalDate tarih2) {
        return ChronoUnit.MONTHS.between(tarih1, tarih2);
    }

    public static long hesaplaYilFarki(LocalDate tarih1, LocalDate tarih2) {
        return ChronoUnit.YEARS.between(tarih1, tarih2);
    }
}
