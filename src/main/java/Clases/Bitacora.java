
package Clases;

import java.util.ArrayList;
import java.util.Scanner;


public class Bitacora {
    
    public ArrayList <Materia> materias;
    public ArrayList <Tema> temas;


    public Bitacora() {
           materias = new ArrayList();
           temas = new ArrayList();

    }
    
    Scanner read = new Scanner(System.in);
    
    public void registrarInfo(){
        System.out.println("");
         int eleccion = 0;
         do {
             System.out.println("1. Registrar materia");
             System.out.println("2. Registrar tema");
             System.out.println("3. Registrar ejercicios");
             System.out.println("4. Registrar item");
             System.out.println("5. Atras");
            
             System.out.println("Ingrese una opcion: ");
            
            eleccion = read.nextInt();
             
            switch (eleccion) {
            case 1:
            registrarMateria();
            break;
            case 2:
            registrarTema();
            break;
            case 3:
           
            break;
            case 4:
            
            break;
            case 5:
           
            break;
            default: 
                 System.out.println("Opcion incorrecta. Ingrese el numero de las opciones disponibles: ");
               
            }
        } while (eleccion !=5);
        System.out.println("");
        System.out.println("El proceso fue un exito!");
        System.out.println("");
         
    }

    
    public void registrarMateria(){
        System.out.println("");
         int eleccion = 0;
        do {
            
              System.out.println("Ingrese un numero identificador para la materia: ");
            int id_materia = read.nextInt();
            comparar_IDMAT(id_materia);
      
            System.out.println("Ingrese el nombre de la materia:");
            String nombre_materia = read.nextLine();
            read.nextLine();
   
            Materia unaMateria = new Materia(id_materia, nombre_materia);
            materias.add(unaMateria);
             System.out.println("1. Cargar otra materia");
             System.out.println("2. Registrar tema");
             System.out.println("3. Registrar ejercicios");
             System.out.println("4. Registrar item");
             System.out.println("5. Menu principal");
            
             System.out.println("Ingrese una opcion: ");
            
            eleccion = read.nextInt();
             
            switch (eleccion) {
            case 1:
           
            break;
            case 2:
           
            registrarTema();
            break;
            case 3:
           
            break;
            case 4:
            
            break;
            case 5:
           
            break;
            default: 
                 System.out.println("Opcion incorrecta. Ingrese el numero de las opciones disponibles: ");
               
            }
        } while (eleccion == 1 || eleccion !=5);
        System.out.println("");
        System.out.println("El proceso fue un exito!");
        System.out.println("");
    }
    
    public void comparar_IDMAT(int id_materia) {
        for (Materia unaMateria : materias) {
            while (id_materia == unaMateria.id_materia) {
                System.out.println("La materia ya ha sido registrada. Intente otro: ");
                id_materia = read.nextInt();
            }
        }
    }
    
     //Arreglar metodo, A la hora de asignar el tema a una materia, en caso de que este no este registrado este metodo deberia
    //avisar que no existe registro de la materia, deberia saltar el mensaje hasta que se inserte la opcion correcta. 
    public void registro_IDMAT(int id_materia) {
        for (Materia unaMateria : materias) {
            while (id_materia == unaMateria.id_materia) {
                System.out.println("La materia no ha sido registrada. Intente otro: ");
                id_materia = read.nextInt();
            }
        }
    }
    
    public void registrarTema(){
        System.out.println("");
        int eleccion = 0;
        do {
            System.out.println("Ingrese un numero identificador para el tema:  ");
            int id_tema = read.nextInt();
            comparar_IDTEM(id_tema);
            read.nextLine();
            System.out.println("Ingrese el nombre del tema: ");
            String nombre_tema = read.nextLine();
            System.out.println("Ingrese la fecha en la que se desarrolló el tema (DD/MM/AA): ");
            String fecha = read.nextLine();
            
            Tema unTema = new Tema (id_tema, nombre_tema, fecha);
            temas.add(unTema);
            
            System.out.println("Ingrese el identificador de la materia a la cual corresponde este tema: ");
            int id = read.nextInt();
            Materia unaMateria = buscar_IDMAT(id);
            
             if (unaMateria == null) {
                registro_IDMAT(id);
            } else {
                 System.out.println("La tarea ha sido agregado satisfactoriamente a la materia");
                unaMateria.agregarTema(unTema);
            }
            
            System.out.println("1. Cargar otro tema");
            System.out.println("2. Menu principal");
            System.out.println("Ingrese una opcion: ");
            eleccion = read.nextInt();
            
        }while (eleccion ==1);
        System.out.println("");
        System.out.println("El proceso fue un exito!");
        System.out.println("");
    }
    
    public void comparar_IDTEM(int id_tema) {
        for (Tema unTema : temas) {
            while (id_tema == unTema.id_tema) {
                System.out.println("El tema ya ha sido registrado. Intente otro: ");
                id_tema = read.nextInt();
            }
        }
    }
    
    public Materia buscar_IDMAT(int id_materia) {
       Materia unaMateria;
        for (int i = 0; i < materias.size(); i++) {
            unaMateria = materias.get(i);
            if (unaMateria.id_materia == id_materia) {
                return unaMateria;
            }
        }
        return null;
    }
    
    public void visualizarMateria(){
        Materia unaMateria;
         for (int i = 0; i < materias.size(); i++) {
            unaMateria = materias.get(i);
        unaMateria.mostrarMaterias();
    }
    }
    
}
