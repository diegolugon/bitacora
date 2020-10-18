
package Clases;

import java.util.ArrayList;
import java.util.Scanner;


public class Bitacora {
    
    public ArrayList <Materia> materias;

    public Bitacora() {
           materias = new ArrayList();
    }
    
    Scanner read = new Scanner(System.in);

    
    public void registrarMateria(){
        System.out.println("");
         int eleccion = 0;
        do {
            System.out.println("Ingrese el nombre de la materia:");
            String materia = read.nextLine();
            read.nextLine();
           
            System.out.println("Ingrese un numero identificador para la materia: ");
            int id_materia = read.nextInt();
            comparar_IDMAT(id_materia);
            
        
            Materia unaMateria = new Materia(materia, id_materia);
            materias.add(unaMateria);
            System.out.println("1. Cargar otra materia");
            System.out.println("2. Menu principal");
            eleccion = read.nextInt();
        } while (eleccion == 1);
        System.out.println("");
        System.out.println("El proceso fue un exito!");
        System.out.println("");
    }
    
    public void comparar_IDMAT(int id_materia) {
        for (Materia unaMateria : materias) {
            while (id_materia == unaMateria.id_materia) {
                System.out.println("La materia ya ha sido registrada. Intente otra vez: ");
                id_materia = read.nextInt();
            }
        }
    }
    
    
}
