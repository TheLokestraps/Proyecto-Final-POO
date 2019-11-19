package pfpoo;

import JFRAMES.Login;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Transmetro {

    public static ArrayList<Bus> buses = new ArrayList<>();
    public static ArrayList<Ruta> rutas = new ArrayList<>();
    public static ArrayList<Persona> personas = new ArrayList<>();
    public static ArrayList<Conductor> conductores = new ArrayList<>();

    public static void main(String[] args) {
        cargarInformacion();
        Login log = new Login();
        log.setVisible(true);
//         Scanner sc= new Scanner(System.in);
//         System.out.println("Digite el ID del bus:");
//         String Id=sc.next();
//         Bus bb= new Bus(Id,null,null);
//         bb.guardar();
//         System.out.println("Digite la dirección de la parada:");
//         String dir=sc.next();
//         Parada pp= new Parada(dir);
//         pp.guardar();
//         System.out.println("Digite el nombre de la estación:");
//         String est=sc.next();
//         Estacion ee=new Estacion(est,dir);
//         ee.guardar();
//         System.out.println("Escriba el nombre del usuario:");
//         String nom=sc.next();
//         System.out.println("Escriba la contraseña del usuario:");
//         String con=sc.next();
//          System.out.println("Escriba la cedula del usuario:");
//         String cel=sc.next();
//        
//         Usuario uu=new Usuario(nom,con,cel);
//         uu.guardar();
    }

    public static Persona buscarPersonaconCedula(String cedula) {
        int i = 0;
        while (i < personas.size()) {
            if (personas.get(i).cedula.equals(cedula)) {
                return personas.get(i);
            }
            i++;
        }

        return null;
    }

    public static boolean personaExiste(String cedula) {
        return buscarPersonaconCedula(cedula) != null;
    }

    public static boolean contraseñaCorrecta(String cedula, String contraseña) {
        Persona p = buscarPersonaconCedula(cedula);
        if (p != null) {
            return p.contraseña.equals(contraseña);
        } else {
            return false;
        }

    }

    public static void cargarInformacion() {
        ArrayList<String> est = new ArrayList();
        ArrayList<String> par = new ArrayList();
        ArrayList<String> rut = new ArrayList();
        Estacion e1 = new Estacion("Portal de Soledad", "calle 65 No.13-445", "R1,S1,S2,B1");
        Estacion e2 = new Estacion("Pedro Ramayá Beltrán", "Troncal Murillo entre carrera 23 y AV. Circunvalar ", "R1,S1,S2,B1");
        Estacion e3 = new Estacion("Pacho Galán", "Troncal Murillo entre carreras 16 y 17 de Soledad", "R1,S1,S2,B1");
        Estacion e4 = new Estacion("Joaquin Barrios", "Troncal Murillo entre carreras 1G y 2A", "R1,S1,S2,B1");
        Estacion e5 = new Estacion("Buenos Aires", "Troncal Murillo entre carreras 7 y 7G", "R1,S1,S2,B1");
        Estacion e6 = new Estacion("La Ocho", "Troncal Murillo entre carreras 8 y 8c", "R1,S1,S2,B1");
        Estacion e7 = new Estacion("La Catorce", "Troncal Murillo entre carreras 14 y 17", "R1,S1,S2,B1");
        Estacion e8 = new Estacion("La Veintiuna", "Troncal Murillo entre carreras 20 y 21", "R1,S1,S2,B1");
        Estacion e9 = new Estacion("Atlántico", "Troncal Murillo entre carreras 26 y 27", "R1,S1,S2,B1");
        Estacion e10 = new Estacion("Chiquinquirá", "Troncal Murillo entre carreras 33 y 36", "R1,S1,S2,B1");
        Estacion e11 = new Estacion("La Arenosa", "Troncal Murillo entre carreras 41 y 43", "R1,S1,S2,B1");
        Estacion e12 = new Estacion("Joe Arroyo", "carrera 46 con calle 74", "R1,R2,S1");
        Estacion e13 = new Estacion("Esthercita Forero", "Troncal Olaya Herrera entre calles 69 y 70", "R1,R2,S1");
        Estacion e14 = new Estacion("Alfredo Corrrea De Andréis", "Troncal Olaya Herrera entre calles 60 y 62", "R1,R2,S1");
        Estacion e15 = new Estacion("La catedral", "Troncal Olaya Herrera entre calles 50 y 53", "R1,R2,S1");
        Estacion e16 = new Estacion("Barrio Abajo", "Troncal Olaya Herrera entre calles 43 y 45", "R2,S2,B1");
        Estacion e17 = new Estacion("Parque Cultural del Caribe", "Troncal Olaya Herrera entre calles 36 y 39", "R2,S2,B1");
        Mapa.estaciones.add(e1);
        Mapa.estaciones.add(e2);
        Mapa.estaciones.add(e3);
        Mapa.estaciones.add(e4);
        Mapa.estaciones.add(e5);
        Mapa.estaciones.add(e6);
        Mapa.estaciones.add(e7);
        Mapa.estaciones.add(e8);
        Mapa.estaciones.add(e9);
        Mapa.estaciones.add(e10);
        Mapa.estaciones.add(e11);
        Mapa.estaciones.add(e12);
        Mapa.estaciones.add(e13);
        Mapa.estaciones.add(e14);
        Mapa.estaciones.add(e15);
        Mapa.estaciones.add(e16);
        Mapa.estaciones.add(e17);

        Parada p1 = new Parada("calle 65 No.13-445");
        Parada p2 = new Parada("Troncal Murillo entre carrera 23 y AV. Circunvalar ");
        Parada p3 = new Parada("Troncal Murillo entre carreras 16 y 17 de Soledad");
        Parada p4 = new Parada("Troncal Murillo entre carreras 1G y 2A");
        Parada p5 = new Parada("Troncal Murillo entre carreras 7 y 7G");
        Parada p6 = new Parada("Troncal Murillo entre carreras 8 y 8c");
        Parada p7 = new Parada("Troncal Murillo entre carreras 14 y 17");
        Parada p8 = new Parada("Troncal Murillo entre carreras 20 y 21");
        Parada p9 = new Parada("Troncal Murillo entre carreras 26 y 27");
        Parada p10 = new Parada("Troncal Murillo entre carreras 33 y 36");
        Parada p11 = new Parada("Troncal Murillo entre carreras 41 y 43");
        Parada p12 = new Parada("carrera 46 con calle 74");
        Parada p13 = new Parada("Troncal Olaya Herrera entre calles 69 y 70");
        Parada p14 = new Parada("Troncal Olaya Herrera entre calles 60 y 62");
        Parada p15 = new Parada("Troncal Olaya Herrera entre calles 50 y 53");
        Parada p16 = new Parada("Troncal Olaya Herrera entre calles 43 y 45");
        Parada p17 = new Parada("Troncal Olaya Herrera entre calles 36 y 39");
        Mapa.paradas.add(p1);
        Mapa.paradas.add(p2);
        Mapa.paradas.add(p3);
        Mapa.paradas.add(p4);
        Mapa.paradas.add(p5);
        Mapa.paradas.add(p6);
        Mapa.paradas.add(p7);
        Mapa.paradas.add(p8);
        Mapa.paradas.add(p9);
        Mapa.paradas.add(p10);
        Mapa.paradas.add(p11);
        Mapa.paradas.add(p12);
        Mapa.paradas.add(p13);
        Mapa.paradas.add(p14);
        Mapa.paradas.add(p15);
        Mapa.paradas.add(p16);
        Mapa.paradas.add(p17);
        Ruta r1 = new Ruta("R1");
        Ruta r2 = new Ruta("R2");
        Ruta r3 = new Ruta("S1");
        Ruta r4 = new Ruta("S2");
        Ruta r5 = new Ruta("B1");
        Mapa.rutas.add(r1);
        Mapa.rutas.add(r2);
        Mapa.rutas.add(r3);
        Mapa.rutas.add(r4);
        Mapa.rutas.add(r5);
        for (int i = 0; i < Mapa.estaciones.size(); i++) {
            String estacion = Mapa.estaciones.get(i).getNombre() + "/" + Mapa.estaciones.get(i).getDireccion() + "/" + Mapa.estaciones.get(i).getNombrerutas();
            est.add(estacion);
        }
        for (int i = 0; i < Mapa.paradas.size(); i++) {
            String parada = Mapa.paradas.get(i).getDireccion();
            par.add(parada);
        }
        for (int i = 0; i < Mapa.rutas.size(); i++) {
            String laruta = Mapa.rutas.get(i).getNombre();
            rut.add(laruta);
        }
        try {
            saveInformation(est, "Estaciones.txt");
            saveInformation(par, "Paradas.txt");
            saveInformation(rut, "Rutas.txt");
        } catch (Exception jsd) {
        }
        ubicarBuses();
    }

    public static void saveInformation(ArrayList info, String ruta) throws IOException {
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

    public static void loadInformation(ArrayList dato, String ruta) throws FileNotFoundException {
        String rutaU = ruta;
        File file = new File(rutaU);
        FileReader fr = new FileReader(file);
        BufferedReader br = new BufferedReader(fr);
        Object[] line = br.lines().toArray();
        for (int i = 0; i < line.length; i++) {
            dato.add(String.valueOf(line[i]));
        }
    }

    private static void devolverparada(String rr, ArrayList<String> est) {

        try {
            loadInformation(est, "Estaciones.txt");

        } catch (Exception jsd) {

        }
        for (int i = 0; i < est.size(); i++) {
            if (est.get(i).contains(rr)) {
                System.out.println("Parada " + est.get(i));
            }
        }
    }
    
    public static void ubicarBuses(){
        int i = 0;
        while(i<buses.size()){
            buses.get(i).paradaAnterior = Mapa.estaciones.get(selectorEstacion());
            buses.get(i).proximaParada = Mapa.proximaParada(buses.get(i).paradaAnterior);
        }
    }
    
    public static int selectorEstacion(){
        int i;
        do{
            i = (int) Math.random();
        
        }while(0>=i && i<Mapa.estaciones.size());
        return i;
    }
    public static void avanzarBuses(){
        int i = 0;
        while(i<buses.size()){
            buses.get(i).avanzar();
        }
    
    
    }
    

}
