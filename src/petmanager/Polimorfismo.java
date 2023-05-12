
package petmanager;

import clases.clsCat;
import clases.clsDoctor;
import clases.clsDog;
import clases.clsVeterinary;

public class Polimorfismo {
    
    public static void main(String[] args) {
        
 
    clsCat gato1 = new clsCat("1","Juan",2016,"Cafe","sano","caribeño");
    clsDog perro1 = new clsDog("2","Torin",2017,"Negro","sano","pastor",true);
    clsDoctor doctor1 = new clsDoctor("Kevin","1321354658");
    clsVeterinary vete1 = new clsVeterinary("Vetepet","13254655","cll 18b-56",doctor1);
    
    
    String careDog = vete1.petCare(perro1);
    System.out.println("El estado de salud de "+perro1.getName()+" es "+careDog);
    String careCat= vete1.petCare(gato1);
    System.out.println("El estado de salud de "+gato1.getName()+" es "+careCat);
    }
    
}
