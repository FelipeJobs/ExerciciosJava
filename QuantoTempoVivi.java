import java.util.Scanner;

public class QuantoTempoVivi {
    /*Fa�a um sistema que leia a idade de uma pessoa expressa em dias e mostre-a
    expressa em anos, meses e dias.

     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int dias,meses,anos;
        System.out.println("Qual � o total de dias que voc� j� viveu? ");
        dias = input.nextInt();
        anos = dias/365;
        dias = dias - 365*anos;
        meses = dias/30;
        dias = dias -meses*30;
        System.out.println("Voc� j� viveu " + anos + " anos " + meses + " meses e " + dias + " dias." );
        input.close();
    }
}
