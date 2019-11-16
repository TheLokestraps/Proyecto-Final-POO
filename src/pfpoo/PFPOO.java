
package pfpoo;

import java.util.Scanner;


public class PFPOO {

   
    public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
        System.out.println("Digite nombre:");
        String nom=sc.next();
        System.out.println("Digite apellido:");
        String ape=sc.next();
    
       NewClass nn=new NewClass(nom,ape);
       nn.guardar();
    }
    
}
