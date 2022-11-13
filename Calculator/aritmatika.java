package Calculator;

import java.util.Scanner;

public class aritmatika {
    Scanner scan = new Scanner(System.in);

    void tambah(double a, double b) {
        System.out.println("Pemambahan antara " + Math.round(a) + " dan " + Math.round(b) + " Adalah " + (a + b));
    }

    void kurang(double a, double b) {
        System.out.println("Pengurangan antara " + Math.round(a) + " dan " + Math.round(b) + " adalah " + (a - b));
    }

    void bagi(double a, double b) {
        System.out.println("Pembagian antara " + Math.round(a) + " dan " + Math.round(b) + " Adalah "
                + Math.round(a / b * 100.0) / 100.0);
    }

    void kali(double a, double b) {
        System.out.println("Perkalian antara " + Math.round(a) + " dan " + Math.round(b) + " Adalah " + a * b);
    }

    double input1() {
        System.out.print("Masukkan Nilai 1 :");
        double a = scan.nextDouble();
        return a;
    }

    double input2() {
        System.out.print("Masukkan Nilai 2 :");
        double b = scan.nextDouble();
        return b;
    }
}