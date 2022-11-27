/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package problemasTaller07;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author aysanchez6
 */
public class problema01 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);

        int contador = 0;
        int edad;
        double estatura;
        // variables para guardar los promedios
        double edadpromedio;
        double estaturapromedio;
        // variable para acumular las edades y estaturas
        double sumaedad = 0;
        double sumaestatura = 0;
        String nombre;
        String posicionCampo;
        String informacionJugador = "";
        int salir;
        boolean bandera = true;

        informacionJugador = String.format("%s%s\n", informacionJugador,
                "Listado de Jugadores");
        do {
            System.out.println("Ingrese su nombre porfavor");
            nombre = entrada.nextLine();
            System.out.println("en que posición juega usted");
            posicionCampo = entrada.nextLine();
            System.out.println("Ingrese su edad porfavor");
            edad = entrada.nextInt();
            System.out.println("Que estatura tiene");
            estatura = entrada.nextDouble();

            sumaedad = sumaedad + edad;
            sumaestatura = sumaestatura + estatura;

            contador = contador + 1;
             

            informacionJugador = String.format("%s%d) %s -%s-, edad ,%d\n, edad,",
                    informacionJugador,
                    contador,
                    nombre,
                    posicionCampo,
                    edad,
                    estatura);

            entrada.nextLine();
            System.out.println("Desea salir del ciclo; digite: 2");
            salir = entrada.nextInt();
            
            
            if(salir==2){
              bandera = false;  
              entrada.nextLine();
            }
            
          }while(bandera);

        edadpromedio = (double) sumaedad / contador;

        estaturapromedio = (double) sumaestatura / contador;

        informacionJugador = String.format("%sPromedio de edades: %.2f\n",
                informacionJugador, edadpromedio);

        informacionJugador = String.format("%sPromedio de estaturas: %.2f\n",
                informacionJugador, estaturapromedio);
        
        System.out.printf("%s\n",informacionJugador);
    }
}
