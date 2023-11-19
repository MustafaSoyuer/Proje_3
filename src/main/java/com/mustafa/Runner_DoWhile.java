package com.mustafa;

import java.util.Random;
import java.util.Scanner;

public class Runner_DoWhile {
    public static void main(String[] args) {

        /**
         * Do-While Döngüsü :
         * Döngü içerisinde oluşturmuş olduğumuz şart boolean türde true olduğu sürece döngü devam eder,
         * bu true değer false döndüğü takdirde döngüden çıkılır.
         *  * While döngüsünden tek farkı, işleme muhakkak bir kez girmesi ve sonra verilen koşulu kontrol
         *  etmesidir. Bu durumda bu döngünün en az bir kere çalışacağı anlamına gelmektedir.
         *
         *  Syntax :
         *  do{
         *      kod
         *  }while(koşul);
         */

        /**
         * Faktöriyel hesaplama
         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Faktöriyel hesaplanacak sayıyı giriniz");
        int sayi = scanner.nextInt(); // faöktireli hesaplanacak sayıyı dışarıdan alıyoruz
        int faktoriyel = 1;
        int i=1;

        do{
            faktoriyel*=i; // önce işlem
            i++; // döngü içerisinde sayac artımı
        }while (i<=sayi); // sonra koşul kontrolü
        System.out.println(sayi+"!="+faktoriyel);

        System.out.println();
        /**
         *  Sonsuz döngü örneği :
         *  Rastgele atılan iki zarın 6-6 gelene kadar çalıştığı döngü
         */

        Random random = new Random();
        int sayac=1;
        int zar1,zar2;
        do {
            zar1 = random.nextInt(1,7);//1den 7 ye kadar (1 dahil,7 dahil değil)
            zar2 = random.nextInt(1,7);
            if(zar1==6 && zar2==6){
                System.out.println("Bilgisayar "+sayac+" denemesinde 6-6 atmıştır");
                break; // koşul sağlandığında sonsuz döngüyü kırması için break komutu kullanılır.
            }else {
                System.out.println("Bİrinci zar : "+zar1+" İkinci zar : "+zar2+" atmıştır. "+sayac+" deneme");
            }
            sayac++;
        }while (true); // koşul içerisine boolen true değerini verdiğimiz için sonsuz döngü oluşturuldu.







    }//main sonu
}//class sonu
