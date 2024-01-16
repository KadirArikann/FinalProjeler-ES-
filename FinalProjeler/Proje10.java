public class Proje10 {
    public static void main(String[] args) {
        System.out.println("0'dan 20ya Kadar Olan Asal Sayılar");
        System.out.println("0 Asal Sayı Değildir");
        System.out.println("1 Asal Sayı Değildir");
        for (int girilensay = 2; girilensay <= 20; girilensay++) {
            boolean asal = true;
            for (int i = 2; i < girilensay; i++) {
                if (girilensay % i == 0) {
                    asal = false;
                    break;
                }
            }
            
            if (asal) {
                
                System.out.println(girilensay + " Asal Sayıdır");
            } else {
                System.out.println(girilensay + " Asal Sayı Değildir");
            }
        }
    }
}

     