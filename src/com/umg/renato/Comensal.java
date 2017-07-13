package com.umg.renato;

/**
 * Created by alumno on 12/07/2017.
 */
public class Comensal {

    private String nombrecomensal;
    private String apellidocomensal;
    private int cantidadvisitas;

    public Comensal(String nombrecomensal, String apellidocomensal, int cantidadvisitas) {
        this.nombrecomensal = nombrecomensal;
        this.apellidocomensal = apellidocomensal;
        this.cantidadvisitas = cantidadvisitas;
    }

    public String getNombrecomensal() {
        return nombrecomensal;
    }

    public void setNombrecomensal(String nombrecomensal) {
        this.nombrecomensal = nombrecomensal;
    }

    public String getApellidocomensal() {
        return apellidocomensal;
    }

    public void setApellidocomensal(String apellidocomensal) {
        this.apellidocomensal = apellidocomensal;
    }

    public int getCantidadvisitas() {
        return cantidadvisitas;
    }

    public void setCantidadvisitas(int cantidadvisitas) {
        this.cantidadvisitas = cantidadvisitas;
    }
}
