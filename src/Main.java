import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int dateOfBirth ;

        Scanner input=new Scanner(System.in);
        System.out.println("Çin Zodyağı Hesaplama");
        System.out.print("Doğum Yılınızı Giriniz: ");
        dateOfBirth=input.nextInt();

        int kalan = dateOfBirth % 12;
        String horoscope= "";

        if (kalan==0){
            horoscope="Maymun";
        }else if(kalan==1){
            horoscope="Horoz";
        }else if(kalan==2){
            horoscope="Köpek";
        }else if(kalan==3){
            horoscope="Domuz";
        }else if(kalan==4){
            horoscope="Fare";
        }else if(kalan==5){
            horoscope="Öküz";
        }else if(kalan==6){
            horoscope="Kaplan";
        }else if(kalan==7){
            horoscope="Tavşan";
        }else if(kalan==8){
            horoscope="Ejderha";
        }else if(kalan==9){
            horoscope="Yılan";
        }else if(kalan==10){
            horoscope="At";
        }else if (kalan==11){
            horoscope="Koyun";
        }else {
            System.out.println("Yanlış Girdiniz !");
        }
        System.out.print("Çin Zodyağı Burcunuz : "+horoscope);
    }
}
