package com.umg.renato;

/**
 * Created by alumno on 12/07/2017.
 */
public class Restaurante {
    private String nombre;
    private String direccion;
    private int cantidadtrabajadores;
    private int cantidadcomensales;
    private boolean niños;
    private String categoria;


    public Restaurante(String nombre, String direccion, int cantidadtrabajadores, int cantidadcomensales, boolean niños, String categoria) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.cantidadtrabajadores = cantidadtrabajadores;
        this.cantidadcomensales = cantidadcomensales;
        this.niños = niños;
        this.categoria = categoria;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getCantidadtrabajadores() {
        return cantidadtrabajadores;
    }

    public void setCantidadtrabajadores(int cantidadtrabajadores) {
        this.cantidadtrabajadores = cantidadtrabajadores;
    }

    public int getCantidadcomensales() {
        return cantidadcomensales;
    }

    public void setCantidadcomensales(int cantidadcomensales) {
        this.cantidadcomensales = cantidadcomensales;
    }

    public boolean isNiños() {
        return niños;
    }

    public void setNiños(boolean niños) {
        this.niños = niños;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
}
