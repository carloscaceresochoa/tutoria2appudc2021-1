package com.udc.tutoria2.modelo.entidad;

public class Persona {

    private String nombre;
    private String edad;
    private String estatura;

    public Persona(String nombre, String edad, String estatura) {
        this.nombre = nombre;
        this.edad = edad;
        this.estatura = estatura;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEdad() {
        return edad;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }

    public String getEstatura() {
        return estatura;
    }

    public void setEstatura(String estatura) {
        this.estatura = estatura;
    }

    public String salida(){
        return "Nombre: "+nombre+"\n"+
                "Edad: "+edad+"\n"+
                "Estatura "+estatura;
    }
}
