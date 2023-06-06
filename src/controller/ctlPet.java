package controller;


import clases.*;
import model.*;



public class ctlPet {
    
    
    private modelDog modelDog;
    private modelCat modelCat;
    
    public ctlPet(){
        this.modelDog = new modelDog();
        this.modelCat = new modelCat();
    }


public boolean CreatePet(clsPet pet){

    try{
        System.out.println("controlador");
        System.out.println(pet.getAnimalType());
        switch(pet.getAnimalType()){
            case "Gato":
                this.modelDog.CreatePet((clsDog)pet);
                break;
            case "Perro":
                this.modelDog=new modelDog();
                this.modelDog.CreatePet((clsDog)pet);
                break;
        }
        return true;
}catch (Exception e){
return false;
}
}

 public boolean EditPet(clsPet pet){
    try{
        switch(pet.getAnimalType()){
            case "Perro":
                this.modelDog=new modelDog();
                this.modelDog.EditPet((clsDog)pet);
                break;
            case "Gato":
                this.modelCat=new modelCat();
                this.modelCat.EditPet((clsCat)pet);
                break;
        }
        return true;
    }catch(Exception e){}
        return false;
    }
        
    public clsPet searchPet(String code,String type){
        clsPet pet = null;
    try{
        switch(type){
            case "Perro":
                this.modelDog=new modelDog();
                pet=modelDog.SearchPet(code);
                break;
            case "Gato":
                this.modelCat=new modelCat();
                pet=modelCat.SearchPet(code);
                break;
        }
        return pet;
    }catch(Exception e){}
        return pet;
    }
            
    public boolean DeletePet(String code, String type){
    try{
        switch(type){
            case "Perro":
                this.modelDog=new modelDog();
                this.modelDog.DeletePet(code);
                break;
            case "Gato":
                this.modelCat=new modelCat();
                
                break;
        }
        return true;
    }catch(Exception e){}
        return false;
    }
}