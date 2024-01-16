import java.util.Scanner;
public class Proje13 {
    public static void main(String[] args)
    {
        Scanner taraacı1 = new Scanner(System.in);
        System.out.print("1.Açı Giriniz: ");
        int acı1=taraacı1.nextInt();
        Scanner taraacı2 = new Scanner(System.in);
        System.out.print("2.Açı Giriniz: ");
        int acı2=taraacı2.nextInt();
        Scanner taraacı3 = new Scanner(System.in);
        System.out.print("3.Açı Giriniz: ");
        int acı3=taraacı3.nextInt();
        int eskenar = acı1+acı2+acı3; 
        if(eskenar!=180)
        {
            System.out.println("Üçgen Oluşamaz");
        }
        else if(acı1+acı2+acı3==180)
        {
            if (acı1==acı2 && acı2==acı3 )
            {
               System.out.println("Eşkenar Üçgen Oluşabilir");
            }
            else if ((acı1==acı2 && acı2!=acı3)  || (acı1==acı3 && acı1 !=acı2) || (acı2==acı3 && acı1 !=acı3))
            {
              System.out.println("İkizKenar Üçgen Oluşabilir");
            }
            else if ((acı1==90) || (acı2==90) || (acı3==90))
            {
                System.out.println("DikKenar Üçgen Oluşabilir");
            }

        }
        taraacı1.close();
        taraacı2.close();
        taraacı3.close();
    }
    
}
