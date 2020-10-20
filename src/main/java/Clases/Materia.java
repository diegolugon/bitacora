
package Clases;

import java.util.ArrayList;

public class Materia {
   public String nombre_materia;
   public int id_materia; 
   public ArrayList <Tema> temas;

    public Materia( int id_materia, String materia) {
        this.id_materia = id_materia;
        this.nombre_materia = materia;
        temas = new ArrayList();
    }
    
     public void mostrarMaterias(){
        System.out.println("");
        System.out.println("Identificado de la Materia: "+id_materia);
        System.out.println("Nombre de la Materia: "+nombre_materia);
        System.out.println("");
    }
    
      public void agregarTema(Tema unTema){
        temas.add(unTema);
   }
      
}


