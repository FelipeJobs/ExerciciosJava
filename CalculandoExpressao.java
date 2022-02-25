import java.util.Scanner;
/*Escreva  um sistema que leia tr�s n�meros inteiros e positivos (A, B, C)
e calcule a seguinte express�o: d = r+s/2
, onde r = (a+b)� e s= (b+c)�
 */
public class CalculandoExpressao {
    public static void main(String[] args) {
        int a,b,c,r,s;
        double d;
        Scanner input = new Scanner(System.in);
        System.out.print("Qual � o valor de A: ");
        a= input.nextInt();
        System.out.print("Qual � o valor de B: ");
        b= input.nextInt();
        System.out.print("Qual � o valor de C: ");
        c= input.nextInt();
        if(a < 0 || b< 0 || c<0){
            System.out.print("Voc� n�o pode digitar valores negativos, tente novamente.");
        }
        if(a > 0 && b> 0 && c>0){
            r = (int) Math.pow((a+b),2);
            s = (int) Math.pow((b+c),2);
            d= (r+s)/2;
            System.out.println("O valor da express�o �: " + d);}
        input.close();
    }
}
