
package petmanager;

import clases.clsDoctor;
import clases.clsVeterinary;


public class AbstractClass {
    public static void main(String[] args) {
        clsDoctor doctor = new clsDoctor ("Kevin Maria","L123456");
        clsVeterinary veterinary = new clsVeterinary ("Veterinaria El Buen Pastor","036","Cll 73 24 53", doctor);
        
        veterinary.setData(veterinary.getName()+ " "+ veterinary.getAddres());
        
        String data = veterinary.getHospitalInformation();
        String type = veterinary.getPatientType();
        String surgery = veterinary.Surgery();
        
        System.out.println("Data: " + data);
        System.out.println("Type: " + type);
        System.out.println("Surgery: " + surgery);
    }
}
