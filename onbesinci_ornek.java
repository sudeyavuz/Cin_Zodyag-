package JAVA101;
import java.util.Scanner;
public class onbesinci_ornek {
    public static void main(String[] args) {
        int yil ;
        Scanner input = new Scanner(System.in);

        System.out.println("doğum yılınızı giriniz: ");
        yil = input.nextInt();

        if (yil%12==0){
            System.out.println("çin zodyağı burcunuz:Maymun");
        } if (yil%12==1){
            System.out.println("çin zodyağı burcunuz:Horoz");
        } if (yil%12==2){
            System.out.println("çin zodyağı burcunuz:Köpek");
        } if (yil%12==3){
            System.out.println("çin zodyağı burcunuz:Domuz");
        } if (yil%12==4){
            System.out.println("çin zodyağı burcunuz:Fare");
        } if (yil%12==5){
            System.out.println("çin zodyağı burcunuz:Öküz");
        } if (yil%12==6){
            System.out.println("çin zodyağı burcunuz:Kaplan");
        } if (yil%12==7){
            System.out.println("çin zodyağı burcunuz:Tavşan");
        } if (yil%12==8){
            System.out.println("çin zodyağı burcunuz:Ejderha");
        } if (yil%12==9){
            System.out.println("çin zodyağı burcunuz:Yılan");
        } if (yil%12==10){
            System.out.println("çin zodyağı burcunuz:At");
        } if (yil%12==11){
            System.out.println("çin zodyağı burcunuz:Koyun");
        }
    }
}
