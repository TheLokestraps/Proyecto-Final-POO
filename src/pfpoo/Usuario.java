package pfpoo;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class Usuario extends Persona {

    public ArrayList<Viaje> Viajes = new ArrayList<>();
    public ArrayList<String> u = new ArrayList();

    public Usuario(String nombre, String contraseña, String cedula) {
        super(nombre, contraseña, cedula);
    }

    public void guardar() {
        u.clear();
        try {
            loadInformation(u, "Usuario.txt");

        } catch (Exception jsd) {
        }

        String combinar2 = nombre + "/" + contraseña + "/" + cedula;
        u.add(combinar2);
        try {
            saveInformation(u, "Usuario.txt");

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
