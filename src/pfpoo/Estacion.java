package pfpoo;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class Estacion extends Parada {

  public String nombre;
  public String nombreRutas;
  public ArrayList<String> e = new ArrayList();

    public Estacion(String nombre,String Direccion,String nombreRutas) {
        super(Direccion);
        this.nombre = nombre;
        this.nombreRutas = nombreRutas;
    }
    
    public String getNombre() {
        return nombre;
    }

    public String getDireccion() {
        return Direccion;
    }

    public String getNombrerutas() {
        return nombreRutas;
    }
    
    public ArrayList<Ruta> getRuta() {
        return Ruta;
    }

  

    
    
  public void guardar(){
       e.clear();
         try {
                loadInformation(e, "Estacion.txt");
   
            } catch (Exception jsd) {
            }
        
        String combinar=nombre+"/"+Direccion;
         e.add(combinar);
          try {
                    saveInformation(e,"Estacion.txt" );
           
                } catch (Exception jsd) {
                }
    }
   public void saveInformation(ArrayList info, String ruta) throws IOException {
        String rutaU = ruta;
        File file = new File(rutaU);
        FileWriter fr = new FileWriter(file);
        BufferedWriter bw = new BufferedWriter(fr);
        for (int i = 0; i < info.size(); i++) {
            bw.write(info.get(i).toString());
            bw.newLine();
        }
        bw.close();

    }
public void loadInformation(ArrayList dato, String ruta) throws FileNotFoundException {
        String rutaU = ruta;
        File file = new File(rutaU);
        FileReader fr = new FileReader(file);
        BufferedReader br = new BufferedReader(fr);
        Object[] line = br.lines().toArray();
        for (int i = 0; i < line.length; i++) {
            dato.add(String.valueOf(line[i]));
        }
  
}
}