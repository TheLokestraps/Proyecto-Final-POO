package pfpoo;

import java.util.ArrayList;

public class Ruta {

    public String nombre;
    public ArrayList<Recorrido> recorridos = new ArrayList<>();
    public Parada ultimaParada;

    public Ruta(String nombre, Parada ultimaParada) {
        this.nombre = nombre;
        this.ultimaParada = ultimaParada;
    }

    
}
