/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controler;
import configs.Crude;
import Model.Pays;
import java.sql.*;
import java.util.*;
import javax.swing.*;
/**
 *
 * @author Hanine
 */
public class PaysController {
    private Crude crude = new Crude();
    public List<Pays> getAll() {
       try {
               String sql = "SELECT * FROM pays";
               ResultSet rs = crude.exeRead(sql);
               List<Pays> liste = new ArrayList<Pays>();
               while (rs.next()) {
                   Pays pays = new Pays();
                   pays.setIdPays(rs.getInt(1));
                   pays.setNomPays(rs.getString(2));
           
                   liste.add(pays);
               }
               return liste;
           } catch (SQLException ex) {
                   System.err.println(ex.getMessage());
                JOptionPane.showMessageDialog(null, "Erreur AdministratorDAO ", "Erreur ", JOptionPane.ERROR_MESSAGE);

               return null;
           }
       }
    
}