/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 
2
5
10
17
26
37*/
package problemasTaller07;

/**
 *
 * @author aysanchez6
 */
public class problema03 {

    public static void main(String[] args) {

        int numero = 2;

        int contador = 1;
        do {
            System.out.printf("%d\n", numero);
            numero = numero + 3;
            System.out.printf("%d\n", numero);
            numero = numero * 2;
            System.out.printf("%d\n", numero);
            numero = numero + 7;
            System.out.printf("%d\n", numero);
            numero = numero + 9;
            System.out.printf("%d\n", numero);
            numero = numero + 11;
            System.out.printf("%d\n", numero);
            contador = contador + 1;

        } while (contador <= 1);

    }
}
