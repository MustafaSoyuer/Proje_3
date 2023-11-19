package com.mustafa;

import java.util.Random;
import java.util.Scanner;

public class Runner_While {
    public static void main(String[] args) {

        /**
         *  While :
         *  Döngülerinde, tekrar sayısı belli değildir. Döngü içerisinde oluşturmuş olduğumuz şart boolean türde
         *  true olduğu sürece döngü devam eder, bu true değer false döndüğü takdirde döngüden çıkılır ve program
         *  döngünün bittiği yerden çalışmaya devam eder. Anlamsal olarak "iken" anlamına gelen while kelimesini
         *  "x şartımız y değerinden küçük iken bu kodları çalıştır" şeklinde düşünebiliriz.
         *
         *  Sytnax :
         *  while(koşul){
         *      kod
         *  }
         */

        /**
         *  While döngüsü ile faktöriyel hesabı
         */
        Scanner scanner =new Scanner(System.in);
        System.out.println("Faktöriyel hesaplanacak sayıyı giriniz");
        int sayi = scanner.nextInt(); // hangi sayının faktöriyeli hesaplanacak kullanıcıdan aldık
        int i=1, faktoriyel=1;
        while (i<=sayi){ // koşulumuz, sayacımız girdiğimiz sayıya eşit olana kadar
            faktoriyel*=i; // sonucumuzu sayac ile çarparak tekrar sonucumuza atıyoruz
            i++; // sayacımızı döngü içinde arttırıyoruz
        }
        System.out.println(sayi+"!="+faktoriyel);


        System.out.println();
        /**
         * Sonsuz döngü örneği :
         * Rastgele atılan iki zarın 6-6 gelene kadar çalıştığı döngü
         */
        Random random =new Random(); // Random sınıfından nesne üretiyoruz
        int sayac=1;
        while(true){ // koşul sürekli doğru olduğu için sonsuz döngü oluşturmuş oluruz.
            int zar1 = random.nextInt(1,7);//1den 7 ye kadar (1 dahil,7 dahil değil)
            int zar2 = random.nextInt(1,7);
            if(zar1==6 && zar2==6){
                System.out.println("Bilgisayar "+sayac+" denemesinde 6-6 atmıştır");
                break; // koşul sağlandığında sonsuz döngüyü kırması için break komutu kullanılır.
            }else {
                System.out.println("Bİrinci zar : "+zar1+" İkinci zar : "+zar2+" atmıştır. "+sayac+" deneme");
            }
            sayac++;
        }



    }// main sonu
}// class sonu
