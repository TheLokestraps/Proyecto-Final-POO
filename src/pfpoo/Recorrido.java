package pfpoo;

import java.util.Date;
import java.util.ArrayList;

public class Recorrido {

    public Date fInicio;
    public Date fFinal;
    
    public EstadoBus estadoBus;
    public Ruta ruta;
    public ArrayList<Bus> buses = new ArrayList<>();
    public Conductor conductor;

    public Recorrido(Date fInicio, EstadoBus estadoBus, Ruta ruta, Conductor conductor) {
        this.fInicio = fInicio;
        this.estadoBus = estadoBus;
        this.ruta = ruta;
        this.conductor = conductor;
    }
    
    public Parada proximaParada(Parada actual){
        Parada proxima; 
        int i = 0;
        while(i<ruta.paradas.size()){
            if (ruta.paradas.get(i).Direccion.equals(actual.Direccion)) {
                break;
            }
            i++;
        }
        if (i<ruta.paradas.size()-1) {
            proxima = ruta.paradas.get(i+1);
        }else{
            proxima = ruta.paradas.get(0);
        }
        return proxima;
    }


    
    
}
