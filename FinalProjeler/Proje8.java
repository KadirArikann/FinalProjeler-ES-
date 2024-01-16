public class Proje8{
    public static void main(String args[]) {
        
        int maxfibonaccisayı = 20; 
        long[] fibonnaciserisi = new long[maxfibonaccisayı];
        fibonnaciserisi[0] = 0;
        fibonnaciserisi[1] = 1;
        for (int i = 2; i < maxfibonaccisayı; i++) {
            fibonnaciserisi[i] = fibonnaciserisi[i - 1] + fibonnaciserisi[i - 2];
        }
        System.out.println("Fibonacci serisinin ilk " +  maxfibonaccisayı  + " sayısının dizileri");
        for (int i = 0; i < maxfibonaccisayı; i++) {
            System.out.print(fibonnaciserisi[i] + " ");
        }
        }
        
}