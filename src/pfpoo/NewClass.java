
package pfpoo;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;


public class NewClass {
    public String nombre;
    public String apellido;
public ArrayList<String>n=new ArrayList();
    public NewClass(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
    }
    public void guardar(){
       n.clear();
         try {
                loadInformation(n, "Informacion - Personal.txt");
   
            } catch (Exception jsd) {
            }
         String h=nombre+"/"+apellido;
        
         n.add(h);
          try {
                    saveInformation(n,"Informacion - Personal.txt" );
           
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
