

package clases;

public class clsDoctor {
    private String Name;
    private String Licencia;

    public clsDoctor(String Name, String Licencia) {
        this.Name = Name;
        this.Licencia = Licencia;
    }

    public clsDoctor(){};
    
    //metodos getters and setters 
    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getLicencia() {
        return Licencia;
    }

    public void setLicencia(String Licencia) {
        this.Licencia = Licencia;
    }
    
    
    
}
