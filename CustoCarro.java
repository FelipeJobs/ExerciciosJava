import java.util.Scanner;
/* O custo ao consumidor de um carro novo � a soma do custo de f�brica com a
percentagem do distribuidor e dos impostos (aplicados ao custo de f�brica).
Supondo que a percentagem do distribuidor seja de 28% e os impostos de 45%,
escrever um sistema que leia o custo de f�brica de um carro e escreva o custo ao
consumidor.
 */
public class CustoCarro {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double custo,fabrica,distribuidor,impostos;
        String nome;
        System.out.print("Qual � o seu nome? ");
        nome = input.next();
        System.out.print("Qual � o valor de f�brica do carro? R$: ");
        fabrica = input.nextDouble();
        distribuidor = fabrica *0.28;
        impostos = fabrica * 0.45;
        custo = fabrica+impostos+distribuidor;
        System.out.println("O custo do carro para voc� " + nome + " � R$: " + custo + " reais.");
        input.close();
    }
}