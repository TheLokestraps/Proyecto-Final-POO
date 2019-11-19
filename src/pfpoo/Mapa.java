package pfpoo;

import java.util.ArrayList;

public class Mapa {


  public static ArrayList<Parada> paradas  = new ArrayList<>();
  public static ArrayList<Estacion> estaciones  = new ArrayList<>();
  public static ArrayList<Ruta> rutas = new ArrayList<>();

    public static Parada buscarParada(String direccion){
        int i = 0;
        while(i<Mapa.paradas.size()){
            if (Mapa.paradas.get(i).Direccion.equals(direccion)) {
                return Mapa.paradas.get(i);
            }
            i++;
        }
        return null;
    } 
    
    public static Estacion buscarEstacionConNombre(String nombre){
        int i = 0;
        while(i<Mapa.estaciones.size()){
            if (Mapa.estaciones.get(i).nombre.equals(nombre)) {
                return Mapa.estaciones.get(i);
            }
            i++;
        }
        return null;
    }
    
    public static Estacion buscarEstacionConDireccion(String direccion){
        int i = 0;
        while(i<Mapa.estaciones.size()){
            if (Mapa.estaciones.get(i).Direccion.equals(direccion)) {
                return Mapa.estaciones.get(i);
            }
            i++;
        }
        return null;
    }
    
    public static boolean EstacionExisteDireccion(String direccion){
        return buscarEstacionConDireccion(direccion) != null;
    } 
    
    public static boolean EstacionExisteNombre(String nombre){
        return buscarEstacionConNombre(nombre) != null;
    }
  
    public static boolean paradaExiste(String direccion){
        return buscarParada(direccion) != null;
    }
    
    public static ArrayList<Bus> busesProximos(Parada parada){
        ArrayList<Bus> buses = new ArrayList<>();
        for (int i = 0; i < rutas.size(); i++) {
            if (rutas.get(i).pasaPor(parada)) {
                Ruta laRuta = rutas.get(i);
                for (int j = 0; j < laRuta.recorridos.size(); j++) {
                    Recorrido elRecorrido = laRuta.recorridos.get(j);
                    for (int k = 0; k < elRecorrido.buses.size(); k++) {
                        if (elRecorrido.buses.get(k).proximaParada == parada) {
                            buses.add(elRecorrido.buses.get(k));
                        }
                    }
                }
            }
        }
        return buses;
    }
    
    
    
    
        public static Parada proximaParada(Parada actual){
        Parada proxima; 
        int i = 0;
        while(i<paradas.size()){
            if (paradas.get(i).Direccion.equals(actual.Direccion)) {
                break;
            }
            i++;
        }
        if (i<paradas.size()-1) {
            proxima = paradas.get(i+1);
        }else{
            proxima = paradas.get(0);
        }
        return proxima;
    }

    
    public static Ruta buscarRuta(String nombre){
        int i = 0; 
        while(i<rutas.size()){
            if (rutas.get(i).nombre.equals(nombre)) {
                return rutas.get(i);
            }
            i++;
        }
        return null;
    }
    
    public static boolean rutaExiste(String nombre){
        return buscarRuta(nombre) != null;
    }
  
}