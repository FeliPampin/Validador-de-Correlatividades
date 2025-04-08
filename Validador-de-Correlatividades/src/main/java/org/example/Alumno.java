package org.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Alumno {
    //Atributos
    private String nombre;
    private String apellido;
    private int legajo;
    private List<Materia> materiasAprobadas;


    //Setters y getters
    public Alumno(){
        this.materiasAprobadas = new ArrayList<>();
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
    public int getLegajo() {
        return legajo;
    }
    public void setLegajo(int legajo) {
        this.legajo = legajo;
    }
    public List<Materia> getMateriasAprobadas() {
        return materiasAprobadas;
    }
    public void agregarMateriasAprobadas(Materia ... materiasAprobadas) {
        Collections.addAll(this.materiasAprobadas, materiasAprobadas);
    }

}
