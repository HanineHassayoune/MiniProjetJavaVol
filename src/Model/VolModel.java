/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author Hanine
 */
public class VolModel {
    private Integer idVol;
    private AeroportModel AeroportDepart;
    private AeroportModel AeroportArrive;
    private String dateDepart;
    private String dateArrive;
    private String heureDepart;
    private String heureArrive;
    private boolean reservable;


    public VolModel( AeroportModel AeroportDepart, AeroportModel AeroportArrive, String dateDepart, String dateArrive, String heureDepart, String heureArrive, boolean reservable) {
        this.AeroportDepart = AeroportDepart;
        this.AeroportArrive = AeroportArrive;
        this.dateDepart = dateDepart;
        this.dateArrive = dateArrive;
        this.heureDepart = heureDepart;
        this.heureArrive = heureArrive;
        this.reservable = reservable;
    }
    public VolModel(Integer idVol, AeroportModel AeroportDepart, AeroportModel AeroportArrive, String dateDepart, String dateArrive, String heureDepart, String heureArrive, boolean reservable) {
        this.idVol = idVol;
        this.AeroportDepart = AeroportDepart;
        this.AeroportArrive = AeroportArrive;
        this.dateDepart = dateDepart;
        this.dateArrive = dateArrive;
        this.heureDepart = heureDepart;
        this.heureArrive = heureArrive;
        this.reservable = reservable;
    }
    
    public VolModel() {
          }


    public void setIdVol(Integer idVol) {
        this.idVol = idVol;
    }

    public void setAeroportDepart(AeroportModel AeroportDepart) {
        this.AeroportDepart = AeroportDepart;
    }

    public void setAeroportArrive(AeroportModel AeroportArrive) {
        this.AeroportArrive = AeroportArrive;
    }

    public void setDateDepart(String dateDepart) {
        this.dateDepart = dateDepart;
    }

    public void setDateArrive(String dateArrive) {
        this.dateArrive = dateArrive;
    }

    public void setHeureDepart(String heureDepart) {
        this.heureDepart = heureDepart;
    }

    public void setHeureArrive(String heureArrive) {
        this.heureArrive = heureArrive;
    }

    public void setReservable(boolean reservable) {
        this.reservable = reservable;
    }

    public Integer getIdVol() {
        return idVol;
    }

    public AeroportModel getAeroportDepart() {
        return AeroportDepart;
    }

    public AeroportModel getAeroportArrive() {
        return AeroportArrive;
    }

    public String getDateDepart() {
        return dateDepart;
    }

    public String getDateArrive() {
        return dateArrive;
    }

    public String getHeureDepart() {
        return heureDepart;
    }

    public String getHeureArrive() {
        return heureArrive;
    }

    public boolean isReservable() {
        return reservable;
    }

    
   
} 
