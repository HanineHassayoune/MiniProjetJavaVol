/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author Hanine
 */
public class EscaleModel {
   private int idEscale;
   private AeroportModel aeroport;
   private VolModel vol;
   private String heureDepart;
   private String heureArrive;

    public EscaleModel() {
    }

    public EscaleModel(AeroportModel aeroport, VolModel vol, String heureDepart, String heureArrive) {
        this.aeroport = aeroport;
        this.vol = vol;
        this.heureDepart = heureDepart;
        this.heureArrive = heureArrive;
    }

    public EscaleModel(int idEscale, AeroportModel aeroport, VolModel vol, String heureDepart, String heureArrive) {
        this.idEscale = idEscale;
        this.aeroport = aeroport;
        this.vol = vol;
        this.heureDepart = heureDepart;
        this.heureArrive = heureArrive;
    }
    public void setIdEscale(int idEscale) {
        this.idEscale = idEscale;
    }

    public void setAeroport(AeroportModel aeroport) {
        this.aeroport = aeroport;
    }

    public void setVol(VolModel vol) {
        this.vol = vol;
    }

    public void setHeureDepart(String heureDepart) {
        this.heureDepart = heureDepart;
    }

    public void setHeureArrive(String heureArrive) {
        this.heureArrive = heureArrive;
    }

    public int getIdEscale() {
        return idEscale;
    }

    public AeroportModel getAeroport() {
        return aeroport;
    }

    public VolModel getVol() {
        return vol;
    }

    public String getHeureDepart() {
        return heureDepart;
    }

    public String getHeureArrive() {
        return heureArrive;
    }

   
    
   
}
