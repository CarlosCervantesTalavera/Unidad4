/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datos;

/**
 *
 * @author carlo
 */
public class Informacion {
    
    String Nombre;
    String Carrera;
    int NumSemestre;

    public Informacion(String Nombre, String Carrera, int NumSemestre) {
        this.Nombre = Nombre;
        this.Carrera = Carrera;
        this.NumSemestre = NumSemestre;
    }

    public String getNombre() {
        return "EL nombre del alumno es: " + Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getCarrera() {
        return "Carrera: " + Carrera;
    }

    public void setCarrera(String Carrera) {
        this.Carrera = Carrera;
    }

    public String getNumSemestre() {
        return "Numero de semestre: " + NumSemestre;
    }

    public void setNumSemestre(int NumSemestre) {
        this.NumSemestre = NumSemestre;
    }
    
    
}
