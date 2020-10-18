
package Clases;

import java.util.ArrayList;

public class Materia {
   public String materia;
   public int id_materia; 
   public ArrayList <Tema> temas;

    public Materia(String materia, int id_materia) {
        this.materia = materia;
        this.id_materia = id_materia;
        temas = new ArrayList();
    }
   
   
   
    
}


