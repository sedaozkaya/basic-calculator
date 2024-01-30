import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.println("Simple Calculator created by Seda");

        Scanner input= new Scanner(System.in);
        int n1,n2,select;
        System.out.println("1.sayıyı gir");
        n1=input.nextInt();
        System.out.println("2.sayıyı gir");
        n2=input.nextInt();
        System.out.println("1-Toplama\n2-Çıkarma\n3-Çarpma\n4-Bölme");
        System.out.println("seçiminiz:");
        select=input.nextInt();
        if (select==1){
            System.out.println("sonuç:"+ n1+n2);
        }
        else if (select==2){
            System.out.println("sonuç:"+ (n1-n2));
        }
        else if (select==3){
            System.out.println("sonuç:"+ (n1*n2));
        }
        else if (select==4){
            if (n2!=0){
            System.out.println("sonuç:"+ (n1/n2));}
            else {
                System.out.println("0 a bölünemez");
            }
        }
        else {
            System.out.println("geçrsiz");
        }

    }
}
