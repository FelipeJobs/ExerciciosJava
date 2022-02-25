import java.util.Scanner;

public class AnosDeUmaPessoa {
    /*Faça um sistema que leia a idade de uma pessoa expressa em anos,
    meses e dias e mostre-a expressa apenas em dias.
     */
    public static void main(String[] args) {
        int idade;
        int meses;
        int dias;
        Scanner input = new Scanner(System.in);
        System.out.println("Qual a sua idade: ");
        idade = input.nextInt();
        System.out.println("quantos meses: ");
        meses = input.nextInt();
        System.out.println("quantos dias: ");
        dias= input.nextInt();
        System.out.println("A sua idade expressa em dias é: " +(idade*365 + meses *30 + dias));



    }
}