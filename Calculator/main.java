package Calculator;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        aritmatika calculator = new aritmatika();
        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.println("==========Kalkulator=========");
            System.out.println("1. Penjumlahan");
            System.out.println("2. Pengurangan");
            System.out.println("3. Pembagian");
            System.out.println("4. Perkalian");
            System.out.println("0. Memberhentikan Program");
            System.out.println("=============================");
            System.out.print("Masukkan perintah :");
            int a = input.nextInt();

            if (a == 1) {
                calculator.tambah(calculator.input1(), calculator.input2());
            } else if (a == 2) {
                calculator.kurang(calculator.input1(), calculator.input2());
            } else if (a == 3) {
                calculator.bagi(calculator.input1(), calculator.input2());
            } else if (a == 4) {
                calculator.kali(calculator.input1(), calculator.input2());
            } else {
                break;
            }
        }

    }
}
