package pfpoo;

import java.util.ArrayList;
import java.util.Scanner;

public class Transmetro {

    public ArrayList<Bus> buses = new ArrayList<>();
    public ArrayList<Ruta> rutas = new ArrayList<>();
    public ArrayList<Persona> personas = new ArrayList<>();
    public ArrayList<Conductor> conductores = new ArrayList<>();
    

     public static void main(String[] args) {
         Scanner sc= new Scanner(System.in);
         System.out.println("Digite el ID del bus:");
         String Id=sc.next();
         Bus bb= new Bus(Id,null,null);
         bb.guardar();
         System.out.println("Digite la dirección de la parada:");
         String dir=sc.next();
         Parada pp= new Parada(dir);
         pp.guardar();
         System.out.println("Digite el nombre de la estación:");
         String est=sc.next();
         Estacion ee=new Estacion(est,dir);
         ee.guardar();
         System.out.println("Escriba el nombre del usuario:");
         String nom=sc.next();
         System.out.println("Escriba la contraseña del usuario:");
         String con=sc.next();
         Usuario uu=new Usuario(nom,con);
         uu.guardar();
    }
    
}
 