
package clases;

import java.util.ArrayList;

public class clsVeterinary extends AbsHospital {
    
    //atributos
    private String Name;
    private String Phone;
    private String Addres;
    private ArrayList<clsPet> pets;
    private clsDoctor  doctor;
    
    public clsVeterinary(){};
    
    public clsVeterinary(String Name, String Phone, String Addres ,clsDoctor doctor) {
        this.Name = Name;
        this.Phone = Phone;
        this.Addres = Addres;
        this.doctor = doctor;
        
    }
    
    
    public void  AgregarPet(clsPet pet){
        pets.add(pet);
    }
    
    
    public void mostrarPets(){
            for (clsPet pets : pets) {
            System.out.println("- "+pets.getCode()+" "+ pets.getName()+" "+pets.getColor()+" "+pets.getHealthStatus()+" "+pets.getBorn_year());
        }
    }

    //metodos 
    public String petCare(clsPet pet){
        System.out.println("cuidado de mascotas a cargo de "+doctor.getName());
        return pet.getHealthStatus() ;
    }

    //metodos getters and setters
    public String getName() {
        return Name;
    }
    public void setName(String Name) {
        this.Name = Name;
    }
    public String getPhone() {
        return Phone;
    }
    public void setPhone(String Phone) {
        this.Phone = Phone;
    }
    public String getAddres() {
        return Addres;
    }
    public void setAddres(String Addres) {
        this.Addres = Addres;
    }

    @Override
    public String getPatientType() {
        return "Animal";
    }

    @Override
    public String Surgery() {
        return "Surgery animal date";
    }
    
    
    
    
    
}
