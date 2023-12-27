/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.util.List;

/**
 *
 * @author Hanine
 */
public class Pays {
    private Integer idPays;
    private String nomPays;
    private List<String> tunisiaCities; 

    public Pays() {
       
    }

    public Pays(Integer idPays, String nomPays) {
        this.idPays = idPays;
        this.nomPays = nomPays;
    }
    
  
    
    public Pays(String nomPays) {
        this.nomPays = nomPays;
    }

    public Integer getIdPays() {
        return idPays;
    }

    public void setIdPays(Integer idPays) {
        this.idPays = idPays;
    }

    public String getNomPays() {
        return nomPays;
    }

    public void setNomPays(String nomPays) {
        this.nomPays = nomPays;
    }

    // You can add more methods or overrides as needed
}
