import java.util.Scanner;
public class Proje2 {
     public static void main(String [] args)
     {
        Scanner ters = new Scanner(System.in);
        System.out.println("Lütfen Kelime Giriniz: ");
        String kelime = ters.nextLine().toLowerCase();
        String tersten="".toLowerCase();
        for(int i=kelime.length() -1;i >=0; i--)
        {
            tersten = tersten + kelime.charAt(i);
            
        }
        System.out.println(tersten);
        if (kelime.equals(tersten)) {
            System.out.println("Bu Kelime Palindromdur");
        } else {
            System.out.println("Bu Kelime Palindrom Değildir");
        }
      ters.close();
    
     }
}
