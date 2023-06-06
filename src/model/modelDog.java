
package model;
import clases.*;
import java.sql.Connection;
import java.sql.Statement;
import javax.swing.table.DefaultTableModel;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import java.sql.PreparedStatement;
import java.sql.ResultSet;


public class modelDog {
    
    connector dbData;
    
    public modelDog(){
        this.dbData = new connector();
    }
    
    public boolean CreatePet(clsDog dog) {
        try (Connection conn = DriverManager.getConnection(dbData.getUrl(), dbData.getUser(), dbData.getPassword())){
            if(conn !=null){
                System.out.println("conectado");
            }
            String sqlPet = "INSERT INTO tb_pet (code, name, born_year, color, health_status) VALUES (?, ?, ?, ?, ?)";
            String sqlDog="INSERT INTO tb_dog(breed, pedigree , pet_id) VALUES (?,?,?)";
            
            PreparedStatement statement = conn.prepareStatement(sqlPet,PreparedStatement.RETURN_GENERATED_KEYS);
            
            
            statement.setString (1,dog.getCode());
            statement.setString(2, dog.getName());
            statement.setInt(3, dog.getBorn_year());
            statement.setString(4, dog.getColor());
            statement.setString(5, dog.getHealthStatus());
            System.out.println(sqlPet);
            int rowsAffected = statement.executeUpdate();
            
           
            ResultSet rs = statement.getGeneratedKeys();//se obtiene la llave generada Id 
            int id =-1;
            
            
            if(rs.next()){//se itinera sobre result set para poder obtener los datos de lo contrario no devolvera el dato
            id = rs.getInt(1);
        }
       
        PreparedStatement statementDog = conn.prepareStatement(sqlDog);
        statementDog.setString(1, dog.getBreed());
        statementDog.setBoolean(2,dog.getPedigree());
        statementDog.setInt(3, id);
        
        statementDog.executeUpdate();
        
        return true;
        
        }catch(SQLException e) {
            e.printStackTrace();
            System.out.println("No conectada");
            return false;
        }
    }

public boolean EditPet (clsDog dog){
    System.out.println("editar funciona");
    try(Connection con=DriverManager.getConnection(dbData.getUrl(),dbData.getUser(),dbData.getPassword())){
        if(con != null){
        System.out.println("conectado");
        };
        
        String sqlId="SELECT pet.id,dog.id FROM tb_pet as pet inner join tb_dog as dog on (dog.pet_id=pet.id) WHERE pet.code=?";
        String sqlPet="UPDATE tb_pet SET code=?,name=?,born_year=?,color=?,health_status=? WHERE id=?";
        String sqlDog="UPDATE tb_dog SET breed=?,pedigree=? WHERE pet_id=?";
        
        
        //se prepara el estamento y se envia la orden de retornar las llaves generadas
        PreparedStatement statement = con.prepareStatement(sqlId);
        statement.setString(1,dog.getCode());
        //se ejecuta la consulta para conocer los id 
        ResultSet rs=statement.executeQuery();
        while(rs.next()){
            int id1=rs.getInt(1);
            int id2=rs.getInt(2);
            PreparedStatement staPet=con.prepareStatement(sqlPet);
            //se envian lso datos a la cconsulta sql
            staPet.setString(1,dog.getCode());
            staPet.setString(2,dog.getName());
            staPet.setInt(3,dog.getBorn_year());
            staPet.setString(4,dog.getColor());
            staPet.setString(5,dog.getHealthStatus());
            staPet.setInt(6,id1);
            staPet.executeUpdate();
            
            
           
            PreparedStatement staDog=con.prepareStatement(sqlDog);
            staDog.setString(1,dog.getBreed());
            staDog.setBoolean(2,dog.getPedigree());
            staDog.setInt(3, id2);
            
            staDog.executeUpdate();
            
            
        }
       
        return true;
        }catch(SQLException e){
            e.printStackTrace();
            return false;
        }
    }

public boolean DeletePet (String code){
    try(Connection con=DriverManager.getConnection(dbData.getUrl(),dbData.getUser(),dbData.getPassword())){
        if(con != null){
        System.out.println("conectado");
        };
        
        String sqlId="SELECT pet.id,dog.id FROM tb_pet as pet inner join tb_dog as dog on (dog.pet_id=pet.id) WHERE pet.code=?";
        String sqlPet="DELETE FROM `tb_pet` WHERE id=?";
        String sqlDog="DELETE FROM `tb_dog` WHERE id=?";
        
        
        //se prepara el estamento y se envia la orden de retornar las llaves generadas
        PreparedStatement statement = con.prepareStatement(sqlId);
        statement.setString(1,code);
        //se ejecuta la consulta para conocer los id 
        ResultSet rs=statement.executeQuery();
        while(rs.next()){
            int id1=rs.getInt(1);
            int id2=rs.getInt(2);

            
            PreparedStatement staDog=con.prepareStatement(sqlDog);
            staDog.setInt(1, id2);
            
            staDog.executeUpdate();
            
            
            
            PreparedStatement staPet=con.prepareStatement(sqlPet);
            //se envian lso datos a la cconsulta sql
            staPet.setInt(1,id1);
            staPet.executeUpdate();
        }
        return true;
        }catch(SQLException e){
            e.printStackTrace();
            return false;
        }
}  

public clsDog SearchPet (String code){
    
    clsDog dog =null;
            System.out.println("buscar  funciona = "+code);
            try(Connection con=DriverManager.getConnection(dbData.getUrl(),dbData.getUser(),dbData.getPassword())){
            if(con != null){
            System.out.println("conectado");
            };
                
            String sql="SELECT pet.code ,pet.name,pet.born_year,pet.color,pet.health_status,dog.breed,dog.pedigree FROM tb_pet as pet inner join tb_dog as dog on (dog.pet_id=pet.id) WHERE pet.code=?";
            PreparedStatement statement=con.prepareStatement(sql);
                
            statement.setString(1,code);
            ResultSet rs=statement.executeQuery();
            while(rs.next()){
            dog=new clsDog();
            dog.setCode(rs.getString(1));
            dog.setName(rs.getString(2));
            dog.setBorn_year(rs.getInt(3));
            dog.setColor(rs.getString(4));
            dog.setHealthStatus(rs.getString(5));
            dog.setBreed(rs.getString(6));
            dog.setPedigree(rs.getBoolean(7));
            }
              return dog;  
            }catch(SQLException e){
                e.printStackTrace();
            return dog;
            }
            
    }
}
