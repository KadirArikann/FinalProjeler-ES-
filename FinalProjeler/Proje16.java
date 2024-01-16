import java.util.Scanner;

public class Proje16{
    public static void main(String[] args){
       Scanner tara = new Scanner(System.in);
       System.out.print("Bir Kelime Giriniz: ");
       String yaz = tara.nextLine();
       int harfsayısı =yaz.length();
       System.out.println("Kelime Harf Sayısı: " + harfsayısı);
       tara.close();
       
    }

}

    