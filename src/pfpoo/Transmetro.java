package pfpoo;

import JFRAMES.Login;
import java.util.ArrayList;
import java.util.Scanner;

public class Transmetro {

    public static ArrayList<Bus> buses = new ArrayList<>();
    public static ArrayList<Ruta> rutas = new ArrayList<>();
    public static ArrayList<Persona> personas = new ArrayList<>();
    public static ArrayList<Conductor> conductores = new ArrayList<>();
    

     public static void main(String[] args) {
         
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
     
    public static Persona buscarPersonaconCedula(String cedula){
        int i = 0;
        while(i<personas.size()){
            if (personas.get(i).cedula.equals(cedula)) {
                return personas.get(i);
            }
            i++;
        }
     
        return null;
    }
    
    public static boolean personaExiste(String cedula){
        return buscarPersonaconCedula(cedula) != null;
    }
     
    public static boolean contraseñaCorrecta(String cedula, String contraseña){
        Persona p = buscarPersonaconCedula(cedula);
        if (p != null) {
            return p.contraseña.equals(contraseña);
        }else{
            return false;
        }
        
    }
}
 