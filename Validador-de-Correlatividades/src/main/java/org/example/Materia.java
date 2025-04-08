package org.example;

import java.util.Collections;
import java.util.List;
import java.util.ArrayList;


public class Materia {
    //Atributos
    private List<Materia> materiasNecesarias;
    private int codigo;


    //Setters y getters
    public Materia(){
        this.materiasNecesarias = new ArrayList<>();
    }
    public int getCodigo() {
        return codigo;
    }
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    public void agregarMateriasNecesarias(Materia ... materias) {
        Collections.addAll(this.materiasNecesarias, materias);
    }


    //Metodos
    public boolean sePuedeAnotar(Alumno alumno){
        return alumno.getMateriasAprobadas().containsAll(materiasNecesarias);
    }
}
