import java.text.DecimalFormat;
import java.util.Scanner;
/*Construa um programa em c que, tendo como dados de entrada dois pontos
quaisquer no plano, P(x1, y1) e P(x2, y2), escreva a distância entre eles.
 */
public class DistanciaEntre2Pontos {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        DecimalFormat formatador = new DecimalFormat("0.00");
        double d,x1,x2,y1,y2,ry,rx;
        System.out.print("Qual a coordenada de X1? ");
        x1= input.nextDouble();
        System.out.print("Qual a coordenada de Y1? ");
        y1= input.nextDouble();
        System.out.print("Qual a coordenada de X2? ");
        x2= input.nextDouble();
        System.out.print("Qual a coordenada de Y2? ");
        y2= input.nextDouble();
        rx = Math.pow((x1-x2),2);
        ry = Math.pow((y1-y2),2);
        d = Math.sqrt((rx+ry));
        System.out.println("A distância entre esses dois pontos é: "+ formatador.format(d) + " metros.");
    }
}
