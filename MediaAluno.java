import java.util.Scanner;

/* Faça um sistema que leia as 3 notas de um aluno e calcule a média final
deste aluno. Considerar que a média é ponderada e que o peso das notas
é: 2,3 e 5, respectivamente.
 */
public class MediaAluno {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double n1=0,n2=0,n3=0,media;
        int cont;
        for(cont =0; cont <3;cont++){
            if(cont ==0){
            System.out.print("Digite a " + (cont+1) + "º nota: ");
            n1 = input.nextDouble()*2;}
            if(cont==1){
                System.out.print("Digite a " + (cont+1) + "º nota: ");
                n2 = input.nextDouble()*3;}
            if(cont==2){
                System.out.print("Digite a " + (cont+1) + "º nota: ");
                n3 = input.nextDouble()*5;}
            }
        media = (n1+n2+n3)/10;
        System.out.println("A média do aluno é: " + media);
        input.close();
            }

    }
