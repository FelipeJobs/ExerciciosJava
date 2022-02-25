import java.util.Scanner;
/*Um sistema de equações lineares do tipo:
ax + by =c
dx+dy=f
x = ce-bf/ae-bd
y= af-cd/ae-bd
Escreva um sistema que lê os coeficientes a,b,c,d,e e f e calcula e mostra os
valores de x e y.
 */
public class SistemaDeEquacao {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a,b,c,d,e,f,ce,bf,ae,bd,af,cd,x,y;
        System.out.print("Qual o valor de A? ");
        a= input.nextInt();
        System.out.print("Qual o valor de B? ");
        b=input.nextInt();
        System.out.print("Qual o valor de C? ");
        c=input.nextInt();
        System.out.print("Qual o valor de D? ");
        d=input.nextInt();
        System.out.print("Qual o valor de E? ");
        e=input.nextInt();
        System.out.print("Qual o valor de F? ");
        f= input.nextInt();
        ae = a*e;
        bd = b*d;
        af = a *f;
        ce = c*e;
        bf = b*f;
        cd =c*d;
        x =Math.abs((ce-bf)/(ae-bd));
        y = Math.abs((af-cd)/(ae-bd));
        System.out.println("O valor de X é: "+ x + " e o valor de Y é: " + y);
}}

