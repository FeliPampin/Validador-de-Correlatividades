package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class InscripcionTest {

    @Test
    @DisplayName("Un alumno intenta inscribirse a materias y le deja")
    public void puedeHacerUnaInscripcion(){

        //Se crean las materias
        Materia am1 = new Materia();
        am1.setCodigo(2053);
        //----------------------------------------//
        Materia am2 = new Materia();
        am2.setCodigo(2052);
        am2.agregarMateriasNecesarias(am1);
        //----------------------------------------//
        Materia am3 = new Materia();
        am3.setCodigo(3053);
        am3.agregarMateriasNecesarias(am1);
        //----------------------------------------//
        Materia am4 = new Materia();
        am4.setCodigo(3050);
        am4.agregarMateriasNecesarias(am2);
        //----------------------------------------//


        //Se crea el alumno
        Alumno alumno = new Alumno();
        alumno.setNombre("Juan");
        alumno.setApellido("Pérez");
        alumno.setLegajo(12345);
        alumno.agregarMateriasAprobadas(am1, am2);
        //----------------------------------------//


        //Se crea la inscripcion
        Inscripcion inscripcion = new Inscripcion();
        inscripcion.setAlumno(alumno);
        inscripcion.agregarMaterias(am3, am4);
        //----------------------------------------//


        // Verificar si la inscripcion es aprobada
        boolean esAprobada = inscripcion.aprobada();
        //----------------------------------------//

        assertTrue(esAprobada);

    }

//----------------------------------------------------------------------------------------------------

    @Test
    @DisplayName("Un alumno intenta inscribirse a materias y NO le deja")
    public void noPuedeHacerUnaInscripcion(){

        //Se crean las materias
        Materia am1 = new Materia();
        am1.setCodigo(2053);
        //----------------------------------------//
        Materia am2 = new Materia();
        am2.setCodigo(2052);
        am2.agregarMateriasNecesarias(am1);
        //----------------------------------------//
        Materia am3 = new Materia();
        am3.setCodigo(3053);
        am3.agregarMateriasNecesarias(am1);
        //----------------------------------------//
        Materia am4 = new Materia();
        am4.setCodigo(3050);
        am4.agregarMateriasNecesarias(am3);
        //----------------------------------------//


        //Se crea el alumno
        Alumno alumno = new Alumno();
        alumno.setNombre("Juan");
        alumno.setApellido("Pérez");
        alumno.setLegajo(12345);
        alumno.agregarMateriasAprobadas(am1, am2);
        //----------------------------------------//


        //Se crea la inscripcion
        Inscripcion inscripcion = new Inscripcion();
        inscripcion.setAlumno(alumno);
        inscripcion.agregarMaterias(am3, am4);
        //----------------------------------------//


        // Verificar si la inscripcion es aprobada
        boolean esAprobada = inscripcion.aprobada();
        //----------------------------------------//

        assertFalse(esAprobada);

    }

}