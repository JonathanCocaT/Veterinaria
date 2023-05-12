

package clases;

public class clsCat extends clsPet {
    private String breed;


        public clsCat(String code, String name, int born_year, String color, String healthStatus,String breed) {
        super(code, name, born_year, color, healthStatus);
        this.breed=breed;
    }

  
   
    @Override
    public void sound(){
    
        System.out.println(this.getName()+" dice miau miau miau");
    }
    
    
    //metodos de la clase gato 
    
    public void SelfCleaning(){
        System.out.println("Limpio");
    }
    
    @Override
    public String getAnimalType() {
        return "Domestico";
    }

    @Override
    public int getNumberOfBones() {
        return 230;
    }
       
       
    
    //metodos getters ans setters
    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }
}
