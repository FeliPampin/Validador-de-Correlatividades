package org.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Inscripcion {
    //Atributos
    private List<Materia> materias;
    private Alumno alumno;


    //Setters y getters
    public Inscripcion(){
        this.materias = new ArrayList<>();
    }
    public List<Materia> getMaterias() {
        return materias;
    }
    public Alumno getAlumno() {
        return alumno;
    }
    public void setAlumno(Alumno alumno) {
        this.alumno = alumno;
    }
    public void agregarMaterias(Materia ... materias) {
        Collections.addAll(this.materias, materias);
    }


    //Metodos
    public boolean aprobada(){      //Para cada materia a la que se quiere insc, tiene aprobadas las correlativas
        return materias.stream().allMatch(materia -> materia.sePuedeAnotar(alumno));
    }

}
