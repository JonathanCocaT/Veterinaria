
package clases;


public abstract class AbsHospital {

    private String data;
    
    public abstract String getPatientType();
    public abstract String Surgery();
    
public String getHospitalInformation(){
    return "La informacion es "+this.getData();
}
public String getData(){
    return data;
}
public void setData(String data){
    this.data = data;
}
}
