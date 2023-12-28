/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controler;
import java.util.*;
import configs.Crude;
import javax.swing.*;
import Model.AeroportModel;
import Model.Pays;
import javax.swing.JOptionPane;
import java.sql.*;


/**
 *
 * @author Hanine
 */
public class AeroportController {
    private Crude crude = new Crude();
    public boolean insert(AeroportModel aeroport) {
        String sql = "INSERT INTO aeroport(nomAeroport, nomPays) VALUES ('"
                + aeroport.getNomAeroport() + "','" + aeroport.getPays().getNomPays() + "')";
        System.out.println(sql);
        return crude.exeCreate(sql);
    }

    
    
    public List<AeroportModel> getAll() {
    try {
        String sql = "SELECT * FROM aeroport"; 
        ResultSet rs = crude.exeRead(sql);
        List<AeroportModel> liste = new ArrayList<>();
        while (rs.next()) {
            AeroportModel aeroport = new AeroportModel();
            aeroport.setIdAeroport(rs.getInt(1));
            aeroport.setNomAeroport(rs.getString(2));
            Pays pays = new Pays();
            pays.setNomPays(rs.getString(3));

            // Set Pays object for AeroportModel
            aeroport.setPays(pays);

           liste.add(aeroport);
        }
        return liste;
    } catch (SQLException  ex) {
        System.err.println(ex.getMessage());
        JOptionPane.showMessageDialog(null, "Erreur  ", "Erreur ", JOptionPane.ERROR_MESSAGE);
        return null;
    }
     
    }
    
    
    
            public int getAeroportIdByName(String nomAeroport) {
            try {
                String sql = "SELECT idAeroport FROM aeroport WHERE nomAeroport = '" + nomAeroport + "'";
                ResultSet rs = crude.exeRead(sql);

                if (rs.next()) {
                    return rs.getInt("idAeroport");
                }
            } catch (SQLException ex) {
                System.err.println(ex.getMessage());
                JOptionPane.showMessageDialog(null, "Erreur  ", "Erreur ", JOptionPane.ERROR_MESSAGE);
            }

            // Return -1 if the airport is not found
            return -1;
        }
            
            
        public String getAeroportNameById(int idAeroport) {
        try {
            String sql = "SELECT nomAeroport FROM aeroport WHERE idAeroport = " + idAeroport;
            ResultSet rs = crude.exeRead(sql);

            if (rs.next()) {
                return rs.getString("nomAeroport");
            }
        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
            JOptionPane.showMessageDialog(null, "Erreur  ", "Erreur ", JOptionPane.ERROR_MESSAGE);
        }

        // Return null if the airport name is not found
        return null;
    }
            
            
            
        
}
