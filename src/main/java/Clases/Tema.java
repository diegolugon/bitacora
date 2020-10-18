
package Clases;

import java.util.ArrayList;


public class Tema {
    public int id_tema;
    public String nombre_tema;
    public String fecha;
   public ArrayList <Ejercicio> ejercicios;
   public ArrayList <Investigacion> investigaciones;
   public ArrayList <Item> item;

    public Tema(int id_tema, String nombre_tema, String fecha, ArrayList<Ejercicio> ejercicios, ArrayList<Investigacion> investigaciones, ArrayList<Item> item) {
        this.id_tema = id_tema;
        this.nombre_tema = nombre_tema;
        this.fecha = fecha;
        this.ejercicios = ejercicios;
        this.investigaciones = investigaciones;
        this.item = item;
    }
   
   
}
