package com.mustafa;

import java.util.Random;
import java.util.Scanner;

public class Runner_For {
    public static void main(String[] args) {

        /**
         * For döngüsü :
         * İçerisinde belirleyeceğimiz koşul doğru olduğu sürece içerisindeki kod satırları çalışır ve
         * koşul sağlanmadığı takdirde işlem sonlandırılır.
         *
         * Syntax :
         * for(sayac tanımı,başlangıç değeri ; koşul ; sayac artım veya azalım miktarı)
         * for döngüsünü içerisinde değişken tanımlaması yapabileceğimiz gibi dışarıdan alacağımız
         * verileri de kullanabiliriz.
         */

        /**
         * For döngüsü ile faktöriyel hesaplama
         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Faktöriyel hesaplanacak sayıyı giriniz");
        int sayi = scanner.nextInt(); // faöktireli hesaplanacak sayıyı dışarıdan alıyoruz
        int faktoriyel = 1; // int i =1 şekilde sayac döngü dışında da tanımlanabilir
        for(int i = 1 ; i<=sayi ; i++){ // (sayacın tanımı başlangıcı; koşul ; sayacın artım şekli)
            faktoriyel*=i;
        }
        System.out.println(sayi+"!="+faktoriyel);

        System.out.println();
        /**
         * Sonsuz döngü örneği :
         * Rastgele atılan iki zarın 6-6 gelene kadar çalıştığı döngü
         */

        Random random = new Random();
        int zar1, zar2;
        for(int i=1;i>0;i++ ) { // burada sayacı 1 den başlatıp koşul olarak 0 dan büyük olana kadar sayacın
                                //çalışmasını isteyerek sonsuz bir döngü başlatmış oluyoruz ayrıca
                                //bu döngü for(int i=1; ; i++) şeklinde de koşul boş bırakılarak da kurulabilir
            zar1= random.nextInt(1,7); // 1dahil 7 değil rastgele sayı üretir
            zar2= random.nextInt(1,7);
            if (zar1 == 6 && zar2 == 6){
                System.out.println("Bilgisayar "+i+" denemesinde 6-6 atmıştır");
                break; // koşul sağlandığında sonsuz döngüyü kırması için break komutu kullanılır.
            }else {
                System.out.println("Bİrinci zar : "+zar1+" İkinci zar : "+zar2+" atmıştır. "+i+" deneme");

            }
        }







    }// main sonu
}// class sonu