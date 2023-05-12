
package petmanager;

import clases.clsCat;
import clases.clsDog;


public class Interfaz {
    public static void main(String[] args) {
        clsCat gato1 = new clsCat("1","Juan",2016,"Cafe","sano","Azul ruso");
        clsDog perro1 = new clsDog("2","Torin",2017,"Negro","sano","Afgano",true);
        System.out.println("El nombre del animal es "+gato1.getName()+"\n"+"Tipo = "+gato1.getAnimalType()+"\n"+"Tiene = "+gato1.getNumberOfBones()+" huesos");
        System.out.println("El nombre del animal es "+perro1.getName()+"\n"+"Tipo = "+perro1.getAnimalType()+"\n"+"Tiene = "+perro1.getNumberOfBones()+" huesos");
   
}
}
