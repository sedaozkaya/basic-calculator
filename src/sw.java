import java.util.Scanner;

public class sw {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        double n1,n2;
        int select;
        System.out.println("1.sayıyı gir");
        n1=input.nextDouble();
        System.out.println("2.sayıyı gir");
        n2=input.nextInt();
        System.out.println("1-Toplama\n2-Çıkarma\n3-Çarpma\n4-Bölme");
        System.out.println("seçiminiz:");
        select=input.nextInt();
        switch (select){
            case 1:
                System.out.println("sonuç:"+ (n1+n2));
                break;
            case 2:
                System.out.println("sonuç:"+ (n1-n2));
                break;
            case 3:
                System.out.println("sonuç:"+ (n1*n2));
                break;
            case  4:
                if (n2!=0){
                System.out.println("sonuç:"+ (n1/n2));}
                else {
                    System.out.println("0a bölüneemz");
                }
                break;
            default:
                System.out.println("geçersiz");
        }
}}
