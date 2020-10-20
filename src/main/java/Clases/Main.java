
package Clases;

import java.util.Scanner;


public class Main {
        static Bitacora unaBitacora = new Bitacora();

    public static void main (String [] args) {
        Scanner read = new Scanner(System.in);

        int opcion = 0;
        do {
            System.out.println("");
            System.out.println("Bitacora de Aprendizaje");
            System.out.println("");
            System.out.println("1. Registrar Informacion para la Bitacora");
            System.out.println("2. Listar materias");
            System.out.println("6. Lista de tareas pendientes");
            System.out.println("7. Salir");
            System.out.println("");
            System.out.println("Ingrese una opcion para continuar: ");
            opcion = read.nextInt();
            
            
        
        switch (opcion) {
            case 1:
               unaBitacora.registrarInfo();
                break;
            case 2:
               unaBitacora.visualizarMateria();
                break;
            case 3:
 
                break;
            case 4:
              
                break;
            case 5:
                
                break;
            case 6: 
                
                break;
                
            case 7:
                System.out.println("Gracias por utilizar la Bitacora de Aprendizaje.");
                break;
            default:
                System.out.println("Opcion incorrecta. Intente de nuevo");
        }
        } while (opcion != 7);
    }
    
}
