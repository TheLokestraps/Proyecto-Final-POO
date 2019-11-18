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

    
    
}
