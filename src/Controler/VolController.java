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
        try {
            String sql = "INSERT INTO vol(AeroportDepart,AeroportArrive,dateDepart,dateArrive,heureDepart,heureArrive,reservable) VALUES ('"
                    + e.getAeroportDepart().getIdAeroport() + "','" + e.getAeroportArrive().getIdAeroport() + "','" + e.getDateDepart() + "','" + e.getDateArrive() + "','"
                    + e.getHeureDepart() + "','" + e.getHeureArrive() + "','" + e.isReservable() + "')";
            System.out.println(sql);
            return crude.exeCreate(sql);
        } catch (Exception ex) { 
            System.err.println(ex.getMessage());
            JOptionPane.showMessageDialog(null, "Erreur  ", "Erreur ", JOptionPane.ERROR_MESSAGE);
            return false;
        }
    }
    
     public boolean update(VolModel a, Integer id) {
        String sql =
                "UPDATE vol SET AeroportDepart='" + a.getAeroportDepart().getIdAeroport() + "', AeroportArrive='"
                + a.getAeroportArrive().getIdAeroport()+ "' , dateDepart= '" + a.getDateDepart() + "', dateArrive = '" + a.getDateArrive() 
                + "', heureDepart = '" + a.getHeureDepart() +"', heureArrive = '" + a.getHeureArrive() + "', reservable = '" + a.isReservable() + "' WHERE idVol=" + id;
        System.out.println(sql);
        return crude.exeUpdate(sql);    
    }

  public boolean delete(VolModel e) {
    try {
        String sql = "DELETE FROM vol WHERE idVol=" + e.getIdVol();
        System.out.println(sql);
        return crude.exeDelete(sql);
    } catch (Exception ex) {
        // Print or log the exception message
        System.err.println(ex.getMessage());
        return false;
    }
}
  
    public boolean deleteById(int e) {
    try {
        String sql = "DELETE FROM vol WHERE idVol=" + e;
        System.out.println(sql);
        return crude.exeDelete(sql);
    } catch (Exception ex) {
        // Print or log the exception message
        System.err.println(ex.getMessage());
        return false;
    }
}
   

    
    public List<VolModel> getAll() {
    try {
        String sql = "SELECT * FROM vol"; 
        ResultSet rs = crude.exeRead(sql);
        List<VolModel> liste = new ArrayList<>();
        while (rs.next()) {
            VolModel vol = new VolModel();
            vol.setIdVol(rs.getInt(1));
            
            AeroportModel aeroportDepart = new AeroportModel();
            aeroportDepart.setIdAeroport(rs.getInt(2));
            AeroportModel aeroportArrive = new AeroportModel();
            aeroportArrive.setIdAeroport(rs.getInt(3));
            vol.setAeroportDepart(aeroportDepart);
            vol.setAeroportArrive(aeroportArrive);
            
            vol.setDateDepart(rs.getString(4));
            vol.setDateArrive(rs.getString(5));
            vol.setHeureDepart(rs.getString(6));
            vol.setHeureArrive(rs.getString(7));
            vol.setReservable(rs.getInt(8)); 
            liste.add(vol);
        }
        return liste;
    } catch (SQLException ex) {
        System.err.println(ex.getMessage());
        JOptionPane.showMessageDialog(null, "Erreur  ", "Erreur ", JOptionPane.ERROR_MESSAGE);
        return null;
    }
}
    
  /*  public Vol findByID(int id) {
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
