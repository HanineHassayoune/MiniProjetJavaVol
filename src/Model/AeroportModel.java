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
public class AeroportModel {
    private Integer idAeroport;
    private String nomAeroport;
    private List <VolModel> volDepart;
    private List<VolModel> VolArrive;
    private Pays pays; 

    public AeroportModel(String nomAeroport, List<VolModel> volDepart, List<VolModel> VolArrive, Pays pays) {
        this.nomAeroport = nomAeroport;
        this.volDepart = volDepart;
        this.VolArrive = VolArrive;
        this.pays = pays;
    }

    public AeroportModel(Integer idAeroport, String nomAeroport, List<VolModel> volDepart, List<VolModel> VolArrive, Pays pays) {
        this.idAeroport = idAeroport;
        this.nomAeroport = nomAeroport;
        this.volDepart = volDepart;
        this.VolArrive = VolArrive;
        this.pays = pays;
    }

  

    public AeroportModel() {
        
    }


    public void setIdAeroport(Integer idAeroport) {
        this.idAeroport = idAeroport;
    }

    public void setNomAeroport(String nomAeroport) {
        this.nomAeroport = nomAeroport;
    }

    public void setVolDepart(List<VolModel> volDepart) {
        this.volDepart = volDepart;
    }

    public void setVolArrive(List<VolModel> VolArrive) {
        this.VolArrive = VolArrive;
    }

    public Integer getIdAeroport() {
        return idAeroport;
    }

    public String getNomAeroport() {
        return nomAeroport;
    }

    public List<VolModel> getVolDepart() {
        return volDepart;
    }

    public List<VolModel> getVolArrive() {
        return VolArrive;
    }
    
     public Pays getPays() {
        return pays;
    }

    public void setPays(Pays pays) {
        this.pays = pays;
    }


    

}
