import java.util.Scanner;
public class CiftSayilar {
    public static void main(String[] args) {
        Scanner girdi = new Scanner(System.in);
        int sayi, i, toplam =0;
        while(true){
            System.out.println("Sayı giriniz :");
            sayi = girdi.nextInt();

            if(sayi % 2 == 1){
                break;
            }
            if(sayi % 2 == 0 && sayi % 4 == 0){
                toplam += sayi;
            }
        }
        System.out.println(toplam);
    }
}
