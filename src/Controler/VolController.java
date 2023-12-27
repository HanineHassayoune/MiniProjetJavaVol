/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controler;


import java.sql.*;
import Model.AeroportModel;
import Model.VolModel;
import java.util.*;
import configs.Crude;
import javax.swing.*;

/**
 *
 * @author Hanine
 */
public class VolController {
     private Crude crude = new Crude();
 
    public boolean insert(VolModel e) {      
    String sql = "INSERT INTO vol(AeroportDepart, AeroportArrive, dateDepart, dateArrive, heureDepart, heureArrive, reservable) VALUES ('"
            +e.getAeroportDepart().getIdAeroport() + "','" + e.getAeroportArrive().getIdAeroport() + "','" + e.getDateDepart() + "','" + e.getDateArrive() + "','"
            + e.getHeureDepart() + "','" + e.getHeureArrive() + "','" + e.isReservable() + "')";
    System.out.println(sql);
    return crude.exeCreate(sql); 
}
    
    /* public boolean update(Vol a, Integer id) {
        String sql =
                "UPDATE vol SET AeroportDepart='" + a.getAeroportDepart() + "', AeroportArrive='"
                + a.getAeroportArrive() + "' , dateDepart= '" + a.getDateDepart() + "', dateArrive = '" + a.getDateArrive() 
                + "', heureDepart = '" + a.getHeureDepart() +"', heureArrive = '" + a.getHeureArrive() + "', reservable = '" + a.isReservable() + "' WHERE id=" + id;
        return crude.exeUpdate(sql);    
    }

    public boolean delete(Vol e) {
        String sql = "DELETE FROM vol WHERE id=" + e.getIdVol();
        return crude.exeDelete(sql);    
    }
   

    
    public List<Vol> getAll() {
    try {
        String sql = "SELECT * FROM vol"; 
        ResultSet rs = crude.exeRead(sql);
        List<Vol> liste = new ArrayList<>();
        while (rs.next()) {
            Vol vol = new Vol();
            vol.setIdVol(rs.getInt(1));
            
            Aeroport aeroportDepart = new Aeroport();
            aeroportDepart.setIdAeroport(rs.getInt(2));
            Aeroport aeroportArrive = new Aeroport();
            aeroportArrive.setIdAeroport(rs.getInt(3));
            vol.setAeroportDepart(aeroportDepart);
            vol.setAeroportArrive(aeroportArrive);
            
            vol.setDateDepart(rs.getString(4));
            vol.setDateArrive(rs.getString(5));
            vol.setHeureDepart(rs.getString(6));
            vol.setHeureArrive(rs.getString(7));
            vol.setReservable(rs.getBoolean(8)); 
            liste.add(vol);
        }
        return liste;
    } catch (SQLException ex) {
        System.err.println(ex.getMessage());
        JOptionPane.showMessageDialog(null, "Erreur  ", "Erreur ", JOptionPane.ERROR_MESSAGE);
        return null;
    }
}
    
    public Vol findByID(int id) {
        try {
            String sql = "SELECT * FROM vol WHERE id = "+id;
            ResultSet rs = crude.exeRead(sql);
            Vol vol = new Vol();
            while (rs.next()) {
                vol.setIdVol(rs.getInt(1));
                Aeroport aeroportDepart = new Aeroport();
                aeroportDepart.setIdAeroport(rs.getInt(2));
                Aeroport aeroportArrive = new Aeroport();
                aeroportArrive.setIdAeroport(rs.getInt(3));
                vol.setAeroportDepart(aeroportDepart);
                vol.setAeroportArrive(aeroportArrive);
                vol.setDateDepart(rs.getString(4));
                vol.setDateArrive(rs.getString(5));
                vol.setHeureDepart(rs.getString(6));
                vol.setHeureArrive(rs.getString(7));
                vol.setReservable(rs.getBoolean(8));
            }
            return vol;
        } catch (SQLException ex) {
              System.err.println(ex.getMessage());
            JOptionPane.showMessageDialog(null, "Erreur  ", "Erreur ", JOptionPane.ERROR_MESSAGE);
            return null;
        }
    }
*/
   

    
    
}
