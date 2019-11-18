package pfpoo;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class Bus {

    public String ID;
    public ArrayList<Recorrido>  recorridos = new ArrayList<>();
    public Parada ultimaParada;
    public Parada proximaParda;
    public ArrayList<String>b=new ArrayList();
    public Bus(String ID, Parada ultimaParada, Parada proximaParada) {
        this.ID = ID;
        this.ultimaParada = ultimaParada;
        this.proximaParda = proximaParada;
    }
    
     public void guardar(){
       b.clear();
         try {
                loadInformation(b, "Bus.txt");
   
            } catch (Exception jsd) {
            }
        
        
         b.add(ID);
          try {
                    saveInformation(b,"Bus.txt" );
           
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