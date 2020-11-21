package com.example.personasmaterial;

public class Persona {

    private String id;

    private String cedula;

    private String nombre;

    private String apellido;

    public Persona() {
    }



    public Persona(String id, String cedula, String nombre, String apellido) {
        this.id = id;
        this.cedula = cedula;
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public  void guardar(){
        Datos.guardar(this);
    }

    public  void eliminar(){
        Datos.eliminar(this);
    }
}
