/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controler;

import Model.EscaleModel;
import configs.Crude;


import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Hanine
 */
public class EscaleController {
     private Crude crude = new Crude();
    public boolean insert(EscaleModel esc) {
        String sql = "INSERT INTO escale(idAeroport, codeVol,heureDepart,heureArrive) VALUES ('"
                + esc.getAeroport().getIdAeroport() + "','" + esc.getVol().getCodeVol() + "','" + esc.getHeureDepart()+ "','" + esc.getHeureArrive()  +"')";
        System.out.println(sql);
        return crude.exeCreate(sql);
    }
    
    
    public String getMaxOccurrenceCodeVol() {
        String sql = "SELECT codeVol FROM escale GROUP BY codeVol ORDER BY COUNT(codeVol) DESC LIMIT 1";
        System.out.println(sql);

        try (ResultSet resultSet = crude.exeRead(sql)) {
            if (resultSet.next()) {
                return resultSet.getString("codeVol");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return null;
    }

    public String getMinOccurrenceCodeVol() {
        String sql = "SELECT codeVol FROM escale GROUP BY codeVol ORDER BY COUNT(codeVol) ASC LIMIT 1";
        System.out.println(sql);

        try (ResultSet resultSet = crude.exeRead(sql)) {
            if (resultSet.next()) {
                return resultSet.getString("codeVol");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return null;
    }
    
    
}


