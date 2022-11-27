/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
Problema02 (use while)
Generar e imprimir la siguiente serie:
2
6
12
20
30
42
56
72
90
110 */
package problemasTaller07;
/**
 *
 * @author aysanchez6
 */
public class problema02 {
    
    public static void main(String[] args) {
    int numero = 2;
    
    int contador = 1;
     
    while(contador<= 1){
     System.out.printf("%d\n", numero);
     numero = numero *3;
     System.out.printf("%d\n", numero);
     numero = numero *2;
     System.out.printf("%d\n", numero);
     numero = numero +8;
     System.out.printf("%d\n", numero);
     numero = numero + 10;
     System.out.printf("%d\n", numero);
     numero = numero + 12;
     System.out.printf("%d\n", numero);
     numero = numero + 14;
      System.out.printf("%d\n", numero);
     numero = numero + 16;
      System.out.printf("%d\n", numero);
     numero = numero + 18;
     System.out.printf("%d\n", numero);
     numero = numero + 20;
     System.out.printf("%d\n", numero);
      contador = contador + 1;
    }
   
       
}
    
    
}
