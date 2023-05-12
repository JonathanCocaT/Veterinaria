
package petmanager;

import clases.clsCat;
import clases.clsDog;


public class Polimorfismo2 {
    public static void main(String[] args) {
        clsCat gato1 = new clsCat("1","Juan",2016,"Cafe","sano","Azul ruso");
        clsDog perro1 = new clsDog("2","Torin",2017,"Negro","sano","Afgano",true);
        
        gato1.sound();
        perro1.sound();

    }
}
