package pfpoo;

import java.util.ArrayList;

public class Ruta {

    public String nombre;
    public ArrayList<Recorrido> recorridos = new ArrayList<>();
    public ArrayList<Parada> paradas = new ArrayList<>();

    public Ruta(String nombre) {
        this.nombre = nombre;
        
    }

        public boolean pasaPor(Parada parada){
        int i = 0;
        while(i<paradas.size()){
            if (paradas.get(i).Direccion.equals(parada)) {
                return true;
            }
            i++;
        }
    
        return false;
    }
        
    public String getNombre() {
        return nombre;
    }

    
}
