package configs;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Crude {
    MyConnexion mc = MyConnexion.getInstance();
   
    public boolean exeCreate(String sql){
        try {
         
            Statement statement = mc.getConnection().createStatement();
            int result = statement.executeUpdate(sql);
            System.out.println("Result "+result);
            return true;
        } catch (SQLException ex) {
             System.out.println("Result "+ex);
            return false;
        }
    }

    public boolean exeUpdate(String sql){
        try {
            Statement statement = mc.getConnection().createStatement();
            statement.executeUpdate(sql);
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(Crude.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }

    public boolean exeDelete(String sql){
        try {
            Statement statement = mc.getConnection().createStatement();
            statement.executeUpdate(sql);
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(Crude.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }

    public ResultSet exeRead(String sql){
        try {
            Statement statement = mc.getConnection().createStatement();
            ResultSet rs;
            rs = statement.executeQuery(sql);
            return rs;
        } catch (SQLException ex) {
            Logger.getLogger(Crude.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }

    }
}
