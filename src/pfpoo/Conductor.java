package pfpoo;

import java.util.ArrayList;

public class Conductor extends Persona {

 
    public ArrayList<Recorrido>  recorridos = new ArrayList<>();

    public Conductor(String nombre, String contraseña,String cedula) {
        super(nombre, contraseña, cedula);
    }
  
    
  
}