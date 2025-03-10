package edu.andrey.segundasemana;

import java.util.Scanner;

public class SegundaSemana {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println("Digite um numero: ");
        for (int i = 1; i <= a; i++) {
            System.out.println(i);
        }
    }
}

