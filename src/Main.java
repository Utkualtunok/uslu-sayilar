import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n,k;
        int toplam = 1 ;
        //Kullanıcı veri girişi
        Scanner inp = new Scanner(System.in);
        System.out.println("Üssü alınacak sayı : ");
        n = inp.nextInt();
        System.out.println("Üs olacak sayı : ");
        k = inp.nextInt();
        //Üs alma işlemleri
        for (int i = 1; i <= k ; i++) {
          toplam *= n;
        }
        System.out.println("Cevap : " + toplam);
    }
}