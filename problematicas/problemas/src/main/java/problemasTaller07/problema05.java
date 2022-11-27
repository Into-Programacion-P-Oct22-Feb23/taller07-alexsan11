/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 Problema05 (use do-while)
Generar, imprimir y obtenga el resultado de la serie:
1 - 1/3 + 1/5 - 1/7 + 1/9 - 1/11 + 1/13 - 1/15
*/
package problemasTaller07;

/**
 *
 * @author aysanchez6
 */
public class problema05 {

    public static void main(String[] args) {
        int numero = -1;
        int numerodos = 3;
        int contador = 1;

        System.out.printf("1 ");

        do {
            if (numero == -1) {

                System.out.printf("%d/%d ",
                        numero,
                        numerodos);
            } else {

                System.out.printf("+%d/%d ",
                        numero,
                        numerodos);
            }
            contador = contador + 1;
            numero = numero * -1;
            numerodos = numerodos + 2;

        } while (contador <= 7);

    }

}
