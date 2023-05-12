
package petmanager;

import clases.clsDog;

public class Polimorfismo3 {
    public static void main(String[] args) {
        //clsCat gato1 = new clsCat(1,"Juan",2016,"Cafe","sano","Azul ruso");
        clsDog perro1 = new clsDog("2","Torin",2017,"Negro","sano","Afgano",true);
        
        perro1.WalkAround();
        perro1.WalkAround(10);
        perro1.WalkAround(true);
    }
}
