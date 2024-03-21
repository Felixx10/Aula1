package Chm;

import java.util.Scanner;

public class Exerciciomf {

public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Digite o número de horas: ");
    int horas = scanner.nextInt();

    int minutos = horas * 60;

    System.out.println(horas + " horas equivalem a " + minutos + " minutos.");
    
    System.out.println("#################################");

    System.out.print("Digite a idade em anos: ");
    
    int idadeAnos = scanner.nextInt();
    int idadeDias = idadeAnos * 365;

    System.out.println("A idade de " + idadeAnos + " anos equivale a aproximadamente " + idadeDias + " dias.");

    System.out.println("#################################");

    
    System.out.print("Digite um número: ");
    double numero = scanner.nextDouble();

    double quadrado = numero * numero;

    System.out.println("O quadrado de " + numero + " é: " + quadrado);

    System.out.println("#################################");


    System.out.print("Digite o primeiro número: ");
    int primeiroNumero = scanner.nextInt();

    System.out.print("Digite o segundo número: ");
    int segundoNumero = scanner.nextInt();

    int modulo = primeiroNumero % segundoNumero;

    System.out.println(" O modulo de " + primeiroNumero + " e " + segundoNumero + " é " + modulo);

    System.out.println("#################################");

    }
}
