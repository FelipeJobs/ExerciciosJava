import java.util.Scanner;

/*Fa�a um sistema que leia o tempo de dura��o de um evento em uma f�brica
expressa em segundos e mostre-o expresso em horas, minutos e segundos.
 */
public class ConversaoDeTempo {
    public static void main(String[] args) {
        int tempo,horas,minutos;
        Scanner input = new Scanner(System.in);
        System.out.print("Qual foi o tempo de dura��o do evento em segundos: ");
        tempo = input.nextInt();
        horas = tempo/3600;
        tempo = tempo - (horas*3600);
        minutos = tempo/60;
        tempo = tempo - minutos*60;
        System.out.println("O evento durou " + horas + " horas, " + minutos + " minutos e " + tempo + " segundos." );
        input.close();
    }
}