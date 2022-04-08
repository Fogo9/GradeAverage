import java.util.Scanner;

public class Main{
    public static void main(String[] args) {

        int matematik, fizik, kimya, turkce, tarih, muzik;

        Scanner input   =   new Scanner(System.in);

        System.out.print("Matematik Notunuz :");
        matematik = input.nextInt();

        System.out.print("Fizik Notunuz :");
        fizik = input.nextInt();

        System.out.print("Kimya Notunuz :");
        kimya = input.nextInt();

        System.out.print("Türkçe Notunuz :");
        turkce = input.nextInt();

        System.out.print("Tarih Notunuz :");
        tarih = input.nextInt();

        System.out.print("Müzik Notunuz :");
        muzik = input.nextInt();

        int toplam   = (matematik + fizik + kimya + turkce + tarih + muzik);

        double sonuc    = toplam / 6;

        System.out.println("Ortalamanız :" + sonuc);


        int a = 60, b = 60;

        boolean ort1 = sonuc > a;
        boolean ort2 = sonuc > b;

        boolean deger1 = ort1 || ort2;
        boolean deger2 = (sonuc > a) || (sonuc > b);

        String str = (deger2) ? "Sınıfı Geçti" : "Sınıfta Kaldı";

        System.out.println(str);








    }
}

