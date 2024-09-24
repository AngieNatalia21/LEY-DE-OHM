import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int V, I, R, opEj, op, T, Q, P, res1, res2, res3;
        double por1, por2, por3, Resultado, Resultado_final;

        Scanner teclado=new Scanner(System.in);
        System.out.println("¿Que ejercicio deseas realizar?(1=Ley de ohm, 2=Notas) ");
        opEj = teclado.nextInt();

        switch (opEj) {
            case 1:
                System.out.println("LEY DE OHM");

                System.out.println("1 Voltaje");
                System.out.println("2 Corriente");
                System.out.println("3 Resistencia");
                System.out.println("¿Que valor deseas hallar?");

                op = teclado.nextInt();


                if (op == 1) {
                    System.out.println("Digita el valor de Corriente y Resistencia");
                    I = teclado.nextInt();
                    R = teclado.nextInt();
                    V = I * R;
                    System.out.println("El valor del voltaje es " + V);


                } else if (op == 2) {
                    System.out.println("Digita el valor de Voltaje y Resistencia");
                    V = teclado.nextInt();
                    R = teclado.nextInt();
                    I = V / R;
                    System.out.println("El valor de la Corriente es " + I);


                } else if (op == 3) {
                    System.out.println("Digita el valor de Voltaje y Corriente");
                    V = teclado.nextInt();
                    I = teclado.nextInt();
                    R = V / I;
                    System.out.println("El valor de la Resistencia es " + R);


                }
            case 2:
                System.out.println("Notas");

                System.out.println("Corte uno");
                System.out.println("Ingrese su nota de tareas");
                T = teclado.nextInt();
                System.out.println("Ingrese su nota de Quiz");
                Q = teclado.nextInt();
                System.out.println("Ingrese su nota de Parcial");
                P = teclado.nextInt();
                res1=T+Q+P;
                System.out.println("La suma de sus notas es "+res1);
                por1=res1*0.35;
                System.out.println("El porcentaje de las notas de corte uno es "+por1);

                System.out.println("Corte dos");
                System.out.println("Ingrese su nota de tareas");
                T = teclado.nextInt();
                System.out.println("Ingrese su nota de Quiz");
                Q = teclado.nextInt();
                System.out.println("Ingrese su nota de Parcial");
                P = teclado.nextInt();
                res2=T+Q+P;
                System.out.println("La suma de sus notas es "+res2);
                por2=res2*0.35;
                System.out.println("El porcentaje de sus notas de corte dos es "+por2);


                System.out.println("Corte tres");
                System.out.println("Ingrese su nota de tareas");
                T = teclado.nextInt();
                System.out.println("Ingrese su nota de Quiz");
                Q = teclado.nextInt();
                System.out.println("Ingrese su nota de Parcial");
                P = teclado.nextInt();
                res3=T+Q+P;
                System.out.println("La suma de sus notas es "+res3);
                por3=res3*0.30;
                System.out.println("El porcentaje de sus notas de corte tres es "+por3);

                Resultado=por1+por2+por3;
                System.out.println("La suma de su corte uno, corte dos, corte tres es "+Resultado);
                Resultado_final=Resultado*3;
                System.out.println("El porcentaje de sus tres cortes es "+Resultado_final);


        }
    }
}