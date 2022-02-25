import java.util.Scanner;
/* O custo ao consumidor de um carro novo é a soma do custo de fábrica com a
percentagem do distribuidor e dos impostos (aplicados ao custo de fábrica).
Supondo que a percentagem do distribuidor seja de 28% e os impostos de 45%,
escrever um sistema que leia o custo de fábrica de um carro e escreva o custo ao
consumidor.
 */
public class CustoCarro {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double custo,fabrica,distribuidor,impostos;
        String nome;
        System.out.print("Qual é o seu nome? ");
        nome = input.next();
        System.out.print("Qual é o valor de fábrica do carro? R$: ");
        fabrica = input.nextDouble();
        distribuidor = fabrica *0.28;
        impostos = fabrica * 0.45;
        custo = fabrica+impostos+distribuidor;
        System.out.println("O custo do carro para você " + nome + " é R$: " + custo + " reais.");
        input.close();
    }
}