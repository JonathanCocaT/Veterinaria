
package clases;

public class clsDog extends clsPet{
     private String breed;
     private boolean Pedigree;


    //constructor con  los elementos de la superclase
    public clsDog(String code, String name, int born_year, String color, String healthStatus, String breed, boolean Pedigree) {
        super(code, name, born_year, color, healthStatus);
        this.breed = breed;
        this.Pedigree = Pedigree;
    }
    
     @Override
    public void sound(){
    
        System.out.println(this.getName()+" dice guau guau guau guau");
    }
    
     //metodos 
    
    public void WalkAround(){
        System.out.println(this.getName()+" esta caminando");
    }
    public void WalkAround(int km){
        System.out.println(this.getName()+" esta caminando "+km+" km");
    }
    public void WalkAround(boolean dogLeash){
        if(dogLeash){
            System.out.println(this.getName()+" esta caminando con correa");
        }else{
            System.out.println(this.getName()+" esta caminando sin correa");
        }
    }

    //metodos getters y setters 

    public boolean getPedigree() {
        return Pedigree;
    }

    public void setPedigree(boolean Pedigree) {
        this.Pedigree = Pedigree;
    }
    
    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }
    @Override
    public String getAnimalType() {
        return "Domestico";
    }

    @Override
    public int getNumberOfBones() {
        return 321;
    }
}
